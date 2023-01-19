public class Main {
    public static void main(String[] args) {

        int[] evenNumber = {0,2,4,6,8};

        System.out.println("3rd element of array is "+ evenNumber[2]);

        evenNumber[4]=20;//{0,2,4,6,20};

        for (int i: evenNumber) {
            System.out.println(i);
        }
    }
}