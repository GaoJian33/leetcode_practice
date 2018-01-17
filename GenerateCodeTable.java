import java.io.*;


public class  GenerateCodeTable{

    public static void main(String[] args) {
        //Read java solution Folder

        File folder = new File("./Java");//"." = current path
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("check Directory:1");
            return;
        }//check if ./Java exit
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            System.out.println("check DIrection:2");
            return;
        }

        String outputContent = "";

        if(args.length == 0){
            outputContent = generateREADEME(listOfFiles);
            printTable("README.md", outputContent);
        }else {
            return;
        }
    }//main


    public static void printTable(String fileName, String outputContent){
        //System.out.println(outputContent);
        try{
            File outFile = new File(fileName);
            FileOutputStream fop = new FileOutputStream(outFile);
            byte[] contentInBytes = outputContent.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            System.out.println("Mission Accompliched. Now go ahead and commit");
        }catch(IOException e){
            e.printStackTrace();;
        }
    }

    public static String generateREADEME(File[] listOfFiles){
        String outputContent = "| Squence | Problem       | Level  | Language  | Video Tutorial|\n" +
        "|:-------:|:--------------|:------:|:---------:|:-------------:|\n";
        int count = 0;
        for (File file : listOfFiles){
            String tutorialLink = "";
            String calculatedLevel = "";
            if(file.getName().contains(".java")) {
                try {
                    final BufferedReader reader = new BufferedReader(new InputStreamReader(
                            new FileInputStream("Java/" + file.getName()), "UTF-8"));
                    final String levelLine = reader.readLine().trim();
                    if (levelLine.length() == 1) {
                        calculatedLevel = calculateLevel(levelLine.toUpperCase());
                    }
                    final String tutorialLine = reader.readLine();
                    if (tutorialLine.indexOf(TUTORIAL_KEY_WORD) == 0) {
                        tutorialLink = "[Link](" + tutorialLine.substring(TUTORIAL_KEY_WORD.length()) + ")";
                    }
                } catch (Exception e) {
                    System.err.format("IOException: %s%n", e);
                }
                String convertedFileName = file.getName().replace(" ", "%20");
                outputContent += "|" + count + "|[" + file.getName() + "](https://github.com/awangdev/LintCode/blob/master/Java/"
                        + convertedFileName + ")|" + calculatedLevel + "|" + "Java|" + tutorialLink + "|\n";
                count++;
            }
        }
        return outputContent;
    }

    private static String calculateLevel(final String level) {
        switch(level) {
            case "N" :
                return "Naive";
            case "E" :
                return "Easy";
            case "M" :
                return "Medium";
            case "H" :
                return "Hard";
            case "S" :
                return "Super";
        }
        return "";
    }


}
