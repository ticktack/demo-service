package com.demo.routes;

import com.demo.config.SvcConst;
import com.demo.module.adtadmdiv.AdtAdmDivRest;
import com.demo.module.blog.BlogRest;
import com.jfinal.config.Routes;

public class RestRoutes extends Routes {
	
	public void config() {
		
		add(SvcConst.url("/blog"), BlogRest.class); 
		add(SvcConst.url("/admdiv"), AdtAdmDivRest.class); 
		
	}
}