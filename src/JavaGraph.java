/*import java.util.Scanner;
public class JavaGraph{
    private final int vertices;
    private int[][] adjacency_matrix;

    public Represent_Graph_Adjacency_matrix(int v){
        vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge){
        try {
            adjacency_matrix[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("The vertices does not exist");
        }
    }
    public int getEdge(int to, int from){
        try {
            return adjacency_matrix[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("The vertices does not exist");
        }
        return -1;
    }

    public static void main(String[] args) {
        int v,e,count = 1, to = 0, from=0;
        Scanner sc = new Scanner(System.in);
        Represent_Graph_Adjacency_Matrix graph;
        try {
            System.out.println("Enter the Number of Vertices: ");
            v = sc.nextInt();
            System.out.println("Enter the Number of Edge: ");
            e = sc.nextInt();

            graph = new Represent_Graph_Adjacency_Matrix(v);

            System.out.println("Enter the Edges: <to> <from>");
            while (count <=e){
                to =sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("The Adjacency matrix for the given graph is: ");
            System.out.print(" ");
            for (int i=1; i<=v; i++)
                System.out.print(i + " ");
            System.out.println();
            for (int i=1; i<= v; i++){
                System.out.println(i + " ");
                for (int j=1; j<=v; j++)
                    System.out.println(graph.getEdge(i,j) + " ");
                System.out.println();
            }
            catch(Exception E){
                System.out.println("Something went Wrong");
            }
            sc.close();
        }
}
*/