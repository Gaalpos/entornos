public class pruebas {

    public static void main(String[] args) {
        

        System.out.println(busca(66));

        System.out.println(cuentaPositivos());

        for(int i=0; i<numeros.length; i++){
	    	System.out.println(i);
        }



    }
    static int numeros[] = {-5, 3,6, 66, 55,2,-7,6,1};

    static boolean busca(int numeroBuscado){
        for(int n: numeros){
            if(numeroBuscado == n){
                return true;
            }
        }
        return false;
    }

    static int cuentaPositivos() {
    	int contador = 0;
    	for(int n: numeros) {
    		if(n>=0) {
    			contador++;
    		}
    	}
    	return contador;
    }


    
    
}
