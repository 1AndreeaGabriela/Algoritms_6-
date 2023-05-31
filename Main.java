public class Main {
    public static void main(String[] args)
    {
        System.out.println("---------------------PASCAL TRIANGLE---------------------------\n");
        int n = 5;
        PascalTriangle.printPascal(n);
        System.out.println("------------------END PASCAL TRIANGLE--------------------------\n");




        System.out.println("-----------------Longest increasing subsequence-----------------\n");
        int[] nums = {1,3,2,9,6,10,5};
        LongestIncreasingSubsequence.printLIS(nums);
        System.out.println("--------------End Longest increasing subsequence----------------\n");




        System.out.println("----------------Triangularea cu ponderea minimă-----------------\n");

        Point[] vertices
                    = { new Point(0, 0), new Point(2, 0),
                    new Point(2, 1), new Point(1, 2),
                    new Point(0, 1) };

        System.out.println(MinimumTriangulation.MWT(vertices,
                    0, vertices.length - 1));

        System.out.println("-------------End Triangularea cu ponderea minimă----------------\n");

    }
}