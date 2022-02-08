import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G')
                builder.append('C');
            else if(dnaStrand.charAt(i)=='C')
                builder.append('G');
            else if(dnaStrand.charAt(i)=='T')
                builder.append('A');
            else if(dnaStrand.charAt(i)=='A')
                builder.append('U');
            
            
        }
        return builder.toString();
        
    }

}
