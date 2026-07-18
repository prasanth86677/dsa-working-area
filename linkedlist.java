import java.util.Scanner;

class node<T>{
    T value;
    node<T> next;
    node(T value){
        this.value=value;
        this.next=null;
    }
};
class nodeoperation<T>{
    Scanner scan=new Scanner(System.in);
    node<T> head=null;
    node<T> current=null;
    // void nodecreate(int value){
    //     for(int i=1;i<=value;i++){
    //         System.out.println("enter the value for the node "+i);
    //         int v;
    //         v=scan.nextInt();
    //         node<T> newnode=new node<>(v);
    //         if(head==null){
    //             head=newnode;
    //             current=newnode;
    //         }
    //         else{
    //             current.next=newnode;
    //             current=newnode;
    //         }
    //     }
    // }

    void display(){
        current=head;
        while(true){
            System.out.println("| "+current.value+" |"+"| "+current.next+" |");
        if(current.next==null){
            break;
        }
        current=current.next;
        }
    }
    void delete(T value){
        current=head;
        while(current.next!=null && !current.next.value.equals(value)){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("invalid position");
        }
        else{
            current.next=current.next.next;
        }
    }

    void insertion1(T value,int pos){
        node<T> newnode=new node<>(value);
        current=head;
        if(pos==1){
            newnode.next=head;
            head=newnode;
        }
        for(int i=1;current!=null && i<pos-1;i++){
            current=current.next;
        }
        if(current==null){
            System.out.println("invalid position");
        }
        else{
            newnode.next=current.next;
            current.next=newnode;
        }

    }
    //insertatlast
    void insertatlast(T value){
        current=head;
        node<T> newnode=new node<>(value);
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }

    //insertatbeginning
    void insertatbeginning(T value){
        head=current;
        node<T> newnode=new node<>(value);
        newnode.next=current;
        head=newnode;

    }
//insertion part which is used to insert the value between the linkedlist
    void insertion(T value,int pos){
        if(pos<1){
            System.out.println("invalid position");
        }
        node<T> newnode=new node<>(value);
        current=head;
        int i=1;
        while(current.next!=null && i<pos-1){
                current=current.next;
                i+=1;
        }
        if(current.next==null){
            System.out.println("invalid positon ");}
        else{
            newnode.next=current.next;
            current.next=newnode;
        }
        
    }

    //reverse operation
    void reverse(){
        node<T> prev=null;
        node<T> next1=null;
        current=head;
        while(current!=null){
            next1=current.next;
            current.next=prev;
            prev=current;
            current=next1;
        }
        head=prev;
    }
}
public class linkedlist{


  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String type;
    System.out.println("enter the type of linkedlist you want to create");
    type=scan.next();
    if(type.equals("String")){
    nodeoperation<String> n=new nodeoperation<>();
    n.insertatbeginning("Welocome");
    n.insertatlast("mental"); 
    n.insertatlast("psycho"); 
    n.insertatlast("30");    
    n.delete("psycho");
    n.display();
    }
    if(type.equals("int")){
        nodeoperation<Integer> n=new nodeoperation<>();
    n.insertatbeginning(99);
    n.insertatlast(30);    
    n.display();
    }
    
  
    //  long start=System.nanoTime();
    // n.insertion1(99, 7);
    // long end=System.nanoTime();
    // System.out.println("the total time"+(end-start)/1_000_000.0);
    // n.delete(4);
    // n.display();
      
  }
}
//hello new file changes
//welocome to the new fileclea
//sponsorship
//buttler welcome to the world
//water packetgit 