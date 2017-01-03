import java.io.*;

public class FileCopier{

    public static void main(String[] args) {

        FileCopier fc = new FileCopier();
        if(args.length == 2){
            fc.copy(args[0], args[1]);
        } else {
            System.out.println("USAGE: File copier <filename1> <filename2>");
        }
        
    }

    public void copy(String inputName, String outputName) {
        try (BufferedReader in = new BufferedReader(new FileReader( new File(inputName)))) {
            PrintWriter out = new PrintWriter( new File (outputName));
            String line;
            while ((line = in.readLine()) != null) {
                out.print(line);
                out.println();
            }
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File [ " + inputName + " ] does not exist or it is a directory.");
        } catch (IOException ex) {
            System.out.println("There was an I/O error.");
        }

    }
}