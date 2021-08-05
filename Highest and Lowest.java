import java.util.Arrays;
public class Kata {
  public static String highAndLow(String numbers) {
//     int dlina = numbers.length - 1;
    String[] words = numbers.split(" ");
    int[] nums = new int[words.length];
    for (int i = 0; i < words.length; i++){
      nums[i] = Integer.parseInt(words[i]);
    }
    Arrays.sort(nums);
    return nums[words.length - 1] + " " + nums[0];
    
  }
}
