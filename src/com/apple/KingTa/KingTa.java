import java.util.Scanner;
class KingTa
{
public static void main (String[] args)
{
    System.out.println("请输入要打印的行数：");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    for(int i=0; i<=num; i++)
    {
        for(int j=0; j < (num-i); j++)    
        {
            System.out.print(" ");
        }
        for(int k = 0; k < (2*i-1); k++)  
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}