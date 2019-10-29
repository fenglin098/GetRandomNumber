import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 24, 30, 31, 24, 32, 33, 34, 24, 35, 36);
        int randomNum = r.nextInt(arr1.size());
        System.out.println(arr1.get(randomNum));
        }
    }

