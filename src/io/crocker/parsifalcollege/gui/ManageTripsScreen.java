package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.booking.Booking;
import io.crocker.parsifalcollege.cost.Cost;
import io.crocker.parsifalcollege.gui.partial.HeaderPartial;
import io.crocker.parsifalcollege.person.Student;
import io.crocker.parsifalcollege.trip.component.TripComponent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManageTripsScreen {
	private static ManageTripsScreen instance = null;

	private Stage stage;

	private ManageTripsScreen() {
		// Create stage
		this.stage = new Stage();

		// Set up root
		VBox root = new VBox();
		root.setPadding(new Insets(10));

		// Set up columns
		HBox hBoxColumns = new HBox();
		hBoxColumns.setSpacing(10);

		hBoxColumns.getChildren().add(generateTripList());
		hBoxColumns.getChildren().add(generateTripForm());

		hBoxColumns.setMinWidth(540);
		hBoxColumns.setPadding(new Insets(20, 0, 0, 0));

		// Add header
		root.getChildren().add((new HeaderPartial()).generatePartial(Lang.TITLE_MANAGE_TRIPS));
		root.getChildren().add(hBoxColumns);

		// Set up scene
		Scene scene = new Scene(root, 680, 620);
		this.stage.setResizable(false);
		this.stage.setTitle(Lang.TITLE_MANAGE_TRIPS);
		this.stage.setScene(scene);
	}

	private Pane generateTripForm() {
		VBox vBoxTripForm = new VBox();
		vBoxTripForm.setSpacing(10);

		vBoxTripForm.getChildren().add(generateFormFields());
		vBoxTripForm.getChildren().add(generateTripItinerary());
		vBoxTripForm.getChildren().add(generateTripStudents());
		vBoxTripForm.getChildren().add(generateSaveButton());

		vBoxTripForm.setMinWidth(450);

		return vBoxTripForm;
	}

	private Button generateSaveButton() {
		Button btnSave = new Button(Lang.BUTTON_SAVE);

		// TODO Save Action

		return btnSave;
	}

	private Pane generateTripStudents() {
		VBox vBoxBookings = new VBox();
		vBoxBookings.setSpacing(5);

		Label lblBookings = new Label(Lang.FIELD_LABEL_STUDENTS);

		TableView<Booking> tblBookings = new TableView<Booking>();

		TableColumn<Booking, Student> colStudent = new TableColumn<Booking, Student>(Lang.FIELD_LABEL_STUDENT);
		TableColumn<Booking, Cost> colRemainingBalance = new TableColumn<Booking, Cost>(
				Lang.FIELD_LABEL_REMAINING_BALANCE);
		TableColumn<Booking, String> colHasConsent = new TableColumn<Booking, String>(Lang.FIELD_LABEL_HAS_CONSENT);
		TableColumn<Booking, String> colFullyPaid = new TableColumn<Booking, String>(Lang.FIELD_LABEL_FULLY_PAID);

		tblBookings.getColumns().add(colStudent);
		tblBookings.getColumns().add(colRemainingBalance);
		tblBookings.getColumns().add(colHasConsent);
		tblBookings.getColumns().add(colFullyPaid);

		vBoxBookings.getChildren().add(lblBookings);
		vBoxBookings.getChildren().add(tblBookings);

		return vBoxBookings;
	}

	private Pane generateTripItinerary() {
		VBox vBoxItinerary = new VBox();
		vBoxItinerary.setSpacing(5);

		Label lblItinerary = new Label(Lang.FIELD_LABEL_ITINERARY);

		TableView<TripComponent> tblItinerary = new TableView<TripComponent>();

		TableColumn<TripComponent, String> colType = new TableColumn<TripComponent, String>(Lang.FIELD_LABEL_ITEM_TYPE);
		TableColumn<TripComponent, String> colDescription = new TableColumn<TripComponent, String>(
				Lang.FIELD_LABEL_ITEM_DESCRIPTION);
		TableColumn<TripComponent, Cost> colCost = new TableColumn<TripComponent, Cost>(Lang.FIELD_LABEL_ITEM_COST);

		tblItinerary.getColumns().add(colType);
		tblItinerary.getColumns().add(colDescription); // TODO Fill all available space?
		tblItinerary.getColumns().add(colCost);

		vBoxItinerary.getChildren().add(lblItinerary);
		vBoxItinerary.getChildren().add(tblItinerary);

		return vBoxItinerary;
	}

	private Pane generateFormFields() {
		HBox hBoxFields = new HBox();
		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		hBoxFields.setSpacing(10);

		// Trip Type | Organiser
		// Trip Name | Trip Cost
		VBox vBoxFieldsLeft = new VBox();
		VBox vBoxFieldsRight = new VBox();

		// Trip Type
		Label lblTripType = new Label(Lang.FIELD_LABEL_TRIP_TYPE);
		TextField txtTripType = new TextField();

		lblTripType.setPadding(insLabelPadding);

		vBoxFieldsLeft.getChildren().add(lblTripType);
		vBoxFieldsLeft.getChildren().add(txtTripType);

		// Trip Name
		Label lblTripName = new Label(Lang.FIELD_LABEL_TRIP_NAME);
		TextField txtTripName = new TextField();

		lblTripName.setPadding(insLabelPadding);

		vBoxFieldsLeft.getChildren().add(lblTripName);
		vBoxFieldsLeft.getChildren().add(txtTripName);

		// Organiser
		Label lblOrganiser = new Label(Lang.FIELD_LABEL_ORGANISER);
		TextField txtOrganiser = new TextField();

		lblOrganiser.setPadding(insLabelPadding);

		vBoxFieldsRight.getChildren().add(lblOrganiser);
		vBoxFieldsRight.getChildren().add(txtOrganiser);

		// Trip Cost
		Label lblTripCost = new Label(Lang.FIELD_LABEL_TRIP_COST);
		TextField txtTripCost = new TextField();

		lblTripCost.setPadding(insLabelPadding);

		vBoxFieldsRight.getChildren().add(lblTripCost);
		vBoxFieldsRight.getChildren().add(txtTripCost);

		hBoxFields.getChildren().add(vBoxFieldsLeft);
		hBoxFields.getChildren().add(vBoxFieldsRight);

		return hBoxFields;
	}

	private Pane generateTripList() {
		VBox vBoxPeopleList = new VBox();

		vBoxPeopleList.setSpacing(10);

		ListView<String> listTrips = new ListView<String>();

		listTrips.getItems().add("Lake District (English)");
		listTrips.getItems().add("Lake District (ICT)");
		listTrips.getItems().add("Ski Trip");

		// TODO Populate List of Trips

		Button btnNewPerson = new Button(Lang.BUTTON_NEW_TRIP);
		btnNewPerson.setMinWidth(200);

		vBoxPeopleList.getChildren().add(listTrips);
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

	public static ManageTripsScreen getInstance() {
		if (instance == null) {
			instance = new ManageTripsScreen();
		}

		return instance;
	}
}
