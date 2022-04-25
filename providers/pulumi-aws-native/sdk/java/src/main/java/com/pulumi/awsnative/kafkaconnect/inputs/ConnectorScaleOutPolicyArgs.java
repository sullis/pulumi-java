// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Information about the scale out policy of the connector.
 * 
 */
public final class ConnectorScaleOutPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorScaleOutPolicyArgs Empty = new ConnectorScaleOutPolicyArgs();

    /**
     * Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
     * 
     */
    @Import(name="cpuUtilizationPercentage", required=true)
    private Output<Integer> cpuUtilizationPercentage;

    /**
     * @return Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
     * 
     */
    public Output<Integer> cpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    private ConnectorScaleOutPolicyArgs() {}

    private ConnectorScaleOutPolicyArgs(ConnectorScaleOutPolicyArgs $) {
        this.cpuUtilizationPercentage = $.cpuUtilizationPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorScaleOutPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorScaleOutPolicyArgs $;

        public Builder() {
            $ = new ConnectorScaleOutPolicyArgs();
        }

        public Builder(ConnectorScaleOutPolicyArgs defaults) {
            $ = new ConnectorScaleOutPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuUtilizationPercentage Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilizationPercentage(Output<Integer> cpuUtilizationPercentage) {
            $.cpuUtilizationPercentage = cpuUtilizationPercentage;
            return this;
        }

        /**
         * @param cpuUtilizationPercentage Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
            return cpuUtilizationPercentage(Output.of(cpuUtilizationPercentage));
        }

        public ConnectorScaleOutPolicyArgs build() {
            $.cpuUtilizationPercentage = Objects.requireNonNull($.cpuUtilizationPercentage, "expected parameter 'cpuUtilizationPercentage' to be non-null");
            return $;
        }
    }

}
