package io.crocker.parsifalcollege.gui.partial;

import io.crocker.parsifalcollege.Lang;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TeacherPersonPartial implements Partial {

	@Override
	public Pane generatePartial() {
		VBox vBoxFields = new VBox();

		Insets insLabelPadding = new Insets(10, 0, 0, 0);

		Label lblDepartment = new Label(Lang.FIELD_LABEL_DEPARTMENT);
		TextField txtDepartment = new TextField();

		lblDepartment.setPadding(insLabelPadding);

		vBoxFields.getChildren().add(lblDepartment);
		vBoxFields.getChildren().add(txtDepartment);

		return vBoxFields;
	}

}
