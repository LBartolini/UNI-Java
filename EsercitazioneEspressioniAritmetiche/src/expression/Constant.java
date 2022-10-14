package expression;

public final class Constant implements Expression {
	
	private int value;

	public Constant(int value) {
		this.value = value;
	}
	
	@Override
	public int eval() {
		return value;
	}
	
}
