// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingS3LogsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class InfrastructureConfigurationLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationLoggingArgs Empty = new InfrastructureConfigurationLoggingArgs();

    /**
     * Configuration block with S3 logging settings. Detailed below.
     * 
     */
    @Import(name="s3Logs", required=true)
      private final Output<InfrastructureConfigurationLoggingS3LogsArgs> s3Logs;

    public Output<InfrastructureConfigurationLoggingS3LogsArgs> s3Logs() {
        return this.s3Logs;
    }

    public InfrastructureConfigurationLoggingArgs(Output<InfrastructureConfigurationLoggingS3LogsArgs> s3Logs) {
        this.s3Logs = Objects.requireNonNull(s3Logs, "expected parameter 's3Logs' to be non-null");
    }

    private InfrastructureConfigurationLoggingArgs() {
        this.s3Logs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<InfrastructureConfigurationLoggingS3LogsArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder s3Logs(Output<InfrastructureConfigurationLoggingS3LogsArgs> s3Logs) {
            this.s3Logs = Objects.requireNonNull(s3Logs);
            return this;
        }
        public Builder s3Logs(InfrastructureConfigurationLoggingS3LogsArgs s3Logs) {
            this.s3Logs = Output.of(Objects.requireNonNull(s3Logs));
            return this;
        }        public InfrastructureConfigurationLoggingArgs build() {
            return new InfrastructureConfigurationLoggingArgs(s3Logs);
        }
    }
}
