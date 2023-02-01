import java.util.LinkedList;

public class ListaArray implements EstruturaDeDados{
    private LinkedList<Integer> elementos;

    public ListaArray () {
        elementos = new LinkedList<Integer>();
    }

    @Override
    public boolean insert(int chave) {
        this.elementos.add(chave);
        return false;
    }

    @Override
    public boolean delete(int chave) {
        int aux = -1;
        for (int i = 0; i < this.elementos.size(); i++) {
            if (this.elementos.get(i) == chave) {
                aux = i;
            }
        }
        if(aux >= 0){
            this.elementos.remove(aux);
            return true;
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < this.elementos.size(); i++) {
            if (this.elementos.get(i) == chave) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        int aux = this.elementos.get(1);
        for (int i = 0; i < this.elementos.size(); i++) {
            if (this.elementos.get(i) < aux) {
                aux = this.elementos.get(i);
            }
        }
        return aux;
    }

    @Override
    public int maximum() {
        int aux = this.elementos.get(1);
        for (int i = 0; i < this.elementos.size(); i++) {
            if (this.elementos.get(i) > aux) {
                aux = this.elementos.get(i);
            }
        }
        return aux;
    }

    @Override
    public int sucessor(int chave) {
        int aux = 0;
        int resultado = 0;
        for (int i = 0; i < this.elementos.size(); i++) {
            aux = i;
            if (this.elementos.get(i) == chave) {
                aux = i+1;
            }
        }
        if(aux < this.elementos.size()){
            resultado = this.elementos.get(aux);
        }
        return resultado;
    }

    @Override
    public int prodessor(int chave) {
        int aux = 0;
        int resultado = 0;
        for (int i = 0; i < this.elementos.size(); i++) {
            aux = i;
            if (this.elementos.get(i) == chave) {
                aux = i+1;
            }
        }
        if(aux >= 0){
            resultado = this.elementos.get(aux);
        }
        return resultado;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.delete(3);
        System.out.println(r.search(0));
        System.out.println(r.search(2));
        System.out.println(r.minimum());
        System.out.println(r.maximum());
        System.out.println(r.sucessor(1));
        System.out.println(r.prodessor(1));
    }
}