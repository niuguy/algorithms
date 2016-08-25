ArrayList<ArrayList<Integer>> getAllSubSets(ArrayList<Integer> set, int index){
	ArrayList<ArrayList<Integer>>  allSubSets;

	if(index == set.size()){
		allSubSets = new ArrayList<ArrayList<Integer>>();
		allSubSets.add(new ArrayList<Integer>());
	}	else{
		allSubSets = getAllSubSets(set, index+1);
		//每一个子集合都要加这个元素
		addSubSet = allSubSets.get(index)
		//iterate add each subset to moreSubsets
		ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> newSet: newSubSets){
			ArrayList<Integer> moreSubSet = new ArrayList<Integer>();
			moreSubSet.add(addSubSet);
			moreSubSet.add(newSet);
			moreSubsets.add(moreSubSet);
		}
		allSubSets.add(moreSubSets);

	}

}