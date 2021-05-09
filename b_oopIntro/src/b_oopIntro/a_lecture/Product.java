package b_oopIntro.a_lecture;

public class Product {
	
	int id; // nesneyi diger nesnelerden ayiran özellik
	private String name;
	private double unitPrice; // birim fiyati
	private String detail; // ürün detayi, açiklamasi vs.
	private double discount; //indirim (orani)
	//private double unitPriceAfterDiscount;//indirimden sonraki oran. indirim sonrasinda ortaya cikacak urune ihtiyac icin
	//final disaridan erisimi kisitlar. sadece constructor'da set edilebilir.
	//private ozel demek. sadece tanimlandigi class'in icerisinde kullanilabilir. baska yerde nesnesini olusturup cagýrmaya kalktigimizda izin vermez.
	
	/*public Product(int id, String name, double unitPrice, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}*/
	
	

	public Product() {
		System.out.println("Ben calistim.");
	}
	
	public Product(int id, String name, double unitPrice, String detail, double discount/*, double unitPriceAfterDiscount*/) {
		// overloading. ayni isimde birden fazla
		// metod
		this();
		//super();
		/* id=id; degil */ this.id = id; // this "bu classtaki" demek. o yuzden ozellikleri metodun tanimasi icin üste
											// almaya gerek yok. (Python'da selftir)
		
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
		//this.unitPriceAfterDiscount=unitPriceAfterDiscount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Product product = new 

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		//return unitPriceAfterDiscount;
		return this.unitPrice-(this.unitPrice*this.discount*100);
	}

	
}
