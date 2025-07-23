package basic_project.basic_project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "filmId")
    private Integer filmId;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "budzet")
    private Double budzet;
    @Column(name = "opis")
    private String opis;
    @Column(name = "godina")
    private Integer godina;
    @Column(name = "userID")
    private Integer userId;

    public Film() {
    }

    public Film(Integer filmId, String naziv, Double budzet, String opis, Integer godina, Integer userId) {
        this.filmId = filmId;
        this.naziv = naziv;
        this.budzet = budzet;
        this.opis = opis;
        this.godina = godina;
        this.userId = userId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getBudzet() {
        return budzet;
    }

    public void setBudzet(Double budzet) {
        this.budzet = budzet;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getGodina() {
        return godina;
    }

    public void setGodina(Integer godina) {
        this.godina = godina;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
