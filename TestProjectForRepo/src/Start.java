public class Start {
    private final String name;
    private final int age;

    public Start(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void turnToString(){
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
    }
    public static void main(String[] args){
        Start me = new Start ("Roberto Villegas", 19);
        me.turnToString();
    }
}
