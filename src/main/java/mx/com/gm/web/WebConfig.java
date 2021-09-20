package mx.com.gm.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    //configuracion para los idiomas
    @Bean
    public LocaleResolver localeResolver(){
    //LocaleResolver y SessionLocaleResolver -> paquete de web.servlet
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("en"));
        //se asocia con el messages.properties
        return slr;
    }
    
    @Bean //este es el que me permite cambiar el idioma de manera dinamica
    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registro){
         //InterceptorRegistry -> paquete de web.servlet   
        registro.addInterceptor(localeChangeInterceptor());
    }
    
}
