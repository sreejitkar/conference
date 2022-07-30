import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speakerService")
	public SpeakerService getSpeakerService() {
		// SpeakerServiceImpl service = new SpeakerServiceImpl();
		// service.setRepository(getSpeakerRepository());

		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		return service;
	}

	@Bean(name = "speakerRespository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
