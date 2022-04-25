// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RulesetSubstitutionValue {
    /**
     * @return Value or column name
     * 
     */
    private final String value;
    /**
     * @return Variable name
     * 
     */
    private final String valueReference;

    @CustomType.Constructor
    private RulesetSubstitutionValue(
        @CustomType.Parameter("value") String value,
        @CustomType.Parameter("valueReference") String valueReference) {
        this.value = value;
        this.valueReference = valueReference;
    }

    /**
     * @return Value or column name
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return Variable name
     * 
     */
    public String valueReference() {
        return this.valueReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetSubstitutionValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;
        private String valueReference;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetSubstitutionValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueReference = defaults.valueReference;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder valueReference(String valueReference) {
            this.valueReference = Objects.requireNonNull(valueReference);
            return this;
        }        public RulesetSubstitutionValue build() {
            return new RulesetSubstitutionValue(value, valueReference);
        }
    }
}
