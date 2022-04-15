// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs Empty = new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs();

    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
     */
    @Import(name="realtimeMetricsSubscriptionStatus", required=true)
      private final Output<String> realtimeMetricsSubscriptionStatus;

    public Output<String> realtimeMetricsSubscriptionStatus() {
        return this.realtimeMetricsSubscriptionStatus;
    }

    public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs(Output<String> realtimeMetricsSubscriptionStatus) {
        this.realtimeMetricsSubscriptionStatus = Objects.requireNonNull(realtimeMetricsSubscriptionStatus, "expected parameter 'realtimeMetricsSubscriptionStatus' to be non-null");
    }

    private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs() {
        this.realtimeMetricsSubscriptionStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> realtimeMetricsSubscriptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionStatus = defaults.realtimeMetricsSubscriptionStatus;
        }

        public Builder realtimeMetricsSubscriptionStatus(Output<String> realtimeMetricsSubscriptionStatus) {
            this.realtimeMetricsSubscriptionStatus = Objects.requireNonNull(realtimeMetricsSubscriptionStatus);
            return this;
        }
        public Builder realtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
            this.realtimeMetricsSubscriptionStatus = Output.of(Objects.requireNonNull(realtimeMetricsSubscriptionStatus));
            return this;
        }        public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs build() {
            return new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs(realtimeMetricsSubscriptionStatus);
        }
    }
}
