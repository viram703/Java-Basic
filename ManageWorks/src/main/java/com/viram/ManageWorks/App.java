package com.viram.ManageWorks;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

interface Iworkdone
{
	void workDone();
}

public class App 
{
    public static void main( String[] args )
    {
    	
    //	Resource resource=new ClassPathResource("Spring.xml") ;
    //	BeanFactory factory=new XmlBeanFactory(resource);
    	ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
    	ProjectManager pm=(ProjectManager)ap.getBean("mag");
    	pm.manageWork();
    	
    	
    	
    	/*
    	
    	System.out.println("Dependency or tightly coupled");
//    	creating Designer  object
    	Designer designer=new Designer();
    	
//    	creating developer  object
    	Developer dev=new Developer();
    	
//    	creating Qa object
    	Qa qa=new Qa();
    	
//    	creating program_manager object
    	ProjectManager manager=new ProjectManager(designer, dev, qa);
    	manager.manageWork();    	
    	*/
    }
}
