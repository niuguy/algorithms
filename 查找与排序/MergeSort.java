void mergeSort(int[] array, int low, int high){
	if(low >= high){
		return ;
	}

	int mid = (low + high)/2;
	mergeSort(array, low, mid);
	mergeSort(array, mid + 1, high);
	merge(array, low, mid, high);
}


void int[] merge(int[] array, int low, int mid, int high){
	int[] helper  = new int[array.length];
	//copy original array to helper
	for(int i = 0 ; i < array.length; i++){
		helper[i] = array[i];
	}

	int leftI = low;
	int rightI = mid + 1;
	int cur = low

	while(leftI <= mid && rightI <= high){
		if(array[leftI] <= array[rightI]){
			helper[cur++] = array[leftI];
			leftI ++;
		}else{
			helper[cur++] = array[rightI];
			rightI ++;
		}
	}

	//left is left
	if(leftI <= mid){
		while(leftI <= mid){
			helper[cur] = array[leftI];
			cur++;
			leftI++;
		}
	}



	//right is already in the helper
	return helper;
}

public static void main(String[] array){
	int[] sorted = mergeSort(array, 0, array.length - 1);
}
