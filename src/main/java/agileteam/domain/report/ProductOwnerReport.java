package agileteam.domain.report;

import org.springframework.stereotype.Component;

@Component
public class ProductOwnerReport implements TeamReport{



    @Override
    public String getReport() {
        return "PRODUCT OWNER: Entrega el Product Backlog";
    }
}
