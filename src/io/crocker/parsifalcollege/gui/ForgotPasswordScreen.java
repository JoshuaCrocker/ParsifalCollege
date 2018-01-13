/**
 * 
 */
package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * @author joshu
 *
 */
public class ForgotPasswordScreen {

	private static ForgotPasswordScreen instance = null;

	private Stage stage;

	private ForgotPasswordScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up login form
		VBox vBoxLoginForm = new VBox();
		vBoxLoginForm.setPadding(new Insets(10));

		// Set up window header
		Label lblWindowHeader = new Label(Lang.TITLE_FORGOT_PASSWORD);
		lblWindowHeader.setMinWidth(200);
		lblWindowHeader.setMaxWidth(200);
		lblWindowHeader.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 19));
		lblWindowHeader.setTextAlignment(TextAlignment.CENTER);
		lblWindowHeader.setWrapText(true);

		// Set up login form
		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		// Set up field labels
		Label lblUsername = new Label(Lang.FIELD_LABEL_USERNAME);
		Label lblTeacherId = new Label(Lang.FIELD_LABEL_TEACHER_ID);
		Label lblNewPassword = new Label(Lang.FIELD_LABEL_NEW_PASSWORD);
		Label lblConfirmPassword = new Label(Lang.FIELD_LABEL_CONFIRM_PASSWORD);

		// Add padding to field labels
		lblUsername.setPadding(insLabelPadding);
		lblTeacherId.setPadding(insLabelPadding);
		lblNewPassword.setPadding(insLabelPadding);
		lblConfirmPassword.setPadding(insLabelPadding);

		TextField txtUsername = new TextField();
		txtUsername.setPromptText(Lang.FIELD_LABEL_USERNAME);

		TextField txtTeacherId = new TextField();
		txtTeacherId.setPromptText(Lang.FIELD_LABEL_TEACHER_ID);

		PasswordField txtNewPassword = new PasswordField();
		txtNewPassword.setPromptText(Lang.FIELD_LABEL_NEW_PASSWORD);

		PasswordField txtConfirmPassword = new PasswordField();
		txtConfirmPassword.setPromptText(Lang.FIELD_LABEL_CONFIRM_PASSWORD);

		// Set up login button
		HBox hBoxButtons = new HBox();
		hBoxButtons.setSpacing(10);
		hBoxButtons.setPadding(insLabelPadding);

		Button btnLogin = new Button(Lang.BUTTON_RESET_PASSWORD);

		// Add controls to vBox
		hBoxButtons.getChildren().add(btnLogin);

		vBoxLoginForm.getChildren().add(lblWindowHeader);
		vBoxLoginForm.getChildren().add(lblUsername);
		vBoxLoginForm.getChildren().add(txtUsername);
		vBoxLoginForm.getChildren().add(lblTeacherId);
		vBoxLoginForm.getChildren().add(txtTeacherId);
		vBoxLoginForm.getChildren().add(lblNewPassword);
		vBoxLoginForm.getChildren().add(txtNewPassword);
		vBoxLoginForm.getChildren().add(lblConfirmPassword);
		vBoxLoginForm.getChildren().add(txtConfirmPassword);
		vBoxLoginForm.getChildren().add(hBoxButtons);

		// Set up scene
		Scene scene = new Scene(vBoxLoginForm, 200, 280);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.TITLE_FORGOT_PASSWORD);
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

	public static ForgotPasswordScreen getInstance() {
		if (instance == null) {
			instance = new ForgotPasswordScreen();
		}

		return instance;
	}

}
