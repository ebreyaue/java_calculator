//command line calculator, scalable and programable.

class calculator 
{

public static void message(String query)
{
System.out.println(query);    
}

//addicion
public static int add (int a,int b)
{
return a+b;
}

//substraction
public static int substr (int a,int b)
{
return a-b;
}

//multiplication
public static int mul (int a,int b)
{
return a * b;
}

//division
public static int div (int a,int b)
{
return a/b;
}

//main function 
public static void main(String[] args)
{

int a;
int b;
int i;

if(args.length == 0 || args.length>3){message("too many parameters"); System.exit(0);}

   //convert the two parameters to int variable
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[2]);

//convert args to string
String operator = args[1].toString();


//sentence of calculate

if(operator.equals("add")==true){message(String.valueOf(add(a,b)));}
else if(operator.equals("mul")==true){message(String.valueOf(mul(a,b)));}
else if(operator.equals("res")==true){message(String.valueOf(substr(a,b)));}
else if(operator.equals("div")==true){message(String.valueOf(div(a,b)));}

else{message("error operator not found"); System.exit(0);}


} //end public class
} //end of class
