
package Prefixsum;

import java.util.Arrays;

public class Tries1 {
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;
        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
    public static int[] solve(int[] A, String[] B) {
        root = new TrieNode();
        int searchCount=0;
        for (int temp =0;temp<A.length;temp++){
            if(temp==0){
                insert(B[temp]);
            }
            else{
                searchCount++;
                search(B[temp]);

            }    
        }
        int[] ans = new int[searchCount];
        for (int i = 0; i < B.length; i++) {
            if (search(B[i]) == true)
                ans[i] = 1;
            else ans[i] = 0;
        }
        return ans;
    }
    static void insert(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEndOfWord = true;
    }
    static boolean search(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                return false;
            pCrawl = pCrawl.children[index];
        }
        return (pCrawl != null && pCrawl.isEndOfWord);
    }

    public static void main(String[] arg){
        int[] A = {0,0,1,1};
        String[] B ={"hack", "hacker", "hac", "hak"};
        System.out.println(Arrays.toString(solve(A, B)));
    }

}
