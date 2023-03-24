package kimjihye.mycompany.myweb.product;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Inject
	SqlSession sqlSession;

	// 상품 목록 추가 03/17
	public void insert(ProductDTO dto) {
		sqlSession.insert("product.insert", dto);
	}
	// 상품 등록의 목록 전체 조회 03/17
	public List<ProductDTO> list() {
		return sqlSession.selectList("product.list");
	}


	
	
			
}
