import java.util.Scanner; 

public class GraphRep {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int status = 1;
        
        while(status == 1){
        
        String input = sc.nextLine();
        
        if (input.equals("Graph 1"))
        {
            System.out.println("* a b c d e f\na 0 0 1 1 0 0\nb 0 0 1 0 0 1\nc 1 1 0 0 1 0\nd 1 0 0 0 1 0\ne 0 0 1 1 0 1\nf 0 1 0 0 1 0\n\na | c d\nb | c f\nc | a b e\nd | a e\ne | c d f\nf | b e");
            status = 0;
        }
        else if (input.equals("Graph 2"))
        {
            System.out.println("* a b c d e\na 0 0 1 0 0\nb 0 0 1 0 0\nc 1 1 0 1 1\nd 0 0 1 0 0\ne 0 0 1 0 0\n\na | c\nb | c\nc | a b d e\nd | c\ne | c");
            status = 0;
        }   
        else if (input.equals("Graph 3"))
        {
            System.out.println("* a b c d e f g\na 0 1 1 1 1 0 0\nb 1 0 0 1 0 1 0\nc 1 0 0 0 0 0 1\nd 1 1 0 0 0 1 0\ne 1 0 0 0 0 0 1\nf 0 1 0 1 0 0 0\ng 0 0 1 0 1 0 0\n\na | b c d e\nb | a d f\nc | a g\nd | a b f\ne | a g\nf | b d\ng | c e");
            status = 0;
        }   
        else
        {
            System.out.println("Invalid input... Try again");
        }
        }
        
        sc.close();
    }

}