package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    public void String(){
        System.out.println("Có luồng chạy vào đây không");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Luong chay thu nhat");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Luong chay thu 3");
        return new String[]{"/"};
    }
}
