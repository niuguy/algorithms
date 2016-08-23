class stack{
	Node top;

	Object pop(){
		if(null != top){
			 Object item = top.item;
			 top = top.next;
			 return item
		}
		return null;
	}

	void push(Object item){
			newTop = new Node();
			newTop.item = item;
			newTop.next = top;
			top = newTop;
	}

	void peak(){
		return top.item;
	}

}