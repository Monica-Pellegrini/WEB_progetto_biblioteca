package unife.biblioteca.biblioteca_provinciale.model.mo;

public class PrestitoCopiaLibro extends Prestito {
    private CopiaLibro copiaLibro;


    public CopiaLibro getCopiaLibro() {
        return copiaLibro;
    }

    public void setCopiaLibro(CopiaLibro copiaLibro) {
        this.copiaLibro = copiaLibro;
    }
}
