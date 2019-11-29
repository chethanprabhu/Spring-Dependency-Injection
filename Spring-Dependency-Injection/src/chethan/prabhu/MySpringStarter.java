package chethan.prabhu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringStarter {

	public static void main(String[] args) {
		
		//Creating the spring container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive the beans from spring container
		Coach coach = applicationContext.getBean("baseballCoach", Coach.class); //without 2nd parameter the type will be object
		
		//performing necessary operations with the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getCouponCode());
		
		//closing the spring container
		applicationContext.close();

	}

}
