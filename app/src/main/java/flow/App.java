/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package flow;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }
    public int restar(int n1, int n2){
        int resta = n1 - n2;
        return resta;
    }
}
