// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.UrlSigningActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the url signing action for the delivery rule.
 * 
 */
public final class UrlSigningActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlSigningActionResponse Empty = new UrlSigningActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlSigning'.
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
      private final UrlSigningActionParametersResponse parameters;

    public UrlSigningActionParametersResponse parameters() {
        return this.parameters;
    }

    public UrlSigningActionResponse(
        String name,
        UrlSigningActionParametersResponse parameters) {
        this.name = Codegen.stringProp("name").arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private UrlSigningActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlSigningActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlSigningActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public UrlSigningActionResponse build() {
            return new UrlSigningActionResponse(name, parameters);
        }
    }
}
