// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowS3InputFormatConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowS3SourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowS3SourcePropertiesArgs Empty = new FlowS3SourcePropertiesArgs();

    @InputImport(name="bucketName", required=true)
      private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="bucketPrefix", required=true)
      private final Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix;
    }

    @InputImport(name="s3InputFormatConfig")
      private final @Nullable Input<FlowS3InputFormatConfigArgs> s3InputFormatConfig;

    public Input<FlowS3InputFormatConfigArgs> getS3InputFormatConfig() {
        return this.s3InputFormatConfig == null ? Input.empty() : this.s3InputFormatConfig;
    }

    public FlowS3SourcePropertiesArgs(
        Input<String> bucketName,
        Input<String> bucketPrefix,
        @Nullable Input<FlowS3InputFormatConfigArgs> s3InputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = Objects.requireNonNull(bucketPrefix, "expected parameter 'bucketPrefix' to be non-null");
        this.s3InputFormatConfig = s3InputFormatConfig;
    }

    private FlowS3SourcePropertiesArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.s3InputFormatConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3SourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private Input<String> bucketPrefix;
        private @Nullable Input<FlowS3InputFormatConfigArgs> s3InputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3SourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3InputFormatConfig = defaults.s3InputFormatConfig;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setBucketPrefix(Input<String> bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }

        public Builder setBucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Input.of(Objects.requireNonNull(bucketPrefix));
            return this;
        }

        public Builder setS3InputFormatConfig(@Nullable Input<FlowS3InputFormatConfigArgs> s3InputFormatConfig) {
            this.s3InputFormatConfig = s3InputFormatConfig;
            return this;
        }

        public Builder setS3InputFormatConfig(@Nullable FlowS3InputFormatConfigArgs s3InputFormatConfig) {
            this.s3InputFormatConfig = Input.ofNullable(s3InputFormatConfig);
            return this;
        }
        public FlowS3SourcePropertiesArgs build() {
            return new FlowS3SourcePropertiesArgs(bucketName, bucketPrefix, s3InputFormatConfig);
        }
    }
}