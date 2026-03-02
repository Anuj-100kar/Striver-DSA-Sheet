import java.util.*;

public class patterns {
    public static void main (String args[]){
        // ****
        // ****
        // ****
        // ****
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //--------------------//

        // *
        // **
        // ***
        // ****
        // *****
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // for(int i=1;i<5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4 
        // for(int i=1;i<5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // *****
        // ****
        // ***
        // **
        // *
        // for(int i=0;i<5;i++){
        //     for(int j=i;j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1 
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        
        // ***********
        //  ********* 
        //   *******  
        //    *****   
        //     ***    
        //      *  
        // for(int i=5;i>=0;i--){
        //     //spaces
        //     for(int j=0;j<6-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=0;j<2*i+1;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=0;j<6-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        // for(int i=0;i<=2*5-1;i++){
        //     int stars=i;
        //     if(i>5)stars=2*5-i;

        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 1 
        // 0 1 
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1
        // for(int i=0;i<5;i++){
        //     int start=1;
        //     if(i%2==0)start=1;
        //     else start=0;
        //     for(int j=0;j<=i;j++){
        //         System.out.print(start+" ");
        //         start=1-start;
        //     }
        //     System.out.println();
        // }

        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
        // int n=5;
        // int spaces=2*(n-1);
        // for(int i=1;i<=n;i++){
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }

        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>0;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //     spaces-=2;
        // }

        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 
        // int num=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num=num+1;
        //     }
        //     System.out.println();
        // }

        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        // for(int i=0;i<5;i++){
        //     for(char ch='A';ch<='A'+i; ch++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }

        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
        // for(int i=0;i<5;i++){
        //     for(char ch='A';ch<='A'+(5-i-1);ch++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }

        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
        // char ch='A';
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        //     ch+=1;
        // }

        //      A     
        //     ABA    
        //    ABCBA   
        //   ABCDCBA  
        //  ABCDEDCBA 
        // ABCDEFEDCBA
        // for(int i=0;i<6;i++){
        //     for(int j=0;j<6-i-1;j++){
        //         System.out.print(" ");
        //     }

        //     char ch='A';
        //     int breakpoint=(2*i+1)/2;

        //     for(int j=0;j<2*i+1;j++){
        //         System.out.print(ch);
        //         if(j<breakpoint)ch++;
        //         else ch--;
        //     }
        //     for(int j=0;j<6-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // E 
        // D E 
        // C D E 
        // B C D E 
        // A B C D E 
        // for(int i=0;i<5;i++){
        //     for(char ch=(char) ('E'-i);ch<='E';ch++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }
        

        // ********
        // ***  ***
        // **    **
        // *      *
        // *      *
        // **    **
        // ***  ***
        // ********
        // int n=4;
        // int spaces=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=0;j<spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
        //     spaces+=2;
        //     System.out.println();
        // }

        // spaces=6;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=0;j<spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     spaces-=2;
        //     System.out.println();
        // }


        // *      *
        // **    **
        // ***  ***
        // ********
        // ***  ***
        // **    **
        // *      *
        // int n=4;
        // int spaces=2*n-2;
        // for(int i=1;i<=2*n-1;i++){
        //     int stars=i;
        //     if(i>n) stars=2*n-i;

        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=stars;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        //     if(i<n)spaces-=2;
        //     else spaces+=2;
        // }

        // ****
        // *  *
        // *  *
        // ****
        // int n=4;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0 || i==n-1 || j==n-1){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //     }
        //      System.out.println();
        // }


        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444
        // int n=4;
        // for(int i=0;i<2*n-1;i++){
        //     for(int j=0;j<2*n-1;j++){
        //         int top=i;
        //         int left=j;
        //         int right=(2*n-2)-j;
        //         int down=(2*n-2)-i;
        //         System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right)));
        //     }
        //     System.out.println();
        // }
    }
}
