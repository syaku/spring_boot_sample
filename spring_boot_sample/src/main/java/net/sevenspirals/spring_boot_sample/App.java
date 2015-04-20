package net.sevenspirals.spring_boot_sample;

import net.sevenspirals.dbflute.allcommon.DBFluteBeansJavaConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("net.sevenspirals.spring_boot_sample")
@Import(DBFluteBeansJavaConfig.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
