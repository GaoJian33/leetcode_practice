import java.io.*;


public class Make{

	public static void main(String[] args){
		File folder = new File("./Java");
		File[] filelist = folder.listFiles();
		String outputContent = "";
		genREADEME("READEME.md",outputContent);
	}

	public static void genREADEME(String fileName, String content){
		try{
			File outFile = new File(fileName);
			FileOutputStream fop = new FileOutputStream(outFile);

		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
