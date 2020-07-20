package agileteam.domain;

import agileteam.domain.report.TeamReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ProductOwner implements TeamMember{

    private TeamReport report;

    @Autowired
     public ProductOwner(@Qualifier("productOwnerReport") TeamReport report) {
         this.report = report;
     }

    @Override
    public String doAction() {
        return "PRODUCT OWNER: Define las historias de usuario";
    }

    @Override
    public String doReport() {
        return report.getReport();
    }
}
