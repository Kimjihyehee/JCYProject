package kimjihye.mycompany.myweb.Main;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{

	@Inject
	MainDAO mainDao;
	
}
