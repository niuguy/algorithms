class StackWithMin extends Stack<Integer>{
	Stack<Integer> minStack;

	public StackWithMin(){
		minStack = new Stack<Integer>();
	}

	public int pop(){
		int top = super.pop();
		if(top == min()){
			minStack.pop();
		}
		return top;
	}

	public int min(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return minStack.peek();
		}
	}

	public void push(int item){
		if(item <= minStack.peek()){
			minStack.push(item);
		}

		super.push(item);
	}


}