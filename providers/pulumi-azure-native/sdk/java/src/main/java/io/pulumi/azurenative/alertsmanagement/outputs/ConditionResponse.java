// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConditionResponse {
    /**
     * operator for a given condition
     * 
     */
    private final @Nullable String operator;
    /**
     * list of values to match for a given condition.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"operator","values"})
    private ConditionResponse(
        @Nullable String operator,
        @Nullable List<String> values) {
        this.operator = operator;
        this.values = values;
    }

    /**
     * operator for a given condition
     * 
    */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * list of values to match for a given condition.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operator;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ConditionResponse build() {
            return new ConditionResponse(operator, values);
        }
    }
}