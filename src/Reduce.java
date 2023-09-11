public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        for (int i=100; i>0;){

            boolean even = i % 2 == 0;
            if (even){
                i = i / 2;
                counter++;
            }
            else{
                i--;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
