package agileteam;

import agileteam.report.TeamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Developer implements TeamMember {

    private TeamReport report;

    @Override
    public String doAction() {
        return "Dev: Realiza desarrollo";
    }

    @Override
    public String doReport() {
        return report.getReport();
    }

    @Autowired
    @Qualifier("developerReport")
    public void setReport(TeamReport report){
        this.report = report;
    }
}
