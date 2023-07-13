package Prefixsum.Arrays;

public class Tries2 {

    static TrieNode root=null;
    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd=false;
        public TrieNode(){
            isEnd=false;
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    static void insert(String A){
        TrieNode r = root;
        for(int l=0;l<A.length();l++){  
            int index=A.charAt(l)-'a';
            if(r.children[index]==null){
                r.children[index]=new TrieNode();
            }
            r=r.children[index];
        }
        r.isEnd=true;
    }

    static boolean SearchWord(String w){
        TrieNode r=root;
        for(int i=0;i<w.length();i++){
            int index = w.charAt(i)-'a';
            if(r.children[index]==null){
                return false;
            }
            r=r.children[i];
        }
        return (r!=null && r.isEnd);
    }
    public static void main(String[] arg){
        int[] A={};
        String[] strs={"flower","flow","flight"};

        root=new TrieNode();

        for(int i=0;i<strs.length;i++){
            insert(strs[i]);
        }

        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(SearchWord(strs[i])){
                
            }
        }


    }
    
}
