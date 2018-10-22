public class Car extends Vehicle{
    private int no_tire;
    private int no_door;
    private int no_mirror;

    public Car(){}

    public Car(int no_tire){
        this.no_tire = no_tire;
    }

    public Car(int no_tire, int no_door){
        this.no_tire = no_tire;
        this.no_door = no_door;
    }

    public Car(int no_tire, int no_door, int no_mirror){
        this.no_tire = no_tire;
        this.no_door = no_door;
        this.no_mirror = no_mirror;
    }

    public void setNo_tire(int no_tire){
        this.no_tire = no_tire;
    }

    public void setNo_door(int no_door){
        this.no_door = no_door;
    }

    public void setNo_mirror(int no_mirror){
        this.no_mirror = no_mirror;
    }

    public int getNo_tire(){
        return no_tire;
    }

    public int getNo_door(){
        return no_door;
    }

    public int getNo_mirror(){
        return no_mirror;
    }
}