package hashtablesystems;

import java.util.*;

public class Q4_PlagiarismDetection {

    public List<String> extractNgrams(String text,int n){

        String[] words = text.split(" ");
        List<String> grams = new ArrayList<>();

        for(int i=0;i<=words.length-n;i++){

            String gram = "";

            for(int j=0;j<n;j++){
                gram += words[i+j]+" ";
            }

            grams.add(gram.trim());
        }

        return grams;
    }

    public static void main(String[] args){

        Q4_PlagiarismDetection obj = new Q4_PlagiarismDetection();

        String text = "machine learning algorithms are powerful";

        System.out.println(obj.extractNgrams(text,3));
    }
}