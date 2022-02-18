// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define a match condition.
 * 
 */
public final class FrontDoorMatchConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FrontDoorMatchConditionResponse Empty = new FrontDoorMatchConditionResponse();

    /**
     * List of possible match values.
     * 
     */
    @InputImport(name="matchValue", required=true)
    private final List<String> matchValue;

    public List<String> getMatchValue() {
        return this.matchValue;
    }

    /**
     * Request variable to compare with.
     * 
     */
    @InputImport(name="matchVariable", required=true)
    private final String matchVariable;

    public String getMatchVariable() {
        return this.matchVariable;
    }

    /**
     * Describes if the result of this condition should be negated.
     * 
     */
    @InputImport(name="negateCondition")
    private final @Nullable Boolean negateCondition;

    public Optional<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    /**
     * Comparison type to use for matching with the variable value.
     * 
     */
    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
     * 
     */
    @InputImport(name="selector")
    private final @Nullable String selector;

    public Optional<String> getSelector() {
        return this.selector == null ? Optional.empty() : Optional.ofNullable(this.selector);
    }

    /**
     * List of transforms.
     * 
     */
    @InputImport(name="transforms")
    private final @Nullable List<String> transforms;

    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public FrontDoorMatchConditionResponse(
        List<String> matchValue,
        String matchVariable,
        @Nullable Boolean negateCondition,
        String operator,
        @Nullable String selector,
        @Nullable List<String> transforms) {
        this.matchValue = Objects.requireNonNull(matchValue, "expected parameter 'matchValue' to be non-null");
        this.matchVariable = Objects.requireNonNull(matchVariable, "expected parameter 'matchVariable' to be non-null");
        this.negateCondition = negateCondition;
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private FrontDoorMatchConditionResponse() {
        this.matchValue = List.of();
        this.matchVariable = null;
        this.negateCondition = null;
        this.operator = null;
        this.selector = null;
        this.transforms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorMatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> matchValue;
        private String matchVariable;
        private @Nullable Boolean negateCondition;
        private String operator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorMatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValue = defaults.matchValue;
    	      this.matchVariable = defaults.matchVariable;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder setMatchValue(List<String> matchValue) {
            this.matchValue = Objects.requireNonNull(matchValue);
            return this;
        }

        public Builder setMatchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }

        public FrontDoorMatchConditionResponse build() {
            return new FrontDoorMatchConditionResponse(matchValue, matchVariable, negateCondition, operator, selector, transforms);
        }
    }
}
