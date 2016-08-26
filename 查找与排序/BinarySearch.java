public int findposition(int[] numbers, target){
	if(null == numbers || numbers.length == 0){
		return -1;
	}

	int start = 0;
	int end = numbers.length;

	while(start + 1 < end){
		int mid = start + (end - start)/2;
		if(numbers[mid] == target) {
			return target;
		}
		else if(numbers[mid] > target){
			end = mid;
		}
		else if(numbers[mid] < target){
			start = mid;
		}
	}

	if(nums[start] == target){
		return start;
	}

	if(nums[end] == target){
		return end;
	}

	return -1;

}