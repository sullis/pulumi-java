// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LongTermSchedulePolicyResponse {
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermSchedulePolicy'.
     * 
     */
    private final String schedulePolicyType;

    @OutputCustomType.Constructor({"schedulePolicyType"})
    private LongTermSchedulePolicyResponse(String schedulePolicyType) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermSchedulePolicy'.
     * 
    */
    public String getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }
        public LongTermSchedulePolicyResponse build() {
            return new LongTermSchedulePolicyResponse(schedulePolicyType);
        }
    }
}