package io.crocker.parsifalcollege.gui.partial;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.person.Guardian;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class StudentPersonPartial implements Partial {

	@Override
	public Pane generatePartial() {
		Region spacer = new Region();
		HBox.setHgrow(spacer, Priority.ALWAYS);

		VBox vBoxGuardiansTable = new VBox();
		vBoxGuardiansTable.setSpacing(10);

		HBox hBoxTableTitle = new HBox();

		Label lblGuardians = new Label(Lang.FIELD_LABEL_GUARDIANS);
		Button btnAddGuardian = new Button(Lang.BUTTON_ADD_GUARDIAN);

		hBoxTableTitle.getChildren().add(lblGuardians);
		hBoxTableTitle.getChildren().add(spacer);
		hBoxTableTitle.getChildren().add(btnAddGuardian);

		// Table
		TableView<Guardian> tblGuardians = new TableView<Guardian>();

		TableColumn<Guardian, String> colFirstName = new TableColumn<Guardian, String>(Lang.FIELD_LABEL_FIRST_NAME);
		TableColumn<Guardian, String> colLastName = new TableColumn<Guardian, String>(Lang.FIELD_LABEL_LAST_NAME);
		TableColumn<Guardian, String> colRelation = new TableColumn<Guardian, String>(Lang.FIELD_LABEL_RELATION);

		tblGuardians.getColumns().add(colFirstName);
		tblGuardians.getColumns().add(colLastName);
		tblGuardians.getColumns().add(colRelation);

		vBoxGuardiansTable.getChildren().add(hBoxTableTitle);
		vBoxGuardiansTable.getChildren().add(tblGuardians);

		return vBoxGuardiansTable;
	}

}
