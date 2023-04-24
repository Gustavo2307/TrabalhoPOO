package TrabalhoPOO;

public interface TAD_Pilha {
    public boolean isEmpty();
    public boolean isFull();
    public Cliente push(Cliente x);
    public Cliente pop();
    public Cliente top();
    public void ordena();
    public int busca(String buscado);
    public String toString();
}
