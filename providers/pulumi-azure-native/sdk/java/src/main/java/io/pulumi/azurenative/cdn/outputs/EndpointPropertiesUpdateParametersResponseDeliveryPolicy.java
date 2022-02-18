// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.DeliveryRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointPropertiesUpdateParametersResponseDeliveryPolicy {
    /**
     * User-friendly description of the policy.
     * 
     */
    private final @Nullable String description;
    /**
     * A list of the delivery rules.
     * 
     */
    private final List<DeliveryRuleResponse> rules;

    @OutputCustomType.Constructor({"description","rules"})
    private EndpointPropertiesUpdateParametersResponseDeliveryPolicy(
        @Nullable String description,
        List<DeliveryRuleResponse> rules) {
        this.description = description;
        this.rules = Objects.requireNonNull(rules);
    }

    /**
     * User-friendly description of the policy.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A list of the delivery rules.
     * 
     */
    public List<DeliveryRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private List<DeliveryRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.rules = defaults.rules;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setRules(List<DeliveryRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public EndpointPropertiesUpdateParametersResponseDeliveryPolicy build() {
            return new EndpointPropertiesUpdateParametersResponseDeliveryPolicy(description, rules);
        }
    }
}
