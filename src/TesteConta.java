import static java.lang.System.out;
public class TesteConta 
{
	public static void main (String args [])
	{
		Conta pessoa1 = new Conta();
		Conta pessoa2 = new Conta();
	//definição das pessoas 	
		pessoa1.setNome("Paulo Luis");
		pessoa1.setEndereço("Rua Sumidouro, 125");
		pessoa1.setSaldo(150.52);
		pessoa2.setNome("Maria Eduarda");
		pessoa2.setEndereço("Rua Marcolino, 252");
		pessoa2.setSaldo(365.25);
		
		out.println(pessoa1.getNome());
		out.print(" (");
		out.print(pessoa1.getEndereço());
		out.print(("), (tem saldo R$"));
		out.print(pessoa1.getSaldo());
		out.print(")");
		out.println();
		
		out.println(pessoa2.getNome());
		out.print(" (");
		out.print(pessoa2.getEndereço());
		out.print(("), (tem saldo R$"));
		out.print(pessoa2.getSaldo());
		out.print(")");
		out.println();
		
				
	}
}
