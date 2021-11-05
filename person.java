public class person implements Ieat,Ichill{
    //data

    public String name;
    public String job;
    public int salary;

    //func
    public person(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public void chilling(){
        System.out.println("watching tv");
    }

    @Override
    public void eat() {
        System.out.println("eating kosher pizza");
    }

    @Override
    public void drink() {
        System.out.println("drinking zero coke");
    }

    public void talk(){
        System.out.println("hii my name is "+this.name+" my job is " +this.job);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
