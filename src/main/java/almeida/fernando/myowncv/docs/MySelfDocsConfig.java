package almeida.fernando.myowncv.docs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MySelfDocsConfig  {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("almeida.fernando.myowncv"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointsInfo());
    }

    @Bean
    public ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Fernando Almeida")
                .description("https://twitter.com/almeidajava")
                //.description("Full Java Developer - @almeidajava")
                .contact(new Contact("Fernando Almeida", "https://www.linkedin.com/in/oalmeidajavadeveloper/", "almeidascv@gmail.com"))
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version(null)
                .build();
    }

}
