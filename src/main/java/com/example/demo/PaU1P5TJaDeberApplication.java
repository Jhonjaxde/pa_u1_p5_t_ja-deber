package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaU1P5TJaDeberApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PaU1P5TJaDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("original");
		//-----------
		System.out.println("cambios en la misma branch");
		
	}

}
