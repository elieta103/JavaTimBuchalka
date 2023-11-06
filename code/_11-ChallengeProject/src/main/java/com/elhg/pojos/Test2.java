package com.elhg.pojos;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        char[] arr = "MyΟβιεγτFinder".toCharArray();
        for(int i = 0 ; i<arr.length; i++ ){
            if(arr[i]=='-'){
                if(Character.isDigit(arr[i+1])){
                    str.append((""+arr[i+2]).toUpperCase());
                    i=i+2;
                }else{
                    str.append((""+arr[i+1]).toUpperCase());
                    i++;
                }
            }else if(Character.isISOControl(arr[i])){
                str.append("CTRL");
            }else if(Character.isWhitespace(arr[i])){
                str.append('_');
            }else if(!Character.isAlphabetic(arr[i]) ){
                str.append("");
            }else if(arr[i]>='\u03B1' && arr[i]<='\u03C9'){
                str.append("");
            }else{
                str.append(arr[i]);
            }
        }
        System.out.println(str.toString());
    }
}
