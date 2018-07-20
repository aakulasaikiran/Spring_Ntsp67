package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AOPAfterAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingStore store=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		store=ctx.getBean("pfb",ShoppingStore.class);
		//invoke method
		System.out.println("Bill Amount::"+store.shopping(new String[]{"shirt","pant","watch","cap","shoes"}));
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
