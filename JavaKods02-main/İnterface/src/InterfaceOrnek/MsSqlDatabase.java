package InterfaceOrnek;

public class MsSqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("MsSQL veritabanına eklendi.");
		
	}

	@Override
	public void insert() {
		System.out.println("MsSQL verileri gösterildi.");
		
	}

	@Override
	public void delete() {
		System.out.println("MsSQL veritabanından silindi.");
		
	}

	@Override
	public void update() {
		System.out.println("MsSQL veritabanında güncellendi.");
		
	}

}
