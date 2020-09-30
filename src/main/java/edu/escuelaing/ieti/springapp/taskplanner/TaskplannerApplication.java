package edu.escuelaing.ieti.springapp.taskplanner;

import edu.escuelaing.ieti.springapp.taskplanner.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class TaskplannerApplication {

	public static ArrayList<User> users = new ArrayList<>();
	public static void main(String[] args) {
		getPort();
		users.add(new User("1","Daniel","Alfonso","daniel@gmail.com"));
		users.add(new User("2","Felipe","Bueno","daniel@gmail.com"));
		users.add(new User("3","Prueba","Prueba","prueba@gmail.com"));
		users.add(new User("4","Prueba2","Prueba2","prueba2@gmail.com"));
		users.add(new User("5","Prueba3","Prueba3","prueba3@gmail.com"));
		SpringApplication.run(TaskplannerApplication.class, args);
	}

	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 35000; //returns default port if heroku-port isn't set(i.e. on localhost)
	}

}
