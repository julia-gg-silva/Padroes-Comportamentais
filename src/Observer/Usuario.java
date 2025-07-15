package Observer;

public class Usuario implements Observador{

    String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }
}
