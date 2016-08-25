public static ArrayList<String> getPerms(String str){
	if(str == null){
		return null;
	}

	ArrayList<String> allPerms = new ArrayList<String>();
	if(str.length() == 0){
		allPerms.add("");
		return allPerms;
	}

	//取出第一个
	char first = str.charAt(0);
	String remain = str.subString(1);
	//剩余的字符任意位置添加first字符，再并入总集合
	for(i = 0 ; i< remain.length ; i ++){
		String left = remain.subString(0, i);
		String right = remain.subString(i);
		allPerms.add(left + first + remain);

	}

	return allPerms;

}