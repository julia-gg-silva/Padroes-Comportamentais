package AtividadeCommand;

public class ComandoImprimir implements Comando {
   private Impressao impressao;

   public ComandoImprimir(Impressao impressao) {
       this.impressao = impressao;
   }

    @Override
    public void executar() {
        impressao.imprimir();
    }

    @Override
    public void desfazer() {
        impressao.calcelar();
    }
}
