import com.sun.corba.se.impl.orbutil.graph.Graph;

public class MainApp {

    public static void main(String[] args) {


        // testGraph();
//        testDfs();

        testBfs();

    }

    private static void testBfs() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула", 9);
        graph.addEdge("Москва", "Рязань", 6);
        graph.addEdge("Москва", "Калуга", 7);
        graph.addEdge("Тула", "Липецк", 5);
        graph.addEdge("Рязань", "Тамбов", 6);
        graph.addEdge("Калуга", "Орел", 4);
        graph.addEdge("Липецк", "Воронеж", 6);
        graph.addEdge("Тамбов", "Саратов", 5);
        graph.addEdge("Орел", "Курск", 7);
        graph.addEdge("Саратов", "Воронеж", 7);
        graph.addEdge("Курск", "Воронеж", 5);



    }

    private static final String startName = "Москва";
    private static final String stopName = "Воронеж";


//    private static void testDfs() {
//        Graph graph = new Graph(7);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//
//        graph.addEdges("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("D", "F");
//        graph.addEdge("F", "G");
//
//        graph.dfs("A");
//    }
//
//    private static void testGraph() {
//        Graph graph = new Graph(5);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//
//        graph.addEdges("A", "B", "C");
//        graph.addEdges("B", "A", "C", "D");
//        graph.addEdges("C", "A", "B", "D");
//        graph.addEdges("D", "B", "C");
//
//        graph.display();
//    }
}
