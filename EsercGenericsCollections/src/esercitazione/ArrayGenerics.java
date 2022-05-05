package esercitazione;

public class ArrayGenerics {

	public static <T> void printArray(T[] array) {
		for(T el: array) {
			System.out.println(el);
		}
	}
	
}
