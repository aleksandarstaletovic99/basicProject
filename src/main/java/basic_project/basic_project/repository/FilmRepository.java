package basic_project.basic_project.repository;

import basic_project.basic_project.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {

}
