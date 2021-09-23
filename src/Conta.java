public class Conta 
{
	private String nome;
	private String endereço;
	private Double saldo;
	
	public void setNome(String n)
	{
		nome = n;
	}
	public String getNome()
	{
		return nome;
	}
	public void setEndereço (String e)
	{
		endereço = e;
	}
	public String getEndereço()
	{
		return endereço;
	}
	public void setSaldo (Double s)
	{
		saldo = s;
	}
	public Double getSaldo()
	{
		return saldo;
	}
}
