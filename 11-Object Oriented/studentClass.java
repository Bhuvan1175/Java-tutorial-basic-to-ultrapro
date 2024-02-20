class student {
    public int rollNo;
    public String Name;
    public String Course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (total()) / 3;
    }

    public char grade() {
        if (average() > 60)
            return 'A';
        else
            return 'B';
    }

    public void displayStudent() {
        System.out.println("-------------Student Details----------------");
        System.out.println("Roll No :" + rollNo + "\nName : " + Name + "\nCourse : " + Course);
    }
}

public class studentClass {
    public static void main(String[] args) {
        student S1 = new student();
        S1.rollNo = 71;
        S1.Name = "Bhuvi";
        S1.Course = "B.Tech";
        S1.m1 = 87;
        S1.m2 = 93;
        S1.m3 = 78;
        System.out.println("Total Marks : " + S1.total());
        System.out.println("Average     : " + S1.average());
        System.out.println("Grade       : " + S1.grade());
        S1.displayStudent();
    }
}
