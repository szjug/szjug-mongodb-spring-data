package io.szjug.mdbsd.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		log(mongoOperation.toString());
	}

	private static void log(String s) {
		System.out.println(s);
	}

}
