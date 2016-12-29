package patterns.simplefactory;

public class SimpleFactoryEnter
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        OptionFactory optionFactory = new OptionFactory();
        Option operator0 = optionFactory.createOperator("+");
        operator0.setFactors(20, 60);
        System.out.println(operator0.getResult());
        Option operator1 = optionFactory.createOperator("-");
        operator1.setFactors(20, 60);
        System.out.println(operator1.getResult());
    }
}