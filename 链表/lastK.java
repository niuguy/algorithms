public static Node lastK(Node start, k){
	pre = cur = start;
	if(null == start){
		return null;
	}
	int count = 1;
	while(cur.next != null  && count < k){
		cur = cur.next;
		count += 1;
	}

	if(count < k){
		//链表长度不足k
		return null;
	}

	while (cur.next != null){
		cur = cur.next;
		pre = pre.next;
	}

	return pre;

}