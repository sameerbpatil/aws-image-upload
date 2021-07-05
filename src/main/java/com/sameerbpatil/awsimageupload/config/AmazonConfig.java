package com.sameerbpatil.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "", //AWS Access Key Id
                "" //AWS Secret Key
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion(Regions.US_EAST_2) // Error: Received multiple errors without setting 'region' field.
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}