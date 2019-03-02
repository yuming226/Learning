package SpringIOC.Xiao.Demo3;

import javax.annotation.Resource;

public class ProductService {

    @Resource(name="orderDao")
    private OrderDao orderDao;

    @Resource(name="productDao")
    private ProductDao productDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save() {
        System.out.println("ProductService的save方法执行了。。。。");
        orderDao.save();
        productDao.save();
    }
}
