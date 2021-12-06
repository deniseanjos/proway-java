public class Desktop extends Computador {
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "MARCA DESKTOP: " + this.marca + "\nMEMORIA RAM: " + this.memoriaRam + "\nPROCESSADOR: " + this.processador + "\nDISCO RIGIDO: " + this.discoRigido + "\nTAMANHO GABINETE: " + this.tamanhoGabinete + "\nMONITOR EXTERNO: " + this.monitorExterno + "\nFONTE: " + this.fonte;
    }

    // @Override
    // public String toString() {
    //     return super.toString() + "\nTAMANHO GABINETE: " + this.tamanhoGabinete + "\nMONITOR EXTERNO: " + this.monitorExterno + "\nFONTE: " + this.fonte;
    // }
}
