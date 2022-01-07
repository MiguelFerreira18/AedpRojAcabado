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

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return
     */
    public int getIdAuthor() {
        return idAuthor;
    }

    /**
     *
     * @param idAuthor
     */
    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    /**
     *
     * @return
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     *
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Job{" +
                "titulo='" + titulo + '\'' +
                ", idAuthor=" + idAuthor +
                ", pageNumber=" + pageNumber +
                '}';
    }
}//fim da classe
