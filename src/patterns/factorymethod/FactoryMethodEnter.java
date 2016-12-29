package patterns.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:11:02
 **/
public class FactoryMethodEnter
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        OperatorFactory addFactory = new AddFactory();
        Operation addOperation = addFactory.createOperator();
        addOperation.setFactors(20, 40);
        System.out.println("the result of add is " + addOperation.getResult());
        
        OperatorFactory subFactory = new SubFactory();
        Operation subOperation = subFactory.createOperator();
        subOperation.setFactors(20, 40);
        System.out.println("the result of sub is " + subOperation.getResult());
    }
}