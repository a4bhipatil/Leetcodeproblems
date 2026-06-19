class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        for(int i=0; i<gain.length; i++){
            altitude[i+1]=altitude[i]+gain[i];
        }
        Arrays.sort(altitude);
        int[] temp=new int[altitude.length];
        for(int i=0; i<altitude.length; i++){
            temp[i]=altitude[altitude.length-1-i];
        }
        return temp[0];
    }
}