import java.io.File;

public class InterfaceAvecC {
	
	static{
		
		String path = new File("libInterfaceAvecC.so").getAbsolutePath();
        System.load(path);
	}
	
	public static native String creerGraphe(int n);

	
	
	
}
