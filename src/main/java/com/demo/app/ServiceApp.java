package com.demo.app;

import org.kungfu.core.Interceptor;

import com.demo.config._MappingKit;
import com.demo.routes.RestRoutes;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.json.JacksonFactory;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.ehcache.EhCachePlugin;

/**
 * API引导式配置
 */
public class ServiceApp extends JFinalConfig {
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		// 加载少量必要配置
		PropKit.use("config.properties");
		me.setDevMode(PropKit.getBoolean("devMode", false));
		
		me.setJsonFactory(new JacksonFactory());
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		me.add(new RestRoutes()); 	
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
		// 配置C3p0数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		me.add(c3p0Plugin);
		
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		me.add(arp);
		
		// 所有配置在 MappingKit 中搞定
		_MappingKit.mapping(arp);
		
		// 缓存
		me.add(new EhCachePlugin());
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		me.add(new Interceptor());
		me.add(new SessionInViewInterceptor());
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
	}
	
	/**
	 * 建议使用 JFinal 手册推荐的方式启动项目
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 */
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 8080, "/", 5);
	}
}
