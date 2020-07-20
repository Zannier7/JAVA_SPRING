package com.zan.dev.web.zan.dev.init;


import agileteam.TeamMember;
import agileteam.TechnicalLeader;
import agileteam.report.TechnicalLeaderReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("agileteam")
public class JwdInitApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(JwdInitApplication.class);

	@Autowired
	@Qualifier("developer")
	private TeamMember developerFrontEnd;

	@Autowired
	@Qualifier("developer")
	private TeamMember developerBackEnd;

	@Autowired
	private TeamMember scumMaster;

	@Autowired
	private TeamMember productOwner;

	@Autowired
	@Qualifier("technicalLeader")
	private TeamMember technicalLeader;

	public static void main(String[] args) {
		SpringApplication.run(JwdInitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(developerFrontEnd.doAction());
		logger.info(developerBackEnd.doReport());
		logger.info(scumMaster.doReport());
		logger.info(scumMaster.doAction());
		logger.info(productOwner.doReport());
		logger.info(productOwner.doAction());

		logger.info(technicalLeader.doReport());
		logger.info(technicalLeader.doAction());
	}

	@Bean
	public TechnicalLeaderReport createTechnicalLeaderReport() {
		return new TechnicalLeaderReport();
	}

	@Bean(name="technicalLeader")
	public TechnicalLeader createTechnicalLeader(){
		return new TechnicalLeader(createTechnicalLeaderReport());
	}
}
