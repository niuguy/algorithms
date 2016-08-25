public boolean findPath(int x, int y, ArrayList<Point> path){
	Point point = new Point();
	path.add(point);
	if(x == 0 && y ==0){
		return true;
	}

  boolean success = false;
	if(x > 0 && isFree(x-1 ,y)){
		success = findPath(x-1, y, path);
	}

	if(!success && isFree(x, y-1)){
		success = findPath(x, y-1, path);
	}

	if(!success){
		path.remove(point);
	}

	return success;

}


//DP 版本

public boolean findPath(int x, int y, ArrayList<Point> path, Hashtable<Point, boolen>() cache){
	Point point = new Point(x, y);
	if(cache.containsKey(point)){
		return chache.get(point);
	}

	path.add(point);
	if(x == 0 && y ==0){
		return true;
	}

  boolean success = false;
	if(x > 0 && isFree(x-1 ,y)){
		success = findPath(x-1, y, path, cache);
	}

	if(!success && isFree(x, y-1)){
		success = findPath(x, y-1, path, cache);
	}

	if(!success){
		path.remove(point);
	}
	cache.put(point, success);

	return success;

}