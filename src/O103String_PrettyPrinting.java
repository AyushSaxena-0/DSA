public class O103String_PrettyPrinting {
    public static void main(String[] args) {
        float a=10.12334567f;
        //Note this is not println()
        //It is printf()
        //It is like function of printing in c
        System.out.println(Math.PI);
        System.out.printf("The formatted Pi value is %.3f\n",Math.PI);
        System.out.printf("Formatted number is %.2f\n",a);
        System.out.printf("My name is %s %s","Kunal","Kushwaha");
    }
}

// Basic Format Specifiers
//Specifier	Data Type	Description	Example
//%d	int, byte, short, long	Integer (decimal)	10
//        %f	float, double	Floating-point number	10.25
//        %s	String	String	"Ayush"
//        %c	char	Character	'A'
//        %b	boolean	Boolean	true
//        %e	float, double	Scientific notation	1.05e+03
//        %x	int	Hexadecimal	a
//        %o	int	Octal	12
//        %n	—	New line (platform independent)	line break
