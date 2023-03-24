package kimjihye.mycompany.myweb.product;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	ProductDAO productDAO;

	// 상품(책)insert
	@Override
	public void insert(ProductDTO dto) {
		productDAO.insert(dto);
	}
	// 상품 전체조회
	@Override
	public List<ProductDTO> list() { // 전체조회라 파라미터가 필요없음. 
		return productDAO.list();
	}
	
}
