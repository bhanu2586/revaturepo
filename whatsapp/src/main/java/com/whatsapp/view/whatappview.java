package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controler.whatsappconinterface;
import com.whatsapp.controler.whatsappcontroll;

public class whatappview {

	public static void main(String[] args) {
		System.out.println("***main menu****");
		System.out.println("enter1");
		System.out.println("enter1");
		System.out.println("enter1");
		Scanner sc= new Scanner(System.in);
		int c= sc.nextInt();
		whatsappconinterface wc= new whatsappcontroll();
		switch(c) {
		case 1:wc.createprofile();
		break;
		case 2:wc.editprofile();
		break;
		}
	}
}


