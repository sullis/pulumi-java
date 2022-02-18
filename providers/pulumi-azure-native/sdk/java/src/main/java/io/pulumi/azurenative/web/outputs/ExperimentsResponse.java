// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.RampUpRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExperimentsResponse {
    /**
     * List of ramp-up rules.
     * 
     */
    private final @Nullable List<RampUpRuleResponse> rampUpRules;

    @OutputCustomType.Constructor({"rampUpRules"})
    private ExperimentsResponse(@Nullable List<RampUpRuleResponse> rampUpRules) {
        this.rampUpRules = rampUpRules;
    }

    /**
     * List of ramp-up rules.
     * 
     */
    public List<RampUpRuleResponse> getRampUpRules() {
        return this.rampUpRules == null ? List.of() : this.rampUpRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RampUpRuleResponse> rampUpRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rampUpRules = defaults.rampUpRules;
        }

        public Builder setRampUpRules(@Nullable List<RampUpRuleResponse> rampUpRules) {
            this.rampUpRules = rampUpRules;
            return this;
        }

        public ExperimentsResponse build() {
            return new ExperimentsResponse(rampUpRules);
        }
    }
}
