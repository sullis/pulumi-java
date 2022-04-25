// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs Empty = new InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs();

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    @Import(name="allocationStrategy", required=true)
    private Output<String> allocationStrategy;

    /**
     * @return Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    public Output<String> allocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    @Import(name="blockDurationMinutes")
    private @Nullable Output<Integer> blockDurationMinutes;

    /**
     * @return The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    public Optional<Output<Integer>> blockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }

    /**
     * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    @Import(name="timeoutAction", required=true)
    private Output<String> timeoutAction;

    /**
     * @return The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    public Output<String> timeoutAction() {
        return this.timeoutAction;
    }

    /**
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    @Import(name="timeoutDurationMinutes", required=true)
    private Output<Integer> timeoutDurationMinutes;

    /**
     * @return The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    public Output<Integer> timeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    private InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs() {}

    private InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs(InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs $) {
        this.allocationStrategy = $.allocationStrategy;
        this.blockDurationMinutes = $.blockDurationMinutes;
        this.timeoutAction = $.timeoutAction;
        this.timeoutDurationMinutes = $.timeoutDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs $;

        public Builder() {
            $ = new InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs();
        }

        public Builder(InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs defaults) {
            $ = new InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationStrategy Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
         * 
         * @return builder
         * 
         */
        public Builder allocationStrategy(Output<String> allocationStrategy) {
            $.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * @param allocationStrategy Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
         * 
         * @return builder
         * 
         */
        public Builder allocationStrategy(String allocationStrategy) {
            return allocationStrategy(Output.of(allocationStrategy));
        }

        /**
         * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
         * 
         * @return builder
         * 
         */
        public Builder blockDurationMinutes(@Nullable Output<Integer> blockDurationMinutes) {
            $.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        /**
         * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
         * 
         * @return builder
         * 
         */
        public Builder blockDurationMinutes(Integer blockDurationMinutes) {
            return blockDurationMinutes(Output.of(blockDurationMinutes));
        }

        /**
         * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
         * 
         * @return builder
         * 
         */
        public Builder timeoutAction(Output<String> timeoutAction) {
            $.timeoutAction = timeoutAction;
            return this;
        }

        /**
         * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
         * 
         * @return builder
         * 
         */
        public Builder timeoutAction(String timeoutAction) {
            return timeoutAction(Output.of(timeoutAction));
        }

        /**
         * @param timeoutDurationMinutes The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
         * 
         * @return builder
         * 
         */
        public Builder timeoutDurationMinutes(Output<Integer> timeoutDurationMinutes) {
            $.timeoutDurationMinutes = timeoutDurationMinutes;
            return this;
        }

        /**
         * @param timeoutDurationMinutes The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
         * 
         * @return builder
         * 
         */
        public Builder timeoutDurationMinutes(Integer timeoutDurationMinutes) {
            return timeoutDurationMinutes(Output.of(timeoutDurationMinutes));
        }

        public InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs build() {
            $.allocationStrategy = Objects.requireNonNull($.allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
            $.timeoutAction = Objects.requireNonNull($.timeoutAction, "expected parameter 'timeoutAction' to be non-null");
            $.timeoutDurationMinutes = Objects.requireNonNull($.timeoutDurationMinutes, "expected parameter 'timeoutDurationMinutes' to be non-null");
            return $;
        }
    }

}
