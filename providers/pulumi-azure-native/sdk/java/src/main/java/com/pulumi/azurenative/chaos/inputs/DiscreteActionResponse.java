// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.azurenative.chaos.inputs.KeyValuePairResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a discrete action.
 * 
 */
public final class DiscreteActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiscreteActionResponse Empty = new DiscreteActionResponse();

    /**
     * String that represents a Capability URN.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * List of key value pairs.
     * 
     */
    @Import(name="parameters", required=true)
      private final List<KeyValuePairResponse> parameters;

    public List<KeyValuePairResponse> parameters() {
        return this.parameters;
    }

    /**
     * String that represents a selector.
     * 
     */
    @Import(name="selectorId", required=true)
      private final String selectorId;

    public String selectorId() {
        return this.selectorId;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is 'discrete'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DiscreteActionResponse(
        String name,
        List<KeyValuePairResponse> parameters,
        String selectorId,
        String type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.selectorId = Objects.requireNonNull(selectorId, "expected parameter 'selectorId' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private DiscreteActionResponse() {
        this.name = null;
        this.parameters = List.of();
        this.selectorId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscreteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<KeyValuePairResponse> parameters;
        private String selectorId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscreteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.selectorId = defaults.selectorId;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(List<KeyValuePairResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(KeyValuePairResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder selectorId(String selectorId) {
            this.selectorId = Objects.requireNonNull(selectorId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DiscreteActionResponse build() {
            return new DiscreteActionResponse(name, parameters, selectorId, type);
        }
    }
}
