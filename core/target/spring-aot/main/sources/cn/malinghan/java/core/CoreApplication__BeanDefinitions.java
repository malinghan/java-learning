package cn.malinghan.java.core;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CoreApplication}.
 */
@Generated
public class CoreApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'coreApplication'.
   */
  public static BeanDefinition getCoreApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CoreApplication.class);
    beanDefinition.setTargetType(CoreApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(CoreApplication.class);
    beanDefinition.setInstanceSupplier(CoreApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
