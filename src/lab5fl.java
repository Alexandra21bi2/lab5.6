import java.util.ArrayList;
import java.util.Scanner;

public class lab5fl {
        public static void main(String[] args) {
            Boolean end_signal = true;
            Scanner sc = new Scanner(System.in);
            ArrayList<Float> arr = new ArrayList<Float>();
            System.out.println("when you enter all numbers, please, enter quit");
            System.out.println("Enter the elements:");
            while (end_signal) {
                String str = sc.next();
                if (str.equals("quit")) {
                    end_signal = false;
                    break;
                }
                try {
                    Float element = Float.parseFloat(str);
                    arr.add(element);
                } catch (NumberFormatException e) {}
            }
            sc.close();
            System.out.println(arr);
            int count = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                if ((arr.get(i) > arr.get(i + 1))) {
                    arr.remove(i + 1);
                    i--;
                }
            }
            System.out.print(arr);

        }
    }


