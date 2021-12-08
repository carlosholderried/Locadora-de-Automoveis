package automoveis;

public class Automoveis {
	
	protected String placa;
	protected String tipo;
	protected double ano;	
	protected double valordiaria;
	protected int vago;
	protected String devolucao; 
	protected int dias;
	protected int day;
	protected int month;
	protected int year;
	protected int atraso;
	
	public Automoveis(String placa, String tipo, double ano, double valordiaria, int vago, int dias, int day, int month, int year, int atraso)
	{
		this.placa = placa;
		this.tipo = tipo;
		this.ano = ano;
		this.valordiaria = valordiaria;
		this.vago = vago;
		this.dias = dias;
		this.day = day;
		this.month = month;
		this.year = year;
		this.atraso = atraso;
	}
		
	public double precoGrande(){
		return valordiaria;
	} 
	
	public double precoMedio(){
		return valordiaria;
	} 
	
	public double precoPopular(){
		return valordiaria;
	} 
	
	
	
	public String getPlaca() {		
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
		
	public double getAno() {		
		return ano;
	}
	public void setAno(double ano) {
		this.ano = ano;
	}
	
		
	public double getValordiaria() {
		return valordiaria;
	}
	public void setValordiaria(double valordiaria) {
		this.valordiaria = valordiaria;
	}

	
	public int  getVago() {
		return vago;
	}
	public void setVago(int vago) {
		this.vago = vago; 
	}
	
	
	public int  getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias; 
	}
	
	
	public int  getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day; 
	}
	
	
	public int  getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month; 
	}
	
	
	public int  getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	
	public int  getAtraso() {
		return atraso;
	}
	public void setAtraso(int atraso) {
		this.atraso = atraso; 
	}
	
	
	public String toString()
	{
			return "Placa: " + placa + "     Tipo: " + tipo + "     Ano: " + ano + "     Valor da diaria: " + valordiaria+"\n";	
	}
	

	

	
}
