public class WhileLoop {

    public static void main(String[] args) {
        int mynumber = 100;
        while(mynumber < 100){
            System.out.println(mynumber);
            mynumber++;
        }

        mynumber = 10;
        do {
            System.out.println("do while loop: " + mynumber);
            mynumber++;
        }
        while(mynumber < 100);

    }
}
