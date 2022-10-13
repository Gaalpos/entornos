package testVisual;

/**
 * Principal
 */
public class Principal {

    public static int sumar(int c) {
        int a = 7;
        return a * c;
    }

    public static void  main(String[] args) {
        int num1 =5;
        int num2 =8;     
        int result =num1+num2;
        System.out.println(result);        
        int result2 = sumar(6);
        System.out.println(result2);
    }
