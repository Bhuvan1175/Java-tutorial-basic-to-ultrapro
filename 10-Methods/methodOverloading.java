public class methodOverloading {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static float max(float a, float b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 8f));
    }
}
