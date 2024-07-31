package com.whatsapp.controler;

import java.util.Scanner;

import com.whatsapp.entity.whatsappuser;
import com.whatsapp.service.whatsappservice;
import com.whatsapp.service.whatsserviceinterface;

public class whatsappcontroll implements whatsappconinterface {

	public void createprofile(){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your email");
		String email = sc.next();
		whatsappuser wu = new whatsappuser();
		wu.setName(name);
		wu.setEmail(email);
		whatsserviceinterface wi = new whatsappservice();
		int i = wi.createprofileservice(wu);
		if(i>0) {
			System.out.println("profgile create");
		}
		else {
			System.out.println("moi");
		}
		
		
		
		
		
	}

	public void editprofile() {
		// TODO Auto-generated method stub
		
	}

}
