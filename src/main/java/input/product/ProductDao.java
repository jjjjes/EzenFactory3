package input.product;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void addProductInfo(ProductBean productInfoBean) {
		sqlSessionTemplate.insert("product.addProductInfo", productInfoBean);
	}
	
}