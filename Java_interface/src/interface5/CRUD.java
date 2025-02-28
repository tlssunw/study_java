package interface5;

public interface CRUD {
	
	public boolean save(); // 저장용
	public CRUD select(); // DB 조회
	public CRUD update(); // DB 수정
	public boolean delete(); // DB 삭제용

}

interface aa { //함수형 인터페이스
	public void bb();
}
