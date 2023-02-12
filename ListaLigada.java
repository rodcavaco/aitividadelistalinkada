public class ListaLigada implements EstruturaDeDados{
    private No inicio;

    public void removeInicio (){
        if (inicio != null)
            inicio = inicio.getProximo();
    }

    public void removeFim (){
        if (inicio == null){
            return;
        }
        if (inicio.getProximo() == null){
            inicio = null;
        }
        removeFim(inicio);
    }

    public void removeFim (No n){
        No proximo = n.getProximo();
        if (proximo.getProximo() == null){
            n.setProximo(null);
            return;
        } else{
            removeFim(proximo);
        }
    }

    public void insereInicio (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        No n = new No(valor);
        n.setProximo(inicio);
        inicio = n;

    }

    public void insereFim (int valor){
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        insere(inicio, valor);
    }

    //public boolean procura (int valor){
        //if (inicio == null){
          //  return false;
        //} else {
        //    return procura(inicio, valor);
      //  }
    //}

    public boolean procura (No n, int valor){
        if (n.getValor() == valor){
            return true;
        } else if (n.getProximo() == null){
            return false;
        } else {
            return procura(n.getProximo(), valor);
        }
    }
    public void insere (No n, int valor){
        if (n.getProximo() == null){
            No novo = new No(valor);
            n.setProximo(novo);
        } else {
            insere(n.getProximo(), valor);
        }
    }

    public void remover(int valor){
        if (inicio == null){
            return;
        }
        if (inicio.getValor() == valor){
            inicio = inicio.getProximo();
            return;
        }
        remover(inicio, valor);
    }

    public void remover(No n, int valor){
        No proximo = n.getProximo();
        if (proximo == null){
            return;
        }
        if (proximo.getValor() == valor){
            n.setProximo(proximo.getProximo());
        } else{
            remover(proximo, valor);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50){
                break;
            }
        }
        System.out.println("fim");
    }

    @Override
    public boolean insert(int chave) {
        if(inicio == null){
            inicio = new No(valor);
            return;
        }
        insert(inicio, chave);
    }

    @Override
    public boolean delete(int chave) {
        if (inicio == null){
            return;
        }
        if (inicio.getValor() == valor){
            inicio = inicio.getProximo();
            return;
        }
        remover(inicio, valor);
        return false;
    }

    @Override
    public boolean search(int chave) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int minimum() {
        private int min;
        min = min.getChave();
        if n.getChave() < n.getProximo(){
            max = n.getChave();
            return  max;
        } else if n.getProximo() > n.getChave() {
            n.getProximo() = max;
            return minimun();
        } else {
            return 0;
        }
    }

    @Override
    public int maximum() {
        private int max;
        max = getChave();
        if n.getProximo() > n.getchave(){
            max = n.getProximo();
            return  maximum();
        } else if n.getChave() > n.getProximo() {
            n.getProximo() = max;
            return maximum();
        } else {
            return 0;
        }

    }

    @Override
    public int sucessor(int chave) {
        if chave.getChave() == n.getChave() {
            return chave.getProximo()
        }
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int verificaExistência (No n, int chave){
        if (n.getchave() == chave){
            return chave;
        } else if (n.getProximo() == null){
            return -1;
        } else {
            return procura(n.getProximo(), chave);
        }

    }
}
