package top.knos;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.ContentVersionStrategy;
import org.springframework.web.servlet.resource.VersionResourceResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    VersionResourceResolver versionResourceResolver = new VersionResourceResolver()
        .addVersionStrategy(new ContentVersionStrategy(), "/**");

    registry.addResourceHandler("/lib/*.js")
        .addResourceLocations("classpath:/lib/")
        .setCachePeriod(60 * 60 * 24 * 365) /* one year */
        .resourceChain(true)
        .addResolver(versionResourceResolver);
  }
}