class HouseHold {
    // Attributes
    private int idNumber;
    private double annualIncome;
    private int numMembers;
    private String state;

    // Constructor
    public HouseHold(int idNumber, double annualIncome, int numMembers, String state) {
        this.idNumber = idNumber;
        this.annualIncome = annualIncome;
        this.numMembers = numMembers;
        this.state = state;
    }

    // Getters
    public int getIdNumber() {
        return idNumber;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public String getState() {
        return state;
    }
}