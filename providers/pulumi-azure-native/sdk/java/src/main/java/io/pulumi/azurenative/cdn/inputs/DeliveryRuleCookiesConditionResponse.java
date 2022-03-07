// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.CookiesMatchConditionParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the Cookies condition for the delivery rule.
 * 
 */
public final class DeliveryRuleCookiesConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleCookiesConditionResponse Empty = new DeliveryRuleCookiesConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'Cookies'.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final CookiesMatchConditionParametersResponse parameters;

    public CookiesMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleCookiesConditionResponse(
        String name,
        CookiesMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleCookiesConditionResponse() {
        this.name = null;
        this.parameters = null;
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