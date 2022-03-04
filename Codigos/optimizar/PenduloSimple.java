package optimizar;

class Vector2D {
	double x;
	double y;
}

class Graficos {
	static void linea(double x1, double y1, double x2, double y2) {
// pinta una linea
	}

	static void circulo(double x, double y, double radio) {
// pinta un circulo
	}
}

public class PenduloSimple {
	public double angle;

	double len;
	Vector2D origin;
	double gravity = 1;

	void dibujar() {
		double angleVelocidad = 0;
		double angleAceleracion = 0;
		Vector2D bob =new Vector2D();
		
		double sin = Math.sin(angle);
		double force = gravity * sin;
		angleAceleracion = (-1 * force) / len;
		angleVelocidad += angleAceleracion;
		angle += angleVelocidad;
		bob.x = len *sin + origin.x;
		bob.y = len * Math.cos(angle) + origin.y;
		Graficos.linea(origin.x, origin.y, bob.x, bob.y);
		Graficos.circulo(bob.x, bob.y, 64);
	}
}