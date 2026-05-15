/*
    Exemplo de programa que pode rodar em qualquer OS, já que o Java compila para bytecode, que roda na JVM.
*/

public class ArchitectureNeutral {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
    }
}
