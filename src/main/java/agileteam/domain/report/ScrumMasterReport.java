package agileteam.domain.report;

import org.springframework.stereotype.Component;

@Component
public class ScrumMasterReport implements TeamReport{
    @Override
    public String getReport() {
        return "SCRUM MASTER: Facilitador de equipo";
    }
}
