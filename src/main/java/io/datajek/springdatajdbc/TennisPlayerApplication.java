package io.datajek.springdatajdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication {


		private Logger logger = LoggerFactory.getLogger(this.getClass());


		public static void main(String[] args) {
			SpringApplication.run(TennisPlayerApplication.class, args);
		}


	}


