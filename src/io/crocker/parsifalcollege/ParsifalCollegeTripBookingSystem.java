package io.crocker.parsifalcollege;

import io.crocker.parsifalcollege.gui.DashboardScreen;
import javafx.application.Application;
import javafx.stage.Stage;

public class ParsifalCollegeTripBookingSystem extends Application {

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DashboardScreen.getInstance().show();

	}

}
