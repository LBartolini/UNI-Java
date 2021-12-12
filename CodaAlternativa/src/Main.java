
public class Main {

	public static void main(String[] args) {
		Coda c = new Coda(5);
		
		System.out.println("PUT: "+ c.put(0));
		System.out.println("PUT: "+ c.put(1));
		System.out.println("PUT: "+ c.put(2));
		System.out.println("PUT: "+ c.put(3));
		System.out.println("PUT: "+ c.put(4));
		System.out.println("GET: "+ c.get());
		System.out.println("GET: "+ c.get());
		System.out.println("GET: "+ c.get());
		System.out.println("GET: "+ c.get());
		System.out.println("GET: "+ c.get());
		System.out.println("PUT: "+ c.put(5));
		System.out.println("PUT: "+ c.put(6));
		System.out.println("PUT: "+ c.put(7));
	}

}
