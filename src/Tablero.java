
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tablero extends Application {
    
    @Override
    
    public void start(Stage stage) throws Exception{
        //Layout
        Pane panel = new Pane();
        Canvas canvas = new Canvas(300,300);
        panel.getChildren().add(canvas);
        Scene scene_1 = new Scene(panel,300,300,Color.GHOSTWHITE);
        scene_1.setFill(Color.GREEN);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Gameloop loop = new Gameloop (gc);
        loop.start();
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene_1);
        stage.show();
        //Para dibujar
        //Dibujando rectangulo
        //gc.setFill(Color.AQUA);
        //gc.fillRect(10,10,20,20);
        //gc.fillOval(30, 30, 50, 50);
        //gc.strokeLine(15, 15, 40, 40);
        //Para poligono
        //double xpoints[] = {10,30,20,10};
        //double ypoints[] = {30,30,15,30};
        
        //gc.strokePolygon(xpoints, ypoints, xpoints.length);
        //gc.strokeRect(30,30,15,15);
    }        
    
    public static void main(String[] args){
        Application.launch(args);
    }

}
