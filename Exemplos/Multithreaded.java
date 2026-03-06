/*
    Exemplo de execução de várias tarefas simultaneamente.
*/

class MinhaThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread executando: " + i);
        }
    }
}

public class Multithreaded {
    
    public static void main(String[] args) {

        MinhaThread t = new MinhaThread();
        t.start();

        System.out.println("Main continua executando.");
    }
}
