package cap4;

public class funcionario {
	String departamento;
	int salario;
	data dataDeEntrada;
	pessoa gente;
	
	
	
	void receberAumento(int valor) {
		this.salario += valor;
	}
	
	void DadosFuncionario() {
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario "+ this.salario);
		System.out.println("Data de entrada "+ this.dataDeEntrada.dia);
		System.out.println("Nome: "+ this.nome);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());

	}
	
	int calculoGanhoAnual() {
		return (this.salario *12);
	}
}
