package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			// createInstructor(appDAO);

			findInstructor(appDAO);
		};
	}

	private void findInstructor(AppDAO appDAO) {

		int theId = 2;
		System.out.println("Finding instructor is: " + theId);

		Instructor tempInstructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated instructorDetail only: "
				+ tempInstructor.getInstructorDetail());

	}

	private void createInstructor(AppDAO appDAO) {

		// create some instructors and details

/*		Instructor tempInstructor = new Instructor("Chad",
				"Darby", "darby@luv2code.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"Luv 2 code !!!");*/

		Instructor tempInstructor = new Instructor("Madhu",
				"Patel", "madhu@luv2code.com");

		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"guitar !!!");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		// NOTE: this will also save the details object
		// because of CascadeType.ALL
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

}
