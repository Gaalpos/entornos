package testVisual;

/**
 * Principal
 */
public class Principal {

    public static int sumar(int a, int b) {
        int valor = a - b;
        return valor;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int resultado = sumar(num1, num2);
        System.out.println(resultado);

    }
}