package pe.apiconz.apps.coderetreat2013_game_of_life;

public class Celula {

	private int vecinos;
	private boolean vive = true;

	public void vecinos(int i) {
		this.vecinos = i;
		this.condicionDeVida();
	}

	private void condicionDeVida() {
		if (this.vive && (this.vecinos < 2 || this.vecinos > 3) ){
			this.vive = false;
		} else if(!this.vive && this.vecinos == 3){
			this.vive = true;
		}
		else {
			this.vive = true;
		}

	}

	public boolean estaViva() {
		return this.vive;
	}

	public void matala() {
		this.vive = false;
	}
}
