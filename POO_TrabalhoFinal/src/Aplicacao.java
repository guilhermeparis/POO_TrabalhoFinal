import java.util.Scanner;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Aplicacao extends Application implements EventHandler<ActionEvent> {
/**
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
	**/
	@Override
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Validação de Arquivos");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(true);

//        Text scenetitle = new Text("Welcome");
//        scenetitle.setId("welcome-text");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        grid.add(scenetitle, 0, 0, 2, 1);

        Label arqConf = new Label("Arquivo de Configuração");
        grid.add(arqConf, 0, 1);
        
        TextField arqConfField = new TextField(); //esse que a gente quer
        grid.add(arqConfField, 1, 1);
        
        Label arqSim = new Label("Arquivo de Simulação:");
        grid.add(arqSim, 0, 2);

        TextField arqSimField = new TextField();
        grid.add(arqSimField, 1, 2);

        Button btnConf = new Button("OK");
        HBox hbBtnConf = new HBox(10);
        hbBtnConf.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnConf.getChildren().add(btnConf);
        grid.add(hbBtnConf, 2, 1);
        
        Button btnSim = new Button("OK");
        HBox hbBtnSim = new HBox(10);
        hbBtnSim.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnSim.getChildren().add(btnSim);
        grid.add(hbBtnSim, 2, 2);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        actiontarget.setId("actiontarget");

        // Tratamento de evento do botao
        btnConf.setOnAction(new EventHandler<ActionEvent>() { //BOTÃO OK - CONF
            @Override
            public void handle(ActionEvent e) {
            	Leitor le = new Leitor();
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Configuração verificada.");
                System.out.println("Botao pressionado! Arquivo de Configuração: "+ arqConfField.getText() + "\nConteúdo: ");
                try { //try catch só pra compilar e.e
					le.leitura(arqConfField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        
        btnSim.setOnAction(new EventHandler<ActionEvent>() { //BOTÃO OK - SIMU
            @Override
            public void handle(ActionEvent e) {
            	Leitor le = new Leitor();
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Simulação verificada.");
                System.out.println("Botao pressionado! Arquivo de Simulação: "+ arqSimField.getText() + "\nConteúdo: ");
                try { //try catch só pra compilar e.e
					le.leitura(arqSimField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
