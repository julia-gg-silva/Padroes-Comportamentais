package Observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    public ArrayList<Observador> observadores = new ArrayList<>();

    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(String mensagem) {
        for (Observador observador : observadores) {
            observador.update(mensagem);
        }
    }

}
