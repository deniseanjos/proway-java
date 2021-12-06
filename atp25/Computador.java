public class Computador{
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "MARCA COMPUTADOR: " + this.marca + "\nMEMORIA RAM: " + this.memoriaRam + "\nPROCESSADOR: " + this.processador + "\nDISCO RIGIDO: " + this.discoRigido;
    }
}