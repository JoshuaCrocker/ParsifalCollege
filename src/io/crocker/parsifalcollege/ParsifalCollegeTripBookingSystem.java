package io.crocker.parsifalcollege;

import io.crocker.parsifalcollege.gui.ManagePeopleScreen;
import javafx.application.Application;
import javafx.stage.Stage;

public class ParsifalCollegeTripBookingSystem extends Application {

	public static String loggedInUserName;

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ManagePeopleScreen.getInstance().show();

	}

}
