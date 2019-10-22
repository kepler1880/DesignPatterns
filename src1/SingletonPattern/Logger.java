package SingletonPattern;

public class Logger {
	
	private static Logger logger;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(null == logger) {
			logger=new Logger();
		}
		return logger;
	}

}
