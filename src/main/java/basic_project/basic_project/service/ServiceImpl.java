package basic_project.basic_project.service;

import basic_project.basic_project.model.Film;
import basic_project.basic_project.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements ServiceAPI {
    @Autowired
    private FilmRepository filmRepository;

    public Film getById(Integer id) {
        return filmRepository.findById(id).orElse(null);
    }
}