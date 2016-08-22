public void Node addLists(Node l1, Node l2){
	if(l1 == null && l2 == null){
		return null;
	}
	Node sumNode = new Node();
	int sum_up = 0;
	int sum_remain = 0;
	while(l1 != null && l2 != null){
		int sum_i = l1.val + l2.val + sum_up;
		if(sum_i / 10 > 0){
			sum_up = sum_i /10;
			sum_remain = sum_i % 10;
		}else {
			sum_remain = sum_i;
		}
		sumNode.val = sum_remain;
	}

	//如果l1,l2正好加完，看一下最高位要不要进位

	//l1有剩余，加一下l1剩余部分

	//l2有剩余，加一下l2剩余部分


}

//递归
Node addLists(Node l1, Node l2, int carry){
	if(l1 == null && l2 == null && carry == 0){
		return null;
	}
	int value = carry;
	if(l1 != null){
		value += l1.val;
	}

	if(l2 != null){
		value += l2.val;
	}

	Node result = new Node();
	result.val = value % 10;

	Node next = addLists(l1 == null ? null:l1.next, l2 == null ? null: l2.next, value/10);

	result.next = next;

	return result;




}