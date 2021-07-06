package co.yedam.interfaces;

public class DaoExample {

	public static void main(String[] args) {
		Dao dao = new MysqlDao();

		dao.insert(); //클래스 불러와서 구현
		dao.update();
		dao.delete();

		// sqlite, postgreSQL
		Dao dao2 = new Dao() { // 익명의 구현 객체, 클래스로 따로 만들지 않고 바로 만들기
			@Override
			public void insert() {
				System.out.println("sqlite 입력처리.");
			}
			@Override
			public void update() {
				System.out.println("sqlite 수정처리.");				
			}
			@Override
			public void delete() {
				System.out.println("sqlite 삭제처리.");			
			}		
		};

		dao2.insert();
		dao2.update();
		dao2.delete();
//		dao = new MysqlDao() ;
		
		dao2 = new Dao() { // 익명의 구현 객체, 클래스로 따로 만들지 않고 바로 만들기
			@Override
			public void insert() {
				System.out.println("postsqlite 입력처리.");
			}
			@Override
			public void update() {
				System.out.println("postsqlite 수정처리.");				
			}
			@Override
			public void delete() {
				System.out.println("postsqlite 삭제처리.");			
			}		
		};

		dao2.insert();
		dao2.update();
		dao2.delete();
	}

}
