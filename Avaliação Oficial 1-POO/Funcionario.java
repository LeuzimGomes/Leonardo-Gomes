public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;

	public Funcionario() {
		
	}
	public Funcionario(int matricula, double salario) {
		this.matricula = matricula;
		this.salario = salario;

	}

	public Funcionario(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioPrimeiraParcela() {
		return Math.abs(salario) * 0.6;
	}

	public double getSalarioSegundaParcela() {
		return Math.abs(salario) * 0.4;
	}

}