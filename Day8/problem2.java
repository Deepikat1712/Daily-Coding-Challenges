class Solution {
    public int mostWordsFound(String[] s) {
        int count=0,c;
       for(int i=0 ; i<s.length ; i++)
       {
            String[] word=s[i].split(" ");
            c=word.length;
            if(count<c)
            {
                count=c;
            }
       }
       return count;
    }
}
