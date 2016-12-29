package patterns.decorator;

public class DecoratorEnter
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Police police = new Police();
		Pistol pistol = new Pistol();
		Uniform uniform = new Uniform();
		pistol.setComponent(police);
		uniform.setComponent(pistol);
		uniform.show();
		System.out.println();
		Teacher teacher = new Teacher();
		Book book = new Book();
		Glass glass = new Glass();
		book.setComponent(teacher);
		glass.setComponent(book);
		glass.show();
	}
}
