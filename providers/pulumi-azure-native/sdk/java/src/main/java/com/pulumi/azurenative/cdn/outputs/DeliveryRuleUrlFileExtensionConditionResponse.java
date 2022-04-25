// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.UrlFileExtensionMatchConditionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleUrlFileExtensionConditionResponse {
    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;UrlFileExtension&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    private final UrlFileExtensionMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleUrlFileExtensionConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") UrlFileExtensionMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;UrlFileExtension&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public UrlFileExtensionMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlFileExtensionConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlFileExtensionMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlFileExtensionConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlFileExtensionMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleUrlFileExtensionConditionResponse build() {
            return new DeliveryRuleUrlFileExtensionConditionResponse(name, parameters);
        }
    }
}
