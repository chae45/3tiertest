package me.jsk.app.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 CORS 허용
                // Static Web App의 실제 도메인을 HTTPS로 정확히 입력해야 합니다.
                .allowedOrigins("https://lemon-grass-08dd17000.3.azurestaticapps.net") 
                
                // 필요에 따라 허용할 HTTP 메서드를 지정합니다.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") 
                
                .allowCredentials(true) 
                .allowedHeaders("*");
    }
}
