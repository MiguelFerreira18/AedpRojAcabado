
public class GereImp {
    //variaveis
Impressora[] listImp;

    /**
     * construtor
     */
    public GereImp()
    {
        this.listImp = new Impressora[6];
        listImp[0] = null; // o primeiro elemente é nulo para facilitar a leitura no menu
        listImp[1] = new Impressora("Alunos");
        listImp[2] = new Impressora("Docentes");
        listImp[3] = new Impressora("Funcionários S");
        listImp[4] = new Impressora("Continuos");
        listImp[5] = new Impressora("Reitores");
    }

    /**
     * Este metodo adiciona um job numa dada impressora
     * @param imp posição da impressora que se quer aceder
     * @param titulo titulo do job que se vai inserir impressora
     * @param id id do job que se vai inserir na impressora
     * @param numPags número de paginas que o job tem
     */
    public void adicionaJob(int imp,String titulo,int id,int numPags)
    {
        listImp[imp].add(titulo,id,numPags);
        System.out.println("Job adicionado");
    }//fim do metodo

    /**
     * Este metodo elemina o job mais pequeno(numero de paginas) da impressora
     * @param imp posição da impressora que se quer aceder
     */
    public void removeJob(int imp)
    {
        Job delJob = listImp[imp].popMin();
        System.out.println(delJob);
    }//fim do metodo

    /**
     * Este metodo elemina todos os jobs de uma determianda impressora
     * @param imp posição da impressora que se quer aceder
     */
    public void removeJobsNumaImp(int imp)
    {
        listImp[imp].printAll();
    }//fim do metodo
}//fim da classe
