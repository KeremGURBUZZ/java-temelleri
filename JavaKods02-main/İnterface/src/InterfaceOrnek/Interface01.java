package InterfaceOrnek;

public class Interface01 {

	public static void main(String[] args) {
		
		DatabaseMenager databaseMenager = new DatabaseMenager();
		databaseMenager.addDatabase(new MsSqlDatabase());
		databaseMenager.deleteDatabase(new MySqlDatabase());
		

	}

}
