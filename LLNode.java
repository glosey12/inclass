package LinkedListIntroduction;]
package Stack;
public class LLNode<T> {
    T info;
    LLNode<T> next;

    public LLNode(T info){
        this.info=info;
        this.next=null;
    }
    public void setNext(LLNode<T> next){
        this.next = next;
    }
    public LLNode<T> getNext(){
        return this.next;
    }
    public void setInfo(T info){
        this.info=info;
    }
    public T getInfo(){
        return this.info;
    }
}


