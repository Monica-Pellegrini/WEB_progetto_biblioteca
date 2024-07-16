package unife.biblioteca.biblioteca_provinciale.model.mo;

public class Libro {
    private String isbn;
    private String titolo;
    private Integer anno;
    private String immmCopertina;
    private String autore;
    private String genere;
    private String riassunto;
    private Bibliotecario bibliotecario;
    private User[] userWishlist;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) { this.anno = anno; }

    public String getImmmCopertina() {
        return immmCopertina;
    }

    public void setImmmCopertina(String immmCopertina) {
        this.immmCopertina = immmCopertina;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

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
