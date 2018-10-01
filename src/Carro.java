
/**
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Llanta[] llantas;
    private Chassis chassis;

    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
        this.llantas = new Llanta[2];
        //Inicializar LLantas, tomando como referencia x y del carro
        this.llantas[0] = new Llanta(x, y);
        this.llantas[1] = new Llanta(x, y);
        //Inicializar chassis, tomando como referencia x y del carro
        this.chassis = new Chassis(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public boolean addLlantas(int x, int y) {
        Llanta llanta = new Llanta(x, y);
        for(int i=0; i<this.llantas.length; i++){
            if(this.llantas[i]==null){
                this.llantas[i]=llanta;
                return true;
            }
        }
        return false;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(int x, int y) {
        Chassis chassis = new Chassis(x, y);
        this.chassis = chassis;
    }
    
    public void mover(){
        this.x++;
    }
    
}
