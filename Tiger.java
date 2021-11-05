public class Tiger implements Ieat,Ichill{
    //data
    public String name;
    public int speed;


    //func

    public Tiger(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    @Override
    public void chilling() {
        System.out.println("watching the zebra's");
    }

    @Override
    public void eat() {
        System.out.println("eating shmulik");
    }

    @Override
    public void drink() {
        System.out.println("drinking water");

    }

    public void run(){
        System.out.println("tiger speed is "+this.speed);
    }
    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
