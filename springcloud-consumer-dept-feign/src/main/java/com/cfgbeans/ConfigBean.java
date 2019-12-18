package com.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
 
@Configuration
public class ConfigBean
{

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //指定LoadBalanced的算法 用自带的随机算法
//        return new RandomRule();
    	return new RetryRule();
    }
}