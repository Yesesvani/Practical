public class Assignment{
public static void main(String[] args)
{
int x;
System.out.println("Assignment:"+(x=5));
System.out.println("Addition:"+(x+=3));
System.out.println("subtraction:"+(x-=3));
System.out.println("multiplication:"+(x*=3));
System.out.println("Module:"+(x%=3));
System.out.println("AND"+(x&=3));
System.out.println("Division:"+(x/=3));
System.out.println("OR:"+(x|=3));
System.out.println("..:"+(x^=3));
System.out.println("lesser than:"+(x>>=3));
System.out.println("greather than:"+(x<<=3));
}
}