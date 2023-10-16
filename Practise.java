package ReadingAndCollectingMessagesfromFile;

import java.io.*;

public class Practise {

    public void run(){
        File file = new File("src/ReadingAndCollectingMessagesfromFile/PractiseFile.txt");
        try {
            if(file.createNewFile()){
                System.out.println(file.getName() + " was created");
            }else {
                System.out.println("The operation failed because " + file.getName() + " has already been created." );
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        String str = "5\n10\n20\n12\n33";
        try {
            FileWriter fileWriter = new FileWriter(file ); // We added to the existing file by typing true
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(str);

            bufferedWriter.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("=======================================================");
        System.out.println();

        int sum = 0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line ;
            while ((line = bufferedReader.readLine()) != null){
                //System.out.println(line); We do not print this code
                sum+=(Integer.parseInt(line));
            }
            System.out.println(sum);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


}
