package CriandoExcessao;

public class DivisaoNaoExata extends Exception{
	
	private int num;
	private int denom;
	
	
	public DivisaoNaoExata(int num, int denom) {
		
		this.num = num;
		this.denom = denom;
	}


	@Override
	public String toString() {
		return "Resultado de "+num+" / "+denom+" n�o � um inteiro!";
	}
	
	
	
	

}
