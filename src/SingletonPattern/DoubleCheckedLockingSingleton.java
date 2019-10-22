package SingletonPattern;

public class DoubleCheckedLockingSingleton implements Cloneable{	

	    private static volatile DoubleCheckedLockingSingleton instance;
	    
	    private DoubleCheckedLockingSingleton(){}
	    
	    public static DoubleCheckedLockingSingleton getInstance(){
	        if(instance == null){
	        	synchronized(DoubleCheckedLockingSingleton.class) {
	        		if(null == instance) {
	    	            instance = new DoubleCheckedLockingSingleton();
	        		}	        			
	        	}
	        }
	        return instance;
	    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	    
	 
	}


