// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlFileExtensionMatchConditionParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the UrlFileExtension condition for the delivery rule.
 * 
 */
public final class DeliveryRuleUrlFileExtensionConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleUrlFileExtensionConditionResponse Empty = new DeliveryRuleUrlFileExtensionConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlFileExtension'.
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
    private final UrlFileExtensionMatchConditionParametersResponse parameters;

    public UrlFileExtensionMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleUrlFileExtensionConditionResponse(
        String name,
        UrlFileExtensionMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleUrlFileExtensionConditionResponse() {
        this.name = null;
        this.parameters = null;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlFileExtensionMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleUrlFileExtensionConditionResponse build() {
            return new DeliveryRuleUrlFileExtensionConditionResponse(name, parameters);
        }
    }
}
