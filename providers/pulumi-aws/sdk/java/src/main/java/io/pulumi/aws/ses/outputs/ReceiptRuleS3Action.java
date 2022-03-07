// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReceiptRuleS3Action {
    /**
     * The name of the S3 bucket
     * 
     */
    private final String bucketName;
    /**
     * The ARN of the KMS key
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * The key prefix of the S3 bucket
     * 
     */
    private final @Nullable String objectKeyPrefix;
    /**
     * The position of the action in the receipt rule
     * 
     */
    private final Integer position;
    /**
     * The ARN of an SNS topic to notify
     * 
     */
    private final @Nullable String topicArn;

    @OutputCustomType.Constructor({"bucketName","kmsKeyArn","objectKeyPrefix","position","topicArn"})
    private ReceiptRuleS3Action(
        String bucketName,
        @Nullable String kmsKeyArn,
        @Nullable String objectKeyPrefix,
        Integer position,
        @Nullable String topicArn) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.kmsKeyArn = kmsKeyArn;
        this.objectKeyPrefix = objectKeyPrefix;
        this.position = Objects.requireNonNull(position);
        this.topicArn = topicArn;
    }

    /**
     * The name of the S3 bucket
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * The ARN of the KMS key
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * The key prefix of the S3 bucket
     * 
    */
    public Optional<String> getObjectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }
    /**
     * The position of the action in the receipt rule
     * 
    */
    public Integer getPosition() {
        return this.position;
    }
    /**
     * The ARN of an SNS topic to notify
     * 
    */
    public Optional<String> getTopicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleS3Action defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String kmsKeyArn;
        private @Nullable String objectKeyPrefix;
        private Integer position;
        private @Nullable String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleS3Action defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setObjectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleS3Action build() {
            return new ReceiptRuleS3Action(bucketName, kmsKeyArn, objectKeyPrefix, position, topicArn);
        }
    }
}