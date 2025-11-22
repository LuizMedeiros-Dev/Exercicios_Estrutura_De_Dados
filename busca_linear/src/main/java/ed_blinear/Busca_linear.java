package ed_blinear;
 import java.io.*;

class Busca_linear{
	public static void main (String args[]){
		BufferedReader entrada;
		entrada = new BufferedReader (new InputStreamReader (System.in));
		try{
			int qte;
			boolean ok, achou;
			do{
				System.out.println (" -- Entrada de Dados -- ");
				System.out.println ("Que tipo deseja usar?");
				System.out.println ("1 - Entrada Vetor Numeros Inteiros");
				System.out.println ("2 - Fim Opcao - ");
				int opcao = Integer.parseInt (entrada.readLine());
				switch (opcao){
				case 1 :
					System.out.println ("Quantos Numeros? ");
					qte = Integer.parseInt (entrada.readLine());
					int numeros [] = new int [qte];
					for (int i = 0; i < qte; i++){
					   System.out.println (" Numero[" + (i+1) + "]= ");	
                                            numeros [i] = Integer.parseInt (entrada.readLine());
                                             
					}
					System.out.println();
					System.out.println("Qual Numero Deseja Pesquisar? ");
					int x = Integer.parseInt (entrada.readLine());
					achou = linear(x, numeros);
					if (achou)
						System.out.println("Numero "+x+" Presente na Relacao" );
					else
						System.out.println("Numero Nao Presente na Relacao");
					ok = true;
					break;
                                  
                                case 2:
                                        System.out.println("Fim da execução ! ");
                                        System.exit(0);
                                default :					
                                        System.out.println("Opcao Invalida ! ");
					System.out.println("Tente Novamente.");
					System.out.println();
					ok = false;
				}
			} while (!ok);
		}catch (Exception e){
			System.out.println("Valor vazio. Ocorreu um erro durante a leitura !");
		}
	}
        
        public static boolean linear (int x, int dados []){
		final int n = dados.length;
		for (int i = 0; i < n; i++)
			if (x == dados[i])                             
				return true;                 
                return false;                        
	}
     
}       
