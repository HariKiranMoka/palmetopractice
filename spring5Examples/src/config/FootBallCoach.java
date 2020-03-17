package config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hari")
public class FootBallCoach {
	FortuneService f;
	@Autowired
	public FootBallCoach(FortuneService f) {
		super();
		this.f = f;
	}
	public String getDailyWorkOut() {
		return "Do Work Out Daily For Success...";
	}
	public String getMessage()
	{
		return f.getFortune();
	}

}
