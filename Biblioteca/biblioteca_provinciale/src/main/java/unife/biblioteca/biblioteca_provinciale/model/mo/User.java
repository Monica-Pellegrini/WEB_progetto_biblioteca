package unife.biblioteca.biblioteca_provinciale.model.mo;

import java.time.LocalDate;

public class User {

  private Integer userId;
  private String email;
  private String password;
  private String nomeBatt;
  private String cognome;
  private String codFiscale;
  private String numTelefono;
  private String indirizzo;
  private String luogoNascita;
  private java.sql.Date dataNascita;
  private boolean statoAccount;
  private boolean notificheAttive;
  private Biblioteca[] bibRegistrate;
  private Evento[] eventiPartecipa;
  private PrestitoCopiaLibro[] prestitiLibri;
  private PrestitoCopiaGiornale[] prestitiGiornali;
  private PrestitoCopiaMultimedia[] prestitiMultimedia;
  private Libro[] libriWishlist;
  private Giornale[] giornaliWishlist;
  private Multimedia[] multimediaWishlist;


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) { this.userId = userId; }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNomeBatt() {
    return nomeBatt;
  }

  public void setNomeBatt(String nomeBatt) {
    this.nomeBatt = nomeBatt;
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public String getCodFiscale() {
    return codFiscale;
  }

  public void setCodFiscale(String codFiscale) {
    this.codFiscale = codFiscale;
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

  public String getLuogoNascita() {
    return luogoNascita;
  }

  public void setLuogoNascita(String luogoNascita) {
    this.luogoNascita = luogoNascita;
  }

  public java.sql.Date getDataNascita() {
    return dataNascita;
  }

  public void setDataNascita(java.sql.Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  public boolean isStatoAccount() { return statoAccount; }

  public void setStatoAccount(boolean statoAccount) { this.statoAccount = statoAccount; }

  public boolean isNotificheAttive() { return notificheAttive; }

  public void setNotificheAttive(boolean notificheAttive) { this.notificheAttive = notificheAttive; }

  public Biblioteca[] getBibRegistrate() {
    return bibRegistrate;
  }

  public void setBibRegistrate(Biblioteca[] bibRegistrate) {
    this.bibRegistrate = bibRegistrate;
  }

  public Biblioteca getBibRegistrate(int index) {
    return this.bibRegistrate[index];
  }

  public void setBibRegistrate(int index, Biblioteca biblioteca) {
    this.bibRegistrate[index] = biblioteca;
  }

  public Evento[] getEventiPartecipa() {
    return eventiPartecipa;
  }

  public void setEventiPartecipa(Evento[] eventiPartecipa) {
    this.eventiPartecipa = eventiPartecipa;
  }

  public Evento getEventiPartecipa(int index) {
    return this.eventiPartecipa[index];
  }

  public void setEventiPartecipa(int index, Evento evento) { this.eventiPartecipa[index] = evento; }

  public PrestitoCopiaLibro[] getPrestitiLibri() {
    return prestitiLibri;
  }

  public void setPrestitiLibri(PrestitoCopiaLibro[] prestitiLibri) {
    this.prestitiLibri = prestitiLibri;
  }

  public PrestitoCopiaLibro getPrestitiLibri(int index) {
    return this.prestitiLibri[index];
  }

  public void setPrestitiLibri(int index, PrestitoCopiaLibro prestitoCopiaLibro) { this.prestitiLibri[index] = prestitoCopiaLibro; }

  public PrestitoCopiaGiornale[] getPrestitiGiornali() {
    return prestitiGiornali;
  }

  public void setPrestitiGiornali(PrestitoCopiaGiornale[] prestitiGiornali) { this.prestitiGiornali = prestitiGiornali; }

  public PrestitoCopiaGiornale getPrestitiGiornali(int index) {
    return this.prestitiGiornali[index];
  }

  public void setPrestitiGiornali(int index, PrestitoCopiaGiornale prestitoCopiaGiornale) { this.prestitiGiornali[index] = prestitoCopiaGiornale; }

  public PrestitoCopiaMultimedia[] getPrestitiMultimedia() {
    return prestitiMultimedia;
  }

  public void setPrestitiMultimedia(PrestitoCopiaMultimedia[] prestitiMultimedia) { this.prestitiMultimedia = prestitiMultimedia; }

  public PrestitoCopiaMultimedia getPrestitiMultimedia(int index) {
    return this.prestitiMultimedia[index];
  }

  public void setPrestitiMultimedia(int index, PrestitoCopiaMultimedia prestitoCopiaMultimedia) { this.prestitiMultimedia[index] = prestitoCopiaMultimedia; }

  public Libro[] getLibriWishlist() {
    return libriWishlist;
  }

  public void setLibriWishlist(Libro[] libriWishlist) {
    this.libriWishlist = libriWishlist;
  }

  public Libro getLibriWishlist(int index) {
    return this.libriWishlist[index];
  }

  public void setLibriWishlist(int index, Libro libro) { this.libriWishlist[index] = libro; }

  public Giornale[] getGiornaliWishlist() {
    return giornaliWishlist;
  }

  public void setGiornaliWishlist(Giornale[] giornaliWishlist) { this.giornaliWishlist = giornaliWishlist; }

  public Giornale getGiornaliWishlist(int index) {
    return this.giornaliWishlist[index];
  }

  public void setGiornaliWishlist(int index, Giornale giornale) { this.giornaliWishlist[index] = giornale; }

  public Multimedia[] getMultimediaWishlist() {
    return multimediaWishlist;
  }

  public void setMultimediaWishlist(Multimedia[] multimediaWishlist) { this.multimediaWishlist = multimediaWishlist; }

  public Multimedia getMultimediaWishlist(int index) {
    return this.multimediaWishlist[index];
  }

  public void setMultimediaWishlist(int index, Multimedia multimedia) { this.multimediaWishlist[index] = multimedia; }
}
