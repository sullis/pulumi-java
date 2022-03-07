// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedScalingPolicyComputeLimit {
    /**
     * The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
     */
    private final Integer maximumCapacityUnits;
    /**
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * 
     */
    private final @Nullable Integer maximumCoreCapacityUnits;
    /**
     * The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances.
     * 
     */
    private final @Nullable Integer maximumOndemandCapacityUnits;
    /**
     * The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
     */
    private final Integer minimumCapacityUnits;
    /**
     * The unit type used for specifying a managed scaling policy. Valid Values: `InstanceFleetUnits` | `Instances` | `VCPU`
     * 
     */
    private final String unitType;

    @OutputCustomType.Constructor({"maximumCapacityUnits","maximumCoreCapacityUnits","maximumOndemandCapacityUnits","minimumCapacityUnits","unitType"})
    private ManagedScalingPolicyComputeLimit(
        Integer maximumCapacityUnits,
        @Nullable Integer maximumCoreCapacityUnits,
        @Nullable Integer maximumOndemandCapacityUnits,
        Integer minimumCapacityUnits,
        String unitType) {
        this.maximumCapacityUnits = Objects.requireNonNull(maximumCapacityUnits);
        this.maximumCoreCapacityUnits = maximumCoreCapacityUnits;
        this.maximumOndemandCapacityUnits = maximumOndemandCapacityUnits;
        this.minimumCapacityUnits = Objects.requireNonNull(minimumCapacityUnits);
        this.unitType = Objects.requireNonNull(unitType);
    }

    /**
     * The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
    */
    public Integer getMaximumCapacityUnits() {
        return this.maximumCapacityUnits;
    }
    /**
     * The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
     * 
    */
    public Optional<Integer> getMaximumCoreCapacityUnits() {
        return Optional.ofNullable(this.maximumCoreCapacityUnits);
    }
    /**
     * The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances.
     * 
    */
    public Optional<Integer> getMaximumOndemandCapacityUnits() {
        return Optional.ofNullable(this.maximumOndemandCapacityUnits);
    }
    /**
     * The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
     * 
    */
    public Integer getMinimumCapacityUnits() {
        return this.minimumCapacityUnits;
    }
    /**
     * The unit type used for specifying a managed scaling policy. Valid Values: `InstanceFleetUnits` | `Instances` | `VCPU`
     * 
    */
    public String getUnitType() {
        return this.unitType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedScalingPolicyComputeLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maximumCapacityUnits;
        private @Nullable Integer maximumCoreCapacityUnits;
        private @Nullable Integer maximumOndemandCapacityUnits;
        private Integer minimumCapacityUnits;
        private String unitType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedScalingPolicyComputeLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCapacityUnits = defaults.maximumCapacityUnits;
    	      this.maximumCoreCapacityUnits = defaults.maximumCoreCapacityUnits;
    	      this.maximumOndemandCapacityUnits = defaults.maximumOndemandCapacityUnits;
    	      this.minimumCapacityUnits = defaults.minimumCapacityUnits;
    	      this.unitType = defaults.unitType;
        }

        public Builder setMaximumCapacityUnits(Integer maximumCapacityUnits) {
            this.maximumCapacityUnits = Objects.requireNonNull(maximumCapacityUnits);
            return this;
        }

        public Builder setMaximumCoreCapacityUnits(@Nullable Integer maximumCoreCapacityUnits) {
            this.maximumCoreCapacityUnits = maximumCoreCapacityUnits;
            return this;
        }

        public Builder setMaximumOndemandCapacityUnits(@Nullable Integer maximumOndemandCapacityUnits) {
            this.maximumOndemandCapacityUnits = maximumOndemandCapacityUnits;
            return this;
        }

        public Builder setMinimumCapacityUnits(Integer minimumCapacityUnits) {
            this.minimumCapacityUnits = Objects.requireNonNull(minimumCapacityUnits);
            return this;
        }

        public Builder setUnitType(String unitType) {
            this.unitType = Objects.requireNonNull(unitType);
            return this;
        }
        public ManagedScalingPolicyComputeLimit build() {
            return new ManagedScalingPolicyComputeLimit(maximumCapacityUnits, maximumCoreCapacityUnits, maximumOndemandCapacityUnits, minimumCapacityUnits, unitType);
        }
    }
}