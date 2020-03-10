package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void movimiento(Game game,String m) {
		if (m.equalsIgnoreCase(Game.DERECHA)) {
			setX(getX() + 1);
		}
		if (m.equalsIgnoreCase(Game.IZQUIERDA)) {
			setX(getX() - 1);
		}
		if (m.equalsIgnoreCase(Game.ARRIBA)) {
			setY(getY() - 1);
		}
		if (m.equalsIgnoreCase(Game.ABAJO)) {
			setY(getY() + 1);
		}
}
}