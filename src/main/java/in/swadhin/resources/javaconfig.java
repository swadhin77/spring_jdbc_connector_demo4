package in.swadhin.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class javaconfig {
	@Bean
	public DriverManagerDataSource name()
	{
		DriverManagerDataSource npjt=new DriverManagerDataSource();
		npjt.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		npjt.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		npjt.setUsername("system");
		npjt.setPassword("Swadhin9090.");
		return npjt;
	}
	@Bean
	public NamedParameterJdbcTemplate templet()
	{
		NamedParameterJdbcTemplate nn=new NamedParameterJdbcTemplate(name());
		return nn;
	}
}
