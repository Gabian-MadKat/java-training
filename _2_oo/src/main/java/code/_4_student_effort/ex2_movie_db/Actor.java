package code._4_student_effort.ex2_movie_db;

public class Actor {
    public String nume;
    public Integer varsta;
    public Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}