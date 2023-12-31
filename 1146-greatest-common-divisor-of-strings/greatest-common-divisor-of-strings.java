class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }       

        else if(!str1.startsWith(str2)){
            return "";
        }

        else if(str2.length() == 0){
            return str1;
        }

        else{
            return(gcdOfStrings(str1.substring(str2.length()), str2));
        }
       
    }
}

// **************************************************************************
   // beats 82.73%
    //    if((str1 + str2).equals(str2 + str1)){
    //        return str1.substring(0, gcd(str1.length(), str2.length()));
    //    }
    //    return "";
    // }
    //     private int gcd(int a, int b){ //Euclidean Algorithm
    //        while(b != 0){
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
           
    //        }
    //        return a; 
    //    }


// recursion
    // public int gcd(int a, int b){
    //     if(b == 0){
    //         return a;
    //     }
    //     return gcd(b, a % b);
//     }
// }