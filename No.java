public class No{
    private int valor;
    private No proximo;
    private int chave;

    public No(int valor) {
        this.valor = valor;
        proximo = null;
    }

    public No(int chave) {
        this.chave = chave;
        proximo = null;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No novo) {
        proximo = novo;
    }

    public int getValor() {
        return valor;
    }

    public int getChave() {
        return chave;
    }

}