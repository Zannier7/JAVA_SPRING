package agileteam.report;

import org.springframework.stereotype.Component;

@Component
public class DeveloperReport implements TeamReport {
    @Override
    public String getReport() {
        return "Dev: Genera reporte de bugs";
    }
}
