package Assignment;

public class Add {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,int b){
        return a +""+ b;
    }

    public static void main(String[] args) {
        Add val=new Add();
        int result1=val.add(10,20);
        int result2=val.add(10,20,30);
        double result3=val.add(10.5,20.1);
        String result4=val.add("Hello",20);
        System.out.println("result of adding two numbers: "+result1);
        System.out.println("result of adding three numbers: "+result2);
        System.out.println("result of adding double numbers: "+result3);
        System.out.println("result of adding(\"Hello\" ,20) : " +  result4);

    }

}

