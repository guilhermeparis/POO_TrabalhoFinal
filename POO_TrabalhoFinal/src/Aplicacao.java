import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


        System.out.println("\nEsta aplicação funciona por ciclos de execução. Digite 0 para sair, e qualquer outra tecla para iniciar/continuar.");

        System.out.println("\n>SIMULAÇÃO INICIADA<\n");
        
        int cont = 0;
		while(waitPress() != '0'){
			
			
			

			System.out.println(cont);
			cont++;
		
		}//fecha while
	}//fecha main
	
	public static char waitPress(){ //eu nem preciso do retorno, mas dava erro de execução se fizesse void...
		Scanner wp = new Scanner (System.in);
		return wp.next().charAt(0);
	}

}
