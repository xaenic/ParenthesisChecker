/***
   MyStackLinked - linked implementation of the MyStack interface
**/
public class MyStackLinked implements MyStack{
   
   //define the data container
   private Node top;
   //utility variables
   private int count;
   private int MAX=10;
   //no constructor is required to be explicity defined
   //sentinel methods
   public boolean isFull()       { return false; }
   public boolean isEmpty()      { return top==null; }
   //the standard method names
   public boolean push(Object item){
      boolean ok=!isFull();
         Node node=new Node(item);
         /*if(isEmpty()){
            top=node;
         }
         else{
            node.setNext(top);
            top=node;
         }*/
         if(!isEmpty()){
            node.setNext(top);
         }
         top=node;
         count++;
      return ok;
   }
   public Object pop(){
      Object item=peek();
         if(item!=null){
            Node temp=top;
            top=temp.getNext();
            temp=null;
            count--;
         }
      return item;
   }
   public Object peek(){
      /*Object obj=null
      if(!isEmpty()){
         obj=top.getItem();
      }
      return obj;*/
      //use ternary operator
      return (!isEmpty())?top.getItem():null;
   }
   
     
   public String toString(){
      //REMEMBER: Stack is LIFO (Last-In, First-Out)
      StringBuffer sb=new StringBuffer();
         /*
         Node temp=top;
         while(temp!=null){
            sb.append(top.getItem());
            temp=temp.getNext();
         }*/
         /*for(Node temp=top;temp!=null;temp=temp.getNext()){
            sb.append(temp.getItem());
         }*/
         for(Node temp=top;temp!=null;sb.append(temp.getItem()),temp=temp.getNext());
      return sb.toString();
   }

}//end of class
