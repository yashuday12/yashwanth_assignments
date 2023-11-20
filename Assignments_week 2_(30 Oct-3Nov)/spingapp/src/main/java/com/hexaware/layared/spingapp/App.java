package com.hexaware.layared.spingapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.layared.spingapp.bean.Product;
import com.hexaware.layared.spingapp.service.IProductService;
import com.hexaware.layared.spingapp.service.ProductService;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages= {"com.hexaware.layared.spingapp"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation layer UI" );
        ApplicationContext container=new AnnotationConfigApplicationContext(App.class);
        IProductService service= container.getBean(ProductService.class);
        Product product= service.getProduct();
        System.out.println(product);
    }
}
