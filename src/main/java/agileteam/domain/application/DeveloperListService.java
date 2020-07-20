package agileteam.domain.application;

import agileteam.domain.Developer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperListService {

    public List<Developer> getDeveloperList() {
        List<Developer> list = new ArrayList<>();
        list.add(new Developer("Zannier", "Vargas Cisneros"));
        list.add(new Developer("Deyvis", "Garcia Cercado"));
        list.add(new Developer("Jeiner", "Castro Vasquez"));
        list.add(new Developer("Hans", "Exebio Fernandez"));
        return list;
    }
}
