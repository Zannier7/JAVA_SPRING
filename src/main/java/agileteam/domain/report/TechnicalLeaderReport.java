package agileteam.domain.report;

import org.springframework.stereotype.Component;

@Component
public class TechnicalLeaderReport implements TeamReport{

    @Override
    public String getReport() {
        return "TECH. LEAD: Entrega la deuda tecnica de las apps";
    }
}
