// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceFleetLaunchSpecificationsOnDemandSpecification {
    /**
     * @return Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    private final String allocationStrategy;

    @CustomType.Constructor
    private InstanceFleetLaunchSpecificationsOnDemandSpecification(@CustomType.Parameter("allocationStrategy") String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * @return Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    public String allocationStrategy() {
        return this.allocationStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsOnDemandSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecificationsOnDemandSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }        public InstanceFleetLaunchSpecificationsOnDemandSpecification build() {
            return new InstanceFleetLaunchSpecificationsOnDemandSpecification(allocationStrategy);
        }
    }
}
