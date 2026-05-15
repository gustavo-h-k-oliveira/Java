/*
    Exemplo de classes e objetos. Aqui aparecem conceitos fundamentais como atributos e métodos.
*/

class Carro {

    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println(modelo + " - " + ano);
    }
}

public class ObjectOriented {
    public static void main(String[] args) {

        Carro c = new Carro();
        c.modelo = "Civic";
        c.ano = 2022;

        c.exibirInfo();
    }
}
