package com.arife.exception_handling;

import com.arife.exception_handling.entity.Student;
import com.arife.exception_handling.exceptions.StudentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class ExceptionHandlingApplication   {

	public static void main(String[] args)  {

		SpringApplication.run(ExceptionHandlingApplication.class, args);
		Student student = new Student(1L,"arife","senol",90,true);
		System.out.println(student);
       //throw new StudentException("Arife sistemde hata aldı", HttpStatus.BAD_REQUEST);
	}

}
