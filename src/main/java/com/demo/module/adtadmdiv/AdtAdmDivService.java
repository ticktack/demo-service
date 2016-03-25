package com.demo.module.adtadmdiv;

import java.util.List;

import org.kungfu.core.Service;
import org.kungfu.util.StrKit;

import com.demo.adtadmdiv.AdtAdmDiv;
import com.demo.adtadmdiv.AdtAdmDivAPI;
import com.jfinal.plugin.activerecord.Page;

public class AdtAdmDivService extends Service implements AdtAdmDivAPI {

	@Override
	public Page<AdtAdmDiv> paginate(int pageNumber, int pageSize, String pcode) {
		return StrKit.isBlank(pcode) ?  
				AdtAdmDiv.dao.paginate(pageNumber, pageSize, "select * ", "from adt_adm_div ") : 
				AdtAdmDiv.dao.paginate(pageNumber, pageSize, "select * ", "from adt_adm_div where pcode=? ", pcode);
	}

	@Override
	public boolean save(AdtAdmDiv admDiv) {
		return admDiv.save();
	}

	@Override
	public boolean update(AdtAdmDiv admDiv) {
		return admDiv.update();
	}

	@Override
	public AdtAdmDiv findById(int id) {
		return AdtAdmDiv.dao.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return AdtAdmDiv.dao.deleteById(id);
	}

	@Override
	public List<AdtAdmDiv> getList() {
		return AdtAdmDiv.dao.findByCache("adm_div_list", "adm_div_list", "select * from adt_adm_div");
	}

}
