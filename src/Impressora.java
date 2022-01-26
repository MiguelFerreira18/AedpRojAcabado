import java.util.ArrayList;

public class Impressora {
    //variaveis
    private String name;
    private ArrayList<Job> heap;
    private int tamanho;
    /**
     * Construtor sem espaço
     * @param name nome da impressora
     */
    public Impressora(String name)
    {
        this.name = name;
        this.heap = new ArrayList<Job>();//array list de jobs
        this.heap.add(null);//este valor serve essencialmente para ajudar quando se está a ver os valores em vez de começar em 0 começa em 1
        this.tamanho = 0;//tamanho inicial
    }
    /**
     * construtor com espaço limitado
     * @param name nome da impressora
     * @param sizeArray tamanho do array
     */
    public Impressora(String name,int sizeArray)
    {
        this.heap = new ArrayList<Job>(sizeArray);//array list de jobs
        this.heap.add(null);//este valor serve essencialmente para ajudar quando se está a ver os valores em vez de começar em 0 começa em 1
        this.tamanho = 0;//tamanho inicial
    }

    /**
     *  Este meodo adiciona um noo job na heap
     * @param titulo titulo do job
     * @param idAuthor  id do autor
     * @param pageNumber  numero de paginas do job
     */
    public String add(String titulo, int idAuthor, int pageNumber)
    {
        for (Job j:heap)
        {
            if (j == null) {
                continue;
            } else if(j.getTitulo().compareToIgnoreCase(titulo)==0 && j.getIdAuthor() == idAuthor ) {
                return "não se pode por Jobs repetidos";
            }
        }

        heap.add(new Job(titulo,idAuthor,pageNumber));
        tamanho++;
        sobeEmBolha(); //comparação para trocar valores maior para menor
        return "Job adicionado";
    }//fim do metodo
/**
* Este metodo elemina o valor mais pequeno(primeiro valor da heap)
* @return retorna o valor eleminado
*/
public Job popMin()
{
    try {
        if (tamanho == 0) {
            throw new Error("Heap está vazia");
        }
        troca(1, tamanho);
        Job min = heap.remove(tamanho);
        tamanho--;
        heapify();
        return min;
    }catch (Error e){
        System.out.println("Como a impressora dos Continuos está vazia vai enviar um erro");
        return null;
    }
}//fim do metodo
    /**
     * metodo para trocar o elemento que foi recentemente adicionado em que compara com o elemetno pai se for menor irá trocar sucessivamente até deixar de o ser
     */
    private void sobeEmBolha()
{
    int current = tamanho;
    while(current > 1 && heap.get(current).getPageNumber()<(heap.get(getParent(current)).getPageNumber()))
    {
        troca(current, getParent(current));
        current = getParent(current);
    }
}//fim do metodo
    /**
     * metodo para fazer trocar os elementos
     */
    private void heapify()
    {
    int current = 1;
    int leftChild = getLeft(current);
    int rightChild = getRight(current);
    while (podeTrocar(current, leftChild, rightChild))
    {
        if (existe(leftChild) && existe(rightChild))
        {
            if (heap.get(leftChild).getPageNumber() < heap.get(rightChild).getPageNumber())
            {
                troca(current, leftChild);
                current = leftChild;
            } else
            {
                troca(current, rightChild);
                current = rightChild;
            }
        } else
        {
            troca(current, leftChild);
            current = leftChild;
        }
        leftChild = getLeft(current);
        rightChild = getRight(current);
    }//fim do while
}//fim do metodo
    /**
     * metodo que será usado para trocar os elementos no array
     * @param inicial posição do elemento corrente
     * @param ultimo posição do filho esquerdo ou filho direito
     */
    private void troca(int inicial, int ultimo)
{
    Job temp = heap.get(ultimo);
    heap.set(ultimo, heap.get(inicial));
    heap.set(inicial, temp);
}//fim do metodo
    /**
     * verifica se o index numa posição do array existe vendo se é menor ou igual que o tamanho
     * @param index posição que se quer saber se existe
     * @return retorna verdadeiro se o valor existe e falso se o valor não existe
     */
    private boolean existe(int index)
{
    return index <= tamanho;
}
    /**
     * metodo que verifica se os elementos podem ser trocados
     * @param current   posição do pai
     * @param leftChild     posição do filho esquerdo
     * @param rightChild   posição do filho direito
     * @return retorna verdadeiro se os valores existem e se o número de paginas  do filho esquerdo ou o filho direito forem maiores que o numero de paginas do pai
     */
    private boolean podeTrocar(int current, int leftChild, int rightChild)
{
    return (existe(leftChild) && (heap.get(current).getPageNumber()>heap.get(leftChild).getPageNumber()) || (existe(rightChild) && (heap.get(current).getPageNumber()>heap.get(rightChild).getPageNumber())));
}//fim do metodo
    /**
     * metodo para imprimir todos os jobs por ordem
     */
    public void printAll()
{
    if (heap.get(1)==null)
    {
        System.out.println("não há jobs na impressora");
    }
   while(tamanho>=1)
   {
       System.out.println(popMin());
   }//fim do while
}//fim do metodo
    /**
     * este metodo arranja o pai de um job
     * @param current posição corrente
     * @return retorna a posição do pai
     */
    public int getParent(int current)
{
    return (int) Math.floor(current / 2);
}
    /**
     * este metodo arranja o filho esquerdo de um job
     * @param current posição corrente
     * @return retorna a posição do filho esquerdo
     */
    public int getLeft(int current)
{
    return current * 2;
}
    /**
     * este metodo arranja o filho direito de um job
     * @param current posição corrente
     * @return retorna a posição do filho esquerdo
     */
    public int getRight(int current)
{
    return (current * 2) + 1;
}
}//fim da class
