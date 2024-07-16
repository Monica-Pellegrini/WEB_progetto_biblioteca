package unife.biblioteca.biblioteca_provinciale.model.mo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Evento {

    private Integer idEvento;
    private LocalDateTime data;
    private String luogo;
    private String nome;
    private String descrizione;
    private String immagine;
    private Biblioteca bibOspitante;
    private Bibliotecario bibliotecarioOrganizza;
    private User[] partecipanti;


    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public Biblioteca getBibOspitante() {
        return bibOspitante;
    }

    public void setBibOspitante(Biblioteca bibOspitante) {
        this.bibOspitante = bibOspitante;
    }

    public Bibliotecario getBibliotecarioOrganizza() {
        return bibliotecarioOrganizza;
    }

    public void setBibliotecarioOrganizza(Bibliotecario bibliotecarioOrganizza) { this.bibliotecarioOrganizza = bibliotecarioOrganizza; }

    public User[] getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(User[] partecipanti) {
        this.partecipanti = partecipanti;
    }

    public User getPartecipanti(int index) { return this.partecipanti[index]; }

    public void setPartecipanti(int index, User user) { this.partecipanti[index] = user; }
}
