package AtividadeObserver;

import java.util.ArrayList;

public class Usuario implements Observer {

    private String nome;
    private ArrayList<Categoria> listaCategorias;

    public Usuario(String nome) {
        this.nome = nome;
        this.listaCategorias = new ArrayList<>();
    }


    public void adicionarCategoria(Categoria c) {
        listaCategorias.add(c);
    }

    @Override
    public void enviar(String atualizacao) {
        System.out.println("Ultima atualização para "+this.nome +": "+ atualizacao);
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }
}
