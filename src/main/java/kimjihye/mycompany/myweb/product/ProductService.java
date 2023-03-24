package kimjihye.mycompany.myweb.product;

import java.util.List;

public interface ProductService {

	// 상품(책)insert
	void insert(ProductDTO dto);
	// 상품 전체목록조회 
	List<ProductDTO> list();

}
