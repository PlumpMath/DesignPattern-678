package patterns.proxy;

public class ProxyEnter
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Customer customer = new Customer("Tom");
        Proxy proxy = new Proxy(customer);
        proxy.supplyProducts();
        proxy.repairProducts();
        proxy.updateProducts();
    }
}