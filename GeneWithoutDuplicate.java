import edu.duke.*;
import java.util.*;
import java.io.*;
/**
 * Write a description of GeneWithoutDuplicate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneWithoutDuplicate {
    public static HashMap<String,ArrayList<Integer>> duplicateRemover(){
        HashMap<String,ArrayList<Integer>> map=new HashMap<String,ArrayList<Integer>>();
        FileResource fr=new FileResource();
        for(String s:fr.lines()){
            String key=s.substring(0,5);
            int value=Integer.parseInt(s.substring(6));
            if(!map.containsKey(key)){
                ArrayList<Integer> al=new ArrayList<Integer>();
                al.add(value);
                map.put(key,al);
            }
            else{
                ArrayList<Integer> al=map.get(key);
                al.add(value);
                map.put(key,al);
            }
        }
        return map;
    }
    
    public static void main(String []args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        HashMap<String,ArrayList<Integer>> map=duplicateRemover();
        for(String s:map.keySet()){
            System.out.print(s+" ");
            al=map.get(s);
            for(int i: al){
                System.out.print(i+",");
            }
            System.out.println();
        }
    }
}
