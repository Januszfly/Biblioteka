package controller;


import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {
    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    public void openLibrary( ) {
        System.out.println("hej");
    }
    @FXML
    public void openListBooks( ) {
        System.out.println("hej2");
    }
    @FXML
    public void openStatistic( ) {
        System.out.println("hej3");

    }

        public void setMainController(MainController mainController) {
            this.mainController = mainController;
        }

    @FXML
        public void addBook() {
        if (toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter("/fxml/AddBook.fxml");
    }

}
