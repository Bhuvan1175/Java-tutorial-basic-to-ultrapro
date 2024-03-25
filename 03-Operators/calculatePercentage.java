public class calculatePercentage {
    public static void main(String[] args) {
        double digitalSystemDesign = 47;
        double digitalCommunication = 57;
        double computerNetwork = 43;
        double dataScience = 42;
        double obtainedMarks = digitalSystemDesign + digitalCommunication + computerNetwork + dataScience;
        double totalMarks=60*4;
        double percentage=(obtainedMarks/totalMarks)*100;
        System.out.println("Percentage : "+percentage);
    }
}
// WAP to calculate the percentage of 4 subject of 60 marks each.
