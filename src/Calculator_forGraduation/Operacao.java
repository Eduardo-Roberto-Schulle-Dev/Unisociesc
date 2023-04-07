package Calculator_forGraduation;

public class Operacao {

	protected int numero1;
	protected int numero2;

	public int getNumero1() {

		return numero1;

	}

	public void setNumero1(int numero1) {

		numero1 = numero1;

	}

	public int getNumero2() {

		return numero2;

	}

	public void setNumero2(int numero2) {
		numero2 = getNumero2();

	}

	public float calcula() {
		System.out.println("Não será possivel calcular!!!!");
		return -1;

	}

	public float calcula(int prm1, int prm2) {
		System.out.println("Não será possivel calcular!!!!");
		{
			return -1;

		}

	}

}
