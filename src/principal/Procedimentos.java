package principal;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import clientes.Clientes;
import automoveis.Automoveis;
import automoveis.Grandes;
import automoveis.Medios;
import automoveis.Populares;

/**
 * @author Carlos
 *
 */
public class Procedimentos {  
	 
	
	public  ArrayList<Automoveis>  auto = new ArrayList<Automoveis>();
	public  ArrayList<Clientes>  client = new ArrayList<Clientes>();
	

	/**
	 * construtor
	 */
	public Procedimentos(){
		
	}	
	 
//---> 1.Cadastrar Cliente <----------------------------------------------------------------------------------------------------------------	
	
	/**
	 * @param nome
	 * @param cpf
	 */
	public  void armazenaDados(String nome, String cpf){
																				
		String placaAluguel = "0";
		Clientes tempClient = new Clientes(nome,cpf, placaAluguel);											
		tempClient.setNome(nome);
		tempClient.setCpf(cpf);
		tempClient.setPlacaAluguel(placaAluguel);
		client.add(tempClient);		
	}
	
//---> 2.Cadastrar Automovel <----------------------------------------------------------------------------------------------------------------	
	 /**
	 * @param placa			recebe a placa do automovel
	 * @param ano			recebe o ano do modelo do automovel
	 * @param valorDiaria	recebe o valor da diaria do aluguel do automovel
	 * @param tipo			recebe o tipo do automovel
	 */
	public void armazenaDadosAutomovel(String placa, double ano, Double valorDiaria, String tipo){
			int vago = 1;
			int dias = 0;
			int day=1;
			int month=1;
			int year=1990;
			int atraso=0;
			if(tipo.equals("Grande")){
				Grandes tempGrand = new Grandes(placa, tipo, ano, valorDiaria, vago, dias,day,month,year,atraso);																	
				auto.add(tempGrand);
			}
			else if(tipo.equals("Medio")){
				Medios tempMed = new Medios(placa, tipo, ano, valorDiaria, vago, dias,day,month,year,atraso);																	
				auto.add(tempMed);
			}else if(tipo.equals("Popular")){
				Populares tempPop = new Populares(placa, tipo, ano, valorDiaria, vago, dias,day,month,year,atraso);																	
				auto.add(tempPop);
			} 
	 }	
	
	//---> 3.Apresentar Clientes <----------------------------------------------------------------------------------------------------------------	
	/**
	 * 	mostra trodos os clientes cadastarados
	 */
	public void apresentaClientes(){
		for(Clientes clientes : client){				
			System.out.println(clientes.toString());
			}		
	}
	//---> 4.Apresentar Automoveis <----------------------------------------------------------------------------------------------------------------
	/**
	 * 	mostra todos os automoveis cadastrados
	 */
	public  void apresentaAuto(){
		for(Automoveis automoveis : auto){	
		System.out.println(automoveis.toString());
		}	
	}	
	//---> 5.Alugar Automoveis  <----------------------------------------------------------------------------------------------------------------
		 
	/**
	 * @param cpf2 o valor do cpf digitado
	 * @return verdadeiro se encontra o cpf, falso se nao encontra
	 */
	public  boolean verificaCpf(String cpf2){	
		
		
		for(Clientes clientes : client){
			String tempAlugCpf = clientes.getCpf();
			if(cpf2.equals(tempAlugCpf)){
				return true;
			}
				
		}
		System.out.println("\n NENHUM CLIENTE CADASTRADO COM ESSE CPF\n"); 				
		return false;
	}
	
	
	/**
	 * @param cpf2		o valor digitado no metodo anterior agora sendo usado para comparar com o cpfs da string percorrida
	 * @param dias		variavel que armazena a quantidades de dias que o cliente quer ficar com o carro
	 * @param entrada	objeto scanner
	 */
	public  void alugaDias(String cpf2, int dias, Scanner entrada ){
		
				
		int tempDia = 1;
		int tempMes = 1;
		int tempAno = 1990;
		
		LocalDate date = LocalDate.now();
																												
		tempDia = date.getDayOfMonth();
		tempMes = date.getMonthValue();
		tempAno = date.getYear();
		
        int cont = 0;
        for(Automoveis automoveis : auto){	
		    	  
				if(automoveis.getVago() == 1){
				cont++;
				System.out.println(cont+". " + automoveis.toString()); 
				}																		
		}	
        cont++;
        System.out.println(cont+". Sair");
        
        int opcao3 = entrada.nextInt();
        int cont2 = 0;
        
        String placaTemp = "0";
        int vago4 = 0;
        
        for(Automoveis automoveis : auto){											        	
	        	
		      	if(automoveis.getVago() == 1){	cont2++;
		      		
		      	}
		      	
				if(cont2 == opcao3){	
										automoveis.setVago(vago4);
										placaTemp = automoveis.getPlaca();
										automoveis.setDias(dias);
										automoveis.setDay(tempDia);
										automoveis.setMonth(tempMes);
										automoveis.setYear(tempAno);
										break;										
				}
					
		}
        
        String cpfTemp = "0";
        
        for(Clientes clientes : client){		
        	
        										cpfTemp = clientes.getCpf(); 
        										if(cpf2.equals(cpfTemp)) {
        																clientes.setPlacaAluguel(placaTemp);
        																break;
        										}
        }
        
       }
	//---> 6.Devolucao Automovel  <-----------------------------------------------------------------------------------------------------------------------------------
	 
	/**
	 * @param cpf3 variavel com o valor do cpf digitado na classe interface
	 * @return  retorna o valor da placa digitada se o cpf bater, se nao bater retorna vazio 
	 */
	public  String devolucaoCpf(String cpf3){
								
		for(Clientes clientes : client){
			String tempTempCpf = clientes.getCpf();
			if(cpf3.equals(tempTempCpf)){
				return clientes.getPlacaAluguel();}
				}
		System.out.println("\n NENHUM CARRO ALUGADO NESSE CPF\n");
		return "";
		}

	/**
	 * @param placaAluguel  variavel com o valor da placa lido no metodo anterior
	 * @param ano		    variavel que recebe o ano da devolucao
	 * @param mes			variavel que recebe o mes da devolucao
	 * @param dia			variavel que recebe o dia da devolucao
	 */
	public  void devolucao(String placaAluguel, int ano, int mes, int dia){
		
		for(Automoveis automoveis : auto){	
																												
			LocalDate dataRetirada = LocalDate.of(ano, mes, dia);
			LocalDate dataMarcada = LocalDate.of(automoveis.getYear(),automoveis.getMonth(),automoveis.getDay());
	        																										
			long diasDiff = dataMarcada.until(dataRetirada, ChronoUnit.DAYS);			
			int diasAtraso = (int) diasDiff;			
			
			int tempDias = automoveis.getDias();
			 String tempPlaca3 = automoveis.getPlaca();
			 String tempTipo = automoveis.getTipo();
			 															
			if(diasDiff > Long.valueOf(tempDias) && placaAluguel.equals(tempPlaca3) && tempTipo.equals("Grande")){
				automoveis.setAtraso(diasAtraso);
				double valorGran = automoveis.precoGrande() * 1.1;
				System.out.println("\nValor a ser pago: R$"+ valorGran+"\n");
				automoveis.setVago(1);
				break;
			}
			else {
				if(diasDiff > Long.valueOf(tempDias) && placaAluguel.equals(tempPlaca3) && tempTipo.equals("Medio")){
					automoveis.setAtraso(diasAtraso);
					double valorMed = automoveis.precoMedio() * 1.1;
					System.out.println("\nValor a ser pago: R$"+ valorMed+"\n");
					automoveis.setVago(1);
					break;
				}
				else {
					if(diasDiff > Long.valueOf(tempDias) && placaAluguel.equals(tempPlaca3) && tempTipo.equals("Popular")){
						automoveis.setAtraso(diasAtraso);
						double valorPop = automoveis.precoPopular() * 1.1;
						System.out.println("\nValor a ser pago: R$"+ valorPop+"\n");
						automoveis.setVago(1);
						break;
					}
					else {
						if( placaAluguel.equals(tempPlaca3) && tempTipo.equals("Grande")){
							automoveis.setAtraso(diasAtraso);
							System.out.println("\nValor a ser pago: R$"+ automoveis.precoGrande()+"\n");
							automoveis.setVago(1);
							break;
					}
					else {
						if( placaAluguel.equals(tempPlaca3) && tempTipo.equals("Medio")){
							automoveis.setAtraso(diasAtraso);
							System.out.println("\nValor a ser pago: R$"+ automoveis.precoMedio()+"\n");
							automoveis.setVago(1);
							break;
						}											
						else {
							if( placaAluguel.equals(tempPlaca3) && tempTipo.equals("Popular")){
								automoveis.setAtraso(diasAtraso);
								System.out.println("\nValor a ser pago: R$"+ automoveis.precoPopular()+"\n");
								automoveis.setVago(1);
								break;
							}}}}}}
		}
		
	
		
		
	}
	
	
}
