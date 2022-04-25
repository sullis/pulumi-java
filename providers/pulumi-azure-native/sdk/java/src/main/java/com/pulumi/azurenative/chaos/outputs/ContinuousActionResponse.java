// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.outputs;

import com.pulumi.azurenative.chaos.outputs.KeyValuePairResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContinuousActionResponse {
    /**
     * @return ISO8601 formatted string that represents a duration.
     * 
     */
    private final String duration;
    /**
     * @return String that represents a Capability URN.
     * 
     */
    private final String name;
    /**
     * @return List of key value pairs.
     * 
     */
    private final List<KeyValuePairResponse> parameters;
    /**
     * @return String that represents a selector.
     * 
     */
    private final String selectorId;
    /**
     * @return Enum that discriminates between action models.
     * Expected value is &#39;continuous&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ContinuousActionResponse(
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") List<KeyValuePairResponse> parameters,
        @CustomType.Parameter("selectorId") String selectorId,
        @CustomType.Parameter("type") String type) {
        this.duration = duration;
        this.name = name;
        this.parameters = parameters;
        this.selectorId = selectorId;
        this.type = type;
    }

    /**
     * @return ISO8601 formatted string that represents a duration.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return String that represents a Capability URN.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of key value pairs.
     * 
     */
    public List<KeyValuePairResponse> parameters() {
        return this.parameters;
    }
    /**
     * @return String that represents a selector.
     * 
     */
    public String selectorId() {
        return this.selectorId;
    }
    /**
     * @return Enum that discriminates between action models.
     * Expected value is &#39;continuous&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContinuousActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String name;
        private List<KeyValuePairResponse> parameters;
        private String selectorId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContinuousActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.selectorId = defaults.selectorId;
    	      this.type = defaults.type;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
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
        }        public ContinuousActionResponse build() {
            return new ContinuousActionResponse(duration, name, parameters, selectorId, type);
        }
    }
}
