package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class JavaFX extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/pages/Main.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    private static void run(final String[] args) {
        launch(args);
    }

   /* public static final class Main {
        private Main() {
            //never used
        }

        public static void main(String[] args) {
            JavaFX.run(args);
        }
    }
    */
}
