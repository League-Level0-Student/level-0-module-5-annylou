package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	
	int one = 0;
	int two = 1;
	int sum;
	int total = 0;
	System.out.println(one);
	System.out.println(two);
	while(total<5) {
		sum = one + two;
		one = sum;
		two = two + sum;
		System.out.println(one);
		System.out.println(two);
		
		total+=1;
	}
                    
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ~144, 233, 377, 610, 987, 1597, 2584, 4181~

/* sum = 0+1 (1)
one = 1
two = 1+1 (2)
sum = 1+2 (3)
one = 3
two = 2+3 (5) */