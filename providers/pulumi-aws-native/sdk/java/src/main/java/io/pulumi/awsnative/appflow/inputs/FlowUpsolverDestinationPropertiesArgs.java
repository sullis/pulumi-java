// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowUpsolverS3OutputFormatConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowUpsolverDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowUpsolverDestinationPropertiesArgs Empty = new FlowUpsolverDestinationPropertiesArgs();

    @InputImport(name="bucketName", required=true)
    private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="bucketPrefix")
    private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    @InputImport(name="s3OutputFormatConfig", required=true)
    private final Input<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig;

    public Input<FlowUpsolverS3OutputFormatConfigArgs> getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig;
    }

    public FlowUpsolverDestinationPropertiesArgs(
        Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        Input<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig, "expected parameter 's3OutputFormatConfig' to be non-null");
    }

    private FlowUpsolverDestinationPropertiesArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.s3OutputFormatConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private Input<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3OutputFormatConfig = defaults.s3OutputFormatConfig;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setS3OutputFormatConfig(Input<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Objects.requireNonNull(s3OutputFormatConfig);
            return this;
        }

        public Builder setS3OutputFormatConfig(FlowUpsolverS3OutputFormatConfigArgs s3OutputFormatConfig) {
            this.s3OutputFormatConfig = Input.of(Objects.requireNonNull(s3OutputFormatConfig));
            return this;
        }

        public FlowUpsolverDestinationPropertiesArgs build() {
            return new FlowUpsolverDestinationPropertiesArgs(bucketName, bucketPrefix, s3OutputFormatConfig);
        }
    }
}
