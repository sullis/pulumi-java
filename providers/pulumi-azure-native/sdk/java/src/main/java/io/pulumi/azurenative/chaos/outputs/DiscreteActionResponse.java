// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.azurenative.chaos.outputs.KeyValuePairResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DiscreteActionResponse {
    /**
     * String that represents a Capability URN.
     * 
     */
    private final String name;
    /**
     * List of key value pairs.
     * 
     */
    private final List<KeyValuePairResponse> parameters;
    /**
     * String that represents a selector.
     * 
     */
    private final String selectorId;
    /**
     * Enum that discriminates between action models.
     * Expected value is 'discrete'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","parameters","selectorId","type"})
    private DiscreteActionResponse(
        String name,
        List<KeyValuePairResponse> parameters,
        String selectorId,
        String type) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
        this.selectorId = Objects.requireNonNull(selectorId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * String that represents a Capability URN.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of key value pairs.
     * 
     */
    public List<KeyValuePairResponse> getParameters() {
        return this.parameters;
    }
    /**
     * String that represents a selector.
     * 
     */
    public String getSelectorId() {
        return this.selectorId;
    }
    /**
     * Enum that discriminates between action models.
     * Expected value is 'discrete'.
     * 
     */
    public String getType() {
        return this.type;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(List<KeyValuePairResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setSelectorId(String selectorId) {
            this.selectorId = Objects.requireNonNull(selectorId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public DiscreteActionResponse build() {
            return new DiscreteActionResponse(name, parameters, selectorId, type);
        }
    }
}
