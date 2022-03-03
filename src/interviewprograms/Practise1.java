package interviewprograms;

public class Practise1 {

	public static void main(String[] args) {
		
int abc[][]= {{10,4,5},{3,4,7},{11,2,9}};
		
	int min=abc[0][0];
	int n=0;
	for (int i = 0; i < 3; i++) {
		
		for (int j = 0; j < 3; j++) {
			
			if(abc[i][j]>min) {
				
				min=abc[i][j];
				n=j;
			
			}
		}
		
	}
	
	System.out.println(min);
	
	
		
	}

}
