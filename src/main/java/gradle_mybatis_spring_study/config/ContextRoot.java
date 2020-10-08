package gradle_mybatis_spring_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ContextDataSource.class, ContextSqlSession.class/*, ContextTransaction.class*/})
@ComponentScan(basePackages = {"gradle_mybatis_spring_study.mapper"})
public class ContextRoot {

}
