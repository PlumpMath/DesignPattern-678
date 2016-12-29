package patterns.templatemethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月19日 下午9:28:27
 **/
public class TemplateMethodEnter
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        StudentA studentA = new StudentA("Tom", 23, "Harvard", "Jiangsu");
        studentA.showTable();
        System.out.println();
        StudentB studentB = new StudentB("Frank", 25, "CUG", "Hubei");
        studentB.showTable();
    }
}