import java.util.ArrayList;

public class Impressora
{

    private ArrayList<Job> heap;
    private int tamanho;
    public Impressora()
    {
        this.heap = new ArrayList<Job>();//array list de jobs
        this.heap.add(null);//valor inicial que será alterado
        this.tamanho = 0;//tamanho inicial
    }
    public Impressora(int sizeArray)
    {
        this.heap = new ArrayList<Job>(sizeArray);//array list de jobs
        this.heap.add(null);//valor inicial que será alterado
        this.tamanho = 0;//tamanho inicial
    }

    /**
     *  Este meodo adiciona um noo job na heap
     * @param titulo titulo do job
     * @param idAuthor  id do autor
     * @param pageNumber  numero de paginas do job
     */
    public void add(String titulo, int idAuthor, int pageNumber)
    {
        heap.add(new Job(titulo,idAuthor,pageNumber));
        tamanho++;
        sobeEmBolha(); //comparação para trocar valores maior para menor
    }
/**
* Este metodo elemina o valor mais pequeno(primeiro valor da heap)
* @return retorna o valor eleminado
*/
public Job popMin()
{
   if (tamanho == 0)
   {
       throw new Error("Heap está vazia");
   }
   troca(1, tamanho);
   Job min = heap.remove(tamanho);
   tamanho--;
   heapify();
   return min;
}

    /**
     * Este metodo elemina um job á escolha
     * @param id    id do autor
     * @param titulo    titulo do job
     * @return  deolve o job eleminado
     */
    public Job pop(int id, String titulo)
{
    if (tamanho==0)
    {
        throw new Error("heap vazia");
    }
    for(Job d : heap)
    {
        if(d==null)
            continue;
        if (d.getIdAuthor()==id && d.getTitulo().compareToIgnoreCase(titulo)==0)
        {
            System.out.println("aqui");
            Job removed = d;
            heap.remove(d);
            tamanho--;
            heapify();
            return removed;
        }
    }
    throw new Error("não tem esse titulo nem esse id");//ver depois
}

    /**
     * metodo para trocar os elementos para que estajam por ordem crescente de nº de paginas  (troca um dos elementos filhos pelo parent se o parent for maior)
     */
    private void sobeEmBolha()
{
    int current = tamanho;
    while(current > 1 && heap.get(current).getPageNumber()<(heap.get(getParent(current)).getPageNumber()))
    {
        troca(current, getParent(current));
        current = getParent(current);
    }
}

    /**
     * metodo para fazer trocar os elementos
     */
    private void heapify() {
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
    }
}

    /**
     * metodo que será usado para trocar os elementos no array
     * @param a posição do elemento corrente
     * @param b posição do filho esquerdo ou filho direito
     */
    private void troca(int a, int b)
{
    Job temp = heap.get(b);
    heap.set(b, heap.get(a));
    heap.set(a, temp);
}

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
}

    /**
     * metodo para imprimir todos os jobs
     */
    public void printAll()
{
    try {
        if (heap.get(1)==null)
        {
            System.out.println("não há jobs na impressora");
        }
    }catch(Exception e)
    {
        System.out.println("não há jobs na impressora");
        return;
    }
    while(tamanho!=0)
    {
        if(heap.get(tamanho)!=null)
        {
            System.out.println(heap.get(tamanho).getIdAuthor() +" imprimiu - " + heap.get(tamanho).getPageNumber()+" paginas com o titulo - " + heap.get(tamanho).getTitulo());
            heap.remove(tamanho);
            heapify();
        }
        tamanho--;
    }
}
public void printAlll()
{
   while(tamanho>=1)
   {
       System.out.println(popMin().getPageNumber());
   }
}
public int getParent(int current)
{
    return (int) Math.floor(current / 2);
}

public int getLeft(int current)
{
    return current * 2;
}

public int getRight(int current)
{
    return (current * 2) + 1;
}
}