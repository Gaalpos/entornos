package refactorizar;


class Enfermero{
	private int inyeccionesSuministradas; // solo aplicable a los enfermeros
}

class Medico extends Sanitario{
	private int numeroGuardias;  // solo aplicable a los medicos de familia y cirujanos
	private Sanitario[] sanitariosACargo; // solo aplicable a los medicos de familia y cirujanos
	
}
class MedicosFamilia extends Medico{
	
}

class Cirujanos extends Medico{
	private int numeroOperaciones;// Solo aplicable a los cirujanos
	
}
// Tenemos 3 tipos de sanitarios ,
//enfermeros, medicos de familia y cirujanos
public class Sanitario {

	private Sanitario jefe; // Aplicable a cualquier tipo de sanitario
	private int sueldo_bruto; // Aplicable a cualquier tipo de sanitario

	Sanitario(int numeroGuardias, int numeroOperaciones, Sanitario[] sanitariosACargo, Sanitario jefe,
			int inyeccionesSuministradas, int sueldo_bruto) {
		this.numeroGuardias = numeroGuardias;
		this.numeroOperaciones = numeroOperaciones;
		this.sanitariosACargo = sanitariosACargo;
		this.jefe = jefe;
		this.inyeccionesSuministradas = inyeccionesSuministradas;
		this.sueldo_bruto = sueldo_bruto;
	}
} 	