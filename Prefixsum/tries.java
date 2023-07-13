package Prefixsum;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;


class tries{
    public static class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfString;
      
        public TrieNode() {
          children = new HashMap<>();
          endOfString = false;
        }
      }
    public static class Trie {
        private TrieNode root;
      
        public Trie() {
          root = new TrieNode();
          System.out.println("The Trie has been create");
        }
        public void insert(String word) {
            TrieNode current = root;
            for (int i=0; i<word.length(); i++) {
              char ch = word.charAt(i);
              TrieNode node = current.children.get(ch);
              if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
              }
              current = node;
            }
            current.endOfString = true;
            System.out.println("Successfully inserted " + word+ " in Trie");
          }
           public boolean search(String word) {
                TrieNode currentNode = root;
                for (int i =0; i<word.length(); i++) {
                    char ch = word.charAt(i);
                    TrieNode node = currentNode.children.get(ch);
                    if (node == null) {
                    System.out.println("Word: "+word+ " does not exist in Trie");
                    return false;
                    }
                    currentNode = node;
                }
                if (currentNode.endOfString == true) {
                    System.out.println("Word: "+word+ " exists in Trie");
                    return true;
                } else {
                    System.out.println("Word: "+word+ " does not exist in Trie. But it is a prefix of another string");
                }
                return currentNode.endOfString;
            }
    }
        
      public static ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        Trie trie = new Trie();
        for(String word: A){
            trie.insert(word);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String word: B){
            if(trie.search(word)){
                result.add(1);
            } else{
                result.add(0);
            }
        }

        return result;
    }  
    public static void main(String[] args){
        String[] a = {"hat", "cat", "rat"};
        String[] b = { "cat", "ball"};
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            A.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            B.add(b[i]);
        }

        System.out.println(solve(A, B));
 
    }
}