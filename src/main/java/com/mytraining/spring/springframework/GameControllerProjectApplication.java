package com.mytraining.spring.springframework;

import com.mytraining.spring.springframework.enterprice.example.web.MyWebController;
import com.mytraining.spring.springframework.games.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class GameControllerProjectApplication {

	public static void main(String[] args)
	{
		/*
		   Using context we are able to manage all beans using Spring Framework.
		   The primary bean is used when the project runs.
		   If there is no primary bean and there are more than one beans, spring framework can not decide which bean should be used.
		 */
		ConfigurableApplicationContext context = SpringApplication.run(GameControllerProjectApplication.class, args);

		GameController control = context.getBean(GameController.class);

		control.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromWebService());

	}

}
