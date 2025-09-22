package LinkedListIntroduction;

public class Main {
    public static void main(String[] args){

        // Building our base node values
        LLNode<String> n1 = new LLNode<String>("Node One");
        LLNode<String> n2 = new LLNode<String>("Node Two");
        LLNode<String> n3 = new LLNode<String>("Node Three");

        n1.setNext(n2);
        n2.setNext(n3);
        
        LLNode<String> CurrNode = n1;
        while(CurrNode!=null){
            System.out.println(CurrNode.getInfo());
            CurrNode=CurrNode.getNext();
        }

        System.out.println("NEXT EXAMPLE");

        // Walking through initializing a linked even values from 0 to 10
        
        // Head value always stays as the first element in our linked list
        LLNode<Integer> head = new LLNode<Integer>(0);

        // Tail, will eventually refer to the last element in our linked list
        LLNode<Integer> tail = head;
        for(int i=2;i<11;i=i+2){
            LLNode<Integer> temp = new LLNode<Integer>(i);
            tail.setNext(temp);
            tail = temp;
        }
        
        LLNode<Integer> CurrIntegerNode = head;
        
        while(CurrIntegerNode!=null){
            System.out.println(CurrIntegerNode.getInfo());
            CurrIntegerNode=CurrIntegerNode.getNext();
        }

        // Insertion at the start of the linked list

        LLNode<Integer> temp = new LLNode<Integer>(-1);
        temp.setNext(head);
        head = temp;

        // Insertion at the end of the list

        // Method 1: If we have maintained our tail state

        temp = new LLNode<Integer>(11);
        tail.setNext(temp);
        tail=temp;

        // Method 2: What if we don't have a maintained tail state

        CurrIntegerNode = head;
        while(CurrIntegerNode.getNext() != null){
            CurrIntegerNode = CurrIntegerNode.getNext();
        }
        CurrIntegerNode.setNext(new LLNode<Integer>(12));

        // Ask students what the BigO complexity between method 1 and method 2 are in this case?

        //Insertaion at the interior of the list
        LLNode<Integer> five = new LLNode<Integer>(5);
        CurrIntegerNode = head;
        while(CurrIntegerNode != null){ // Continue going through linked list until null
            if (five.getInfo() > CurrIntegerNode.getInfo() &&  five.getInfo() < CurrIntegerNode.getNext().getInfo()) {
                LLNode<Integer> tmp = CurrIntegerNode.getNext();
                CurrIntegerNode.setNext(five);
                five.setNext(tmp);
                break;
               
            }
            CurrIntegerNode = CurrIntegerNode.getNext();
        }

        //What are the issues with my implementation, how do we fix them?
        //Null pointer issues <- what happens if our linked list is null and this is the first element we are inserting?
        //what happens if the .getnext() is null for the second part of our && condition?
        //remind students about short circuiting 
        //     if (CurrIntegerNode.getNext() != null &&  // Add this line
        //     five.getInfo() > CurrIntegerNode.getInfo() &&  
        //     five.getInfo() < CurrIntegerNode.getNext().getInfo()) {


        
        
    }
}
