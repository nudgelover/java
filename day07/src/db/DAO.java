package db;

public interface DAO {
	public void insert(Object obj);
	//Object를 넣으면 모든지 다 넣을 수 있다! 다 Object를 상속받은거니..!
	public void delete(Object obj);
	public void update(Object obj);
	

}
