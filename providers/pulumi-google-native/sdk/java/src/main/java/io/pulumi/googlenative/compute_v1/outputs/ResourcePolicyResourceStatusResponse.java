// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse;
import java.util.Objects;

@CustomType
public final class ResourcePolicyResourceStatusResponse {
    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
     */
    private final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

    @CustomType.Constructor
    private ResourcePolicyResourceStatusResponse(@CustomType.Parameter("instanceSchedulePolicy") ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
        this.instanceSchedulePolicy = instanceSchedulePolicy;
    }

    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
    */
    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
        }

        public Builder instanceSchedulePolicy(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }        public ResourcePolicyResourceStatusResponse build() {
            return new ResourcePolicyResourceStatusResponse(instanceSchedulePolicy);
        }
    }
}
