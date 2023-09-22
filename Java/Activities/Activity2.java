package src.main.java.Activities;


//Program to check if the sum of all the 10's in the array is exactly 30.
public class Activity2 {
    public static void main(String[] args) {
        int FixedSum = 30;
        int SearchNumber = 10;
        int[] NumArray = {10, 77, 10, 54, -11, 10};
        System.out.println(result(FixedSum, SearchNumber, NumArray));
    }


    public static boolean result(int FixedSum,int SearchNumber,int[] num) {
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == SearchNumber) {
                sum= sum + num[i];
            }
        }
        System.out.println(sum);

        return sum == FixedSum;


    }
}

