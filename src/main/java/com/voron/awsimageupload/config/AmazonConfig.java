package com.voron.awsimageupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {

	@Value("${amazon.secret.key}")
	private Stirng AMAZON_KEY;

	@Bean
	public AmazonS3 s3() {
		BasicAWSCredentials awsCredentials = new BasicAWSCredentials(AMAZON_KEY);
		System.out.println("========>>>>>> in AmazonS3 constructor");
		
		AmazonS3 s3Client = AmazonS3ClientBuilder
				.standard()
				.withRegion(Regions.EU_WEST_1)
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.build();
		
		System.out.println("========>>>>>> create AmazonS3 : " + s3Client);
		return s3Client;
	}
}
