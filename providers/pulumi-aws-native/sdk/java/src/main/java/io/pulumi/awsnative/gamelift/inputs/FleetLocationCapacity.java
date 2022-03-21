// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Current resource capacity settings in a specified fleet or location. The location value might refer to a fleet's remote location or its home Region.
 * 
 */
public final class FleetLocationCapacity extends io.pulumi.resources.InvokeArgs {

    public static final FleetLocationCapacity Empty = new FleetLocationCapacity();

    /**
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between the minimum and maximum size limits.
     * 
     */
    @Import(name="desiredEC2Instances", required=true)
      private final Integer desiredEC2Instances;

    public Integer getDesiredEC2Instances() {
        return this.desiredEC2Instances;
    }

    /**
     * The maximum value that is allowed for the fleet's instance count for a location. When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is active, you can change this value.
     * 
     */
    @Import(name="maxSize", required=true)
      private final Integer maxSize;

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * The minimum value allowed for the fleet's instance count for a location. When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is active, you can change this value.
     * 
     */
    @Import(name="minSize", required=true)
      private final Integer minSize;

    public Integer getMinSize() {
        return this.minSize;
    }

    public FleetLocationCapacity(
        Integer desiredEC2Instances,
        Integer maxSize,
        Integer minSize) {
        this.desiredEC2Instances = Objects.requireNonNull(desiredEC2Instances, "expected parameter 'desiredEC2Instances' to be non-null");
        this.maxSize = Objects.requireNonNull(maxSize, "expected parameter 'maxSize' to be non-null");
        this.minSize = Objects.requireNonNull(minSize, "expected parameter 'minSize' to be non-null");
    }

    private FleetLocationCapacity() {
        this.desiredEC2Instances = null;
        this.maxSize = null;
        this.minSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLocationCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer desiredEC2Instances;
        private Integer maxSize;
        private Integer minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLocationCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredEC2Instances = defaults.desiredEC2Instances;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder desiredEC2Instances(Integer desiredEC2Instances) {
            this.desiredEC2Instances = Objects.requireNonNull(desiredEC2Instances);
            return this;
        }
        public Builder maxSize(Integer maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        public Builder minSize(Integer minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }        public FleetLocationCapacity build() {
            return new FleetLocationCapacity(desiredEC2Instances, maxSize, minSize);
        }
    }
}
