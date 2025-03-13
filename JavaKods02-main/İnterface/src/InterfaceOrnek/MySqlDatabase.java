package InterfaceOrnek;

public class MySqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("MySQL veritabanına eklendi.");
		
	}

	@Override
	public void insert() {
		System.out.println("MySQL verileri gösterildi.");
		
	}

	@Override
	public void delete() {
		System.out.println("MySQL veritabanından silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("MySQL veritabanında güncellendi.");
		
	}
	
	

}
