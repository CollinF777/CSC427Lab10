package edu.secourse.patientportalguiapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdminController {
    @FXML
    private Label AdminDashboardLabel;

    @FXML
    private Label actionText;

    @FXML
    protected void onDoctorSearchAptButtonClick() {
        actionText.setText("Searching Doctor appointments");
    }

    @FXML
    protected void onPatientSearchAptButtonClick() {
        actionText.setText("Searching Patient appointments");
    }

    @FXML
    protected void onNewAptButtonClick() {
        actionText.setText("Creating a new Appointment");
    }
    @FXML
    protected void onNewPatientButtonClick() {
        actionText.setText("Creating a new Patient");
    }

    @FXML
    protected void onNewDoctorButtonClick() {
        actionText.setText("Creating a new Doctor");
    }

    @FXML
    public void onExitButtonClick() {
        System.exit(0);
    }

}