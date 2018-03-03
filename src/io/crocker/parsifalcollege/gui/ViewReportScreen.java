package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.gui.partial.HeaderPartial;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewReportScreen {
	private static ViewReportScreen instance = null;

	private Stage stage;

	private ViewReportScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up root
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);

		// vBoxReport.setMinWidth(540);
		// vBoxReport.setPadding(new Insets(20, 0, 0, 0));

		// Add header
		root.getChildren().add((new HeaderPartial()).generatePartial(Lang.TITLE_MANAGE_TRIPS));

		root.getChildren().add(generateReportTable());
		root.getChildren().add(generatePrintButton());

		// Set up scene
		Scene scene = new Scene(root, 680, 620);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.TITLE_VIEW_REPORT);
		this.stage.setScene(scene);
	}

	private Button generatePrintButton() {
		Button btnPrint = new Button(Lang.BUTTON_PRINT);

		// TODO Print Action

		return btnPrint;
	}

	private TableView generateReportTable() {
		TableView tblReportTable = new TableView();

		// TODO Render Report

		return tblReportTable;
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

	public static ViewReportScreen getInstance() {
		if (instance == null) {
			instance = new ViewReportScreen();
		}

		return instance;
	}
}
