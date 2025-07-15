package AtividadeStrategy;

public class Main {
    public static void main(String[] args) {

        CompraPlano plano = new CompraPlano(new PlanoBasico());
        plano.mostrarTotalPlano();

        CompraPlano plano2 = new CompraPlano(new PlanoPremium());
        plano2.mostrarTotalPlano();
    }
}
