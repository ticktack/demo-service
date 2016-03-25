package com.demo.module.blog;


import com.demo.base.BaseRest;
import com.demo.blog.Blog;
import com.demo.config.SvcConst;
import com.jfinal.kit.JsonKit;

/**
 * BlogRest
 */
public class BlogRest extends BaseRest {
	private String restUrl = SvcConst.url("/blog");
	private BlogService blogService = new BlogService();
	
	//test http://localhost:8080/api/v1_0/blog
	public void index() {
		renderJson(blogService.paginate(getParaToInt(0, 1), 10));
	}
	
	public void save() {
		Blog blog = JsonKit.parse(getPara("blog"), Blog.class);
		blogService.save(blog);

		redirect(restUrl);
	}
	
	public void edit() {
		renderJson(blogService.findById(getParaToInt()));
	}
	
	public void update() { 
		Blog blog = JsonKit.parse(getPara("blog"), Blog.class);
		blogService.update(blog);
		
		redirect(restUrl);
	}
	
	public void delete() {
		blogService.deleteById(getParaToInt());
		redirect(restUrl);
	}
}