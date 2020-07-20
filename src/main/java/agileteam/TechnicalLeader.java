package agileteam;

import agileteam.report.TeamReport;

public class TechnicalLeader implements TeamMember{


    private TeamReport report;

    public TechnicalLeader(TeamReport report) {
        this.report = report;
    }

    @Override
    public String doAction() {
        return "TECH. LEAD: Orienta al equipo";
    }

    @Override
    public String doReport() {
        return report.getReport();
    }
}
