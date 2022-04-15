// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Information about the scale in policy of the connector.
 * 
 */
public final class ConnectorScaleInPolicy extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorScaleInPolicy Empty = new ConnectorScaleInPolicy();

    /**
     * Specifies the CPU utilization percentage threshold at which connector scale in should trigger.
     * 
     */
    @Import(name="cpuUtilizationPercentage", required=true)
      private final Integer cpuUtilizationPercentage;

    public Integer cpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    public ConnectorScaleInPolicy(Integer cpuUtilizationPercentage) {
        this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage, "expected parameter 'cpuUtilizationPercentage' to be non-null");
    }

    private ConnectorScaleInPolicy() {
        this.cpuUtilizationPercentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorScaleInPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorScaleInPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuUtilizationPercentage = defaults.cpuUtilizationPercentage;
        }

        public Builder cpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
            return this;
        }        public ConnectorScaleInPolicy build() {
            return new ConnectorScaleInPolicy(cpuUtilizationPercentage);
        }
    }
}
