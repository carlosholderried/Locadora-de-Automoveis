package automoveis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Grandes extends Automoveis{

	public Grandes(String placa, String tipo, double ano, double valordiaria, int vago,  int dias,int day, int month, int year, int atraso) {
		super(placa, tipo, ano, valordiaria, vago, dias,day,  month,  year, atraso);
		// TODO Auto-generated constructor stub
	}

	LocalDate date = LocalDate.now();
	final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu", Locale.ENGLISH);
    String datestr = dtf2.format(date);	
    Integer year = Integer.valueOf(datestr);
 			
    @Override
	public double precoGrande(){  if(year-ano>3){return (atraso) * valordiaria*(1-(0.02*4));
							    }	else{
									   			return (atraso) * valordiaria*(1-(0.02*(year-ano)));
								    } 
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "";							
	}	

}
