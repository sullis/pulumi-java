// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.HeaderActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the request header action for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestHeaderActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestHeaderActionResponse Empty = new DeliveryRuleRequestHeaderActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'ModifyRequestHeader'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final HeaderActionParametersResponse parameters;

    public HeaderActionParametersResponse parameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestHeaderActionResponse(
        String name,
        HeaderActionParametersResponse parameters) {
        this.name = Codegen.stringProp("name").arg(name).require();
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

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(HeaderActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestHeaderActionResponse build() {
            return new DeliveryRuleRequestHeaderActionResponse(name, parameters);
        }
    }
}
