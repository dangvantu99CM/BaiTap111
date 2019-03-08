package DeQuy.btChuyenCo10SangNhiphan;

public class Factory {

	public static long factory(int n) { 
		if(n <= 1) {
			return 1;
		}
		return n*factory(n-1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factory(3));

	}

}
