package automoveis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Populares extends Automoveis{

	public Populares(String placa, String tipo, double ano, double valordiaria, int vago,  int dias,int day, int month, int year, int atraso) {
		super(placa, tipo, ano, valordiaria, vago, dias,day,  month,  year, atraso);
		// TODO Auto-generated constructor stub
	}
	
	LocalDate date = LocalDate.now();
	final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu", Locale.ENGLISH);
    String datestr = dtf2.format(date);	
    Integer year = Integer.valueOf(datestr);
 			
    @Override
	public double precoPopular(){  if(year-ano>3){return (atraso) * valordiaria*(1-(0.07*3));
							    }	else{
									   			return (atraso) * valordiaria*(1-(0.07*(year-ano)));
								    } 
	}

	@Override
	public String toString()
	{
		return super.toString() + "";							
	}
	
}
