   import java.util.Scanner;

class Controller {
  public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Informações da Classe Pessoa.

		Pessoa pessoa = new Pessoa(null, null);
		System.out.println("Informações da Classe Pessoa");
		System.out.println();
		System.out.println("Digite seu nome: ");
		pessoa.setNome(ler.next());
		System.out.println("Digite seu sobrenome: ");
		pessoa.setSobrenome(ler.next());
		System.out.println(pessoa.getNomeCompleto());
		System.out.println();
		System.out.println("---------------------------------------------------------------------");

		// Informações da Classe Funcionario.

		Funcionario funcionario = new Funcionario(0, 0);

		// Usando Métodos da Classe Pessoa.

		System.out.println("Informações da Classe Funcionario");
		System.out.println();
		System.out.println("Digite seu nome: ");
		funcionario.setNome(ler.next());
		System.out.println("Digite seu sobrenome: ");
		funcionario.setSobrenome(ler.next());
		System.out.println(funcionario.getNomeCompleto());

		// Usando Métodos da Classe Funcionario.

		System.out.println("Digite sua matrícula: ");
		funcionario.setMatricula(ler.nextInt());
		System.out.println(funcionario.getMatricula());

		// Primeira Parcela Salário Funcionário.
		System.out.println("Digite seu salário: ");
		funcionario.setSalario(ler.nextDouble());
		System.out.println("Primeira parcela do Salário: " + funcionario.getSalarioPrimeiraParcela());

		// Segunda Parcela Salário Funcionário.
		System.out.println("Segunda parcela do Salário: " + funcionario.getSalarioSegundaParcela());
		System.out.println();
		System.out.println("---------------------------------------------------------------------");

		// Informações da Classe Professor.

		Professor professor = new Professor(0, 0);

		// Usando Métodos da Classe Pessoa.

		System.out.println("Informações da Classe Professor");
		System.out.println();
		System.out.println("Digite seu nome: ");
		professor.setNome(ler.next());
		System.out.println("Digite seu sobrenome: ");
		professor.setSobrenome(ler.next());
		System.out.println(professor.getNomeCompleto());

		// Usando Métodos da Classe Funcionario.

		System.out.println("Digite sua matrícula: ");
		professor.setMatricula(ler.nextInt());
		System.out.println(professor.getMatricula());

		// Usando Métodos da Classe Professor.

		// Primeira Parcela Salário Professor.
		System.out.println("Digite seu salário: ");
		professor.setSalario(ler.nextDouble());
		System.out.println("Primeira parcela do Salário: " + professor.getSalarioPrimeiraParcela());

		// Segunda Parcela Salário Professor.
		System.out.println("Segunda parcela do Salário: " + professor.getSalarioSegundaParcela());

	}

}


	

  
