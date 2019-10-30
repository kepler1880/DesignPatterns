package common;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			   URL url = new URL("http://3.94.69.139:8080/tce-teach-api/0/api/content/filerangeservice?encryptedPath=a578e638bb9fbca764ae5e99d9b3bc5930846e29cef405c099b242587d6bc25c&fileName=2269BD0B-3F87-4D89-AC77-CB406374E7C2/images/images.txt");
			   Scanner s = new Scanner(url.openStream());
			   // read from your scanner
			   System.out.println(s.next()); 
			}
			catch(IOException ex) {
			   // there was some connection problem, or the file did not exist on the server,
			   // or your URL was not in the right format.
			   // think about what to do now, and put it here.
			   ex.printStackTrace(); // for now, simply output it.
			}
	}

}
