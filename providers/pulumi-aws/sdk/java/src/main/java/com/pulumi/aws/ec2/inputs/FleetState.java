// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigGetArgs;
import com.pulumi.aws.ec2.inputs.FleetOnDemandOptionsGetArgs;
import com.pulumi.aws.ec2.inputs.FleetSpotOptionsGetArgs;
import com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetState extends com.pulumi.resources.ResourceArgs {

    public static final FleetState Empty = new FleetState();

    /**
     * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    @Import(name="excessCapacityTerminationPolicy")
    private @Nullable Output<String> excessCapacityTerminationPolicy;

    /**
     * @return Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    public Optional<Output<String>> excessCapacityTerminationPolicy() {
        return Optional.ofNullable(this.excessCapacityTerminationPolicy);
    }

    /**
     * Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    @Import(name="launchTemplateConfig")
    private @Nullable Output<FleetLaunchTemplateConfigGetArgs> launchTemplateConfig;

    /**
     * @return Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    public Optional<Output<FleetLaunchTemplateConfigGetArgs>> launchTemplateConfig() {
        return Optional.ofNullable(this.launchTemplateConfig);
    }

    /**
     * Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    @Import(name="onDemandOptions")
    private @Nullable Output<FleetOnDemandOptionsGetArgs> onDemandOptions;

    /**
     * @return Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    public Optional<Output<FleetOnDemandOptionsGetArgs>> onDemandOptions() {
        return Optional.ofNullable(this.onDemandOptions);
    }

    /**
     * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    @Import(name="replaceUnhealthyInstances")
    private @Nullable Output<Boolean> replaceUnhealthyInstances;

    /**
     * @return Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> replaceUnhealthyInstances() {
        return Optional.ofNullable(this.replaceUnhealthyInstances);
    }

    /**
     * Nested argument containing Spot configurations. Defined below.
     * 
     */
    @Import(name="spotOptions")
    private @Nullable Output<FleetSpotOptionsGetArgs> spotOptions;

    /**
     * @return Nested argument containing Spot configurations. Defined below.
     * 
     */
    public Optional<Output<FleetSpotOptionsGetArgs>> spotOptions() {
        return Optional.ofNullable(this.spotOptions);
    }

    /**
     * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Nested argument containing target capacity configurations. Defined below.
     * 
     */
    @Import(name="targetCapacitySpecification")
    private @Nullable Output<FleetTargetCapacitySpecificationGetArgs> targetCapacitySpecification;

    /**
     * @return Nested argument containing target capacity configurations. Defined below.
     * 
     */
    public Optional<Output<FleetTargetCapacitySpecificationGetArgs>> targetCapacitySpecification() {
        return Optional.ofNullable(this.targetCapacitySpecification);
    }

    /**
     * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstances")
    private @Nullable Output<Boolean> terminateInstances;

    /**
     * @return Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> terminateInstances() {
        return Optional.ofNullable(this.terminateInstances);
    }

    /**
     * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    @Import(name="terminateInstancesWithExpiration")
    private @Nullable Output<Boolean> terminateInstancesWithExpiration;

    /**
     * @return Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> terminateInstancesWithExpiration() {
        return Optional.ofNullable(this.terminateInstancesWithExpiration);
    }

    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FleetState() {}

    private FleetState(FleetState $) {
        this.excessCapacityTerminationPolicy = $.excessCapacityTerminationPolicy;
        this.launchTemplateConfig = $.launchTemplateConfig;
        this.onDemandOptions = $.onDemandOptions;
        this.replaceUnhealthyInstances = $.replaceUnhealthyInstances;
        this.spotOptions = $.spotOptions;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.targetCapacitySpecification = $.targetCapacitySpecification;
        this.terminateInstances = $.terminateInstances;
        this.terminateInstancesWithExpiration = $.terminateInstancesWithExpiration;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetState $;

        public Builder() {
            $ = new FleetState();
        }

        public Builder(FleetState defaults) {
            $ = new FleetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param excessCapacityTerminationPolicy Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
         * 
         * @return builder
         * 
         */
        public Builder excessCapacityTerminationPolicy(@Nullable Output<String> excessCapacityTerminationPolicy) {
            $.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        /**
         * @param excessCapacityTerminationPolicy Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
         * 
         * @return builder
         * 
         */
        public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            return excessCapacityTerminationPolicy(Output.of(excessCapacityTerminationPolicy));
        }

        /**
         * @param launchTemplateConfig Nested argument containing EC2 Launch Template configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateConfig(@Nullable Output<FleetLaunchTemplateConfigGetArgs> launchTemplateConfig) {
            $.launchTemplateConfig = launchTemplateConfig;
            return this;
        }

        /**
         * @param launchTemplateConfig Nested argument containing EC2 Launch Template configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateConfig(FleetLaunchTemplateConfigGetArgs launchTemplateConfig) {
            return launchTemplateConfig(Output.of(launchTemplateConfig));
        }

        /**
         * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder onDemandOptions(@Nullable Output<FleetOnDemandOptionsGetArgs> onDemandOptions) {
            $.onDemandOptions = onDemandOptions;
            return this;
        }

        /**
         * @param onDemandOptions Nested argument containing On-Demand configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder onDemandOptions(FleetOnDemandOptionsGetArgs onDemandOptions) {
            return onDemandOptions(Output.of(onDemandOptions));
        }

        /**
         * @param replaceUnhealthyInstances Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder replaceUnhealthyInstances(@Nullable Output<Boolean> replaceUnhealthyInstances) {
            $.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        /**
         * @param replaceUnhealthyInstances Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder replaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
            return replaceUnhealthyInstances(Output.of(replaceUnhealthyInstances));
        }

        /**
         * @param spotOptions Nested argument containing Spot configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder spotOptions(@Nullable Output<FleetSpotOptionsGetArgs> spotOptions) {
            $.spotOptions = spotOptions;
            return this;
        }

        /**
         * @param spotOptions Nested argument containing Spot configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder spotOptions(FleetSpotOptionsGetArgs spotOptions) {
            return spotOptions(Output.of(spotOptions));
        }

        /**
         * @param tags Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetCapacitySpecification(@Nullable Output<FleetTargetCapacitySpecificationGetArgs> targetCapacitySpecification) {
            $.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }

        /**
         * @param targetCapacitySpecification Nested argument containing target capacity configurations. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetCapacitySpecification(FleetTargetCapacitySpecificationGetArgs targetCapacitySpecification) {
            return targetCapacitySpecification(Output.of(targetCapacitySpecification));
        }

        /**
         * @param terminateInstances Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder terminateInstances(@Nullable Output<Boolean> terminateInstances) {
            $.terminateInstances = terminateInstances;
            return this;
        }

        /**
         * @param terminateInstances Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder terminateInstances(Boolean terminateInstances) {
            return terminateInstances(Output.of(terminateInstances));
        }

        /**
         * @param terminateInstancesWithExpiration Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder terminateInstancesWithExpiration(@Nullable Output<Boolean> terminateInstancesWithExpiration) {
            $.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        /**
         * @param terminateInstancesWithExpiration Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            return terminateInstancesWithExpiration(Output.of(terminateInstancesWithExpiration));
        }

        /**
         * @param type The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FleetState build() {
            return $;
        }
    }

}
