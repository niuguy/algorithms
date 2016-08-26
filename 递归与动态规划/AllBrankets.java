//与全排列不同，这里需要考虑括号不同位置的组合可能会重复

public static Set<String> generateParens(int remaining){
	Set<String> set = new HashSet<String>();
	if(remaining == 0){
		set.add("");
	} else {
		Set<String> prev = generatePrens(remaining - 1);
		for(String str:prev){
			for(int i =0 ; i< str.length; i ++){
				if(str.charAt(i) == '('){
					String s = insert(str, i);

					set.add(s);
				}
			}

			if(!set.contains("()" + str)){
				set.add("()" + str);
			}
		}
	}
	return set;
}


public String insert(String str, int leftIndex){
	String left = str.subString(0, leftIndex + 1);
	String right = str.subString(leftIndex + 1, str.length());
	return left + "()" + right;
}