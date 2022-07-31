import java.util.Calendar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.util.CalendarFactory;

@Configuration
@ComponentScan({ "com.pluralsight" })
public class AppConfig {

	@Bean("cal")
	@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}

	@Bean
	public Calendar cal() throws Exception {
		return calFactory().getObject();
	}

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
