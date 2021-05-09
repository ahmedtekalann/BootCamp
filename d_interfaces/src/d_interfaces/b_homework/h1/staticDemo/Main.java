package d_interfaces.b_homework.h1.staticDemo;
//staticlerin kullanim alanlarindan bir tanesi, uygulamalarda utility denen arac yazarken kullanmak
public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price =10;
        product.name="Mouse";

        productManager.add(product);

        //inner class
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}
