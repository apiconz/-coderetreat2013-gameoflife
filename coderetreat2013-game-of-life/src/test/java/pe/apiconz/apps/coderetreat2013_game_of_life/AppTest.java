package pe.apiconz.apps.coderetreat2013_game_of_life;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AppTest {
	@Test
	public void laCelulaTieneMenosDeDosVecinosYMuere() {
		Celula celula = new Celula();
		celula.vecinos(1);
		assertFalse(celula.estaViva());
	}

	@Test
	public void laCelulaTieneDosVecinosYVive() {
		Celula celula = new Celula();
		celula.vecinos(2);
		assertTrue(celula.estaViva());
	}

	@Test
	public void laCelulaTieneTresVecinosYVive() {
		Celula celula = new Celula();
		celula.vecinos(3);
		assertTrue(celula.estaViva());
	}
	
	@Test
	public void laCelulaTieneMasDeTresVecinosYMuere(){
		Celula celula = new Celula();
		celula.vecinos(4);
		assertFalse(celula.estaViva());
	}

	@Test
	public void laCelulaEstaMuertaTieneTresVecinosYRevive(){
		Celula celula = new Celula();
		celula.matala();
		celula.vecinos(3);
		assertTrue(celula.estaViva());
		
	}

	@Test
	public void laCelulaEstaMuertaTieneMasDeTresVecinosYNoRevive(){
		Celula celula = new Celula();
		celula.matala();
		celula.vecinos(4);
		assertFalse(celula.estaViva());
		
	}
	@Test
	public void laCelulaEstaMuertaTieneMenosDeTresVecinosYNoRevive(){
		Celula celula = new Celula();
		celula.matala();
		celula.vecinos(2);
		assertFalse(celula.estaViva());
		
	}

}
