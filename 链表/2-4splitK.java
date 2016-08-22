public void split(Node start, int k){
	if (start == null) {
		return null;
	}


	Node dum1 = new Node();
	Node dum2 = new Node();
	Node dum1_p = dum1;
	Node dum2_p = dum2;

	Node cur = start;

	while(cur != null){
		if(cur.val >= k){
			dum1_p.next = cur;
			dum1_p = dum1_p.next;
		}	else{
			dum2_p.next = cur;
			dum2_p = dum2_p.next;
		}
	}
	dum2_p.next = dum1;

	return dum1;

}


public Node partition(Node node, int x){
	Node beforeStart = null;
	Node beforeEnd = null;
	Node afterStart = null;
	Node afterEnd = null;

	while(node != null){
		Node next = node.next;
		node.next = null;
		if(node.data < x){
			if(beforeStart == null){
				beforeStart = node;
				beforeEnd = beforeStart;
			}else {
				beforeEnd.next = node;
				beforeEnd = node;
			}
		}else {
			if(afterStart == null){
				afterStart = node;
				afterEnd = afterStart;
			}	else{
				afterEnd.next = node;
				afterEnd = node;
			}
		}
		node = next;
	}


}