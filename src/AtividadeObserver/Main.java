package AtividadeObserver;

public class Main {

    static Notificacoes notificacoes = new Notificacoes();

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Julia");
        Usuario usuario2 = new Usuario("Raquel");
        Usuario usuario3 = new Usuario("Gabriela");

        notificacoes.addUsuario(usuario1, Categoria.ESPORTE);
        notificacoes.addUsuario(usuario1, Categoria.POLITICA);

        notificacoes.addUsuario(usuario2, Categoria.TECNOLOGIA);
        notificacoes.addUsuario(usuario3, Categoria.ESPORTE);
        notificacoes.addUsuario(usuario3, Categoria.TECNOLOGIA);


        notificacoes.notificar("Chat gpt caiu", Categoria.TECNOLOGIA);
    }
}
