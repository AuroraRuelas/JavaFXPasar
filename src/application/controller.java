package application;


import java.awt.event.ActionEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class controller {
	@FXML
	private ListView listaCandidatos;
	@FXML
	private ListView listaSeleccionados;
	@FXML
	private Button pasara;

	@FXML
	private Button regresara;

	private final ObservableList<String> data = FXCollections.observableArrayList("Lisa", "Linda", "Luna", "Lina");

	public void seleccionados() {
		Object temp = listaCandidatos.getSelectionModel().getSelectedItem();
		if (temp != null) {
		
			listaSeleccionados.getItems().add(listaCandidatos.getSelectionModel().getSelectedItem());
			listaCandidatos.getItems().remove(temp);
		}
	}

	public void candidatos() {
		Object temp = listaSeleccionados.getSelectionModel().getSelectedItem();
		if (temp != null) {
			listaCandidatos.getItems().add(listaSeleccionados.getSelectionModel().getSelectedItem());
			listaSeleccionados.getItems().remove(temp);
		}

	}

	public void initialize() {
		listaCandidatos.setItems(this.data);

	}
}
