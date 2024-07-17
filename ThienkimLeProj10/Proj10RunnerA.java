public class Proj10RunnerA implements Proj10X {
    private int val;
    private static boolean firstInstance = true;

    public Proj10RunnerA(int val) {
        this.val = val;
            System.out.println("I certify that this program is my own work\n" +
                   "and is not the work of others. I agree not\n" +
                   "to share my solution with others.\n" +
                   "Thienkim\n" +
                   "Le");
    }

    
    @Override
    public int getFirst() {
        return val - 1;
    }

    @Override
    public int getSecond() {
        return val;
    }

    @Override
    public int getThird() {
        return val + 1;
    }

    @Override
    public int getData() {
        return val;
    }

    @Override
    public int getModifiedData() {
        return val -1;
    }

    @Override
    public String toString (){
        
        return String.valueOf(val+5);
    }
}
