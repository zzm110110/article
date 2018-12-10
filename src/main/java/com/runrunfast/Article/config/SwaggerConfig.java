package com.runrunfast.Article.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: SwaggerConfiguration
 * @Description: swagger2配置类
 * @Author: 邹智敏
 * @Date: 2018/8/4   12:54
 * @Version: 1.0
 */

@Configuration
@EnableSwagger2
//@Profile({"dev", "local"}) //在生产环境关闭swagger2
public class SwaggerConfig {

    /**
     * 版本
     */
    @Value("${swagger2.VERSION}")
    public String VERSION;

    /**
     * 包路径
     */
    @Value("${swagger2.SWAGGER_SCAN_BASE_PACKAGE}")
    public String SWAGGER_SCAN_BASE_PACKAGE;

    /**
     * 标题
     */
    @Value("${swagger2.TITLE}")
    public String TITLE;

    /**
     * 版本说明
     */
    @Value("${swagger2.DESCRIPTION}")
    public String DESCRIPTION;

    /**
     * 作者
     */
    @Value("${swagger2.AUTHOR}")
    public String AUTHOR;

    /**
     * 个人链接
     */
    @Value("${swagger2.URL}")
    public String URL;

    /**
     * 个人邮箱
     */
    @Value("${swagger2.EMAIL}")
    public String EMAIL;

    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .enableUrlTemplating(false)
                .forCodeGeneration(true)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(TITLE,DESCRIPTION,VERSION,URL,AUTHOR,EMAIL,null);
    }
}