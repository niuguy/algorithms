public static void deleteDuplates(Node node){
	if(null == node){
		return null;
	}
	HashMap nodeMap= new HashMap();

	Node last = node;
	while(node != null){
		if(nodeMap.get(node.val) == true){
			//删除
			last.next = node.next;
		}else{
			nodeMap.put(node.val, true);
			last = node;
		}
	}
	node = node.next;
}


public static void deleteDuplates2(Node node){
	if(null == node){
		return null;
	}
	Node pre = node;
	Node cur = node;
	while(pre != null){
		cur = pre;
		while(cur.next != null){
			if(cur.next.val == pre.val){
				cur.next = cur.next.next;
			}else{
				cur = cur.next;
			}
		}
		pre = pre.next;

	}


}



