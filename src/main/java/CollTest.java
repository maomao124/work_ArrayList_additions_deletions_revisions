import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project name(项目名称)：作业_ArrayList之增删改查
 * Package(包名): PACKAGE_NAME
 * Class(类名): CollTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 20:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CollTest
{
    public static void main(String[] args)
    {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收给定的一行字符串
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        // 第二步：切割字符串
        String[] str1 = str.split(" ");
        // 第三步：创建集合
        ArrayList<String> p = new ArrayList<>();
        // 第四步：往集合中添加元素
        for (String s : str1)
        {
            p.add(s);
        }
        // 第五步：删除第一个元素和最后一个元素
        p.remove(0);
        p.remove(p.size() - 1);
        // 第六步：往集合中添加hello和educoder
        p.add("hello");
        p.add("educoder");
        // 第七步：修改集合中第三个元素为list
        p.set(2, "list");
        // 第八步：打印集合
        System.out.println(p);

        /********** End **********/
    }
}
