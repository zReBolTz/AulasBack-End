
public class Main {

	public static void main(String[] args) {
		
		Gato gato= new Gato();
	//	gato.falar();
		
		
		Cachorro dog= new Cachorro();
		//dog.falar();
		
		Animal animal= new Cachorro();
		animal= gato;
		
		if(animal instanceof Cachorro) {
			System.out.println("Cachorro");
		}else if(animal instanceof Gato) {
			System.out.println("Gato");
		}
		
		
	
	falar(gato);
	falar(dog);
}
	private static void falar(Animal a) {
		a.falar();
	}
	
}
