package shop;

/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * -------------------------------------------
 * 제품번호 : prodCode : String
 * 제품 명  : prodName : String
 * 가격     : price    : int
 * 재고수량 : quantity : int
 * -------------------------------------------
 * 기본생성자, 매개변수를 받는 생성자 각 필드 1개씩 늘려가며
 * 생성자 중복정의로 5개의 생성자를 정의 this, this() 사용
 * -------------------------------------------
 * 메소드 
 * print() : void 
 *    ==> 제품의 상태 출력
 * discount(double percentage) : int 
 *    ==>입력된 퍼센트만큼 할인가격 리턴
 * 
 * sell(int amount) : void 
 *    ==> 매장에서 판매(출고)되어 재고수량이 줄어듬
 * buy(int amount) : void
 *    ==> 매장에 입고되어 재고수량이 늘어남
 * 
 * set(Sting prodCode, String prodName
 *    , int price, int quantity) : void
 *    ==> 네 개의 필드에 대하여 입력된 값으로 수정
 *  
 * @author PC38206
 *
 */
public class Product {
	
	// 1. 멤버 변수 선언부
	/** 제품 코드 */
	String prodCode;
	/** 제품 명 */
	String prodName;
	/** 제품 가격 */
	int price;
	/** 재고 수량 */
	int quantity;
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Product() {
		
	}
	
	/**
	 * 제품 코드 필드만 초기화하는 생성자
	 * @param prodCode
	 */
	Product(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	Product(String prodCode, String prodName, int price, int quantity) {
		this(prodCode);
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언부
	/**
	 * 제품 정보를 출력
	 */
	public void print() {
		System.out.printf("제품 정보 [제품코드 : %s, 제품명 : %s"
				         + ", 가격 : %,6d , 재고수량 : %2d]%n"
				         , prodCode, prodName, price, quantity);
	}
	
	/**
	 * 입력된 percentage만큼 할인을 진행할 경우
	 * 판매 가격이 얼마가 되는지 계산하여 리턴
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		
		return price;
	}

	/**
	 * 제품을 출고(판매)하고 재고 수량을 감소시킨다.	 
	 * @param amount
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * 제품이 입고되어 재고 수량을 증가시킨다.
	 * @param amount
	 */
	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;		
	}
	
	/**
	 * 입력된 값으로 제품 정보를 수정하여 저장
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set(String prodCode, String prodName
			       , int price, int quantity) {
		
		if (!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		
		if (!this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		
		if (this.price != price) {
			this.price = price;
		}
		
		if (this.quantity != quantity) {
			this.quantity = quantity;
		}
	}
	
	
	
	
	
	
	
	

}
