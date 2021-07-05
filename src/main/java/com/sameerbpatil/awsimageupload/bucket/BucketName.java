package com.sameerbpatil.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE_NAME("sameer-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
