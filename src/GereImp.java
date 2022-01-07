
public class GereImp
{
Impressora[] listImp;
    public GereImp()
    {
        this.listImp = new Impressora[6];
        listImp[0] = null;
        listImp[1] = new Impressora("Alunos");
        listImp[2] = new Impressora("Docentes");
        listImp[3] = new Impressora("Funcionários S");
        listImp[4] = new Impressora("Continuos");
        listImp[5] = new Impressora("Reitores");
    }

    public void adicionaJob(int imp,String titulo,int id,int numPags)
    {
        listImp[imp].add(titulo,id,numPags);
        System.out.println("Job adicionado");
    }
    public void removeJob(int imp)
    {
        Job delJob = listImp[imp].popMin();
        System.out.println(delJob);
    }
    public void removeJobsNumaImp(int imp)
    {
        listImp[imp].printAll();
    }


}
