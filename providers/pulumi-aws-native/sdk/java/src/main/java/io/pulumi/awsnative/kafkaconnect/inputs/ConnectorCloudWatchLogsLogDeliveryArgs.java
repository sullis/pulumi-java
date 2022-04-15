// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about delivering logs to Amazon CloudWatch Logs.
 * 
 */
public final class ConnectorCloudWatchLogsLogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorCloudWatchLogsLogDeliveryArgs Empty = new ConnectorCloudWatchLogsLogDeliveryArgs();

    /**
     * Specifies whether the logs get sent to the specified CloudWatch Logs destination.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The CloudWatch log group that is the destination for log delivery.
     * 
     */
    @Import(name="logGroup")
      private final @Nullable Output<String> logGroup;

    public Output<String> logGroup() {
        return this.logGroup == null ? Codegen.empty() : this.logGroup;
    }

    public ConnectorCloudWatchLogsLogDeliveryArgs(
        Output<Boolean> enabled,
        @Nullable Output<String> logGroup) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.logGroup = logGroup;
    }

    private ConnectorCloudWatchLogsLogDeliveryArgs() {
        this.enabled = Codegen.empty();
        this.logGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCloudWatchLogsLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;
        private @Nullable Output<String> logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCloudWatchLogsLogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder logGroup(@Nullable Output<String> logGroup) {
            this.logGroup = logGroup;
            return this;
        }
        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = Codegen.ofNullable(logGroup);
            return this;
        }        public ConnectorCloudWatchLogsLogDeliveryArgs build() {
            return new ConnectorCloudWatchLogsLogDeliveryArgs(enabled, logGroup);
        }
    }
}
