// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationTriggeringRuleResponse {
    /**
     * @return The expected value.
     * 
     */
    private final @Nullable String expectedValue;
    /**
     * @return A valid comparer operator to use. A case-insensitive comparison will be applied for String PropertyType.
     * 
     */
    private final @Nullable String operator;
    /**
     * @return The JPath of the entity model property that should be checked.
     * 
     */
    private final @Nullable String propertyJPath;
    /**
     * @return The data type of the compared operands (string, integer, floating point number or a boolean [true/false]]
     * 
     */
    private final @Nullable String propertyType;

    @CustomType.Constructor
    private AutomationTriggeringRuleResponse(
        @CustomType.Parameter("expectedValue") @Nullable String expectedValue,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("propertyJPath") @Nullable String propertyJPath,
        @CustomType.Parameter("propertyType") @Nullable String propertyType) {
        this.expectedValue = expectedValue;
        this.operator = operator;
        this.propertyJPath = propertyJPath;
        this.propertyType = propertyType;
    }

    /**
     * @return The expected value.
     * 
     */
    public Optional<String> expectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }
    /**
     * @return A valid comparer operator to use. A case-insensitive comparison will be applied for String PropertyType.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return The JPath of the entity model property that should be checked.
     * 
     */
    public Optional<String> propertyJPath() {
        return Optional.ofNullable(this.propertyJPath);
    }
    /**
     * @return The data type of the compared operands (string, integer, floating point number or a boolean [true/false]]
     * 
     */
    public Optional<String> propertyType() {
        return Optional.ofNullable(this.propertyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationTriggeringRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expectedValue;
        private @Nullable String operator;
        private @Nullable String propertyJPath;
        private @Nullable String propertyType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationTriggeringRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.operator = defaults.operator;
    	      this.propertyJPath = defaults.propertyJPath;
    	      this.propertyType = defaults.propertyType;
        }

        public Builder expectedValue(@Nullable String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder propertyJPath(@Nullable String propertyJPath) {
            this.propertyJPath = propertyJPath;
            return this;
        }
        public Builder propertyType(@Nullable String propertyType) {
            this.propertyType = propertyType;
            return this;
        }        public AutomationTriggeringRuleResponse build() {
            return new AutomationTriggeringRuleResponse(expectedValue, operator, propertyJPath, propertyType);
        }
    }
}
