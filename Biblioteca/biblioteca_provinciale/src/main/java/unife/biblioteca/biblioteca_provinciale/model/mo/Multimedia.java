package unife.biblioteca.biblioteca_provinciale.model.mo;

public class Multimedia {
    private Integer idMultimedia;
    private String titolo;
    private String editore;
    private String tipo;
    private String genere;
    private String riassunto;
    private Bibliotecario bibliotecario;
    private User[] userWishlist;


    public Integer getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(Integer idMultimedia) { this.idMultimedia = idMultimedia; }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
