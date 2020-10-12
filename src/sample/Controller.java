package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtFrase;
    @FXML Label lblResultado;
    @FXML ComboBox comboBox;
    @FXML protected void initialize(){
        comboBox.getItems().addAll("Char At", "Ends With", "compareTo", "EqualsIgnoreCase", "IndexOf", "Replace", "ReplaceFirst", "Split", "startsWith", "Substring");
    }
    public void evento (ActionEvent event){
        String texto=txtFrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0:{
                char res=texto.charAt(2);
                lblResultado.setText(res+"");
                break;
            }
            case 1:{
                boolean res=texto.endsWith("ota");
                lblResultado.setText(res+"");
                break;
            }
            case 2:{
                int res=texto.compareTo("ion");
                lblResultado.setText(res+"");
                break;
            }
            case 3:{
                boolean res=texto.equalsIgnoreCase("es");
                lblResultado.setText(res+"");
                break;
            }
            case 4:{
                int res= texto.indexOf("o");
                lblResultado.setText(res+"");
                break;
            }
            case 5:{
                String res=texto.replace("r","g");
                lblResultado.setText(res+"");
                break;
            }
            case 6:{
                String res= texto.replaceFirst("r","g");
                lblResultado.setText(res+"");
                break;
            }
            case 7:{
                String[] res= texto.split("o", 2);
                lblResultado.setText(res+"");
                break;
            }
            case 8:{
                boolean res=texto.startsWith("l");
                lblResultado.setText(res+"");
                break;
            }
            case 9:{
                String res= texto.substring(2,4);
                lblResultado.setText(res+"");
                break;
            }
        }
    }
}
