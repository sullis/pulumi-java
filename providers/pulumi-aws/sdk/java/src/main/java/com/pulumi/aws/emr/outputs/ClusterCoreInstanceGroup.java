// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.ClusterCoreInstanceGroupEbsConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCoreInstanceGroup {
    /**
     * @return String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
     * 
     */
    private final @Nullable String autoscalingPolicy;
    /**
     * @return Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    private final @Nullable String bidPrice;
    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    private final @Nullable List<ClusterCoreInstanceGroupEbsConfig> ebsConfigs;
    /**
     * @return ID of the cluster.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource&#39;s `core_instance_group` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have map public IP on launch enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `termination_protection = false` configuration applied before destroying this resource.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * @return EC2 instance type for all instances in the instance group.
     * 
     */
    private final String instanceType;
    /**
     * @return Name of the step.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private ClusterCoreInstanceGroup(
        @CustomType.Parameter("autoscalingPolicy") @Nullable String autoscalingPolicy,
        @CustomType.Parameter("bidPrice") @Nullable String bidPrice,
        @CustomType.Parameter("ebsConfigs") @Nullable List<ClusterCoreInstanceGroupEbsConfig> ebsConfigs,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("name") @Nullable String name) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.bidPrice = bidPrice;
        this.ebsConfigs = ebsConfigs;
        this.id = id;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.name = name;
    }

    /**
     * @return String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
     * 
     */
    public Optional<String> autoscalingPolicy() {
        return Optional.ofNullable(this.autoscalingPolicy);
    }
    /**
     * @return Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    public Optional<String> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }
    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    public List<ClusterCoreInstanceGroupEbsConfig> ebsConfigs() {
        return this.ebsConfigs == null ? List.of() : this.ebsConfigs;
    }
    /**
     * @return ID of the cluster.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource&#39;s `core_instance_group` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have map public IP on launch enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `termination_protection = false` configuration applied before destroying this resource.
     * 
     */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * @return EC2 instance type for all instances in the instance group.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Name of the step.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoscalingPolicy;
        private @Nullable String bidPrice;
        private @Nullable List<ClusterCoreInstanceGroupEbsConfig> ebsConfigs;
        private @Nullable String id;
        private @Nullable Integer instanceCount;
        private String instanceType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.bidPrice = defaults.bidPrice;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.id = defaults.id;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.name = defaults.name;
        }

        public Builder autoscalingPolicy(@Nullable String autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }
        public Builder ebsConfigs(@Nullable List<ClusterCoreInstanceGroupEbsConfig> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }
        public Builder ebsConfigs(ClusterCoreInstanceGroupEbsConfig... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ClusterCoreInstanceGroup build() {
            return new ClusterCoreInstanceGroup(autoscalingPolicy, bidPrice, ebsConfigs, id, instanceCount, instanceType, name);
        }
    }
}
