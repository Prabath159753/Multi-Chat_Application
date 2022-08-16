package Client_Side.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class ClientLoginFormController {

    public AnchorPane mainRoot;
    public TextField txtName;

    public static String userName;

    public static ArrayList<String> users = new ArrayList<>();

    public void continueBtnOnAction(ActionEvent actionEvent) throws IOException {

        userName = txtName.getText().trim();
        boolean isAdd = false;
        if(users.isEmpty()){
            users.add(userName);
            isAdd = true;
        }

        for(String s : users){
            if (!s.equalsIgnoreCase(userName)) {
                isAdd = true;
                System.out.println(userName);
                break;
            }
        }

        if(isAdd){
            this.mainRoot.getChildren().clear();
            this.mainRoot.getChildren().add(FXMLLoader.load(this.getClass().getResource("../view/MessageEnvironmentForm.fxml")));
        }

    }
}
