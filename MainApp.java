import java.util.Stack;


public class MainApp {

    public static void main(String[] args) {


        // testGraph();
//        testDfs();

//        testBfs();
//
//    }
//
//    private static void testBfs() {
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

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");
        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        Stack<String> path = graph.findShortPathViaBfs("Москва", "Воронеж");
        System.out.println("\n The shortest path: ");
        showShortPath(path);

    }

    private static void showShortPath(Stack<String> path) {

        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        while (!path.isEmpty()) {
            if (!isFirst) {
                sb.append(" -> ");
            }
            isFirst = false;
            sb.append(path.pop());
        }
        System.out.println(sb);

    }
}


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
//}
