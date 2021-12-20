class createNode{
    String data;
    createNode next;
    createNode(String data,createNode next){
        this.data=data;
        this.next=next;
    }
    public String toString(){
            if(data==null)
                return "Empty data";
            return data;
    }

}

class Slist {
    createNode head=new createNode(null,null);
    public SListIterator newList(){
        return new SListIterator(head);
    }

    public String toString(){
        if(head==null){
            return "empty";
        }
            String ans="";
            SListIterator iterator1=this.newList();
            while(iterator1.hasNext()){
                ans=ans+iterator1.next().data+"-->";
            }
        return ""+ans+"null";
    }
}

class SListIterator {
    createNode node;

    SListIterator(createNode node) {
        this.node = node;
    }
    public createNode next() {
        node = node.next;
        return node;
    }

    public boolean hasNext() {
        return node.next != null;
    }

    public void insertNode(String data) {
        node.next = new createNode(data, node.next);
        node = node.next;
    }

    public void removeNode() {
        if (node.next != null) {
            node.next=node.next.next;
        }

    }
}

class SinglyLinkedList {
    public static void main(String[] args){
        Slist slist =new Slist();
        SListIterator sListIterator = slist.newList();
        System.out.println(slist);
        sListIterator.insertNode("one");
        sListIterator.insertNode("two");
        sListIterator.insertNode("three");
        System.out.println(slist);
        SListIterator sListIterator2= slist.newList();
        sListIterator2.removeNode();
        System.out.println(slist);
    }
}

