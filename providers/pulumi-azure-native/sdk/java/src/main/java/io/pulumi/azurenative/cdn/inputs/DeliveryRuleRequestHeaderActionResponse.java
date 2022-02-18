// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.HeaderActionParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the request header action for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestHeaderActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestHeaderActionResponse Empty = new DeliveryRuleRequestHeaderActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'ModifyRequestHeader'.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final HeaderActionParametersResponse parameters;

    public HeaderActionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestHeaderActionResponse(
        String name,
        HeaderActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestHeaderActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private HeaderActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(HeaderActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleRequestHeaderActionResponse build() {
            return new DeliveryRuleRequestHeaderActionResponse(name, parameters);
        }
    }
}
