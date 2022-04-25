// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ParameterGroupParameter {
    /**
     * @return The name of the ElastiCache parameter.
     * 
     */
    private final String name;
    /**
     * @return The value of the ElastiCache parameter.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ParameterGroupParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The name of the ElastiCache parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the ElastiCache parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ParameterGroupParameter build() {
            return new ParameterGroupParameter(name, value);
        }
    }
}
