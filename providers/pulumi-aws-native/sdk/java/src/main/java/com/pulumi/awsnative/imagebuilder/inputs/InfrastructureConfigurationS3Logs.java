// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The S3 path in which to store the logs.
 * 
 */
public final class InfrastructureConfigurationS3Logs extends com.pulumi.resources.InvokeArgs {

    public static final InfrastructureConfigurationS3Logs Empty = new InfrastructureConfigurationS3Logs();

    /**
     * S3BucketName
     * 
     */
    @Import(name="s3BucketName")
    private @Nullable String s3BucketName;

    /**
     * @return S3BucketName
     * 
     */
    public Optional<String> s3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }

    /**
     * S3KeyPrefix
     * 
     */
    @Import(name="s3KeyPrefix")
    private @Nullable String s3KeyPrefix;

    /**
     * @return S3KeyPrefix
     * 
     */
    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    private InfrastructureConfigurationS3Logs() {}

    private InfrastructureConfigurationS3Logs(InfrastructureConfigurationS3Logs $) {
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureConfigurationS3Logs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureConfigurationS3Logs $;

        public Builder() {
            $ = new InfrastructureConfigurationS3Logs();
        }

        public Builder(InfrastructureConfigurationS3Logs defaults) {
            $ = new InfrastructureConfigurationS3Logs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3BucketName S3BucketName
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(@Nullable String s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3KeyPrefix S3KeyPrefix
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public InfrastructureConfigurationS3Logs build() {
            return $;
        }
    }

}
