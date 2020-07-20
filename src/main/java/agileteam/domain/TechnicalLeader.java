package agileteam.domain;

import agileteam.domain.report.TeamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class TechnicalLeader implements TeamMember{

    @Autowired
    @Qualifier("technicalLeaderReport")
    private TeamReport report;

    @Override
    public String doAction() {
        return "TECH. LEAD: Orienta al equipo";
    }

    @Override
    public String doReport() {
        return report.getReport();
    }
}
