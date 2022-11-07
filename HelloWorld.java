import java.util.Scanner;

class HelloWorld {

public static void main(String[] args) {
    String[] nums = {"104.367", "101.432", "108.43276", "108.1", "111.43", "44.231", "32.12", "119.32", "111.24", "114.37", "108.2", "100.52", "33.237", "10.4"};
    String message = "";

    char[] chars = new char[nums.length];
    int toUpperCase = 32;
    for (int i = 0; i < nums.length; i++){
        chars[i] = (char)(i == 0 ? ((int)((Float.parseFloat(nums[i])) - toUpperCase)) : ((int)(Float.parseFloat(nums[i]))));  
        message += chars[i];            
    }

    System.out.print(message);
    }

}