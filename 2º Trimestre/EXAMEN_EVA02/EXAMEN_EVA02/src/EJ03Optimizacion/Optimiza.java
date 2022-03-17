package EJ03Optimizacion;

import java.util.Arrays;

public class Optimiza {
	
    int numeros[] = {-5, 3,6, 66, 55,2,-7,6,1};

    /* eliminado codigo innecesario eliminando la variable esta añadiendo un return*/
    /* Este método busca si un numero está en una lista de números*/
    boolean busca(int numeroBuscado){
        for(int n: numeros){
            if(numeroBuscado == n){
                return true;
            }
        }
        return false;
    }
    
    /* codigo muerto eliminado */
    /* Este cuenta cuantos números positivos hay en la lista de numeros */
    int cuentaPositivos() {
    	int contador = 0;
    	for(int n: numeros) {
    		if(n>=0) {
    			contador++;
    		}
    	}
    	return contador;
    }
    
    /* sin cambios */
    /* Este método calcula la media de todos los números guardado en la lista de números*/
    float calculaMedia() {
    	float cont = 0;
        for (double num : numeros) {
            cont += num;

        }
        return cont / numeros.length;
    }
    
    /* añadi lNumeros y media para hacer mas rapido el codigo */
    /* Este método divide cada número de la lista entre la media de todos los numeros*/
    float[] dividelosPorLaMedia() {
        int lNumeros = numeros.length;
    	float nuevosNumeros[] = new float[lNumeros];
        float media = calculaMedia();
    	for(int i=0;i<lNumeros;i++) {
    		nuevosNumeros[i] = numeros[i] / media;
    	}
    	return nuevosNumeros;
    }
    
    /* Eliminada la variable incecesaria mediana y simplificado el ejercicio añadiendo lMediaArray */
    /* Este método calcula la mediana de la lista de numeros. 
     * Recueda que la mediana representa el valor de la variable de posición central en un conjunto de datos*/
    double calculaMediana(){
 
    	int[] copiedArray = numeros.clone();
    	Arrays.sort(copiedArray);
        int lMediaArray = copiedArray.length / 2;
    	
    	
    	if (copiedArray.length % 2 == 0) { // Si la longitud es par, se deben promediar los del centro
    	    return (copiedArray[lMediaArray - 1] + copiedArray[lMediaArray]) / 2;
    	} else {
    	    return copiedArray[lMediaArray];
    	}

    }
    
    /* añadido lNumeros */
    int moda(){
    	int maximaVecesQueSeRepite=0;
    	int moda =0;
        int lNumeros = numeros.length;
    	for(int i=0; i<lNumeros; i++){
	    	int vecesQueSeRepite = 0;
	    	for(int j=0; j<lNumeros; j++){
		    	if(numeros[i] == numeros[j]) vecesQueSeRepite++;
		    }
		    if(vecesQueSeRepite > maximaVecesQueSeRepite){
		    	moda = numeros[i];
		    	maximaVecesQueSeRepite = vecesQueSeRepite;
		    }
	    }
    	
    	return moda;
    }
    	
    
    public static void main(String[] args) {
		new Optimiza();
	}
    
	public Optimiza() {
		System.out.println("Numeros: "+ Arrays.toString(numeros));
		System.out.println("Tiene el 5:"+ busca(5));
		System.out.println("Tiene el 2:"+ busca(2));
		System.out.println("Hay "+cuentaPositivos() + " números positivos");
		System.out.println("La media vale: "+calculaMedia());

		System.out.println("Cada número dividido por la media de todos: "+Arrays.toString(dividelosPorLaMedia()));
		System.out.println("La mediana vale:"+calculaMediana());
		System.out.println("La moda vale:"+moda());

	}

}