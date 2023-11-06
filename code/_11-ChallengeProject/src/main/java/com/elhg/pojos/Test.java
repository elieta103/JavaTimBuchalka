package com.elhg.pojos;

public class Test {
    public static void main(String[] args) {
        String A="anitalavalatina";
        /* Enter your code here. Print output to STDOUT. */
        String inverseStr = "";
        for(int i=A.length(); i>0; i--){
            inverseStr = inverseStr + A.substring(i-1, i);
        }
        String response = (A.equals(inverseStr))? "Yes":"No";
        System.out.println(response);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String aux= "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i<s.length()-(k-1); i++){
            aux = s.substring(i, i+k);
            if(aux.compareTo(smallest)<0){
                smallest = aux;
            }
            if(aux.compareTo(largest)>0){
                largest = aux;
            }
        }

        return smallest + "\n" + largest;
    }
}
