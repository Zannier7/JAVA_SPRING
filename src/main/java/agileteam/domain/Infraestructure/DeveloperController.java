package agileteam.domain.Infraestructure;

import agileteam.domain.Developer;
import agileteam.domain.application.DeveloperListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeveloperController {

    @Autowired
    private DeveloperListService developerListService;

    @RequestMapping("/")
    public String inicio(Model model) {
        return "inicio";
    }

    public Map<String, Object> validateDeveloper() {
        Map<String, Object> map = new HashMap<>();
        List<Developer> listDevs = developerListService.getDeveloperList();

        map.put("list", listDevs);
        map.put("size", listDevs.size());
        map.put("code", "ok");

        return map;
    }
}
