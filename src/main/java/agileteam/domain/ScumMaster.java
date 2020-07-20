package agileteam.domain;

import agileteam.domain.report.TeamReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class ScumMaster implements TeamMember {

    public static final Logger looger = LoggerFactory.getLogger(ScumMaster.class);

    @Autowired
    @Qualifier("scrumMasterReport")
    TeamReport report;

    @Override
    public String doAction() {
        return "SCRUM MASTER: Facilitador del Equipo";
    }

    @Override
    public String doReport() {
        return report.getReport();
    }

    @PostConstruct
    public void initBean() {
        looger.info("Iniciando el bean");
    }

    @PreDestroy
    public void destroyBean() {
        looger.info("Destruyendo el Bean");
    }
}
