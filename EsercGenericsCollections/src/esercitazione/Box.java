package esercitazione;

public class Box<T> {
	
	private T  var;
	
	public Box(T v) {
		var = v;
	}
	
	public T getVar() { return var; }
	
	public void setVar(T v) { var = v; }
	
	public static void main(String[] args) {
		Box<Integer> my_integer = new Box<>(5);
		Box<String> my_string = new Box<>("pippo");
		
		my_integer.setVar(100);
		System.out.println(my_integer.getVar());
		
		my_string.setVar("pluto");
		System.out.println(my_string.getVar());
	}

}
