package us.Mallis.JetEditor.BTD5;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import us.Mallis.JetEditor.Main;
import us.Mallis.JetEditor.Passwords.Passwords;

public class Extract {
	public static void extractBtd5() {
		ZipFile jet;
		try {
			jet = new ZipFile(Main.path + "/BTD5.jet");
			jet.setPassword(Passwords.BTD5PW);
			jet.extractAll(Main.path +  "/Extracted");
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
