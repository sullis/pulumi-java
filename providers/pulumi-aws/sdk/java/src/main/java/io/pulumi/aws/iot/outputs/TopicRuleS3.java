// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleS3 {
    /**
     * The Amazon S3 bucket name.
     * 
     */
    private final String bucketName;
    /**
     * The object key.
     * 
     */
    private final String key;
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private TopicRuleS3(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.bucketName = bucketName;
        this.key = key;
        this.roleArn = roleArn;
    }

    /**
     * The Amazon S3 bucket name.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * The object key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The IAM role ARN that allows access to the CloudWatch alarm.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String key;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.key = defaults.key;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public TopicRuleS3 build() {
            return new TopicRuleS3(bucketName, key, roleArn);
        }
    }
}
