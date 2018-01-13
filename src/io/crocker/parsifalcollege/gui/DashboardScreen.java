/**
 * 
 */
package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.gui.partial.HeaderPartial;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * @author joshua
 *
 */
public class DashboardScreen {
	private static DashboardScreen instance = null;

	private Stage stage;

	private DashboardScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up root
		VBox root = new VBox();
		root.setPadding(new Insets(10));

		// Set up columns
		HBox hBoxColumns = new HBox();

		hBoxColumns.getChildren().add(generateTripsColumn());
		hBoxColumns.getChildren().add(generatePeopleColumn());
		hBoxColumns.getChildren().add(generateReportsColumn());

		hBoxColumns.setMinWidth(620);
		hBoxColumns.setPadding(new Insets(20, 0, 0, 0));

		// Add header
		root.getChildren().add((new HeaderPartial()).generatePartial(Lang.TITLE_DASHBOARD));
		root.getChildren().add(hBoxColumns);

		// Set up scene
		Scene scene = new Scene(root, 620, 480);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.TITLE_DASHBOARD);
		this.stage.setScene(scene);
	}

	private Pane generateTripsColumn() {
		VBox vBoxColumn = new VBox();
		vBoxColumn.setMinWidth(620 / 3);
		vBoxColumn.setSpacing(10);

		Label lblTitle = new Label(Lang.TITLE_TRIPS);
		lblTitle.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 16));

		VBox vBoxLabels = new VBox();
		Label lblTripCountToday = new Label("xxx " + Lang.TODAY);
		Label lblUpcomingTripCount = new Label("xxx " + Lang.UPCOMING);

		vBoxLabels.getChildren().add(lblTripCountToday);
		vBoxLabels.getChildren().add(lblUpcomingTripCount);

		Button btnManageTrips = new Button(Lang.BUTTON_MANAGE);

		vBoxColumn.getChildren().add(lblTitle);
		vBoxColumn.getChildren().add(vBoxLabels);
		vBoxColumn.getChildren().add(btnManageTrips);

		return vBoxColumn;
	}

	private Pane generatePeopleColumn() {
		VBox vBoxColumn = new VBox();
		vBoxColumn.setMinWidth(620 / 3);
		vBoxColumn.setSpacing(10);

		Label lblTitle = new Label(Lang.TITLE_PEOPLE);
		lblTitle.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 16));

		VBox vBoxLabels = new VBox();
		Label lblStudentCount = new Label("xxx " + Lang.STUDENTS);
		Label lblTeacherCount = new Label("xxx " + Lang.TEACHERS);
		Label lblParentCount = new Label("xxx " + Lang.PARENTS);

		vBoxLabels.getChildren().add(lblStudentCount);
		vBoxLabels.getChildren().add(lblTeacherCount);
		vBoxLabels.getChildren().add(lblParentCount);

		Button btnManagePeople = new Button(Lang.BUTTON_MANAGE);

		vBoxColumn.getChildren().add(lblTitle);
		vBoxColumn.getChildren().add(vBoxLabels);
		vBoxColumn.getChildren().add(btnManagePeople);

		return vBoxColumn;
	}

	private Pane generateReportsColumn() {
		VBox vBoxColumn = new VBox();
		vBoxColumn.setMinWidth(620 / 3);
		vBoxColumn.setSpacing(10);

		Label lblTitle = new Label(Lang.TITLE_REPORTS);
		lblTitle.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 16));

		Button btnUnpaidReport = new Button(Lang.BUTTON_UNPAID);
		Button btnUnauthorisedReport = new Button(Lang.BUTTON_UNAUTHORISED);

		vBoxColumn.getChildren().add(lblTitle);
		vBoxColumn.getChildren().add(btnUnpaidReport);
		vBoxColumn.getChildren().add(btnUnauthorisedReport);

		return vBoxColumn;
	}

	/**
	 * Show the stage
	 */
	public void show() {
		this.stage.show();
	}

	/**
	 * Hide the stage
	 */
	public void hide() {
		this.stage.hide();
	}

	public static DashboardScreen getInstance() {
		if (instance == null) {
			instance = new DashboardScreen();
		}

		return instance;
	}

}
