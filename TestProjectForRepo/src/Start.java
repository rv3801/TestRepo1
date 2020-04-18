public class Start {
    private String name;
    private int age;

    public Start(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void turnToString(){
        System.out.print("My name is " + this.name + " and I am " + this.age + " years old.");
    }
    public static void main(String[] args){
        Start me = new Start ("Roberto Villegas", 19);
        me.turnToString();
    }
}
