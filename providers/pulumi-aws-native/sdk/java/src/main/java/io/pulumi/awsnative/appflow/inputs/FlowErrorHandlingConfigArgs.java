// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowErrorHandlingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowErrorHandlingConfigArgs Empty = new FlowErrorHandlingConfigArgs();

    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> bucketPrefix() {
        return this.bucketPrefix == null ? Codegen.empty() : this.bucketPrefix;
    }

    @Import(name="failOnFirstError")
      private final @Nullable Output<Boolean> failOnFirstError;

    public Output<Boolean> failOnFirstError() {
        return this.failOnFirstError == null ? Codegen.empty() : this.failOnFirstError;
    }

    public FlowErrorHandlingConfigArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<String> bucketPrefix,
        @Nullable Output<Boolean> failOnFirstError) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.failOnFirstError = failOnFirstError;
    }

    private FlowErrorHandlingConfigArgs() {
        this.bucketName = Codegen.empty();
        this.bucketPrefix = Codegen.empty();
        this.failOnFirstError = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowErrorHandlingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<String> bucketPrefix;
        private @Nullable Output<Boolean> failOnFirstError;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowErrorHandlingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.failOnFirstError = defaults.failOnFirstError;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Codegen.ofNullable(bucketPrefix);
            return this;
        }
        public Builder failOnFirstError(@Nullable Output<Boolean> failOnFirstError) {
            this.failOnFirstError = failOnFirstError;
            return this;
        }
        public Builder failOnFirstError(@Nullable Boolean failOnFirstError) {
            this.failOnFirstError = Codegen.ofNullable(failOnFirstError);
            return this;
        }        public FlowErrorHandlingConfigArgs build() {
            return new FlowErrorHandlingConfigArgs(bucketName, bucketPrefix, failOnFirstError);
        }
    }
}
