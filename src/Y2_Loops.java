public class Y2_Loops {
    public static void main(String[] args) {
        Y2_Loops mycode = new Y2_Loops();
    }
    public Y2_Loops(){
        countUp();
    }
    public void countUp(){
        for (int x = 1; x < 6; x = x + 1){
            System.out.println(x);
        }
    }
    public void countByThrees(){
        for (int x = 3; x < 16; x = x + 3){
            System.out.print(x + " ");
        }
    }
    public void countDown(){
        for (int x = 10; x > 1; x = x - 1){
            System.out.print(x + ", ");
        }
        System.out.println("1");
        System.out.print("Happy Loop Year!");
    }
    }
