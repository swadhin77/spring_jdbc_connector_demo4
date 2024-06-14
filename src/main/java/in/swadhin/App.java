package in.swadhin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.swadhin.resources.javaconfig;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
        NamedParameterJdbcTemplate t=(NamedParameterJdbcTemplate)context.getBean("templet");
        Map<String, Object> m=new HashMap<String, Object>();
        m.put("roll", 106);
        m.put("name" , "gaurav");
        m.put("mark", 93.3f);        
        String query="insert into student values(:roll,:name,:mark)";
        int k=t.update(query, m);
        if(k>0)
        {
        	System.out.println("Insertion Successfully Done......");
        }
        else
        
        {
        	System.out.println("Insertion Failed...");
        }
    }
}
