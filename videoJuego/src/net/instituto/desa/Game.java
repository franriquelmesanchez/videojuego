package net.instituto.desa;

public class Game {
	static final String ABAJO="Abajo";
	static final String ARRIBA= "Arriba";
	static final String IZQUIERDA="Izquierda";
	static final String DERECHA="Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.setX(j.getX() + 1);
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.setX(j.getX() - 1);
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.setY(j.getY() - 1);
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.setY(j.getY() + 1);
		}	
}
}