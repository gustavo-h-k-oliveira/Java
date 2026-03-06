/*
    Exemplo de carregamento de classe em tempo de execução.
*/

public class Dynamic {

    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("java.util.Date");
        Object obj = c.getDeclaredConstructor().newInstance();

        System.out.println(obj);
    }
}
