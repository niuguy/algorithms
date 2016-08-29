void quickSort(int arr[], int left, int right){
	int index = partition(arr, left, right);
	if(left < index -1){
		quickSort(arr, left, index - 1);
	}

	if(right > index){
		quickSort(arr, index, right);
	}
} 

int partition(int arr[], int left, int right){
	int pivot = (left + right) /2 ;
	while(left < = right){
		while(arr[left] < arr[pivot]) left++;
		while(arr[right] > arr[pivot]) right--;
		if(left <= right){
			swap(arr, left, right);
			left++;
			right--
		}
	}
	return left;
}