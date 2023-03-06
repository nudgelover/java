package db;

public class OracleDAO implements DAO {
	//인터페이스를 상속받으려면 implements!
	
	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Oracle Database");
		//실제로는 데이터 연동하는 프로그램이 여기에 들어감!
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");
		
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated Oracle Database");
		
		
	}

}
