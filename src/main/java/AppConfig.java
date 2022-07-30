import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.pluralsight" })
public class AppConfig {

//	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
//	public SpeakerService getSpeakerService() {
//
//		// SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
//		return service;
//	}

//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerRepositoryImpl();
//	}
}
