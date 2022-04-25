// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs;
import com.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetInstanceTypeConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetInstanceTypeConfigGetArgs Empty = new ClusterMasterInstanceFleetInstanceTypeConfigGetArgs();

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
    private @Nullable Output<String> bidPrice;

    /**
     * @return Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    public Optional<Output<String>> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }

    /**
     * Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @Import(name="bidPriceAsPercentageOfOnDemandPrice")
    private @Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice;

    /**
     * @return Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    public Optional<Output<Double>> bidPriceAsPercentageOfOnDemandPrice() {
        return Optional.ofNullable(this.bidPriceAsPercentageOfOnDemandPrice);
    }

    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @Import(name="configurations")
    private @Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations;

    /**
     * @return Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    public Optional<Output<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>>> configurations() {
        return Optional.ofNullable(this.configurations);
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @Import(name="ebsConfigs")
    private @Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs;

    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    public Optional<Output<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>>> ebsConfigs() {
        return Optional.ofNullable(this.ebsConfigs);
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return EC2 instance type for all instances in the instance group.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    @Import(name="weightedCapacity")
    private @Nullable Output<Integer> weightedCapacity;

    /**
     * @return Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    public Optional<Output<Integer>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private ClusterMasterInstanceFleetInstanceTypeConfigGetArgs() {}

    private ClusterMasterInstanceFleetInstanceTypeConfigGetArgs(ClusterMasterInstanceFleetInstanceTypeConfigGetArgs $) {
        this.bidPrice = $.bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = $.bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = $.configurations;
        this.ebsConfigs = $.ebsConfigs;
        this.instanceType = $.instanceType;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMasterInstanceFleetInstanceTypeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMasterInstanceFleetInstanceTypeConfigGetArgs $;

        public Builder() {
            $ = new ClusterMasterInstanceFleetInstanceTypeConfigGetArgs();
        }

        public Builder(ClusterMasterInstanceFleetInstanceTypeConfigGetArgs defaults) {
            $ = new ClusterMasterInstanceFleetInstanceTypeConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bidPrice Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            $.bidPrice = bidPrice;
            return this;
        }

        /**
         * @param bidPrice Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(String bidPrice) {
            return bidPrice(Output.of(bidPrice));
        }

        /**
         * @param bidPriceAsPercentageOfOnDemandPrice Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
         * 
         * @return builder
         * 
         */
        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Output<Double> bidPriceAsPercentageOfOnDemandPrice) {
            $.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        /**
         * @param bidPriceAsPercentageOfOnDemandPrice Bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
         * 
         * @return builder
         * 
         */
        public Builder bidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
            return bidPriceAsPercentageOfOnDemandPrice(Output.of(bidPriceAsPercentageOfOnDemandPrice));
        }

        /**
         * @param configurations Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder configurations(@Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder configurations(List<ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param configurations Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder configurations(ClusterMasterInstanceFleetInstanceTypeConfigConfigurationGetArgs... configurations) {
            return configurations(List.of(configurations));
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(@Nullable Output<List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs) {
            $.ebsConfigs = ebsConfigs;
            return this;
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(List<ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs> ebsConfigs) {
            return ebsConfigs(Output.of(ebsConfigs));
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(ClusterMasterInstanceFleetInstanceTypeConfigEbsConfigGetArgs... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }

        /**
         * @param instanceType EC2 instance type for all instances in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType EC2 instance type for all instances in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param weightedCapacity Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(@Nullable Output<Integer> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        /**
         * @param weightedCapacity Number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
         * 
         * @return builder
         * 
         */
        public Builder weightedCapacity(Integer weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public ClusterMasterInstanceFleetInstanceTypeConfigGetArgs build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}
