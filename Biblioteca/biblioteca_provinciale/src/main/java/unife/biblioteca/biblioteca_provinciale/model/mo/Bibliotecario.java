package unife.biblioteca.biblioteca_provinciale.model.mo;

public class Bibliotecario extends User{
    private Biblioteca biblioteca;
    private Evento[] eventiOrganizza;
    private Libro[] libriRegistrati;
    private CopiaLibro[] copieLibriRegistrati;
    private Giornale[] giornaliRegistrati;
    private CopiaGiornale[] copieGiornaliRegistrati;
    private Multimedia[] multimediaRegistrati;
    private CopiaMultimedia[] copieMultimediaRegistrati;


    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Evento[] getEventiOrganizza() {
        return eventiOrganizza;
    }

    public void setEventiOrganizza(Evento[] eventiOrganizza) {
        this.eventiOrganizza = eventiOrganizza;
    }

    public Evento getEventiOrganizza(int index) {
        return this.eventiOrganizza[index];
    }

    public void setEventiOrganizza(int index, Evento evento) { this.eventiOrganizza[index] = evento; }

    public Libro[] getLibriRegistrati() {
        return libriRegistrati;
    }

    public void setLibriRegistrati(Libro[] libriRegistrati) {
        this.libriRegistrati = libriRegistrati;
    }

    public Libro getLibriRegistrati(int index) {
        return this.libriRegistrati[index];
    }

    public void setLibriRegistrati(int index, Libro libro) { this.libriRegistrati[index] = libro; }

    public CopiaLibro[] getCopieLibriRegistrati() {
        return copieLibriRegistrati;
    }

    public void setCopieLibriRegistrati(CopiaLibro[] copieLibriRegistrati) { this.copieLibriRegistrati = copieLibriRegistrati; }

    public CopiaLibro getCopieLibriRegistrati(int index) {
        return this.copieLibriRegistrati[index];
    }

    public void setCopieLibriRegistrati(int index, CopiaLibro copiaLibro) { this.copieLibriRegistrati[index] = copiaLibro; }

    public Giornale[] getGiornaliRegistrati() {
        return giornaliRegistrati;
    }

    public void setGiornaliRegistrati(Giornale[] giornaliRegistrati) { this.giornaliRegistrati = giornaliRegistrati; }

    public Giornale getGiornaliRegistrati(int index) {
        return this.giornaliRegistrati[index];
    }

    public void setGiornaliRegistrati(int index, Giornale giornale) { this.giornaliRegistrati[index] = giornale; }

    public CopiaGiornale[] getCopieGiornaliRegistrati() {
        return copieGiornaliRegistrati;
    }

    public void setCopieGiornaliRegistrati(CopiaGiornale[] copieGiornaliRegistrati) { this.copieGiornaliRegistrati = copieGiornaliRegistrati; }

    public CopiaGiornale getCopieGiornaliRegistrati(int index) {
        return this.copieGiornaliRegistrati[index];
    }

    public void setCopieGiornaliRegistrati(int index, CopiaGiornale copiaGiornale) { this.copieGiornaliRegistrati[index] = copiaGiornale; }

    public Multimedia[] getMultimediaRegistrati() {
        return multimediaRegistrati;
    }

    public void setMultimediaRegistrati(Multimedia[] multimediaRegistrati) { this.multimediaRegistrati = multimediaRegistrati; }

    public Multimedia getMultimediaRegistrati(int index) {
        return this.multimediaRegistrati[index];
    }

    public void setMultimediaRegistrati(int index, Multimedia multimedia) { this.multimediaRegistrati[index] = multimedia; }

    public CopiaMultimedia[] getCopieMultimediaRegistrati() {
        return copieMultimediaRegistrati;
    }

    public void setCopieMultimediaRegistrati(CopiaMultimedia[] copieMultimediaRegistrati) { this.copieMultimediaRegistrati = copieMultimediaRegistrati; }

    public CopiaMultimedia getCopieMultimediaRegistrati(int index) {
        return this.copieMultimediaRegistrati[index];
    }

    public void setCopieMultimediaRegistrati(int index, CopiaMultimedia copiaMultimedia) { this.copieMultimediaRegistrati[index] = copiaMultimedia; }
}
