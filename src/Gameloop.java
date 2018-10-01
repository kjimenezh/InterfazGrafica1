
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;


public class Gameloop extends AnimationTimer{//Controlador
    
    private GraphicsContext gc;//Vista
    private Carro carro;//Modelo: no debe dibujar en ningun lado...solo guarda informacion
    
    public Gameloop(GraphicsContext gc){
        this.gc = gc;
        this.carro = new Carro(0, 200);
    }
    
    @Override
    public void handle(long l){
        //Borrando el tablero
        gc.clearRect(0, 0, 300, 300);
        //Dibujando el escenario
        gc.fillRect(this.carro.getX(), this.carro.getY(), 20, 20);
        this.carro.mover();
    }
    
}
