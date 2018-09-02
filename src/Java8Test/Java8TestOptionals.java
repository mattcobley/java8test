package Java8Test;

import java.util.Optional;

public class Java8TestOptionals {

	public static void main(String[] args) {
		
		Integer value1 = null;
	    Integer value2 = new Integer(10);
	    
	    Optional<Integer> a = Optional.ofNullable(value1);
	    Optional<Integer> b = Optional.of(value2);
 	    System.out.println(a);
 	    
 	    System.out.println(a.isPresent());
 	    System.out.println(b.isPresent());
 	    if(b.isPresent()) {
 	    	Integer c = b.get();
 	    	System.out.println(c);
 	    }
 	    
 	    Optional<Integer> op = Optional.of(new Integer(10));
 	    System.out.println(op.equals(b));
 	    
	}
	 

}
