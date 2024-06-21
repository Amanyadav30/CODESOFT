public class Fib {
    
        public static void main(String args[]){
            int a=0,b=1,temp;
            System.out.println(a+" "+b);
        for(int i=2;i<10;i++){
            temp=a+b;
            System.out.println(" "+temp);
            a=b;
            b=temp;
    
        }
        }
    }
