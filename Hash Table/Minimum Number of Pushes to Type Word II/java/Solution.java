class Solution {
    public int minimumPushes(String word) {
        int arr []=new int[26];
        for(char s:word.toCharArray()) arr[s-'a']++;
        Arrays.sort(arr);
        int re=0;
        int c=0;
        for(int i=25;i>=0;i--)
        {
            if(arr[i]==0) break;
            if(re<8)
            {
                c=c+arr[i];
            }
            else if(re<16)
            {
                c+=2*arr[i];
            }
            else if(re<24)
            {
                c+=3*(arr[i]);
            }
            else
            {
                c+=4*(arr[i]);
            }
            re++;
        }
        return c;
    }
}