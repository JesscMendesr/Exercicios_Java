package exercicio5_herenca;

public class TesteIngresso {

	public static void main(String[] args) {
		
		
		MeiaEntrada m1 = new MeiaEntrada("Marcela Almeida","Setor 5","24",250,0001,"Meia Entrada","47-89555412","Estudante",20.0f);
		
		Vip v1 = new Vip("Elisabeth Carvalho","Setor 1","12",800,0002,"Vip",3,true,true);
		
		
		m1.imprimirInfo();
		v1.imprimirInfo();

	}

}
