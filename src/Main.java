import java.util.Scanner;

public class Main {
    static GereImp gf = new GereImp();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("adicionar um job na impressora dos alunos com: ");
        System.out.println("Titulo - horários");
        System.out.println("Id - 1");
        System.out.println("Paginas - 10");
        gf.adicionaJob(1,"horarios",1,10);
        System.out.println("______________________________________________ ");

        System.out.println("adicionar um job repetido na impressora dos alunos com: ");
        System.out.println("Titulo - horários");
        System.out.println("Id - 1");
        System.out.println("Paginas - 10");
        gf.adicionaJob(1,"horarios",1,10);
        System.out.println("______________________________________________ ");

        System.out.println("adicionar um job na impressora dos alunos com: ");
        System.out.println("Titulo - CV");
        System.out.println("Id - 2");
        System.out.println("Paginas - 2");
        gf.adicionaJob(1,"CV",2,2);

        System.out.println("______________________________________________ ");
        System.out.println("adicionar um job na impressora dos Professores com: ");
        System.out.println("Titulo - Notas");
        System.out.println("Id - 1");
        System.out.println("Paginas - 5");
        gf.adicionaJob(2,"Notas",1,5);
        System.out.println("______________________________________________ ");


        System.out.println("adicionar um job na impressora dos Reitores com: ");
        System.out.println("Titulo - Contas da universidade");
        System.out.println("Id - 6");
        System.out.println("Paginas - 200");
        gf.adicionaJob(5,"Contas da universidade",6,200);
        System.out.println("______________________________________________ ");

        System.out.println("adicionar um job na impressora dos Professores com: ");
        System.out.println("Titulo - Alunos Inscritos");
        System.out.println("Id - 2");
        System.out.println("Paginas - 1");
        gf.adicionaJob(2,"Alunos Inscritos",2,1);
        System.out.println("______________________________________________ ");


        System.out.println("Processamento de um job na impressora dos alunos");
        gf.removeJob(1);
        System.out.println("______________________________________________ ");
        System.out.println("Processamento de um job na impressora dos docentes");
        gf.removeJob(2);
        System.out.println("______________________________________________ ");

        System.out.println("Processamento de um job na impressora dos Continuos");
        gf.removeJob(3);

        System.out.println("______________________________________________ ");
        System.out.println("Processamento de um job na impressora dos Reitores");
        gf.removeJob(5);
        System.out.println("______________________________________________ ");


        System.out.println("processamento de todos os jobs da impressora dos alunos");
        gf.removeJobsNumaImp(1);
//coisas











//        impOpc();
//        System.out.println("-------------------------");
//        System.out.print("Escolha uma impressora:");
//        int imp = in.nextInt();
//        while(imp<1 || imp>5)
//        {
//            System.out.println("Escolha uma impressora dentro das possiveis:");
//            imp = in.nextInt();
//        }
//        System.out.println("-------------------------");
//            impMenu(imp);
//            System.out.println("-------------------------");
//            System.out.print("Qual ação deseja fazer:");
//            int op = in.nextInt();
//
//            while (op > 0 && imp != 0)
//            {
//                switch (op)
//                {
//                    case 1:
//                        System.out.print("titulo:");
//                        String title = in.next();
//                        System.out.print("id:");
//                        int id = in.nextInt();
//                        System.out.print("Paginas:");
//                        int numPag = in.nextInt();
//                        gp.adicionaJob(imp, title, id, numPag);
//                        break;
//                    case 2:
//                        gp.removeJob(imp);
//                        break;
//                    case 3:
//                        gp.removeJobsNumaImp(imp);
//                        break;
//                    case 4:
//                        impOpc();
//                        System.out.println("-------------------------");
//                        System.out.println("Escolha uma impressora:");
//                        imp = in.nextInt();
//                        while(imp<1 || imp>5)
//                        {
//                            System.out.println("Escolha uma impressora dentro das possiveis:");
//                            imp = in.nextInt();
//                        }
//                        break;
//                    default:
//                        System.out.println("Essa opção não existe, selecione outra!");
//                        System.out.println("-------------------------");
//                        break;
//                }
//                    impMenu(imp);
//                    System.out.println("Qual ação deseja fazer");
//                    op = in.nextInt();
//            }
        }//fim do metodo main

//    public static void impMenu(int imp)
//{
//    if(imp==0 || imp>5)
//        return;
//    else
//    {
//        switch(imp)
//        {
//            case 1:
//               System.out.println("Impressora dos Alunos:");
//               System.out.println("1-Adiciona job");
//               System.out.println("2-Imprimir job com menos paginas");
//               System.out.println("3-Imprimir todos os jobs");
//               System.out.println("4-Sair da impressora");
//                break;
//            case 2:
//                System.out.println("Impressora dos docentes:");
//                System.out.println("1-adiciona job");
//                System.out.println("2-imprimir job com menos paginas");
//                System.out.println("3-imprimir todos os jobs");
//                System.out.println("4-Sair da impressora");
//                System.out.println("0-Sair do programa");
//                break;
//            case 3:
//                System.out.println("Impressora dos Funcionários dos serviços:");
//                System.out.println("1-Adiciona job");
//                System.out.println("2-Imprimir job com menos paginas");
//                System.out.println("3-Imprimir todos os jobs");
//                System.out.println("4-Sair da impressora");
//                System.out.println("0-Sair do programa");
//                break;
//            case 4:
//                System.out.println("Impressora dos Continuos:");
//                System.out.println("1-Adiciona job");
//                System.out.println("2-Imprimir job com menos paginas");
//                System.out.println("3-Imprimir todos os jobs");
//                System.out.println("4-Sair da impressora");
//                System.out.println("0-Sair do programa");
//                break;
//            case 5:
//                System.out.println("Impressora dos Reitores:");
//                System.out.println("1-Adiciona job");
//                System.out.println("2-Imprimir job com menos paginas");
//                System.out.println("3-Imprimir todos os jobs");
//                System.out.println("4-Sair da impressora");
//                System.out.println("0-Sair do programa");
//                break;
//        }//fim do switch
//    }//fim do else
//}//fim do metodo
//public static void impOpc()
//{
//    System.out.println("1-Impressora dos alunos");
//    System.out.println("2-Impressora dos docentes");
//    System.out.println("3-Impressora dos Funcionários dos serviços");
//    System.out.println("4-Impressora dos continuos");
//    System.out.println("5-Impressora dos Reitores");
//}//fim do metodo

}//fim da class main
