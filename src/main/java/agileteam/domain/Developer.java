package agileteam.domain;

import agileteam.domain.report.TeamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class Developer implements TeamMember {

    private TeamReport report;

    private String name;
    private String lastName;

    public Developer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
