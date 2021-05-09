package b_oopIntro.b_homework.h2;

//c# da property'dir attribute veya field'in karsiligi
public class Product {
	/*
	 * int id, stockAmount; //stockamount: stock adedi. String name, description;
	 * double price;
	 */

	// ozellik class'i sadece ozellik tutmali (solid). islemleri, islemleri yapacak
	// olan sinif tutmali (mngr, srvc).

	// get ve set kullanmamizin amaci field'larin private olmasi ve bundan
	// kaynaklanan diger yerlerden cagirabilme ih-
	// tiyaci dogmasi. getter ve setter'lar public tanimlanir. cunku ulasmamiz
	// gerek. get okuma (bilgiyi), set yazma.
	// (genelde class ozellikleri private tanimlanir.)

	// constuctor new yapildigi zaman calisan bloktur/metottur.
	/*
	 * public Product(String name) { System.out.println("Yapici blok calisti."); }
	 */
	// parametreli de kullanilabilir constructor. ama bos constructor'� kullanmak
	// istiyosan yazmak zorundasin.
	// sadece yukardakini yazarsan bosu kullanamazsin.
	public Product() {
		System.out.println("Yapici blok calisti.");
	}

	public Product(int id, String name, String description, int stockAmount, double price, String renk) {
		this();//eger bos cons'un da calismasini istiyosan bu sekilde ilk satira yazmak zorundasin!
		this._id=id;
		this._name=name;
		this._description=description;
		this._stockAmount=stockAmount;
		this._price=price;
		this._renk=renk;
	}
	// bu kullanima method overloading denir.

	private int _id, _stockAmount;
	private String _name, _description, _renk;
	private double _price;

	// getter blogu
	public int getId() {
		return _id;
	}

	// setter blogu
	public void setId(int id) {// parametre olmali. cunku kullanicidan istiyorum, o bana o degeri vermeli
		// id=id; //bunun yerine;
		// this.id=id; //bu yapilir. ya da;
		_id = id; // bu yapilir. buna bestpractice denir. neden yapilir cunku bazen programci this
					// yazmayi unutabiliyor.

	}

	// elle yazmak istemezsek field'a gelip sag tik>refactor>encapsulate field

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	public String get_kod() {
		return _name.substring(0, 1) + _id;
	}

	// setter yok cunku kodu kullanicinin yazmasini istemiyorum.
}
