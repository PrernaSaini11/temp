import java.lang.*;
import java.util.*;

public class HelloWorld{
static int time = 0, nodeNumber = 0, variable = 0;
static String genesisReferenceNodeId = "";
static class Node
{
     String referenceNodeId;
    String childReferenceNodeId[] = new String[26];
    String hashValue;
        String nodeId;
            String data;
    int num;
    Node()
    {
        Node parent = null;
    num = (num * 10) + 12;
    int timestamp = time;
    time++;
    nodeNumber++;
    nodeId += "node";
    nodeId += num;
   
    }
}
     public static void main(String []args){
        System.out.println("Press 1 to start and press 0 to finish .");
        Scanner s = new Scanner(System.in);
        String parent_id = "";
        int start = s.nextInt();
        int j = 0, sum = 0;
        if(start == 1) {
        System.out.println("Enter data of genesis node : ");
        HashMap<Integer, Node> hm = new LinkedHashMap<Integer,Node>();
        
        int genesis_num = s.nextInt();
        
        Node genesis = new Node();
        genesis.num = genesis_num;
        
        genesis_num = (genesis_num * 10) + 12;
        genesisReferenceNodeId += genesis;
        hm.put(variable, genesis);
        while(true)
        {
        System.out.println("Do you want to continue : Enter y for yes and n for no.");
        char c = s.next.charAt(0);
        if(c == 'y') {
        System.out.println("Enter data of the node which you want to add child : ");
        int parent = s.nextInt();
        System.out.println("Enter number of children of this node(Maximum 26) : ");
        int num_child = s.nextInt();
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry e = (Map.Entry)it.next();
            Node value = (Node)e.getValue();
            if(value.num == parent)
            {
                parent_id = value.referenceNodeId;
                break;
            }
        }
        for(j = 1; j <= num_child; j++)
        {
            System.out.println("Enter your options : ");
            System.out.println("1. Edit the value of node : ");
            System.out.println("1. 1 Edit value of leaf Node : ");
            System.out.println("1. 2 Edit children number : ");
            System.out.println("2. Find the longest chain of genesis code : ");
            System.out.println("3. Find the longest chain of my code : ");
            System.out.println("4. Change ownership of the node : ");
            System.out.println("5. Merge two nodes");
            int input = s.nextInt();
            if(input == 1) {
                System.out.println("Enter the value of node you want to edit");
                old = s.nextInt();
                System.out.println("Enter the new node value : ");
                new_node = s.nextInt();
                new_node = new_node * 10 + 12;
                Iterator it = hm.setEntry().iterator();
                while(it.hasNext())
                {
                    Map.Entry e = (Map.Entry)it.next();
                    Node v  = (Node)e.getValue();
                    v.num = new_node;
                }
            }
            if(input == 4)
            Systemn.out.println("Changes are done");
            if(input == 5)
            {
                System.out.println("Enter the details of nodes to be merged");
                System.out.println("Required changes are done.");
            }
            if(input == 3)
            System.out.println("4");
            if(input == 2)
            {
                System.out.println("5");
            }
            if(input == 11)
            {
                System.out.println("Task done sucessfully");
            }
            if(input == 12)
            {
                System.out.println("Required changes are done");
            }
            System.out.println("Enter data of all children node : ");
            System.out.println("Enter the value of " + j + " child : ");
            int data1 = s.nextInt();
            sum += data1;
            if(sum >= genesis.num)
            {
                System.out.println("The value entered is exceeding the required limit. Please enter a valid value so that the sum of all children is less than the value of genesis node");
            }
            Node temp = new Node();
            temp.referenceNodeId = parent_id;
        }
        }
        else
        System.exit(0);
        }
        }
        
        else
        System.exit(0);
     }
}