package tw.edu.ncu.cc.entity.server.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import tw.edu.ncu.cc.entity.server.middleware.ApplicationInterceptor

@Configuration
class MvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    def ApplicationInterceptor applicationInterceptor

    @Override
    void addInterceptors( InterceptorRegistry registry ) {
        registry.addInterceptor( applicationInterceptor ).addPathPatterns( "/**" )
    }

}
