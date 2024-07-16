package unife.biblioteca.biblioteca_provinciale.model.mo;

public class Biblioteca {
    private Integer idBiblioteca;
    private String nome;
    private String email;
    private String numTelefono;
    private String indirizzo;
    private Integer inventario;
    private String comune;
    private Bibliotecario[] lavoratori;
    private User[] utentiRegistrati;
    private Evento[] eventiOspitati;
    private CopiaLibro[] libriAppartengono;
    private CopiaLibro[] libriOspitati;
    private CopiaLibro[] libriRichiesteFatte;
    private CopiaLibro[] libriRichiesteRicevute;
    private CopiaGiornale[] giornaliAppartengono;
    private CopiaGiornale[] giornaliOspitati;
    private CopiaGiornale[] giornaliRichiesteFatte;
    private CopiaGiornale[] giornaliRichiesteRicevute;
    private CopiaMultimedia[] multimediaAppartengono;
    private CopiaMultimedia[] multimediaOspitati;
    private CopiaMultimedia[] multimediaRichiesteFatte;
    private CopiaMultimedia[] multimediaRichiesteRicevute;

    public Integer getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Integer idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

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

    public Bibliotecario[] getLavoratori() {
        return lavoratori;
    }

    public void setLavoratori(Bibliotecario[] lavoratori) {
        this.lavoratori = lavoratori;
    }

    public Bibliotecario getLavoratori(int index) {
        return this.lavoratori[index];
    }

    public void setLavoratori(int index, Bibliotecario bibliotecario) {
        this.lavoratori[index] = bibliotecario;
    }

    public User[] getUtentiRegistrati() {
        return utentiRegistrati;
    }

    public void setUtentiRegistrati(User[] utentiRegistrati) {
        this.utentiRegistrati = utentiRegistrati;
    }

    public User getUtentiRegistrati(int index) {
        return this.utentiRegistrati[index];
    }

    public void setUtentiRegistrati(int index, User user) { this.utentiRegistrati[index] = user; }

    public Evento[] getEventiOspitati() {
        return eventiOspitati;
    }

    public void setEventiOspitati(Evento[] eventiOspitati) {
        this.eventiOspitati = eventiOspitati;
    }

    public Evento getEventiOspitati(int index) {
        return this.eventiOspitati[index];
    }

    public void setEventiOspitati(int index, Evento evento) { this.eventiOspitati[index] = evento; }

    public CopiaLibro[] getLibriAppartengono() {
        return libriAppartengono;
    }

    public void setLibriAppartengono(CopiaLibro[] libriAppartengono) {
        this.libriAppartengono = libriAppartengono;
    }

    public CopiaLibro getLibriAppartengono(int index) {
        return this.libriAppartengono[index];
    }

    public void setLibriAppartengono(int index, CopiaLibro copiaLibro) { this.libriAppartengono[index] = copiaLibro; }

    public CopiaLibro[] getLibriOspitati() {
        return libriOspitati;
    }

    public void setLibriOspitati(CopiaLibro[] libriOspitati) {
        this.libriOspitati = libriOspitati;
    }

    public CopiaLibro getLibriOspitati(int index) {
        return this.libriOspitati[index];
    }

    public void setLibriOspitati(int index, CopiaLibro copiaLibro) { this.libriOspitati[index] = copiaLibro; }

    public CopiaLibro[] getLibriRichiesteFatte() {
        return libriRichiesteFatte;
    }

    public void setLibriRichiesteFatte(CopiaLibro[] libriRichiesteFatte) { this.libriRichiesteFatte = libriRichiesteFatte; }

    public CopiaLibro getLibriRichiesteFatte(int index) {
        return this.libriRichiesteFatte[index];
    }

    public void setLibriRichiesteFatte(int index, CopiaLibro copiaLibro) { this.libriRichiesteFatte[index] = copiaLibro; }

    public CopiaLibro[] getLibriRichiesteRicevute() {
        return libriRichiesteRicevute;
    }

    public void setLibriRichiesteRicevute(CopiaLibro[] libriRichiesteRicevute) { this.libriRichiesteRicevute = libriRichiesteRicevute; }

    public CopiaLibro getLibriRichiesteRicevute(int index) {
        return this.libriRichiesteRicevute[index];
    }

    public void setLibriRichiesteRicevute(int index, CopiaLibro copiaLibro) { this.libriRichiesteRicevute[index] = copiaLibro; }

    public CopiaGiornale[] getGiornaliAppartengono() {
        return giornaliAppartengono;
    }

    public void setGiornaliAppartengono(CopiaGiornale[] giornaliAppartengono) { this.giornaliAppartengono = giornaliAppartengono; }

    public CopiaGiornale getGiornaliAppartengono(int index) {
        return this.giornaliAppartengono[index];
    }

    public void setGiornaliAppartengono(int index, CopiaGiornale copiaGiornale) { this.giornaliAppartengono[index] = copiaGiornale; }

    public CopiaGiornale[] getGiornaliOspitati() {
        return giornaliOspitati;
    }

    public void setGiornaliOspitati(CopiaGiornale[] giornaliOspitati) { this.giornaliOspitati = giornaliOspitati; }

    public CopiaGiornale getGiornaliOspitati(int index) {
        return this.giornaliOspitati[index];
    }

    public void setGiornaliOspitati(int index, CopiaGiornale copiaGiornale) { this.giornaliOspitati[index] = copiaGiornale; }

    public CopiaGiornale[] getGiornaliRichiesteFatte() {
        return giornaliRichiesteFatte;
    }

    public void setGiornaliRichiesteFatte(CopiaGiornale[] giornaliRichiesteFatte) { this.giornaliRichiesteFatte = giornaliRichiesteFatte; }

    public CopiaGiornale getGiornaliRichiesteFatte(int index) {
        return this.giornaliRichiesteFatte[index];
    }

    public void setGiornaliRichiesteFatte(int index, CopiaGiornale copiaGiornale) { this.giornaliRichiesteFatte[index] = copiaGiornale; }

    public CopiaGiornale[] getGiornaliRichiesteRicevute() {
        return giornaliRichiesteRicevute;
    }

    public void setGiornaliRichiesteRicevute(CopiaGiornale[] giornaliRichiesteRicevute) { this.giornaliRichiesteRicevute = giornaliRichiesteRicevute; }

    public CopiaGiornale getGiornaliRichiesteRicevute(int index) {
        return this.giornaliRichiesteRicevute[index];
    }

    public void setGiornaliRichiesteRicevute(int index, CopiaGiornale copiaGiornale) { this.giornaliRichiesteRicevute[index] = copiaGiornale; }

    public CopiaMultimedia[] getMultimediaAppartengono() {
        return multimediaAppartengono;
    }

    public void setMultimediaAppartengono(CopiaMultimedia[] multimediaAppartengono) { this.multimediaAppartengono = multimediaAppartengono; }

    public CopiaMultimedia getMultimediaAppartengono(int index) {
        return this.multimediaAppartengono[index];
    }

    public void setMultimediaAppartengono(int index, CopiaMultimedia copiaMultimedia) { this.multimediaAppartengono[index] = copiaMultimedia; }

    public CopiaMultimedia[] getMultimediaOspitati() {
        return multimediaOspitati;
    }

    public void setMultimediaOspitati(CopiaMultimedia[] multimediaOspitati) { this.multimediaOspitati = multimediaOspitati; }

    public CopiaMultimedia getMultimediaOspitati(int index) {
        return this.multimediaOspitati[index];
    }

    public void setMultimediaOspitati(int index, CopiaMultimedia copiaMultimedia) { this.multimediaOspitati[index] = copiaMultimedia; }

    public CopiaMultimedia[] getMultimediaRichiesteFatte() {
        return multimediaRichiesteFatte;
    }

    public void setMultimediaRichiesteFatte(CopiaMultimedia[] multimediaRichiesteFatte) { this.multimediaRichiesteFatte = multimediaRichiesteFatte; }

    public CopiaMultimedia getMultimediaRichiesteFatte(int index) {
        return this.multimediaRichiesteFatte[index];
    }

    public void setMultimediaRichiesteFatte(int index, CopiaMultimedia copiaMultimedia) { this.multimediaRichiesteFatte[index] = copiaMultimedia; }

    public CopiaMultimedia[] getMultimediaRichiesteRicevute() {
        return multimediaRichiesteRicevute;
    }

    public void setMultimediaRichiesteRicevute(CopiaMultimedia[] multimediaRichiesteRicevute) { this.multimediaRichiesteRicevute = multimediaRichiesteRicevute; }

    public CopiaMultimedia getMultimediaRichiesteRicevute(int index) {
        return this.multimediaRichiesteRicevute[index];
    }

    public void setMultimediaRichiesteRicevute(int index, CopiaMultimedia copiaMultimedia) { this.multimediaRichiesteRicevute[index] = copiaMultimedia; }
}
