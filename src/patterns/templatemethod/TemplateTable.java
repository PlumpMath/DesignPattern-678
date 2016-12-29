package patterns.templatemethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月19日 下午9:29:27
 **/
public class TemplateTable
{
    protected String name;
    protected int age;
    protected String school;
    protected String province;
    
    public TemplateTable(String name, int age, String school, String province)
    {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.age = age;
        this.school =school;
        this.province = province;
    }
    
    /**
     * 姓名模板
     */
    private void showName()
    {
        System.out.print("Name: ");
        this.dispalyName();
    }
    
    /**
     * 年龄模板
     */
    private void showAge()
    {
        System.out.print("Age:  ");
        this.displayAge();
    }
    
    /**
     * 学校名称模板
     */
    private void showSchool()
    {
        System.out.print("School: ");
        this.displaySchool();
    }
    
    /**
     * 户籍模板
     */
    private void showProvince()
    {
        System.out.print("Province: ");
        this.displayProvince();
    }
    
    /**
     * 答应整个表格
     */
    public void showTable()
    {
        this.showName();
        this.showAge();
        this.showSchool();
        this.showProvince();
    }
    
    /**
     * 显示对象姓名
     */
    public void dispalyName()
    {
        System.out.println(this.name);
    }
    
    /**
     * 显示对象年龄
     */
    public void displayAge()
    {
        System.out.println(this.age);
    }
    
    /**
     * 显示对象学校名称
     */
    public void displaySchool()
    {
        System.out.println(this.school);
    }
    
    /**
     * 显示对象户籍
     */
    public void displayProvince()
    {
        System.out.println(this.province);
    }   
}