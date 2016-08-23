public class MyQueue{
	
	Stack<Object> s1, Stack<Object> s2;
	
	public void add(Object item){
		s1.push(item)

	}

	public void shift(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}

	public Object peak(){
		shift()
		s2.peak()
	}

	public Object remove(){
		shift();
		s2.peak();
	}


}