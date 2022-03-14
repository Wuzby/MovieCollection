import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import com.sun.net.httpserver.Authenticator.Result;

public class Main {

	static ArrayList<Integer> resultArray = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		int[] movies = { 3, 1, 1 };
		run(3, 3, movies);

		// Character[] array = {'A','B','D'};

		// System.out.println(Arrays.asList(array).indexOf('D'));

	}

	public static void run(int n, int m, int[] movies) {
		ArrayList<Integer> movieStack = new ArrayList<Integer>();
		
		ArrayList<Integer> idSet = new ArrayList<Integer>();
		
		for (int i = 0; i < movies.length; i++) {
			idSet.add(movies[i]);
			//System.out.println("IDSet Array "+idSet.get(i));
		}
		
		int val = 1;
		for (int j = 0; j < n; j++) {
			movieStack.add(val);
			val++;
			//System.out.println("MovieStack Array " + movieStack.get(j));
		}
		val = 1;
		
		int temp = 0;
		int postition = 0;
		//for (int k = 0; k < n; k++) {
			
			for (int i = 0; i < m; i++) {
				temp = idSet.get(i);
				//System.out.println(i + "Inner loop Temp "+temp);
				//if element exists in the arraylist
				if(movieStack.contains(temp)){
					//if it does I want its position in the arraylist
					postition = movieStack.indexOf(temp);
					//System.out.println("Position "+postition);
					resultArray.add(postition);
					
					movieStack.remove(postition);
					movieStack.add(0, temp);
				}
			}
		//}
//		
//		for (int i = 0; i < resultArray.size(); i++) {
//			System.out.println(resultArray.get(i));
//		}
		int[] resultarr = resultArray.stream().mapToInt(i -> i).toArray();
		
		for (int i = 0; i < resultarr.length; i++) {
			System.out.println(resultArray.get(i));
		}
		
		//System.out.println(resultArray.size());
		
	}

	
	
}