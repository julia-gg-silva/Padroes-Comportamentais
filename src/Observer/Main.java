package Observer;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Julia");
        Usuario usuario2 = new Usuario("Raquel");

        String mensagem = "Oieee essa é minha notificação";

        Canal canal = new Canal();

        canal.adicionar(usuario1);
        canal.adicionar(usuario2);

        canal.notificar(mensagem);

    }

}