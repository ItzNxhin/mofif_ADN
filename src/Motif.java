import java.util.ArrayList;
import java.util.HashMap;

public class Motif {
    
    public ArrayList<String> combinations(String chain, int sSize){
        ArrayList<String> cmb = new ArrayList<>();
        for (int i = 0; i <= chain.length() - sSize; i++) {
            String motif = chain.substring(i, i + sSize);
            System.out.println(motif);
            if(!cmb.contains(motif)) cmb.add(motif);
        }
        return cmb;
    }

    public int countMotif(String motif, String chain){
        int count = 0;
        int index = 0;

        while ((index = chain.indexOf(motif, index)) != -1) {
            count++;
            index += motif.length(); 
        }
        return count;
    }

    public void generateHashMap(String chain, int sSize){
        HashMap<String, Integer> listMotif = new HashMap<>();
        for(String i : combinations(chain, sSize)){
            listMotif.put(i,countMotif(i, chain));
        }
        System.out.println(listMotif);
    }
}
