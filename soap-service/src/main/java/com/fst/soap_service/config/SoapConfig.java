package com.fst.soap_service.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig extends WsConfigurerAdapter {

  @Bean
  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(applicationContext);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean(servlet, "/kalablo/*");
  }

  @Bean(name = "etudiant-wsdl")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema etudiantSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("EtudiantPort");
    wsdl11Definition.setLocationUri("/kalablo/etudiants");
    wsdl11Definition.setTargetNamespace("http://www.fst.com/xml/kalablo");
    
    wsdl11Definition.setSchema(etudiantSchema);
    return wsdl11Definition;
  }

  @Bean
  public XsdSchema etudiantSchema() {
    return new SimpleXsdSchema(new ClassPathResource("main.xsd"));
  }
}
