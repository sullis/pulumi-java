// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class ClusterOpenMonitoringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringGetArgs Empty = new ClusterOpenMonitoringGetArgs();

    /**
     * Configuration block for Prometheus settings for open monitoring. See below.
     * 
     */
    @Import(name="prometheus", required=true)
      private final Output<ClusterOpenMonitoringPrometheusGetArgs> prometheus;

    public Output<ClusterOpenMonitoringPrometheusGetArgs> prometheus() {
        return this.prometheus;
    }

    public ClusterOpenMonitoringGetArgs(Output<ClusterOpenMonitoringPrometheusGetArgs> prometheus) {
        this.prometheus = Objects.requireNonNull(prometheus, "expected parameter 'prometheus' to be non-null");
    }

    private ClusterOpenMonitoringGetArgs() {
        this.prometheus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ClusterOpenMonitoringPrometheusGetArgs> prometheus;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheus = defaults.prometheus;
        }

        public Builder prometheus(Output<ClusterOpenMonitoringPrometheusGetArgs> prometheus) {
            this.prometheus = Objects.requireNonNull(prometheus);
            return this;
        }
        public Builder prometheus(ClusterOpenMonitoringPrometheusGetArgs prometheus) {
            this.prometheus = Output.of(Objects.requireNonNull(prometheus));
            return this;
        }        public ClusterOpenMonitoringGetArgs build() {
            return new ClusterOpenMonitoringGetArgs(prometheus);
        }
    }
}
