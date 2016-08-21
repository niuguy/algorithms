public void replaceSpaces(char[] str,int len){
	int spaceCount = 0, newLen, i;
	for(int i = 0; i < len; i++){
		if(str[i] == ' '){
			spaceCount++;
		}
	}
	newLen = len + spaceCount * 2;
	str[newLen] = '\0';
	int newP = newLen;
	for(i = len -1; i > 0; i--){
		if(str[i] == ' '){
			str[newP - 1] = '0';
			str[newP - 2] = '2';
			str[newP - 3] = '%';
			newP -= 3;
		}else {
			str[newP -1] = str[i];
			newP -= 1;	
		}
	}
}