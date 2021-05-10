package e_nLayeredDArchitecture.a_lecture.business.concretes;

import java.util.List;

import e_nLayeredDArchitecture.a_lecture.business.abstracts.ProductService;
import e_nLayeredDArchitecture.a_lecture.core.LoggerService;
import e_nLayeredDArchitecture.a_lecture.dataAccess.abstracts.ProductDao;
import e_nLayeredDArchitecture.a_lecture.entities.concretes.Product;

//is kodlari
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	/*private JLoggerManager jLoggerManager;	

	public ProductManager(JLoggerManager jLoggerManager) {
		super();
		this.jLoggerManager = jLoggerManager;
	}*/ //Bu yanlis yine d�� dunyan�n service'ine bagimlisin... 
	
	private LoggerService loggerService; //mikroservice mimarisinin hayata gecirilmesi

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		
		if(product.getCategoryId()==1) {
			
			System.out.println("Bu kategoride urun kabul edilmiyor.");
			return; //metod returnu gordugu anda asag� bakmaz bitirir metodu.
			
		}//kurali gecti veritabani katmanina gec;
		//HibernateProductDao dao = new HibernateProductDao();// gercekci
		//dao.add(product);									  // degil. 
															//  boyle b� sey olursa test senaryosu gerceklesmez.
															//	Bunun yerine Dependency Injection yapicaz. Gevsek yapicez.
		this.productDao.add(product); //gevsek bagli oldu.
		
		//this.jLoggerManager.log("asfqwfqwf");
		this.loggerService.logToSystem("Urun eklendi: "+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
