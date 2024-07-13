import java.util.Date;
import java.util.Random;

public class Proj11Runner {
    public void run(Object[][] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Object[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }
    }

    public static void main(String[] args) {
        Random generator = null;
        if (args.length != 0) {
            generator = new Random(Long.parseLong(args[0]));
        } else {
            generator = new Random(new Date().getTime());
        }

        int[] vals = {Math.abs((byte) generator.nextInt()) % 5 + 2,
                      Math.abs((byte) generator.nextInt()) % 5 + 2,
                      Math.abs((byte) generator.nextInt()) % 5 + 2};

        Object[][] array = new Object[3][];
        array[0] = new Object[vals[0]];
        array[1] = new Object[vals[1]];
        array[2] = new Object[vals[2]];

        Proj11Runner obj = new Proj11Runner();
        obj.run(array);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Row 0 width = " + vals[0]);
        System.out.println("Row 1 width = " + vals[1]);
        System.out.println("Row 2 width = " + vals[2]);
        System.out.println("Final value = " + (vals[0] + vals[1] + vals[2]));

        System.out.println("That's all folks.");
    }
}
