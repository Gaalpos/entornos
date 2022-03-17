package EJ05Refactorizacion;


/*
* He separado la clase enemigo haciendo una clase abstracta enemigo de la que heredan las otras clases de enemigos que antes estaban en un enum
* a mayores he puesto alguna informacion en otra clase a parte y he dado alguna informacion especifica a cada una de las clases que heredan de Enemigo 
* tambien he cambiado algunos nombres y notaciones incorrectas
*/
abstract class Enemigo {
    float vida = 100;
    float golpeBase = 40;
    boolean muerto = false;

    abstract float calcularPotenciaGolpe();

    boolean estaMuerto(){
		if(muerto) return true;
		else return false;
	}

}

class Info {
    int durabilidadArmadura;
	int calidadArmadura;

}

class Normal extends Enemigo {

    float calcularPotenciaGolpe() {
        return golpeBase * vida;
    }
}

class Boss extends Enemigo {

    int multiplicadorGolpeBoss = 8;

    float calcularPotenciaGolpe() {
        return golpeBase * multiplicadorGolpeBoss * vida;
    }

}

class FinalBoss extends Enemigo {

    int multiplicadorGolpeFinalBoss = 20;

    float calcularPotenciaGolpe() {
        return golpeBase * multiplicadorGolpeFinalBoss * vida;
    }
}