package com.gura.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MyController {
 
@Autowired
public int num;
 
 public String InsertGoods() {
 
	 	String nS=Integer.toString(num);
	 	
	 	num=num+1;
	 	System.out.println(num);
	 	num=num+3;
	 	System.out.println(num);

	 	
	 	return nS;
	
	}
}
