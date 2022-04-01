
public class main {

	public static void main(String[] args) {
		
		
		Carro carro1= new Carro();
		carro1.setAno(1900);
		carro1.setMarca ("ford");
		carro1.setModelo("Fiesta");
		carro1.setQuatroPortas(true);
		carro1.imprimirDados();

		
		System.out.println();
		
		Moto moto1= new Moto();
		moto1.setAno(2022);
		moto1.setMarca("Honda");
		moto1.setModelo("Titan");
		
		moto1.imprimirDados();
		moto1.buzinar();
		moto1.empinar();
		
		
		
		Caminhao caminhao1= new Caminhao();
		
		caminhao1.buzinar();
	}

}
