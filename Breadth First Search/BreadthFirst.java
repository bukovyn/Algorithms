import java.util.*;

public class BreadthFirst { 
    public static class Graph{
        //TreeMap is used to map vertices to Adjacency Lists. The lists are stored as TreeSets for ordering, uniqueness and log(counter) retrieval.
        private TreeMap<String, TreeSet<String>> graph = new TreeMap<>();
        //Adds a node with a given name to the graph.
        public void addVertex(String name){
            if(!graph.containsKey(name)) graph.put(name, new TreeSet<String>());
        }
        //Adds an edge to the graph. Throws an exception if the Vertices don't exist. Two nodes can only share one edge.
        public void addEdge(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing the vertices connected to the given node.
        public String[] getNeighbours(String node){
            if(!graph.containsKey(node)) throw new NoSuchElementException();
            TreeSet<String> neighbours = graph.get(node);
            return neighbours.toArray(new String[neighbours.size()]);
        }
        //Returns true if there is an edge between vertex1 and vertex2;
        public boolean areConnected(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            return graph.get(vertex1).contains(vertex2) && graph.get(vertex2).contains(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing all the vertices in the graph.
        public String[] getVertices(){
            Set<String> vertices = graph.keySet();
            return vertices.toArray(new String[vertices.size()]);
        }  
    }
    public static HashSet<String> visited = new HashSet<>();
    public static Graph g = new Graph();
    public static Queue<String> queue = new LinkedList<String>();
    public static int counter;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        counter = sc.nextInt();
        
        for (int foo = 0; foo < counter; foo++) {
            g.addVertex(sc.next());
        }
        for (int foo = 0; foo <= counter; foo++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            String v1 = tokens[0];
            for (int bar = 2; bar < tokens.length; bar++) {
                String v2 = tokens[bar];
                g.addEdge(v1, v2);
            }
        }
     
        String node[] = g.getVertices();
        for (int i = 0; i < counter; i++)
        {   if (!visited.contains(node[i]))
            {   breadthFirstPaths(node[i]);}
        }     
    }
    public static void breadthFirstPaths(String node)
    {   visited.add(node);
        queue.add(node);
        while (!queue.isEmpty())
        {   String edge[] = g.getNeighbours(queue.peek());
                for (int j = 0; j < edge.length; j++)
                {   if (!visited.contains(edge[j]))
                    {   visited.add(edge[j]);
                        queue.add(edge[j]);}
                }
        System.out.println(queue.poll());
        }
    }
}