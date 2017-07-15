/**    运算符&流程控制的操作练习
 * Created by dell on 2017/7/15.
 */
public class demo {
    public static void main(String[] args){
        int num1 = 6;
        int num2 = 3;
        System.out.println(num1 & num2);	//与
        System.out.println(num1 | num2);	//或
        System.out.println(num1 ^ num2);	//异或
        System.out.println( ~ num1);	//反
        System.out.println(num1 + num2);  //算数运算符
        System.out.println(num1 << 2);    //位运算符

        if(num1 > num2)
            System.out.println("+++");
        else if(num1 == num2)
            System.out.println("===");
        else
            System.out.println("---");
    }
}
