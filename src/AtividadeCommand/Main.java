package AtividadeCommand;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Impressao impressao = new Impressao();
        Stack<ComandoImprimir> historico = new Stack<>();

        Comando comando = new ComandoImprimir(impressao);

        comando.executar();
        comando.desfazer();

    }
}
