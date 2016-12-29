package patterns.templatemethod;
/**
 * 使用模板，但自定义展示方式
 * @author xuelei xueleicug@163.com
 * @time   2015年1月19日 下午9:57:11
 **/
public class StudentB extends TemplateTable
{

    public StudentB(String name, int age, String school, String province)
    {
        // TODO Auto-generated constructor stub
        super(name, age, school, province);
    }

    public void displaySchool()
    {
        System.out.println("private");
    }
    
    public void displayProvince()
    {
        System.out.println("private");
    }
}