package com.demo.module.adtadmdiv;

import com.demo.base.BaseRest;

public class AdtAdmDivRest extends BaseRest {
	//private String restUrl = SvcConst.url("/admdiv");
	private AdtAdmDivService admdivService = new AdtAdmDivService();
	
	//http://localhost:8080/api/v1_0/admdiv
	public void index() {
		renderJson(admdivService.paginate(getParaToInt(0, 1), 10000, getPara(1)));
	}
	
	public void list() {
		renderJson(admdivService.getList());
	}
	
}
