public boolean isRotation(String s1, String s2){
	int len = s1.length();
	if(len == s2.length() && len != 0){
		String str = s1 + s1;
		return isSubString(str, s2)
	}
	return false;
}