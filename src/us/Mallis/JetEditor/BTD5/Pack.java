package us.Mallis.JetEditor.BTD5;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import us.Mallis.JetEditor.Main;
import us.Mallis.JetEditor.Passwords.Passwords;

public class Pack {
	public static void packBtd5() {
		try {
			ZipFile jet = new ZipFile(Main.path + "/new.jet");
			ZipParameters params = new ZipParameters();
			
			params.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
			params.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			params.setCompressionLevel(5);
			params.setPassword(Passwords.BTD5PW);
			params.setEncryptFiles(true);
			
			jet.createZipFileFromFolder(new File(Main.path +  "/Extracted/Assets"), params, false, 0);
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			System.out.println("File exists, please remove the jet or move it to the game if you have not already. Quitting.");
		}
		
	}
}
