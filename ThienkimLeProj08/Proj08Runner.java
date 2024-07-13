/* File Proj08Runner.java
*****************************************************/

public class Proj08Runner {
    
    public String run(String certification) {
        System.out.println("\n=======This line is required in the output.=======");
        return "I certify that this program is my own work\n" +
               "and is not the work of others. I agree not\n" +
               "to share my solution with others.";
    }
    
    public String run(int num, String name) {
        System.out.println("=======This line is required in the output.=======");
        return "Thienkim Le\n";
    }
    
    public byte run(int value) {
        System.out.println("=======This line is required in the output.=======");
        return (byte)value;
    }
}