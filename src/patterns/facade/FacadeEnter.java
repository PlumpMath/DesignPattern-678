package patterns.facade;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月23日 下午6:46:00
 **/
public class FacadeEnter
{
    public static void main(String[] argv)
    {
        BusinessLogic businessLogic = new BusinessLogic();
        System.out.println("Query a record:");
        businessLogic.getRecord();
        System.out.println();
        System.out.println("Delete a record:");
        businessLogic.deleteRecord();
        System.out.println();
        System.out.println("Update a record:");
        businessLogic.updateRecord();
    }
}