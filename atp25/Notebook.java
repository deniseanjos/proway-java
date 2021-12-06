public class Notebook extends Computador {
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        return "MARCA NOTEBOOK: " + this.marca + "\nMEMORIA RAM: " + this.memoriaRam + "\nPROCESSADOR: " + this.processador + "\nDISCO RIGIDO: " + this.discoRigido + "\nBATERIA: " + this.bateria + "\nVELOCIDADE WIFI: " + this.velocidadeWifi + "\nVERSÃO BLUETOOTH: " + this.versaoBluetooth;
    }
}
