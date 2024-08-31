import java.util.*;
public class CharacterCount 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i, j, k = 0, count = 0;
        String uni = new String("");
        for(i=0; i<str.length(); i++){
            count = 0;
            for(j=0; j<=i; j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }}
            if(count==1){
                uni = uni + str.charAt(i);
            }}
        for(i=0; i<uni.length(); i++){
            count = 0;
            for(j=0; j<str.length(); j++){
                if(uni.charAt(i)==str.charAt(j)){
                    count++;
                }}
            if(count==1){
                System.out.printf("%c",uni.charAt(i));
            }
            else{
                System.out.printf("%c%d",uni.charAt(i),count);
            }}}}