package Model;

public class ContaPoupanša extends Conta {
	
	
	public void Atualiza(double taxa) {
		super.Atualiza(taxa * 3);
		//this.Saldo += this.Saldo * 3 * taxa;
	}
}
