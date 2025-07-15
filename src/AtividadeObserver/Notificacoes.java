package AtividadeObserver;

import java.util.ArrayList;

public class Notificacoes {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    void addUsuario(Usuario usuario, Categoria categoria) {
        if(!usuarios.contains(usuario)) {
            usuarios.add(usuario);
        }
        usuario.adicionarCategoria(categoria);
    }

    void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    void  notificar(String mensagem, Categoria categoria) {
        for (Usuario usuario : usuarios) {
            for(Categoria c : usuario.getListaCategorias()){
                if(c.equals(categoria)){
                    usuario.enviar(mensagem);
                                    }
            }
        }

    }
}
