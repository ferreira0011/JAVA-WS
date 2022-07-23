package entities;
public class student {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double somaNotas() {
		return nota1 + nota2 + nota3 ;
	}
	public double notaRestante() {
		 if(somaNotas() < 60.0) {
			 return 60.0 - somaNotas();
		 }
		 else {
			 return 0.0;
		 }
	}
}