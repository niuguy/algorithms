class queue{
	Node first, last;
	void enqueue(Object item){
		if(first == null){
			last = new Node(item);
			first = last;
		}else{
			last.next = new Node(item);
			last = last.next;
		}
	}

	Object dequeue(){
		if(first == null){
			return null;
		}
		Object item = first.item;
		first = first.next;
		return item;
	}

}