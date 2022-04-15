// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InfrastructureConfigurationLoggingS3LogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationLoggingS3LogsArgs Empty = new InfrastructureConfigurationLoggingS3LogsArgs();

    /**
     * Name of the S3 Bucket.
     * 
     */
    @Import(name="s3BucketName", required=true)
      private final Output<String> s3BucketName;

    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> s3KeyPrefix() {
        return this.s3KeyPrefix == null ? Codegen.empty() : this.s3KeyPrefix;
    }

    public InfrastructureConfigurationLoggingS3LogsArgs(
        Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix) {
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private InfrastructureConfigurationLoggingS3LogsArgs() {
        this.s3BucketName = Codegen.empty();
        this.s3KeyPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLoggingS3LogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLoggingS3LogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder s3BucketName(Output<String> s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Output.of(Objects.requireNonNull(s3BucketName));
            return this;
        }
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Codegen.ofNullable(s3KeyPrefix);
            return this;
        }        public InfrastructureConfigurationLoggingS3LogsArgs build() {
            return new InfrastructureConfigurationLoggingS3LogsArgs(s3BucketName, s3KeyPrefix);
        }
    }
}
