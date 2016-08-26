public static void Merge(int[] a, int[] b, int lastA, int lastB){
	int mergeIndex = lastA + lastB - 1;
	int indexA = lastA - 1;
	int indexB = lastB - 1;
	//from back to start
	while(indexA >= 0 && indexB >=0){
		if(a[indexA] > b[indexB]){
			a[mergeIndex] = a[indexA];
			mergeIndex--;
			indexA--;
		}else{
			a[mergeIndex] = b[indexB];
			mergeIndex--;
			indexB--;
		}
	}

  //array B  may left ,but A wouldn't
	if(indexB >= 0){
		while(indexB >=0){
			a[mergeIndex] = b[indexB];
			mergeIndex--;
			indexB--;
		}
	}

}