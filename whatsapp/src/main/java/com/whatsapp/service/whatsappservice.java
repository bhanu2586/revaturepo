package com.whatsapp.service;

import com.whatsapp.dao.whatsappdao;
import com.whatsapp.dao.whatsappdaointerface;
import com.whatsapp.entity.whatsappuser;

public class whatsappservice implements whatsserviceinterface {

	

	
	public int createprofileservice(whatsappuser wu) {
		whatsappdaointerface dr = new whatsappdao();
		int i = dr. createprofiledao();
		return i;
	}

}
