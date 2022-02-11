// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowErrorHandlingConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowRedshiftDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowRedshiftDestinationPropertiesArgs Empty = new FlowRedshiftDestinationPropertiesArgs();

    @InputImport(name="bucketPrefix")
    private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    @InputImport(name="errorHandlingConfig")
    private final @Nullable Input<FlowErrorHandlingConfigArgs> errorHandlingConfig;

    public Input<FlowErrorHandlingConfigArgs> getErrorHandlingConfig() {
        return this.errorHandlingConfig == null ? Input.empty() : this.errorHandlingConfig;
    }

    @InputImport(name="intermediateBucketName", required=true)
    private final Input<String> intermediateBucketName;

    public Input<String> getIntermediateBucketName() {
        return this.intermediateBucketName;
    }

    @InputImport(name="object", required=true)
    private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public FlowRedshiftDestinationPropertiesArgs(
        @Nullable Input<String> bucketPrefix,
        @Nullable Input<FlowErrorHandlingConfigArgs> errorHandlingConfig,
        Input<String> intermediateBucketName,
        Input<String> object) {
        this.bucketPrefix = bucketPrefix;
        this.errorHandlingConfig = errorHandlingConfig;
        this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName, "expected parameter 'intermediateBucketName' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowRedshiftDestinationPropertiesArgs() {
        this.bucketPrefix = Input.empty();
        this.errorHandlingConfig = Input.empty();
        this.intermediateBucketName = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowRedshiftDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketPrefix;
        private @Nullable Input<FlowErrorHandlingConfigArgs> errorHandlingConfig;
        private Input<String> intermediateBucketName;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowRedshiftDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.intermediateBucketName = defaults.intermediateBucketName;
    	      this.object = defaults.object;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setErrorHandlingConfig(@Nullable Input<FlowErrorHandlingConfigArgs> errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder setErrorHandlingConfig(@Nullable FlowErrorHandlingConfigArgs errorHandlingConfig) {
            this.errorHandlingConfig = Input.ofNullable(errorHandlingConfig);
            return this;
        }

        public Builder setIntermediateBucketName(Input<String> intermediateBucketName) {
            this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName);
            return this;
        }

        public Builder setIntermediateBucketName(String intermediateBucketName) {
            this.intermediateBucketName = Input.of(Objects.requireNonNull(intermediateBucketName));
            return this;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }

        public FlowRedshiftDestinationPropertiesArgs build() {
            return new FlowRedshiftDestinationPropertiesArgs(bucketPrefix, errorHandlingConfig, intermediateBucketName, object);
        }
    }
}
