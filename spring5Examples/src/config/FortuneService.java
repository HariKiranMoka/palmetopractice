package config;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {
	public String getFortune()
	{
		return "fortune cars";
	}

}
