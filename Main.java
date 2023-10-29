import java.lang.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        System.out.println("GODEV'S CEO KAVIN KUMAR K");
        /*String name="abd";
        float percent=25.23f;
        int age=23;
        char gender='m';
        boolean marry=false;
        System.out.println(name);
        System.out.println(marry);
        System.out.println(age);
        System.out.println(percent);
        System.out.println(gender);
        //typecasting
        //byte->short->char->int->long->float->double;
        int a=10;
        double b=a,d=24.2333;
        int c=(int)d;
        System.out.println("Int:"+a);
        System.out.println("Int:"+c);
        System.out.println("double:"+b);
        //logigal
        int m1=17,m2=88;
        System.out.println(m1>=35 && m2>=35 );
        System.out.println(m1>=35 || m2>=35 );
        //condition
        int ab=25,bc=90,cc;
        cc=ab>bc?ab:bc;
        System.out.println(cc);
        //biwise
        int aa=25,ee=45;
        System.out.println(aa&ee);
        System.out.println(aa|ee);
        System.out.println(aa^ee);
        System.out.println(~aa);*/
        /*Scanner in=new Scanner(System.in);
        /*Scanner in=new Scanner(System.in);
        float ae,db,ce;
        //string nextline()
        ae= in.nextFloat();
        db= in.nextFloat();
        ce=((ae*ae) +(db*db)+(2*ae+db));
        System.out.println(ce);*/
       /* //leap year
        int year;
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if(year%4==0 || (year%100==0 && year % 400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not");
        }*/
        //while Loop
       /* System.out.print("limit:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }*/
        //Dowhile
       /* System.out.print("limit:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        do{
            System.out.println(i);
            i=i+2;
        }
        while(i<=n);
        System.out.println("after doing thw work");*/
        //forloop
       /* System.out.print("limit:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++ ){
            System.out.println(i);
        }*/
       /* //Enhanced for
        int number[]={10,20,30,40,50};
        for(int n:number)
        {
            System.out.println(n);
        }*/
       /* //b0reak
        for(int i=0;i<=10;i++){
            if(i==6)
                continue;
            System.out.println(i);
            if(i==7)
                break;
        }*/
         /*//Factorial
        Scanner in=new Scanner(System.in);
        System.out.println("enter teh no");
        int n= in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
            System.out.println(f);*/
      /*  //sum and average of given numbers
        System.out.println("enter the no of digit:");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++){
            System.out.println("enter the NO:");
            a=in.nextInt();
            sum+=a;
        }
        System.out.println(sum);
        System.out.println(sum/n);*/
        /*//fibinacci series
        Scanner in=new Scanner(System.in);
        System.out.println("limit:");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/
      /*  //reverse
        Scanner in=new Scanner(System.in);
        System.out.println("enter num:");
        int n= in.nextInt();
        int reverse=0,rem;
        while(n!=0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        System.out.println(reverse) ;
*/      //Amstrong no
        /*Scanner in=new Scanner(System.in);
        System.out.println("enter num:");
        int number= in.nextInt();
        int temp=number;
        int digit1,digit2,digit3;
        digit3=temp%10;
        temp=temp/10;
        digit2=temp%10;
        temp=temp/10;
        digit1=temp%10;
        int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit1*digit3*digit3);
        if(number==result){
            System.out.println("amstromg");
        }
        else{
            System.out.println("not");
        }*/
        /*
        //multiplication
        Scanner in=new Scanner(System.in);
        System.out.println("enter t:");
        int t=in.nextInt();
        System.out.println("enter l:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(t+ " X "+i+"=" +(t*i));
        }*/
        /*//factorial
        Scanner in=new Scanner(System.in);
        System.out.println("enter num");
        int n=in.nextInt();
        for(int  i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i);}}*/
       /* //prime number
        Scanner in=new Scanner(System.in);
        //System.out.println("enter num");
        // int n=in.nextInt();
        int c=0;
        for(int n=1;n<=999;n++)
        {
            for (int i =1;i<=n;i++)
            {
            if(n%i==0) {
                c++;

        }}
            if(c==2){
                System.out.println(n+ "prime");
            }
            c=0;

            }*/
        /*//perfect square
        Scanner in=new Scanner(System.in);
        System.out.println("enter num");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
                if(n%i==0) {
                sum+=i;
               // System.out.println(n);
                }
                }if(sum==n){
            System.out.println(n+"perfect");
        }
    else{
        System.out.println(n+"not");
        }*/
       /* // Strong number
        int num, originalnum, rem, fact, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter num:");
        num = in.nextInt();
        originalnum = num;
        while (num > 0) {
            rem = num % 10;
            //System.out.println(rem);
            fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            // System.out.println(fact);
            sum += fact;
            num = num / 10;
        }
        if (sum == originalnum) {
            System.out.println("strong");
        } else {
            System.out.println("not");}
            */
        //Array concepts does not support negative indexing
       /* int a[]={1,2,3,4,5};
        System.out.println(a[1]);

            for(int element:a){
                System.out.println(element);
            }
            int b[];
            b=new int[10];
            int [] c=new int[10];
             for(int element:b){
                System.out.println(element);
            }
            for(int i=0;i<3;i++){
            Scanner in=new Scanner(System.in);
            System.out.println("enter the number:");
            c[i]=in.nextInt();
            //System.out.println(c);
        }
            for(int element:c){
                System.out.println(element);
            }*/
        //count the eve and odd num in array
       /* Scanner in= new Scanner(System.in);
        System.out.println("enter the NO");
        int n=in.nextInt();
        int a[]=new int[n];
        int e=0,o=0;
        for(int i=0;i<n; i++){
            System.out.println("enter aa["+i+"]vale:");
            a[i]=in.nextInt();
        }
        for(int element:a){
            if(element%2==0){
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println(+e);
        System.out.println(+o);*/
        //ascending order
       /* int[]a=new int[]{8,9,4,2,5,7,4};
        int o=0,e=0;
        System.out.println(Arrays.toString(a));//convert to single line
        System.out.println("before sort:"+Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("after sort:"+Arrays.toString(a));*/
        //changeing the value of the array in specific  index
       /* int [] a={10,20,30,40,50,60,70,80,90,10};
        int index=2;
        int value=44;
        System.out.println("before="+Arrays.toString(a));
        System.out.println("index:"+index);
        System.out.println("value:"+value);
        for(int i=a.length-1;i>index;i--){
            a[i]= a[i-1];
        }
        a[index]=value;
        System.out.println("after="+Arrays.toString(a));*/
        // a program to find the duplicate element
        /*int []a={1,2,5,5,6,6,7,2};
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                 if((a[i]==a[j]) && (i!=j)){
                     System.out.println(a[ j]);
                 }
            }
        }*/
        /* //2D array
        int a[][]={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+ a[i][j]);
            }
                System.out.println(" ");
            }*/
       /* //int b[][]=new int[3][3];
        Scanner in=new Scanner(System.in);
        int  c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }*/
       /* //jagged array
        int a[][]={
                {10,20,30,40},
                {50,60,70},
                {80,90,91,92}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }*/
        /*//jagged in enhanced for
        int a[][]={
                {10,20,30,40},
                {50,60,70},
                {80,90,91,92}
        };
        for(int k[]:a){
            for(int l:k){
                System.out.print(" "+l);
            }
            System.out.println(" ");
        }*/
       /* //ascii-american standard code for information interchange
        //A-z=97-122,a-z=97-122,0-9=48-57, space=32
        for(int i=0;i<=255;i++)
        {
            System.out.println(i+" "+(char)+i);
        }*/
    /*//String - immutable(cantable to change)
        String a="tutor kavin";
        String b="Tutor kavin";
        System.out.println("A:"+a.hashCode());
        System.out.println("B:"+b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.replace("tutor","CO"));
        System.out.println(a.contains("kavin"));
        System.out.println(a.endsWith("in"));
        System.out.println(a.substring(6));
        System.out.println(a.substring(0,5));
        String k="   kavin   ";
        System.out.println("trim fun:"+k.trim());
        System.out.println("trim fun:"+k.trim().length());//chaining
        char[] carry=a.toCharArray();
        for(char c:carry){
            System.out.print(c +"  ");
        }*/
        //Sting buffer &string builder in java
       /* StringBuffer buffer=new StringBuffer("kavin");
        System.out.println(buffer);
        buffer.append(" kumar");
        System.out.println(buffer);
        buffer.reverse();
        buffer.insert(11," ceo");
        buffer.replace(5,8,"ceo");//replace letter present in elements
        System.out.println(buffer);
        System.out.println(buffer.substring(0,5));

        StringBuffer sb=new StringBuffer();//defafult 16
        sb.append("hello");
        System.out.println(sb.capacity());*/
         /*StringBuilder a=new StringBuilder("ram-age is 12");
        System.out.println(a);
        int upper=0,lower=0,space=0,number=0,vowels=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                lower++;
            }
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                upper++;
            }
            if(a.charAt(i)==32){
                space++;
            }
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                number++;
            }
        }
        System.out.println(+lower);
        System.out.println(+upper);
        System.out.println(+space);
        System.out.println(+number);*/
        //string reverse using string builder
       /* StringBuilder a =new StringBuilder("kavin kumar");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
        }
        System.out.println(b);*/
        //Methods
        //user defined method,user defined.
        //built in math function in java import
        System.out.println(Math.abs(-99));//convert to positive
        System.out.println(Math.round(3.33));//round value
        System.out.println(Math.ceil(2.23));//high value
        System.out.println(Math.floor(2.588));//low value
        double a=3,b=4;
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(b));
        System.out.println("pow:"+Math.pow(a,b));
    }
}