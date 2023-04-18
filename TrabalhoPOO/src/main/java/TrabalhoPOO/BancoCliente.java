package TrabalhoPOO;

public class BancoCliente implements TAD_Pilha {

    private int topo;	//Topo da Pilha
    private int MAX;	//Tamanho da Pilha
    private Cliente memo[];	//Elementos da Pilha (objeto genérico)

    //Método construtor que inicializa a Pilha no estado vazia
    public BancoCliente() {
        topo = -1;
        MAX = 30;
        memo = new Cliente[MAX];
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public BancoCliente(int qtde) {
        topo = -1;
        MAX = qtde;
        memo = new Cliente[MAX];
    }

    //Método que verifica se a Pilha está Vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Método que verifica se a Pilha está cheia
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    public Cliente push(Cliente x) {
        if (!isFull()) {
            memo[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += " " + memo[i].toString();
                if(i!=topo)msg += "\n";
            }
            return ("P: [ \n" + msg + " \n]");
        } else {
            return "P: [ ]";
        }
    }

    //Método para retornar o topo da Pilha e remove-lo
    public Cliente pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    //Método que retorna o topo da pilha sem removê-lo
    public Cliente top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }
    
    public void ordena(){
        for(int i = 0;i<memo.length-1;i++){
            int trocas = 0;
            for(int j = 0; j<memo.length-1-i;i++){
                if(memo[i].nome.compareTo(memo[j].nome) > 0){
                String tpm = memo[j].nome;
                memo[j].nome = memo[j+1].nome;
                memo[j+1].nome = tpm;
                trocas++;
                }
            }
            if(trocas == 0) break;
        }
    }
    
    public int busca(String buscado) {
        for(int i= 0; i< memo.length; i++){
            if(memo[i].nome == buscado) return i;
        }
        return -1;
    }

    
}
