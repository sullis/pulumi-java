// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationCloudwatchLoggingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationCloudwatchLoggingOptionsArgs Empty = new AnalyticsApplicationCloudwatchLoggingOptionsArgs();

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The ARN of the CloudWatch Log Stream.
     * 
     */
    @Import(name="logStreamArn", required=true)
      private final Output<String> logStreamArn;

    public Output<String> getLogStreamArn() {
        return this.logStreamArn;
    }

    /**
     * The ARN of the IAM Role used to send application messages.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public AnalyticsApplicationCloudwatchLoggingOptionsArgs(
        @Nullable Output<String> id,
        Output<String> logStreamArn,
        Output<String> roleArn) {
        this.id = id;
        this.logStreamArn = Objects.requireNonNull(logStreamArn, "expected parameter 'logStreamArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnalyticsApplicationCloudwatchLoggingOptionsArgs() {
        this.id = Output.empty();
        this.logStreamArn = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationCloudwatchLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<String> logStreamArn;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationCloudwatchLoggingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.logStreamArn = defaults.logStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder logStreamArn(Output<String> logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }
        public Builder logStreamArn(String logStreamArn) {
            this.logStreamArn = Output.of(Objects.requireNonNull(logStreamArn));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public AnalyticsApplicationCloudwatchLoggingOptionsArgs build() {
            return new AnalyticsApplicationCloudwatchLoggingOptionsArgs(id, logStreamArn, roleArn);
        }
    }
}
