package refactorizar;

class Armadura{
	String tipo;
	int durabilidad;
	int calidad;

}

class EnemigNormal extends Enemigo{
	
}

class EnemigoBoss extends Enemigo{
	
}

class EnemigoFinalBoss extends Enemigo{
	
}

class Enemigo {
	Armadura armadura;
	float vida = 100; // vida del enemigo
	float golpeBase = 40;
	private boolean muerto = false;

	enum TipoEnemigo {
		NORMAL, BOSS, FINAL_BOSS
	};



	float calculapotenciagolpe() {
		switch (tipoEnemigo) {
		case NORMAL:
			return golpeBase * vida;
		case BOSS:
			return golpeBase * 8 * vida;
		case FINAL_BOSS:
			return golpeBase * 20 * vida;
		default:
			return 0;
		}

	}

	boolean estaMuerto() {
		if (muerto)
			return true;
		else
			return false;
	}

}
