package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.datamodel.Contact;

public class Controller {

    @FXML
    private TableView<Contact> tableview;

    public void initialize() {

        TableColumn<Contact, String> firstNameCol = new TableColumn<>("First Name");


    }
}
