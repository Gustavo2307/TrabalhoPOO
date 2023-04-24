package TrabalhoPOO;

public class Pizza extends Cliente{
    private int quantidade;
    private String tamanho;
    private String sabor;
    private String massa;
    private String bebida;
    //private double preco;
    Principal pri = new Principal();

    public Pizza(){}

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public double getPreco() {
        return pri.preco;
    }

    public void setPreco(int mas, int sab, int beb) {
        //double preco = preco;
        
        
            //Massa
            if(mas==1){
                pri.preco += 2.50;
            }
        
            // Sabor
            switch(sab){
                case 0:  pri.preco+= 49; break;
                case 1:  pri.preco+= 47; break;
                case 2:  pri.preco+= 49; break;
                case 3:  pri.preco+= 49; break;
                case 4:  pri.preco+= 45; break;
                case 5:  pri.preco+= 51; break;
                case 6:  pri.preco+= 39; break;
                case 7:  pri.preco+= 68; break;
                case 8:  pri.preco+= 53; break;
                case 9:  pri.preco+= 45; break;
                case 10: pri.preco+= 53; break;
                case 11: pri.preco+= 51; break;
                case 12: pri.preco+= 49; break;
                case 13: pri.preco+= 45; break;
                case 14: pri.preco+= 39; break;
                case 15: pri.preco+= 47; break;
                case 16: pri.preco+= 54; break;
                case 17: pri.preco+= 58; break;
                case 18: pri.preco+= 53; break;
                case 19: pri.preco+= 55; break;
                case 20: pri.preco+= 51; break;
                case 21: pri.preco+= 55; break;
                case 22: pri.preco+= 49; break;
                
            }
        
        // Bebida
            switch(beb){
                //case 0: preco += 4.50; break;
                case 1: pri.preco += 5.50; break;
                case 2: pri.preco += 7.50; break;
                case 3: pri.preco += 9.50; break;
                case 4: pri.preco += 5.60; break;
            }
        
        
        //System.out.println(getPreco());
    }
    
    
}
