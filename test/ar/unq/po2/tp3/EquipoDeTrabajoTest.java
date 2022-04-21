package ar.unq.po2.tp3;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	Persona pappo = new Persona("Norberto", "Napolitano", LocalDate.of(1962, 2, 19));
	Persona carlos = new Persona("Charly", "Garcia", LocalDate.of(1965, 2, 19));
	Persona roman = new Persona("Juan Roman", "Riquelme", LocalDate.of(1970, 2, 19));
	Persona rene = new Persona("Rene", "Favaloro", LocalDate.of(1950, 2, 19));
	Persona diego = new Persona("Diego", "Maradona", LocalDate.of(1960, 2, 19));
	
	EquipoDeTrabajo argentina = new EquipoDeTrabajo("Argentina");

	@Test
	void testEquipoDeTrabajo() {
		argentina.addPerson(carlos);
		argentina.addPerson(diego);
		argentina.addPerson(rene);
		argentina.addPerson(pappo);
		argentina.addPerson(roman);
		
		System.out.println(argentina.promedioEdad());
		
	}

}
