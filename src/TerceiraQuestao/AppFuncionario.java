package TerceiraQuestao;

import java.util.Scanner;

public class AppFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Digite o nome do funcionario");
		f1.setNome(sc.nextLine());
		System.out.println("Digite o sexo do funcionario");
		f1.setSexo(sc.nextLine());
		System.out.println("Digite o departamento do funcionario");
		f1.setDepartamento(sc.nextLine());
		System.out.println("Salario do funcionario: ");
		f1.setSalario(sc.nextDouble());
		
		System.out.println("Digite o valor da bonificacao em em porcentagem");
		int valor;
		valor = sc.nextInt();
		
		//f1.bonificar(valor);
		
		f1.ganho();
		
		System.out.println("Nome " +f1.getNome());
		System.out.println("Sexo "+f1.getSexo());
		System.out.println("Departamento "+f1.getDepartamento());
		System.out.println("Salario "+f1.getSalario());
		System.out.println("Valor da bonificacao "+f1.bonificar(valor));
		System.out.println("Novo salario "+f1.ganho());
		
	}

}
