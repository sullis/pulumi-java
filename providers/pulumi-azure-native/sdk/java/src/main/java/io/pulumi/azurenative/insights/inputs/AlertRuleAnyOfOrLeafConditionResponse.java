// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.AlertRuleLeafConditionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met.
 * Each condition can be of one of the following types:
 * __Important__: Each type has its unique subset of properties. Properties from different types CANNOT exist in one condition.
 *    * __Leaf Condition -__ must contain 'field' and either 'equals' or 'containsAny'.
 *        _Please note, 'anyOf' should __not__ be set in a Leaf Condition._
 *   * __AnyOf Condition -__ must contain __only__ 'anyOf' (which is an array of Leaf Conditions).
 *       _Please note, 'field', 'equals' and 'containsAny' should __not__ be set in an AnyOf Condition._
 * 
 */
public final class AlertRuleAnyOfOrLeafConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AlertRuleAnyOfOrLeafConditionResponse Empty = new AlertRuleAnyOfOrLeafConditionResponse();

    /**
     * An Activity Log Alert rule condition that is met when at least one of its member leaf conditions are met.
     * 
     */
    @InputImport(name="anyOf")
      private final @Nullable List<AlertRuleLeafConditionResponse> anyOf;

    public List<AlertRuleLeafConditionResponse> getAnyOf() {
        return this.anyOf == null ? List.of() : this.anyOf;
    }

    /**
     * The value of the event's field will be compared to the values in this array (case-insensitive) to determine if the condition is met.
     * 
     */
    @InputImport(name="containsAny")
      private final @Nullable List<String> containsAny;

    public List<String> getContainsAny() {
        return this.containsAny == null ? List.of() : this.containsAny;
    }

    /**
     * The value of the event's field will be compared to this value (case-insensitive) to determine if the condition is met.
     * 
     */
    @InputImport(name="equals")
      private final @Nullable String equals;

    public Optional<String> getEquals() {
        return this.equals == null ? Optional.empty() : Optional.ofNullable(this.equals);
    }

    /**
     * The name of the Activity Log event's field that this condition will examine.
     * The possible values for this field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName', 'resourceGroup', 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with 'properties'.
     * 
     */
    @InputImport(name="field")
      private final @Nullable String field;

    public Optional<String> getField() {
        return this.field == null ? Optional.empty() : Optional.ofNullable(this.field);
    }

    public AlertRuleAnyOfOrLeafConditionResponse(
        @Nullable List<AlertRuleLeafConditionResponse> anyOf,
        @Nullable List<String> containsAny,
        @Nullable String equals,
        @Nullable String field) {
        this.anyOf = anyOf;
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    private AlertRuleAnyOfOrLeafConditionResponse() {
        this.anyOf = List.of();
        this.containsAny = List.of();
        this.equals = null;
        this.field = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAnyOfOrLeafConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AlertRuleLeafConditionResponse> anyOf;
        private @Nullable List<String> containsAny;
        private @Nullable String equals;
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleAnyOfOrLeafConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anyOf = defaults.anyOf;
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder setAnyOf(@Nullable List<AlertRuleLeafConditionResponse> anyOf) {
            this.anyOf = anyOf;
            return this;
        }

        public Builder setContainsAny(@Nullable List<String> containsAny) {
            this.containsAny = containsAny;
            return this;
        }

        public Builder setEquals(@Nullable String equals) {
            this.equals = equals;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }
        public AlertRuleAnyOfOrLeafConditionResponse build() {
            return new AlertRuleAnyOfOrLeafConditionResponse(anyOf, containsAny, equals, field);
        }
    }
}