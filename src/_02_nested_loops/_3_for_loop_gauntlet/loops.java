package _02_nested_loops._3_for_loop_gauntlet;

public class loops {
	
public static void main(String[] args) {
	
	for(int i=0; i<101; i++) {
		System.out.println(i);
	}
	
		System.out.println(" ");
	
	for(int q=100; q>-1; q--) {
		System.out.println(q);
	}
	
		System.out.println(" ");
	
	for(int w=1; w<101; w++) {
		if(w % 2==0) {
			System.out.println(w);
		}
	}
	
		System.out.println(" ");
	
	for(int v=1; v<100; v++) {
		if(v % 2==0) {
			
		}
		else {
			System.out.println(v);
		}
	}
	
		System.out.println(" ");
	
	for(int a=1; a<501; a++) {
		if(a % 2==0) {
			System.out.println(a +" is even");
		}
		else {
			System.out.println(a +" is odd");
		}
	}
	
		System.out.println(" ");
	
	for(int s=0; s<778; s++) {
		if(s %7==0) {
			System.out.println(s);
		}
	}
	
		System.out.println(" ");
	
	for(int y=2010; y<2024; y++) {
		
		System.out.println("i was " +" in " +y);
		
	}
	
		System.out.println(" ");
	
	for(int t=0; t<3; t++) {
		for(int r=0; r<3; r++) {
			System.out.println(t +" " +r);
		}
	}
	
		System.out.println(" ");
		
	for(int x=1; x<5; x+=3) {
		for(int y=2; y<6; y+=3) {
			for(int z=3; z<7; z+=3) {
		System.out.println(x +" " +y +" " +z);
			} 
		}
	}
	
		
		
		
	}
}
