package LAB_3;
// Ungraded Task


import com.sun.security.jgss.GSSUtil;

public class Calculator {

    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    public void add(int n1, int n2, int n3){
        System.out.println(n1+ n2+n3);
    }

    public void multiply(int n1, int n2){
        System.out.println(n1+n2);
    }
    public void multiply(int n1, int n2, int n3){
        System.out.println(n1* n2*n3);
    }

    public void multiply(String s1, int n){
        for (int i = 0; i < n; i++) {
            if(i == n-1){
                System.out.print(s1);
                System.out.println();
            }else{
                System.out.print(s1+"-");
            }
        }
    }
}
