public class recursion {
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
            // fun(n-1);
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}
// Why we Used Recursion insstead of Loops ?
// 1. It's easy to understand and implement.
// 2. It helps in solving complex problems with simpler subproblems.
// 3. It helps in reducing the time complexity of the problem.
// Recursion when it is calling again and again then it will return back while
// returning this do something this cannot be easily do in Loop.
// For example, Fibonacci series can be solved using recursion instead of loops
// because it reduces the number of iterations.
// 4. It allows us to define a function within itself which is called again and
// again until a base condition is reached. This process is known as recursion.
// Recursion is used when a problem can be solved by breaking it down into
// smaller, similar subproblems that are easier to solve.