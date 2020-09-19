public class Main {
    int start;

    public Main(int start){
        this.start = start;
    }

    public int findSpace(){
        int count = 6;
        int remain;

        do{
            count++;
            remain = (this.start - count) % (count + 1);
        } while (remain != 0);

        return count;
    }


    public static void main(String[] args){
        Main test = new Main(146);
        System.out.println(test.findSpace());

        System.out.println((4 - 1) / 2);
    }
}
