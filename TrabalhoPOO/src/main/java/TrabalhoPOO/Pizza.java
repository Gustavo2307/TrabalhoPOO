package TrabalhoPOO;

public class Pizza extends Cliente{
    private int qunatidade;
    private String tamanho;
    private String sabor;

    public Pizza(){}

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    
}
