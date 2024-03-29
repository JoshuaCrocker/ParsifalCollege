package io.crocker.parsifalcollege.gui;

import io.crocker.parsifalcollege.Lang;
import javafx.scene.control.Alert;

public class ErrorAlert extends Alert {

	/**
	 * Error Alert Constructor
	 * 
	 * @param strTitle
	 * @param strHeader
	 * @param strContent
	 */
	public ErrorAlert(String strTitle, String strHeader, String strContent) {
		super(AlertType.ERROR);

		this.setTitle(strTitle);
		this.setHeaderText(strHeader);
		this.setContentText(strContent);
	}

	/**
	 * Error Alert Constructor
	 * 
	 * @param strTitle
	 * @param e
	 */
	public ErrorAlert(String strTitle, Exception e) {
		this(strTitle, e.getClass().getName(), e.getMessage());

	}

	/**
	 * Error Alert Constructor
	 * 
	 * @param e
	 */
	public ErrorAlert(Exception e) {
		this(Lang.TITLE_ERROR_OCCURRED, e.getClass().getName(), e.getMessage());
	}
}
