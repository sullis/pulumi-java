// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowS3OutputFormatConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3DestinationProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowS3DestinationProperties Empty = new FlowS3DestinationProperties();

    @InputImport(name="bucketName", required=true)
    private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="bucketPrefix")
    private final @Nullable String bucketPrefix;

    public Optional<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Optional.empty() : Optional.ofNullable(this.bucketPrefix);
    }

    @InputImport(name="s3OutputFormatConfig")
    private final @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig;

    public Optional<FlowS3OutputFormatConfig> getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig == null ? Optional.empty() : Optional.ofNullable(this.s3OutputFormatConfig);
    }

    public FlowS3DestinationProperties(
        String bucketName,
        @Nullable String bucketPrefix,
        @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = s3OutputFormatConfig;
    }

    private FlowS3DestinationProperties() {
        this.bucketName = null;
        this.bucketPrefix = null;
        this.s3OutputFormatConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3DestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable FlowS3OutputFormatConfig s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3DestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setS3OutputFormatConfig(@Nullable FlowS3OutputFormatConfig s3OutputFormatConfig) {
            this.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }

        public FlowS3DestinationProperties build() {
            return new FlowS3DestinationProperties(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
