package com.zan.dev.web.zan.dev.init;


import agileteam.domain.Developer;
import agileteam.domain.Infraestructure.DeveloperController;
import agileteam.domain.application.DeveloperListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@ComponentScan("agileteam")
public class JwdInitApplication {

    private static final Logger logger = LoggerFactory.getLogger(JwdInitApplication.class);

    @Autowired
    private DeveloperController developerController;

    public static void main(String[] args) {
        SpringApplication.run(JwdInitApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Map<String, Object> listDevelopers = developerController.validateDeveloper();

        String code = (String) listDevelopers.get("code");
        if ("ok".equals(code)) {
			List<Developer> list = (List<Developer>) listDevelopers.get("list");

			list.forEach(developer -> logger.info(developer.getName() + " " + developer.getLastName()));
		} else {
        	logger.info("No existen datos");
		}
    }

}
