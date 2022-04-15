// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetInstanceTypeConfigArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetLaunchSpecificationsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetArgs Empty = new ClusterCoreInstanceFleetArgs();

    /**
     * ID of the cluster.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Configuration block for instance fleet.
     * 
     */
    @Import(name="instanceTypeConfigs")
      private final @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;

    public Output<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? Codegen.empty() : this.instanceTypeConfigs;
    }

    /**
     * Configuration block for launch specification.
     * 
     */
    @Import(name="launchSpecifications")
      private final @Nullable Output<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications;

    public Output<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications() {
        return this.launchSpecifications == null ? Codegen.empty() : this.launchSpecifications;
    }

    /**
     * Name of the step.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="provisionedOnDemandCapacity")
      private final @Nullable Output<Integer> provisionedOnDemandCapacity;

    public Output<Integer> provisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity == null ? Codegen.empty() : this.provisionedOnDemandCapacity;
    }

    @Import(name="provisionedSpotCapacity")
      private final @Nullable Output<Integer> provisionedSpotCapacity;

    public Output<Integer> provisionedSpotCapacity() {
        return this.provisionedSpotCapacity == null ? Codegen.empty() : this.provisionedSpotCapacity;
    }

    /**
     * Target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @Import(name="targetOnDemandCapacity")
      private final @Nullable Output<Integer> targetOnDemandCapacity;

    public Output<Integer> targetOnDemandCapacity() {
        return this.targetOnDemandCapacity == null ? Codegen.empty() : this.targetOnDemandCapacity;
    }

    /**
     * Target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @Import(name="targetSpotCapacity")
      private final @Nullable Output<Integer> targetSpotCapacity;

    public Output<Integer> targetSpotCapacity() {
        return this.targetSpotCapacity == null ? Codegen.empty() : this.targetSpotCapacity;
    }

    public ClusterCoreInstanceFleetArgs(
        @Nullable Output<String> id,
        @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs,
        @Nullable Output<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications,
        @Nullable Output<String> name,
        @Nullable Output<Integer> provisionedOnDemandCapacity,
        @Nullable Output<Integer> provisionedSpotCapacity,
        @Nullable Output<Integer> targetOnDemandCapacity,
        @Nullable Output<Integer> targetSpotCapacity) {
        this.id = id;
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    private ClusterCoreInstanceFleetArgs() {
        this.id = Codegen.empty();
        this.instanceTypeConfigs = Codegen.empty();
        this.launchSpecifications = Codegen.empty();
        this.name = Codegen.empty();
        this.provisionedOnDemandCapacity = Codegen.empty();
        this.provisionedSpotCapacity = Codegen.empty();
        this.targetOnDemandCapacity = Codegen.empty();
        this.targetSpotCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs;
        private @Nullable Output<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> provisionedOnDemandCapacity;
        private @Nullable Output<Integer> provisionedSpotCapacity;
        private @Nullable Output<Integer> targetOnDemandCapacity;
        private @Nullable Output<Integer> targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.provisionedOnDemandCapacity = defaults.provisionedOnDemandCapacity;
    	      this.provisionedSpotCapacity = defaults.provisionedSpotCapacity;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder instanceTypeConfigs(@Nullable Output<List<ClusterCoreInstanceFleetInstanceTypeConfigArgs>> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }
        public Builder instanceTypeConfigs(@Nullable List<ClusterCoreInstanceFleetInstanceTypeConfigArgs> instanceTypeConfigs) {
            this.instanceTypeConfigs = Codegen.ofNullable(instanceTypeConfigs);
            return this;
        }
        public Builder instanceTypeConfigs(ClusterCoreInstanceFleetInstanceTypeConfigArgs... instanceTypeConfigs) {
            return instanceTypeConfigs(List.of(instanceTypeConfigs));
        }
        public Builder launchSpecifications(@Nullable Output<ClusterCoreInstanceFleetLaunchSpecificationsArgs> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }
        public Builder launchSpecifications(@Nullable ClusterCoreInstanceFleetLaunchSpecificationsArgs launchSpecifications) {
            this.launchSpecifications = Codegen.ofNullable(launchSpecifications);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder provisionedOnDemandCapacity(@Nullable Output<Integer> provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
            return this;
        }
        public Builder provisionedOnDemandCapacity(@Nullable Integer provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = Codegen.ofNullable(provisionedOnDemandCapacity);
            return this;
        }
        public Builder provisionedSpotCapacity(@Nullable Output<Integer> provisionedSpotCapacity) {
            this.provisionedSpotCapacity = provisionedSpotCapacity;
            return this;
        }
        public Builder provisionedSpotCapacity(@Nullable Integer provisionedSpotCapacity) {
            this.provisionedSpotCapacity = Codegen.ofNullable(provisionedSpotCapacity);
            return this;
        }
        public Builder targetOnDemandCapacity(@Nullable Output<Integer> targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }
        public Builder targetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = Codegen.ofNullable(targetOnDemandCapacity);
            return this;
        }
        public Builder targetSpotCapacity(@Nullable Output<Integer> targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }
        public Builder targetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = Codegen.ofNullable(targetSpotCapacity);
            return this;
        }        public ClusterCoreInstanceFleetArgs build() {
            return new ClusterCoreInstanceFleetArgs(id, instanceTypeConfigs, launchSpecifications, name, provisionedOnDemandCapacity, provisionedSpotCapacity, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}
