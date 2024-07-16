package unife.biblioteca.biblioteca_provinciale.model.mo;

import java.time.LocalDate;

public class Giornale {

    private String issn;
    private String titolo;
    private String editore;
    private LocalDate data;
    private String immmCopertina;
    private Integer numero;
    private String genere;
    private String riassunto;
    private Bibliotecario bibliotecario;
    private User[] userWishlist;


    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getImmmCopertina() {
        return immmCopertina;
    }

    public void setImmmCopertina(String immmCopertina) {
        this.immmCopertina = immmCopertina;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) { this.numero = numero; }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getRiassunto() {
        return riassunto;
    }

    public void setRiassunto(String riassunto) {
        this.riassunto = riassunto;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public User[] getUserWishlist() {
        return userWishlist;
    }

    public void setUserWishlist(User[] userWishlist) {
        this.userWishlist = userWishlist;
    }

    public User getUserWishlist(int index) {
        return this.userWishlist[index];
    }

    public void setUserWishlist(int index, User user) { this.userWishlist[index] = user; }
}
