public static int superDigit(String n, int k) {
    // Write your code here
     int val=0;
    if(n.length()==1){
       
        val+=Integer.parseInt(n);  
     }
     else{
          long sum=0;
    for (char digit : n.toCharArray()) {
        sum += Character.getNumericValue(digit);
    }
     long tsum=sum*k;
     String v=String.valueOf(tsum);
     int m=1;
      return superDigit(v,m);
     }
     return val;
    }

}