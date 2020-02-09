package springframework.SpringDI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mandola - SP";
    }
}
