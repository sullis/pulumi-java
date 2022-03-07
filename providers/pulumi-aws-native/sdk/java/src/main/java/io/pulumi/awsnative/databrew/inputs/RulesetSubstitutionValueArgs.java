// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate expression's substitution variable names with their values
 * 
 */
public final class RulesetSubstitutionValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetSubstitutionValueArgs Empty = new RulesetSubstitutionValueArgs();

    /**
     * Value or column name
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    /**
     * Variable name
     * 
     */
    @InputImport(name="valueReference", required=true)
      private final Input<String> valueReference;

    public Input<String> getValueReference() {
        return this.valueReference;
    }

    public RulesetSubstitutionValueArgs(
        Input<String> value,
        Input<String> valueReference) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.valueReference = Objects.requireNonNull(valueReference, "expected parameter 'valueReference' to be non-null");
    }

    private RulesetSubstitutionValueArgs() {
        this.value = Input.empty();
        this.valueReference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetSubstitutionValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> value;
        private Input<String> valueReference;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetSubstitutionValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueReference = defaults.valueReference;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public Builder setValueReference(Input<String> valueReference) {
            this.valueReference = Objects.requireNonNull(valueReference);
            return this;
        }

        public Builder setValueReference(String valueReference) {
            this.valueReference = Input.of(Objects.requireNonNull(valueReference));
            return this;
        }
        public RulesetSubstitutionValueArgs build() {
            return new RulesetSubstitutionValueArgs(value, valueReference);
        }
    }
}