package visualizacao;

import java.util.ArrayList;
import java.util.Scanner;
import automoveis.Automoveis;
import automoveis.Grandes;
import automoveis.Medios;
import automoveis.Populares;
	
	
public class Interface{
	
	
	Scanner entrada = new Scanner(System.in);
	
	public void menuPrincipal(){
									System.out.println("0.Cadastrar Cliente");	
									System.out.println("1.Cadastrar Automóvel");
									System.out.println("2.Apresentar Clientes cadastrados");
									System.out.println("3.Alugar um automóvel");
									System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");	
									System.out.println("5.Devolver um automóvel informando a data da devolução");
									System.out.println("6.Sair");
		
										
		int opcao = entrada.nextInt();
		
										while(opcao != 0){	
															switch(opcao){
															case 1:
																	
																	
																break;
															
															case 2:
																	
																	
																		
																break;
															
															case 3:
																	
																	
																
																break;	
																
															case 4:
																
																
																break;	
															}
											
											System.out.println("0.Cadastrar Cliente");		
											System.out.println("1.Cadastrar Automóvel");	
											System.out.println("2.Apresentar Clientes cadastrados");	
											System.out.println("3.Alugar um automóvel");	
											System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");		
											System.out.println("5.Devolver um automóvel informando a data da devolução");	
											System.out.println("6.Sair");	
											opcao = entrada.nextInt();		
			
		}
																															
	
	}	
}