package basic_project.basic_project.controller;

import basic_project.basic_project.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import basic_project.basic_project.service.ServiceAPI;

@RestController
public class ControllerImpl implements ControllerAPI{
    @Autowired
    ServiceAPI serviceAPI;


    @Override
    @GetMapping("/get-film-by-id")
    public Film getById(Integer id) {
        return serviceAPI.getById(id);
    }
}
