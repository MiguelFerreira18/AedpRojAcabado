public class Job
{
    //variaveis
    private String titulo;
    private int idAuthor;
    private int pageNumber;

    //construtor
    public Job(String titulo, int idAuthor, int pageNumber) {
        this.titulo = titulo;
        this.idAuthor = idAuthor;
        this.pageNumber = pageNumber;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getIdAuthor() {
        return idAuthor;
    }
    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    @Override
    public String toString() {
        return  "titulo - "+titulo+", pageNumber=" + pageNumber;
    }
}//fim da classe
