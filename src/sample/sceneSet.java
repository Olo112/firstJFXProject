package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class sceneSet extends Application {

	int win_width = 600, win_height = 550;

	@Override
	public void start(Stage stage) throws Exception {


	/*
	=================================================================================
	OBJECTS:
	=================================================================================
	*/

		Label l0 = new Label("Hello there...");
		Label l1 = new Label("Hello...");

		VBox vboxObj0 = new VBox(l0);
		VBox vboxObj1 = new VBox(l1);

		Scene s0 = new Scene(vboxObj0);		//creating a scene
		Scene s1 = new Scene(vboxObj1);
		Stage st0 = new Stage();			//creating new stage



	/*
	=================================================================================
	MAIN:
	=================================================================================
	*/
		st0.setWidth(win_width);
		st0.setHeight(win_height);
		st0.setTitle("My stage");

		st0.setScene(s0);			//adding a scene to stage

		st0.show();					//showing st0 stage..

	}




	/*
	 =================================================================================
	 	RUN APPLICATION:
	 =================================================================================
	*/

	@Override
	public void init() throws Exception {
		System.out.println("Application opened");
	}

	@Override
	public void stop() throws Exception {
		System.out.println("Application closed");
	}

	public static void main(String[] args) {
		launch();
	}
}


/*
=================================================================================
	END OF FILE
=================================================================================
*/