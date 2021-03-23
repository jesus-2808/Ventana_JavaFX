package gui.viewsandcontrollers.main;


	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class MainController {
	    @FXML
	    private Label label;
	    @FXML
	    private TextField textfield;

	    public void initialize() {
	        // TODO
	    }

	    @FXML
	    private void handleButtonAction(ActionEvent event) throws IOException {
	    	Stage ventana=new Stage();
	    	Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
	    	Scene scene = new Scene(root);
	    	Label label=(Label)root.getChildrenUnmodifiable().get(0);
	    	label.setText(textfield.getText());
	    	ventana.setScene(scene);
	    	ventana.show();
	    }
	    }
	
//asegurar que está configurado en UTF-8


