class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length();
        int n = nums2.length();
        if(m>n){
            int[] temps = nums1;nums1 = nums2;nums2=temps;
            int temp = m;m=n;n=temp;
        }
        int iMin = 0,iMax =m ,halfLen=(m+n+1)/2;
        while(iMin<=iMax){
            int i=(iMin+iMax)/2;
            int j = halfLen-i;
            if(i<iMax&&nums2[j-1]>nums1[j]){
                iMin = iMin+1;
            }
        }
    }
}
