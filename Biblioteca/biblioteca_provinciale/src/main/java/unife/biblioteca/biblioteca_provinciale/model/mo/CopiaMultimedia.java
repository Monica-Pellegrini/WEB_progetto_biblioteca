package unife.biblioteca.biblioteca_provinciale.model.mo;

public class CopiaMultimedia extends Multimedia {

    private Integer inventario;
    private String comune;
    private String stato;
    private Biblioteca bibProprietaria;
    private Biblioteca bibOspitante;
    private Biblioteca bibRichiedente;
    private Bibliotecario bibliotecarioRegistra;
    private PrestitoCopiaMultimedia[] prestiti;


    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) { this.inventario = inventario; }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Biblioteca getBibProprietaria() {
        return bibProprietaria;
    }

    public void setBibProprietaria(Biblioteca bibProprietaria) {
        this.bibProprietaria = bibProprietaria;
    }

    public Biblioteca getBibOspitante() {
        return bibOspitante;
    }

    public void setBibOspitante(Biblioteca bibOspitante) {
        this.bibOspitante = bibOspitante;
    }

    public Biblioteca getBibRichiedente() {
        return bibRichiedente;
    }

    public void setBibRichiedente(Biblioteca bibRichiedente) {
        this.bibRichiedente = bibRichiedente;
    }

    public Bibliotecario getBibliotecarioRegistra() {
        return bibliotecarioRegistra;
    }

    public void setBibliotecarioRegistra(Bibliotecario bibliotecarioRegistra) { this.bibliotecarioRegistra = bibliotecarioRegistra; }

    public PrestitoCopiaMultimedia[] getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(PrestitoCopiaMultimedia[] prestiti) {
        this.prestiti = prestiti;
    }

    public PrestitoCopiaMultimedia getPrestiti(int index) {
        return this.prestiti[index];
    }

    public void setPrestiti(int index, PrestitoCopiaMultimedia prestito) { this.prestiti[index] = prestito; }
}
