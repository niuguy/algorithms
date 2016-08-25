public static int magicFast(int[] array, int start, int end){
	if(start > end || start < 0 || end >= array.length){
		return 0;
	}
	int mid = (start + end) / 2;
	if (array[mid] ==  mid){
		return mid;
	}else if (array[mid] > mid){
		return magicFast(array, start, mid - 1 );
	}else{
		return magicFast(array, start + 1 , mid);
	}
}