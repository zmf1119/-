
public class Customtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custom custom = new Custom();
		
	//	custom.OrderNumber = 201907210001;
		custom.OrderID = "abc123";
		custom.OrderDate = "2018 년 3월 12일";
		custom.OrderName = "김영섭";
		custom.OrderStuffNumber = "PD345-12";
		custom.OrderAddress = "서울시 영등포구 여의도동 20번지";
		
	//	System.out.println("주문 번호 : " + custom.OrderNumber);
		System.out.println("주문자 아이디 : " + custom.OrderID);
		System.out.println("주문 날짜 : " +custom.OrderDate );
		System.out.println("주문 이름 : " +custom.OrderName );
		System.out.println("주문 상품 번호 : " + custom.OrderStuffNumber);
		System.out.println("배송 주소 : " + custom.OrderAddress);
		
		
	}

}
