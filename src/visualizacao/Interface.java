package visualizacao;

public class Interface
{

	
	Scanner entrada = new Scanner(System.in);
	
	public void menuPrincipal()
	{
		System.out.println("0.Sair");	
		System.out.println("1.Cadastrar notebooks");
		System.out.println("2.Cadastrar impressoras");
		System.out.println("3.Ver todos os produtos cadastrados");
		System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");			
				
		int opcao = entrada.nextInt();
		
		while(opcao != 0)
		{	
			switch(opcao)
			{
			case 1:
					
					
			break;
			
			case 2:
					
					
						
			break;
			
			case 3:
					
					
				
			break;	
			
			case 4:
				
				
			break;	
			}
			
			System.out.println("\n0.Sair");	
			System.out.println("1.Cadastrar notebooks");
			System.out.println("2.Cadastrar impressoras");
			System.out.println("3.Ver todos os produtos cadastrados");
			System.out.println("4.Ver todos os produtos cadastrados abaixo de um valor");
			opcao = entrada.nextInt();	
			
		}
																															
	
	}	
}