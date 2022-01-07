import java.util.Scanner;

public class Main
{
    static GereImp gp = new GereImp();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        impOpc();
        System.out.println("-------------------------");
        System.out.print("Escolha uma impressora:");
        int imp = in.nextInt();
        System.out.println("-------------------------");
        if(imp==0)
            System.out.println("");
        else {
            impMenu(imp);
            System.out.println("-------------------------");
            System.out.print("Qual ação deseja fazer:");
            int op = in.nextInt();

            while (op > 0 && imp != 0) {
                switch (op) {
                    case 1:
                        System.out.print("titulo:");
                        String title = in.next();
                        System.out.print("id:");
                        int id = in.nextInt();
                        System.out.print("Paginas:");
                        int numPag = in.nextInt();
                        gp.adicionaJob(imp, title, id, numPag);
                        break;
                    case 2:
                        gp.removeJob(imp);
                        break;
                    case 3:
                        gp.removeJobsNumaImp(imp);
                        break;
                    case 4:
                        impOpc();
                        System.out.println("-------------------------");
                        System.out.println("Escolha uma impressora:");
                        imp = in.nextInt();
                        op = 0;
                        break;
                    default:
                        break;
                }
                System.out.println("deseja mesmo sair ?(\"sim\" para sair)");
                String sair = in.next();
                if (sair.equalsIgnoreCase("sim"))
                    break;
                else {
                    impMenu(imp);
                    System.out.println("Qual ação deseja fazer");
                    op = in.nextInt();
                }
            }
        }
    }
    public static void impMenu(int imp)
{
    if(imp==0 || imp>5)
        return;
    else
    {
        switch(imp)
        {
            case 1:
               System.out.println("Impressora dos Alunos:");
               System.out.println("1-adiciona job");
               System.out.println("2-imprimir job com menos paginas");
               System.out.println("3-imprimir todos os jobs");
               System.out.println("4-Sair da impressora");
                break;
            case 2:
                System.out.println("Impressora dos docentes:");
                System.out.println("1-adiciona job");
                System.out.println("2-imprimir job com menos paginas");
                System.out.println("3-imprimir todos os jobs");
                System.out.println("4-Sair da impressora");
                break;
            case 3:
                System.out.println("Impressora dos Funcionários dos serviços:");
                System.out.println("1-adiciona job");
                System.out.println("2-imprimir job com menos paginas");
                System.out.println("3-imprimir todos os jobs");
                System.out.println("4-Sair da impressora");
                break;
            case 4:
                System.out.println("Impressora dos Continuos:");
                System.out.println("1-adiciona job");
                System.out.println("2-imprimir job com menos paginas");
                System.out.println("3-imprimir todos os jobs");
                System.out.println("4-Sair da impressora");
                break;
            case 5:
                System.out.println("Impressora dos Reitores:");
                System.out.println("1-adiciona job");
                System.out.println("2-imprimir job com menos paginas");
                System.out.println("3-imprimir todos os jobs");
                System.out.println("4-Sair da impressora");
                break;
        }
    }
}
public static void impOpc()
{
    System.out.println("1-Impressora dos alunos");
    System.out.println("2-Impressora dos docentes");
    System.out.println("3-Impressora dos Funcionários dos serviços");
    System.out.println("4-Impressora dos continuos");
    System.out.println("5-Impressora dos Reitores");
    System.out.println("0-para sair");
}
}
