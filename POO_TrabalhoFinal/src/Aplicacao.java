import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


        System.out.println("\nEsta aplica��o funciona por ciclos de execu��o. Digite 0 para sair, e qualquer outra tecla para iniciar/continuar.");

        System.out.println("\n>SIMULA��O INICIADA<\n");
        
        int cont = 0;
		while(waitPress() != '0'){
			
			
			

			System.out.println(cont);
			cont++;
		
		}//fecha while
	}//fecha main
	
	public static char waitPress(){ //eu nem preciso do retorno, mas dava erro de execu��o se fizesse void...
		Scanner wp = new Scanner (System.in);
		return wp.next().charAt(0);
	}

}
