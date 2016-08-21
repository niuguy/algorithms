public String compressBad(String str){
	//检查压缩后的字符串是否变得更长
  int count = countCompression(str);
  if(count >= str.length()){
  	return str;
  }

	String str = " ";
	char last = str.charAt(0);
	int count = 1;
	for(int i = 1; i < str.length(); i++){
		if(str.charAt(0) == last){
			count++;
		}else {
			str += last + "" + count;
			last = str.charAt(i);
			count = 1;
		}
	}
	return str + last + count;
}

int countCompression(String str){
	if(str == null || str.isEmpty()) return 0;
	char last = str.charAt(0);
	int count =1;
	int newCount = 0;
	for(int i =1; i< str.length(); i++){
		if(str.charAt(0) == last){
			count++;
		}else {
			newCount += 1 + String.valueOf(count).length();
			last = str.charAt(i);
			count = 1;
		}
	}
	newCount += 1 + String.valueOf(count).length();
	return newCount;
}