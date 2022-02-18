// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for RequestScheme match conditions
 * 
 */
public final class RequestSchemeMatchConditionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestSchemeMatchConditionParametersArgs Empty = new RequestSchemeMatchConditionParametersArgs();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @InputImport(name="matchValues")
    private final @Nullable Input<List<String>> matchValues;

    public Input<List<String>> getMatchValues() {
        return this.matchValues == null ? Input.empty() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @InputImport(name="negateCondition")
    private final @Nullable Input<Boolean> negateCondition;

    public Input<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Input.empty() : this.negateCondition;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @InputImport(name="operator", required=true)
    private final Input<String> operator;

    public Input<String> getOperator() {
        return this.operator;
    }

    public RequestSchemeMatchConditionParametersArgs(
        @Nullable Input<List<String>> matchValues,
        @Nullable Input<Boolean> negateCondition,
        Input<String> odataType,
        Input<String> operator) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
    }

    private RequestSchemeMatchConditionParametersArgs() {
        this.matchValues = Input.empty();
        this.negateCondition = Input.empty();
        this.odataType = Input.empty();
        this.operator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestSchemeMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> matchValues;
        private @Nullable Input<Boolean> negateCondition;
        private Input<String> odataType;
        private Input<String> operator;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestSchemeMatchConditionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
        }

        public Builder setMatchValues(@Nullable Input<List<String>> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder setMatchValues(@Nullable List<String> matchValues) {
            this.matchValues = Input.ofNullable(matchValues);
            return this;
        }

        public Builder setNegateCondition(@Nullable Input<Boolean> negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = Input.ofNullable(negateCondition);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOperator(Input<String> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public RequestSchemeMatchConditionParametersArgs build() {
            return new RequestSchemeMatchConditionParametersArgs(matchValues, negateCondition, odataType, operator);
        }
    }
}
