// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainLogPublishingOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainLogPublishingOptionArgs Empty = new DomainLogPublishingOptionArgs();

    /**
     * ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    @Import(name="cloudwatchLogGroupArn", required=true)
      private final Output<String> cloudwatchLogGroupArn;

    public Output<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    @Import(name="logType", required=true)
      private final Output<String> logType;

    public Output<String> getLogType() {
        return this.logType;
    }

    public DomainLogPublishingOptionArgs(
        Output<String> cloudwatchLogGroupArn,
        @Nullable Output<Boolean> enabled,
        Output<String> logType) {
        this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
        this.enabled = enabled;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private DomainLogPublishingOptionArgs() {
        this.cloudwatchLogGroupArn = Output.empty();
        this.enabled = Output.empty();
        this.logType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainLogPublishingOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cloudwatchLogGroupArn;
        private @Nullable Output<Boolean> enabled;
        private Output<String> logType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainLogPublishingOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logType = defaults.logType;
        }

        public Builder cloudwatchLogGroupArn(Output<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Objects.requireNonNull(cloudwatchLogGroupArn);
            return this;
        }
        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Output.of(Objects.requireNonNull(cloudwatchLogGroupArn));
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder logType(Output<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public Builder logType(String logType) {
            this.logType = Output.of(Objects.requireNonNull(logType));
            return this;
        }        public DomainLogPublishingOptionArgs build() {
            return new DomainLogPublishingOptionArgs(cloudwatchLogGroupArn, enabled, logType);
        }
    }
}
