package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.gui.partial.HeaderPartial;
import io.crocker.parsifalcollege.gui.partial.TeacherPersonPartial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManagePeopleScreen {
	private static ManagePeopleScreen instance = null;

	private Stage stage;

	private ManagePeopleScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up root
		VBox root = new VBox();
		root.setPadding(new Insets(10));

		// Set up columns
		HBox hBoxColumns = new HBox();
		hBoxColumns.setSpacing(10);

		hBoxColumns.getChildren().add(generatePeopleList());
		hBoxColumns.getChildren().add(generatePersonForm());

		hBoxColumns.setMinWidth(540);
		hBoxColumns.setPadding(new Insets(20, 0, 0, 0));

		// Add header
		root.getChildren().add((new HeaderPartial()).generatePartial(Lang.TITLE_MANAGE_PEOPLE));
		root.getChildren().add(hBoxColumns);

		// Set up scene
		Scene scene = new Scene(root, 580, 620);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.TITLE_MANAGE_PEOPLE);
		this.stage.setScene(scene);
	}

	private Pane generatePersonForm() {
		VBox vBoxPersonForm = new VBox();
		vBoxPersonForm.setSpacing(10);

		HBox hBoxFormColumns = new HBox();
		hBoxFormColumns.setSpacing(10);

		hBoxFormColumns.getChildren().add(generatePersonFormLeftColumn());
		hBoxFormColumns.getChildren().add(generatePersonFormRightColumn());

		vBoxPersonForm.getChildren().add(hBoxFormColumns);

		vBoxPersonForm.getChildren().add((new TeacherPersonPartial()).generatePartial());

		vBoxPersonForm.getChildren().add(generateSaveButton());

		return vBoxPersonForm;
	}

	private Button generateSaveButton() {
		Button btnSave = new Button(Lang.BUTTON_SAVE);

		// TODO Save Action

		return btnSave;
	}

	private Pane generatePersonFormLeftColumn() {
		VBox vBoxFields = new VBox();

		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		// First Name
		Label lblFirstName = new Label(Lang.FIELD_LABEL_FIRST_NAME);
		TextField txtFirstName = new TextField();

		lblFirstName.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblFirstName);
		vBoxFields.getChildren().add(txtFirstName);

		// Last Name
		Label lblLastName = new Label(Lang.FIELD_LABEL_LAST_NAME);
		TextField txtLastName = new TextField();

		lblLastName.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblLastName);
		vBoxFields.getChildren().add(txtLastName);

		// Address Line 1
		Label lblAddressLine1 = new Label(Lang.FIELD_LABEL_ADDRESS_LINE_1);
		TextField txtAddressLine1 = new TextField();

		lblAddressLine1.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblAddressLine1);
		vBoxFields.getChildren().add(txtAddressLine1);

		// Town
		Label lblTown = new Label(Lang.FIELD_LABEL_TOWN);
		TextField txtTown = new TextField();

		lblTown.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblTown);
		vBoxFields.getChildren().add(txtTown);

		// Postcode
		Label lblPostcode = new Label(Lang.FIELD_LABEL_POSTCODE);
		TextField txtPostcode = new TextField();

		lblPostcode.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblPostcode);
		vBoxFields.getChildren().add(txtPostcode);

		// Mobile Number
		Label lblMobileNumber = new Label(Lang.FIELD_LABEL_MOBILE_NUMBER);
		TextField txtMobileNumber = new TextField();

		lblMobileNumber.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblMobileNumber);
		vBoxFields.getChildren().add(txtMobileNumber);

		return vBoxFields;
	}

	private Pane generatePersonFormRightColumn() {
		VBox vBoxFields = new VBox();

		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		// Middle Name
		Label lblMiddleName = new Label(Lang.FIELD_LABEL_MIDDLE_NAME);
		TextField txtMiddleName = new TextField();

		lblMiddleName.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblMiddleName);
		vBoxFields.getChildren().add(txtMiddleName);

		// Date of Birth - date
		Label lblDateOfBirth = new Label(Lang.FIELD_LABEL_DATE_OF_BIRTH);
		DatePicker dpDateOfBirth = new DatePicker();

		lblDateOfBirth.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblDateOfBirth);
		vBoxFields.getChildren().add(dpDateOfBirth);

		// Address Line 2
		Label lblAddressLine2 = new Label(Lang.FIELD_LABEL_ADDRESS_LINE_2);
		TextField txtAddressLine2 = new TextField();

		lblAddressLine2.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblAddressLine2);
		vBoxFields.getChildren().add(txtAddressLine2);

		// County
		Label lblCounty = new Label(Lang.FIELD_LABEL_COUNTY);
		TextField txtCounty = new TextField();

		lblCounty.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblCounty);
		vBoxFields.getChildren().add(txtCounty);

		// Country
		Label lblCountry = new Label(Lang.FIELD_LABEL_COUNTRY);
		TextField txtCountry = new TextField();

		lblCountry.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblCountry);
		vBoxFields.getChildren().add(txtCountry);

		// User Type - dropdown
		ObservableList<String> userTypes = FXCollections.observableArrayList("Student", "Guardian", "Teacher");
		Label lblUserType = new Label(Lang.FIELD_LABEL_USER_TYPE);
		ComboBox<String> comboUserType = new ComboBox<String>(userTypes);

		lblUserType.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblUserType);
		vBoxFields.getChildren().add(comboUserType);

		return vBoxFields;
	}

	private Pane generatePeopleList() {
		VBox vBoxPeopleList = new VBox();

		vBoxPeopleList.setSpacing(10);

		ListView<String> listPeople = new ListView<String>();

		listPeople.getItems().add("[S] Joshua Crocker");
		listPeople.getItems().add("[T] Edd Budzynski");

		// TODO Populate List of People

		Button btnNewPerson = new Button(Lang.BUTTON_NEW_PERSON);
		btnNewPerson.setMinWidth(200);

		vBoxPeopleList.getChildren().add(listPeople);
		vBoxPeopleList.getChildren().add(btnNewPerson);

		vBoxPeopleList.setMaxWidth(200);

		return vBoxPeopleList;
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

	public static ManagePeopleScreen getInstance() {
		if (instance == null) {
			instance = new ManagePeopleScreen();
		}

		return instance;
	}

}
