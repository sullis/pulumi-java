// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CookiesMatchConditionParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleCookiesConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final CookiesMatchConditionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleCookiesConditionResponse(
        String name,
        CookiesMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
     */
    public CookiesMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCookiesConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CookiesMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCookiesConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(CookiesMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleCookiesConditionResponse build() {
            return new DeliveryRuleCookiesConditionResponse(name, parameters);
        }
    }
}
