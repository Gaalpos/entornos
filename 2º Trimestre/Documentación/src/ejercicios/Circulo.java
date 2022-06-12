package ejercicios;

import java.awt.Color;

/**
 * 
 * @author Gaalpos
 * @version 1.0
 *Copyright all rights reserved
 *
 */

public class Circulo {

	public float radio;

	public Color color;

	public float x;

	public float y;

	public float getDiametro() {

		return radio + radio;
	}

	public float getArea() {

		return (float) Math.PI * radio * radio;
	}

	public float getCircunferencia() {
		return 2f * (float) Math.PI * radio;
	}

	public float getPerimetro() {
		return 2f * (float) Math.PI * radio;
	}

	public void setColor(int r, int g, int b) {
		color = new Color(r, g, b);
	}

	public boolean puntoDentro(float px, float py) {
		float vx = x - px;
		float vy = y - py;
		float vx2 = vx * vx;
		float vy2 = vy * vy;
		double modulo = Math.sqrt(vx2 + vy2);
		if (modulo > radio) {
			return false;
		} else {
			return true;
		}
	}

}