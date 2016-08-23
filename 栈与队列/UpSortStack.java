/**
*编写程序,按升序对 栈 进行 排序( 即 最大 元素 位于 栈 顶)。
*最多只能使用一个额外的栈存放数据，但不得将元素复制到别的数据结构中（如数组）栈支持
*push pop peek isEmpty()
*
**/
//tip 需要一个临时变量

public void sort(Stack s){
	Stack r = new Stack()
	while(!s.isEmpty()){
		tmp = s.top();
		while(!r.isEmpty()&&r.peek()>tmp){
			s.push(r.pop());
		}
		r.push(tmp);
	}
	return r;
}
