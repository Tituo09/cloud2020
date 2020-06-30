package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fuqm
 * @create 2020-06-17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderDemoApplication {
    public static void main(String[] args) {
            SpringApplication.run(NacosProviderDemoApplication .class, args);
        }
}
