public class Proj10RunnerB implements Proj10X {
    private int val;

    public Proj10RunnerB(int val) {
        this.val = val;
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
        return val +1;
    }

    @Override
    public String toString (){
        
        return String.valueOf(val+5);
    }
}
