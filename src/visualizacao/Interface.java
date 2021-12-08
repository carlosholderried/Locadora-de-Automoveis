package visualizacao;
import java.util.*;
import principal.Procedimentos;


public class Interface{	
	
	public void menuPrincipal(){	
		
		Scanner entrada = new Scanner(System.in);				
	  	
		Procedimentos pr = new Procedimentos();
		int opcao = 0;
					
		
		do{	
			System.out.println("1.Cadastrar Cliente");		
			System.out.println("2.Cadastrar Automóvel");	
			System.out.println("3.Apresentar Clientes cadastrados");	
			System.out.println("4.Apresentar Automoveis cadastrados");
			System.out.println("5.alugar um automóvel");	
			System.out.println("6.Devolver um automóvel informando a data da devolução");	
			System.out.println("7.Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
							switch(opcao){												
											case 1:	
													System.out.println("Digite o nome do cliente: ");														
													
													String nome = entrada.nextLine();
													
													
													System.out.println("Digite o cpf do cliente: ");
													String cpf = entrada.nextLine();
													
													pr.armazenaDados(nome, cpf);
													break;
																		
											case 2:																
													System.out.println("1.Automovel grande");	
													System.out.println("2.Automovel medio");
													System.out.println("3.Automovel popular");
													int opcao2 = entrada.nextInt();
													String placa;
													double ano;
													Double valordiaria;
													
													entrada.nextLine();
															switch(opcao2){
																			case 1:
																					System.out.println("Digite a placa do carro: ");
																					 placa = entrada.nextLine();
																					
																					System.out.println("Digite o ano do modelo do carro: ");
																					 ano = entrada.nextDouble();
																					
																					System.out.println("Digite valor base da diaria do carro: ");
																					 valordiaria = entrada.nextDouble();
																					
																					pr.armazenaDadosAutomovel(placa, ano, valordiaria, "Grande");
																					break;			
																			case 2:	
																					System.out.println("Digite a placa do carro: ");
																					placa = entrada.nextLine();
																				
																					System.out.println("Digite o ano do modelo do carro: ");
																					ano = entrada.nextDouble();
																				
																					System.out.println("Digite valor base da diaria do carro: ");
																					valordiaria = entrada.nextDouble();
																				
																					pr.armazenaDadosAutomovel(placa, ano, valordiaria, "Medio");
																					break;
																		    case 3:
																		    	System.out.println("Digite a placa do carro: ");
																		    		placa = entrada.nextLine();
																				
																				System.out.println("Digite o ano do modelo do carro: ");
																				 ano = entrada.nextDouble();
																				
																				System.out.println("Digite valor base da diaria do carro: ");
																				 valordiaria = entrada.nextDouble();
																				
																				pr.armazenaDadosAutomovel(placa, ano, valordiaria, "Popular");
																					break;
																}	
															break;
														
											case 3:
													pr.apresentaClientes();
													break;												
											case 4:	
													pr.apresentaAuto();				
													break;											
											case 5:		
													System.out.println("Digite o seu CPF: ");
													String cpf2 = entrada.nextLine();
											    	boolean temCpf = pr.verificaCpf(cpf2);
											    	if(temCpf){
														System.out.println("Digite o numero de dias que deseja alugar o carro: ");
														int dias = entrada.nextInt();
														pr.alugaDias(cpf2,dias,entrada);
													}
													break;											
											case 6:	
												System.out.println("Digite o seu CPF: ");
												String cpf3 = entrada.nextLine();
												String placaAluguel = pr.devolucaoCpf(cpf3); 
												
												if(!placaAluguel.equals("")){
													System.out.println("Digite o ano da devolução.");
													
													int ano9 = entrada.nextInt();
													
													System.out.println("Digite o mes da devolução.");
													int mes = entrada.nextInt();
													
													System.out.println("Digite o dia da devolução.");
													int dia = entrada.nextInt();
													
													pr.devolucao(placaAluguel, ano9, mes, dia);
												}
												
												
										
												
												break;												
							}										
					
		}while(opcao != 7);
		entrada.close();	
	}	
}