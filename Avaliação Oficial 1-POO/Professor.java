public class Professor extends Funcionario {
	
	
	public Professor(int matricula, double salario) {
		super(matricula, salario);
	}
	public double getSalarioPrimeiraParcela() {
		return Math.abs(super.getSalario());
	}

	public double getSalarioSegundaParcela() {
		return 0;
	}

}