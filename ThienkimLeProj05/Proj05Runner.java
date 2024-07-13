public class Proj05Runner {
    public static String runA(String str) {
        // Append the student's name to the input string
        return str + " Thienkim Le\n";
    }

    public static StringBuffer runB(StringBuffer strBuf) {
        // Append the student's name to the input StringBuffer
        strBuf.append(" Thienkim Le");
        return strBuf;
    }
}