package TerceiraQuestao;

public class Funcionario {
	
	String nome;
	String sexo;
	String departamento;
	double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double bonificar(int valor) {
		return salario + (valor * salario)/100;
	}
	
	
	public double ganho() {
		return salario *13;
	}
}
