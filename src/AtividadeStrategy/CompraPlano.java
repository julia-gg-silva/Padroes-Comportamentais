package AtividadeStrategy;

public class CompraPlano {
    PlanoStrategy plano;

    public CompraPlano(PlanoStrategy plano) {
        this.plano = plano;
    }

    void mostrarTotalPlano(){
        System.out.println("Total R$ "+ plano.calcularPlano());
    }
}
