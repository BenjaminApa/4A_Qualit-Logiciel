package Back;

public class Tuple<X, Y> {

	private int c1;
	private int c2;

	public Tuple(int l, int r) {
		this.c1 = l;
		this.c2 = r;
	}

	public int sommeTuple() {
		return c1 + c2;
	}

	public boolean isSpare() {
		if (c1 + c2 == 10 && c1 != 10) {
			return true;
		}
		return false;
	}
	
	public boolean isStrike() {
		if (c1 + c2 == 10 && c1 == 10) {
			return true;
		}
		return false;
	}

	public int getc1() {
		return c1;
	}

	public int getc2() {
		return c2;
	}

	public void setc1(int l) {
		this.c1 = l;
	}

	public void setc2(int r) {
		this.c2 = r;
	}

}