public class Veiculo{
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "MARCA DO VEICULO: " + this.marca + "\nMODELO: " + this.modelo + "\nPLACA: " + this.placa;
    }
}