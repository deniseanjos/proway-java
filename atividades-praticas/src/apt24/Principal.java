public class Principal {
    
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        v1.marca = "Fiat";
        v1.modelo = "Mobi";
        v1.placa = "ABC-1234";

        Carro c1 = new Carro();
        c1.numPortas = 4;
        c1.capacidadePortaMalas = 200.00;

        Object objV = v1;
        imprimir(objV);

        Object objC = c1;
        imprimir(objC);

        Veiculo v2 = (Veiculo)objV;
        imprimir(v2);

        Carro c2 = (Carro)objC;
        imprimir(c2);

        // Testando impressão diretamente pelo override sem criação de função na Main
        // String teste = c2.toString();
        // System.out.println(c2.toString());

    }

    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }

}
