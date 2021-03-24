import java.util.Scanner;
import java.util.logging.LoggingPermission;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


class Comparator{
    public int compare(int a, int b){
        if (a > b){
            return 1;
        }
        else if (a == b){
            return 0;
        }
        else{
            return -1;
        }
    }
}

public class Array {
    private static final Logger LOG = LogManager.getLogger(LoggingPermission.class);
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        LOG.info("Enter only one number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n > 0 && n != 0){
            System.out.println("Enter the elements of array: ");
        LOG.warn("Enter only integers ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }else LOG.fatal("You entered wrong number");

        Comparator comp = new Comparator();
        sort(arr, comp);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " \n");
        }LOG.error("Soon is the end of session\n");
        LOG.fatal("The end of session");
    }

    public static int sort(int[] arr, Comparator comp) {
        for (int k = arr.length / 2; k > 0; k /= 2) {
            for (int i = k; i < arr.length; i++) {
                int val = arr[i];
                int j;
                for (j = i; j >= k && comp.compare(arr[j - k], val) > 0; j -= k) {
                    arr[j] = arr[j - k];
                }
                arr[j] = val;

            }
        }LOG.debug("This is debug message");
        return 0;
    }

}
