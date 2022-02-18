// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Current resource capacity settings in a specified fleet or location. The location value might refer to a fleet's remote location or its home Region.
 * 
 */
public final class FleetLocationCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLocationCapacityArgs Empty = new FleetLocationCapacityArgs();

    /**
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between the minimum and maximum size limits.
     * 
     */
    @InputImport(name="desiredEC2Instances", required=true)
    private final Input<Integer> desiredEC2Instances;

    public Input<Integer> getDesiredEC2Instances() {
        return this.desiredEC2Instances;
    }

    /**
     * The maximum value that is allowed for the fleet's instance count for a location. When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is active, you can change this value.
     * 
     */
    @InputImport(name="maxSize", required=true)
    private final Input<Integer> maxSize;

    public Input<Integer> getMaxSize() {
        return this.maxSize;
    }

    /**
     * The minimum value allowed for the fleet's instance count for a location. When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is active, you can change this value.
     * 
     */
    @InputImport(name="minSize", required=true)
    private final Input<Integer> minSize;

    public Input<Integer> getMinSize() {
        return this.minSize;
    }

    public FleetLocationCapacityArgs(
        Input<Integer> desiredEC2Instances,
        Input<Integer> maxSize,
        Input<Integer> minSize) {
        this.desiredEC2Instances = Objects.requireNonNull(desiredEC2Instances, "expected parameter 'desiredEC2Instances' to be non-null");
        this.maxSize = Objects.requireNonNull(maxSize, "expected parameter 'maxSize' to be non-null");
        this.minSize = Objects.requireNonNull(minSize, "expected parameter 'minSize' to be non-null");
    }

    private FleetLocationCapacityArgs() {
        this.desiredEC2Instances = Input.empty();
        this.maxSize = Input.empty();
        this.minSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLocationCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> desiredEC2Instances;
        private Input<Integer> maxSize;
        private Input<Integer> minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLocationCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredEC2Instances = defaults.desiredEC2Instances;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder setDesiredEC2Instances(Input<Integer> desiredEC2Instances) {
            this.desiredEC2Instances = Objects.requireNonNull(desiredEC2Instances);
            return this;
        }

        public Builder setDesiredEC2Instances(Integer desiredEC2Instances) {
            this.desiredEC2Instances = Input.of(Objects.requireNonNull(desiredEC2Instances));
            return this;
        }

        public Builder setMaxSize(Input<Integer> maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }

        public Builder setMaxSize(Integer maxSize) {
            this.maxSize = Input.of(Objects.requireNonNull(maxSize));
            return this;
        }

        public Builder setMinSize(Input<Integer> minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }

        public Builder setMinSize(Integer minSize) {
            this.minSize = Input.of(Objects.requireNonNull(minSize));
            return this;
        }

        public FleetLocationCapacityArgs build() {
            return new FleetLocationCapacityArgs(desiredEC2Instances, maxSize, minSize);
        }
    }
}
