//JAVAFX COMPONENTS
import java.io.File;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sun.font.CreatedFontTracker;

public class AppPrototype extends Application{ //EXTENDS JAVAFX APPLICATION
	private int defaultXSize = 1280;
	private int defaultYSize = 720;
	
	//Global Scene Names
	private static Scene home;
	
	//Stage for the application
	private static Stage stage;
	//Screen No. Tracker
	

	//Current screen offset
	private double yOffset = 0;
	private double xOffset = 0;
	
		
	public static void main(String[] args) {
		System.out.println("Application Started...");
		launch(args);	//Launch application
		System.out.println("Application Finished...");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//LOAD XML

		//Start
		stage = primaryStage;	//Create stage (Frame)
		stage.initStyle(StageStyle.TRANSPARENT); //Remove bar at the top if window
		//Set dimensions
		stage.setHeight(defaultYSize);
		stage.setWidth(defaultXSize);
		System.out.println("Stage Setup...");
		stage.show(); //Show stage
		
		//Setup Scenes
		StlParser2.StlParse(new File(" "));
		setupHome();

		stage.setScene(home); //Set initial scene in frame
		//Utils.pause(1000);
	}
	
	//Setup Home screen
	private void setupHome(){
		SubScene hotBar = HotBar.createBar("Home Screen", defaultXSize, defaultYSize/20); //Create hotbar for this scene
		TwoDgraphics GWin = new TwoDgraphics();
		CanvasTest Cwin = new CanvasTest();
		hotBar.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});
		//Move window with mouse
		hotBar.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				stage.setX(event.getScreenX() - xOffset);
				stage.setY(event.getScreenY() - yOffset);	
			}
		});
		
		BorderPane bp = new BorderPane(); //New layout
		bp.setTop(hotBar);
		bp.setCenter(Cwin.test(0));
		
		//Finalise Scene
		home = new Scene(bp);
		home.getStylesheets().add("style/homeScreen.css"); //Get styling from css sheet
		System.out.println("Home Screen Setup...");
	}
	
}

//TODO
/*Cursor image change
Resize Window (Area in the bottom corner)
Create button behaviour file
Create 3D model viewer

*/