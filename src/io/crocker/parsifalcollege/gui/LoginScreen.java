package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LoginScreen {

	private static LoginScreen instance = null;

	private Stage stage;

	private LoginScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up login form
		VBox vBoxLoginForm = new VBox();
		vBoxLoginForm.setPadding(new Insets(10));

		// Set up window header
		Label lblWindowHeader = new Label(Lang.APPLICATION_NAME);
		lblWindowHeader.setMinWidth(200);
		lblWindowHeader.setMaxWidth(200);
		lblWindowHeader.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 19));
		lblWindowHeader.setTextAlignment(TextAlignment.CENTER);
		lblWindowHeader.setWrapText(true);

		// Set up login form
		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		// Set up field labels
		Label lblUsername = new Label(Lang.FIELD_LABEL_USERNAME);
		Label lblPassword = new Label(Lang.FIELD_LABEL_PASSWORD);

		// Add padding to field labels
		lblUsername.setPadding(insLabelPadding);
		lblPassword.setPadding(insLabelPadding);

		TextField txtUsername = new TextField();
		txtUsername.setPromptText(Lang.FIELD_LABEL_USERNAME);

		PasswordField txtPassword = new PasswordField();
		txtPassword.setPromptText(Lang.FIELD_LABEL_PASSWORD);

		// Set up login button
		VBox vBoxButtons = new VBox();
		vBoxButtons.setSpacing(5);
		vBoxButtons.setPadding(insLabelPadding);

		Button btnLogin = new Button(Lang.BUTTON_LOGIN);

		// Set up forgotten password link
		Hyperlink hprForgotPassword = new Hyperlink("Forgot Password?");
		hprForgotPassword.setMinWidth(200);
		hprForgotPassword.setMaxWidth(200);
		hprForgotPassword.setTextAlignment(TextAlignment.CENTER);

		// Add controls to vBox
		vBoxButtons.getChildren().add(btnLogin);
		vBoxButtons.getChildren().add(hprForgotPassword);

		vBoxLoginForm.getChildren().add(lblWindowHeader);
		vBoxLoginForm.getChildren().add(lblUsername);
		vBoxLoginForm.getChildren().add(txtUsername);
		vBoxLoginForm.getChildren().add(lblPassword);
		vBoxLoginForm.getChildren().add(txtPassword);
		vBoxLoginForm.getChildren().add(vBoxButtons);

		// Set up scene
		Scene scene = new Scene(vBoxLoginForm, 200, 350);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.APPLICATION_NAME);
		this.stage.setScene(scene);
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

	public static LoginScreen getInstance() {
		if (instance == null) {
			instance = new LoginScreen();
		}

		return instance;
	}

}
