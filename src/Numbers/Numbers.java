package Numbers;

import javafx.scene.image.Image;
import sample.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Numbers {
    Main main;
    Client c;
    public void setMain(Main main) {
        this.main = main;
    }

    public void init(Client c) {
        this.c = c;
        Image img = new Image(Main.class.getResourceAsStream("/Numbers/Numbers.png"));
        image.setImage(img);
    }
    @FXML
    private ImageView image;
    @FXML
    private Button b1;
    @FXML
    private void b1clicked(){
        try {
            main.showNumbers1(c);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
