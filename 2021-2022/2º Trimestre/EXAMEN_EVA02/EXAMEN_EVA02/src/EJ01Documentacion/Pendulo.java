package EJ01Documentacion;

/**
 * Copyright...
 */

/**
 * contiene la informacion sobre cada pendulo
 * @author martin
 * @version 1.0 
 */
class Pendulo{	

	/**
	 * longitud del pendulo
	 */
	float longitud;
	
	/**
	 * define la longitud de un pendulo 
	 * 
	 * @param longitud
	 */
	public Pendulo(float longitud) {
		super();
		this.longitud = longitud;
	}

	/**
	 * calculo del periodo de oscilacion 
	 * 
	 * @param gravedad
	 * 					la gravedad en el lugar donde esta el pendulo
	 * 
	 * @return devuelve el resultado de la formula: "2*Math.PI * Math.sqrt(longitud / gravedad)"
	 * 
	 * @throws ArithmeticException
	 * 					se lanza la excepcion cuando la longitud sea menor que cero 
	 * 					o la gravedad menor o igual que cero
	 */
	double getPeriodo(float gravedad) throws ArithmeticException{
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 2*Math.PI * Math.sqrt(longitud / gravedad);
		
	}
	
	/**
	 * calculo de la frecuencia del pendulo 
	 * 
	 * @param gravedad
	 * 
	 * @throws ArithmeticException
	 * 					se lanza la excepcion cuando la longitud sea menor que cero 
	 * 					o la gravedad menor o igual que cero
	 * 
	 * @return el resultado de la operacion  1/getPeriodo(gravedad), la frecuencia 
	 */
	double getFrecuencia(float gravedad) {
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 1/getPeriodo(gravedad);
	}
	
	/**
	 * Calcula la aceleracion angular del pendulo
	 * 
	 * @param gravedad 
	 * 					la gravedad en el lugar donde se encuentra el pendulo
	 * @param anguloEnGrados
	 * 					los grados que hay entre la posicion actual del pendulo y la vertical
	 * @return
	 * 					el resultado de la formmula: "-(gravedad/longitud) * Math.sin(anguloEnRadianes)"
	 * 					la aceleracion angular
	 */
	double getAceleracionAngular(float gravedad, int anguloEnGrados) {
		if(longitud < 0) return 0;
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);
		return -(gravedad/longitud) * Math.sin(anguloEnRadianes);
	}
}
