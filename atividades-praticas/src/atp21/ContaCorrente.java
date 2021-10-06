import java.util.concurrent.ConcurrentHashMap;

public class ContaCorrente extends Conta {

    private double taxaTransferecia = 10.50;
    private double taxaManutencao = 2.50;
    private int numTransferencia = 0;

    @Override
    public void transferencia(double valor){
        super.transferencia(valor);
        double novoSaldo = this.getSaldo() - taxaTransferecia;
        this.setSaldo(novoSaldo);
        this.numTransferencia++;

        if(numTransferencia % 5 == 0){
            novoSaldo = this.getSaldo() - taxaManutencao;
            this.setSaldo(novoSaldo);
        }
    }

}
