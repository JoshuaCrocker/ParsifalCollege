/**
 * 
 */
package io.crocker.parsifalcollege.gui.partial;

import io.crocker.parsifalcollege.Lang;
import io.crocker.parsifalcollege.ParsifalCollegeTripBookingSystem;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * @author joshua
 *
 */
public class HeaderPartial implements Partial {

	/**
	 * (non-Javadoc)
	 * 
	 * @see io.crocker.parsifalcollege.gui.partial.Partial#generatePartial()
	 */
	@Override
	public Pane generatePartial() {
		return generatePartial("");
	}

	public Pane generatePartial(String strScreenTitle) {
		VBox root = new VBox();

		BorderPane hBoxTopRow = new BorderPane();
		BorderPane hBoxBottomRow = new BorderPane();

		Label lblApplicationTitle = new Label(Lang.APPLICATION_NAME);
		Label lblScreenTitle = new Label(strScreenTitle);

		lblApplicationTitle.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 19));
		lblScreenTitle.setFont(Font.font(Font.getDefault().getFamily(), 17));

		Label lblLoggedInUser = new Label(Lang.LOGGED_IN_AS + " " + ParsifalCollegeTripBookingSystem.loggedInUserName); // Textflow
		Hyperlink hprLogOut = new Hyperlink(Lang.BUTTON_LOG_OUT);

		lblLoggedInUser.setAlignment(Pos.BOTTOM_RIGHT);
		hprLogOut.setAlignment(Pos.BOTTOM_RIGHT);

		hBoxTopRow.setLeft(lblApplicationTitle);
		hBoxTopRow.setRight(lblLoggedInUser);

		hBoxBottomRow.setLeft(lblScreenTitle);
		hBoxBottomRow.setRight(hprLogOut);

		root.getChildren().add(hBoxTopRow);
		root.getChildren().add(hBoxBottomRow);

		return root;
	}

}
