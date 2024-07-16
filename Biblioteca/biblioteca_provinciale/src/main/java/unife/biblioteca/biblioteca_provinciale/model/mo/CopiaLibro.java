package unife.biblioteca.biblioteca_provinciale.model.mo;

public class CopiaLibro extends Libro {
    private Integer inventario;
    private String comune;
    private String editore;
    private String dimensione;
    private Integer numPagine;
    private String stato;
    private String lingue;
    private Integer numRistampa;
    private Biblioteca bibProprietaria;
    private Biblioteca bibOspitante;
    private Biblioteca bibRichiedente;
    private Bibliotecario bibliotecarioRegistra;
    private PrestitoCopiaLibro[] prestiti;



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

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public Integer getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(Integer numPagine) { this.numPagine = numPagine; }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getLingue() {
        return lingue;
    }

    public void setLingue(String lingue) {
        this.lingue = lingue;
    }

    public Integer getNumRistampa() {
        return numRistampa;
    }

    public void setNumRistampa(Integer numRistampa) { this.numRistampa = numRistampa; }

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

    public PrestitoCopiaLibro[] getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(PrestitoCopiaLibro[] prestiti) {
        this.prestiti = prestiti;
    }

    public PrestitoCopiaLibro getPrestiti(int index) {
        return this.prestiti[index];
    }

    public void setPrestiti(int index, PrestitoCopiaLibro prestito) { this.prestiti[index] = prestito; }

}
