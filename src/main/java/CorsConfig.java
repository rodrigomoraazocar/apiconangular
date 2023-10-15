import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
        // Configura los orígenes permitidos (URL de tu frontend)
       // config.addAllowedOrigin("https://apiconangular-frontend-3v8nk7zvw-rodrigomoraazocars-projects.vercel.app");

        
        // Configura otros encabezados y métodos permitidos según tu necesidad
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.addAllowedOrigin("*"); 

        
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
