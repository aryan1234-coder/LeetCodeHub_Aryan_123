class MyHashMap {

    private static class Node{

        int value;
        int key;
        Node next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private int final_size=1000;
    private Node[] buckets;

    public MyHashMap() {

        buckets=new Node[final_size];
        
    }

    public int hash(int key){
        return key%final_size;
    }
    
    public void put(int key, int value) {


        int index=hash(key);
        Node head=buckets[index];

        if(head==null){
            buckets[index]=new Node(key,value);
            return;
        }
        Node curr=head;

        while(curr!=null){

            if(curr.key==key){
                curr.value=value;
                return;
            }
            if(curr.next==null){
                break;
            }
            curr=curr.next;
        }

        curr.next=new Node(key,value);   
    }
    
    public int get(int key) {

        int index=hash(key);

        Node current=buckets[index];

        while(current!=null){

            if(current.key==key){
                return current.value;
            }
            current=current.next;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node curr = buckets[index];

        if (curr == null) return;

        
        if (curr.key == key) {
            buckets[index] = curr.next;
            return;
        }

       
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */