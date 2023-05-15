package mainday16;

public class homework {
    public static void main(String[] args) {
        int a = 34;
        int b = 21;
        int c = a++ + ++b;                  //c=>56     a=>34 b=>22              
        int d = --a + --b + c--;            //d=>111    a=>34 b=>21 c=>55     
        int e = a + +b + +c + d--;          //e=>221    a=>34 b=>21 c=>55 d=>110 
        int f = -a + b-- + -c - d++;        //f=>-178   a=>34 b=>20 c=>55 d=>111   
        int sum = a + b + c + d + e + f;    //sum=>263  a=>34 b=>20 c=>55 d=>111 e=>221 f=>-178
        System.out.println("sum = "+sum);   //sum = 263
    }
}