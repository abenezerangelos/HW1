package test;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class Waddy {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		System.out.println("Welcome user start by choosing your file,\n for File 1 press number 1 \n"+"For file 2 press 2");
		try (Scanner input = new Scanner (System.in)) {
			int x=input.nextInt();
			
			

			if(x==2) {File file2 = new File("/Users/abenezerfetsum/eclipse-workspace/test/src/test/input2.txt");
			Scanner read2= new Scanner (file2);
			LinkedList<Integer> a= new LinkedList<Integer>();
			long start= System.currentTimeMillis();
			while(read2.hasNext()) {
			a.add(read2.nextInt());
			ArrayList<Integer> b= new ArrayList<Integer>(a);
			Collections.sort(b);
			Object[]c= b.toArray();
			List<Object> aL = Arrays.asList(c);
			    
			    			  

// Print the ArrayList 
System.out.println("ArrayList: " + aL); 

// convert the ArrayList to LinkedList 
List<Object> 
lL = convertALtoLL(aL); 
long end= System.nanoTime();
long startmin=System.nanoTime();
min(c);
long endmin=System.nanoTime();
long startmax=System.nanoTime();
max(c);
long endmax=System.nanoTime();
long startmedian=System.nanoTime();
median(c);
long endmedian=System.nanoTime();
System.out.println(time_insert(end, start));
System.out.println(time_min(endmin, startmin));
System.out.println(time_max(endmax, startmax));
System.out.println(time_median(endmedian, startmedian));
// Print the LinkedList 
System.out.println("LinkedList: " + lL); 
}
			read2.close();
}	
if(x==1) {File file1 = new File("/Users/abenezerfetsum/eclipse-workspace/test/src/test/input1.txt");	
Scanner read1= new Scanner(file1);
LinkedList<Integer> a= new LinkedList<Integer>();
long start= System.currentTimeMillis();
while(read1.hasNext()) {
			a.add(read1.nextInt());
			ArrayList<Integer> b= new ArrayList<Integer>(a);
			Collections.sort(b);
			Object[]c= b.toArray();
			List<Object> aL = Arrays.asList(c);
			
	// Print the ArrayList 
	System.out.println("ArrayList: " + aL); 

// convert the ArrayList to LinkedList 
List<Object> 
lL = convertALtoLL(aL); 
long end= System.nanoTime();
long startmin=System.nanoTime();
min(c);
long endmin=System.nanoTime();
long startmax=System.nanoTime();
max(c);
long endmax=System.nanoTime();
long startmedian=System.nanoTime();
median(c);
long endmedian=System.nanoTime();
System.out.println(time_insert(end, start));
System.out.println(time_min(endmin, startmin));
System.out.println(time_max(endmax, startmax));
System.out.println(time_median(endmedian, startmedian));
// Print the LinkedList 
System.out.println("LinkedList: " + lL); 
}
read1.close();
}
}	
}
public static <T> List<T> convertALtoLL(List<T> aL) 
{ 

    // Create the LinkedList by passing the ArrayList 
    // as parameter in the constructor 
    List<T> lL = new LinkedList<>(aL); 

    // Return the converted LinkedList 
    return lL; 
} 
public static int min(Object[]c) {
	int min= (int) c[0];
	for(int i=1;i<c.length ;i++) {
	if ((int) c[i]<min) {
					
			min=(int)c[i];
}
}
	 return min;
}
public static int max(Object[]c) {
	int max= (int)  c[0];
	for (int i=1;i<c.length;i++) {
		if ((int) c[i]>max){
			max=(int)c[i];
			
			
}
}
	return max;
}
public static int median(Object[]c) {
	int midnum=0;
	int x=0;
	int total=0;
	
	for(int i=1;i<c.length;i++) {
		
		if (c.length%2==0) {
			 midnum=(int)c[((c.length-1)/2)+1];
					 x =(int)c[(c.length-1)/2];
					 
			total=midnum+x;
					
			}
	    if (c.length%2==1) {
	    	 total=(int)c[(c.length-1)/2];
}
}
return total;
}
public static long time_insert(long end,long start) {
	
	long elapsed= end-start;
	return elapsed/1000000;
}
public static long time_min(long endmin,long startmin) {
	long elapsedmin= endmin-startmin;
	return elapsedmin/1000000;
}
public static long time_max(long endmax, long startmax) {
	long elapsedmax= endmax-startmax;
	return elapsedmax/1000000;
}
 static long time_median(long endmedian, long startmedian) {
	long elapsedmedian= endmedian-startmedian;
	return elapsedmedian/1000000;
}
}

