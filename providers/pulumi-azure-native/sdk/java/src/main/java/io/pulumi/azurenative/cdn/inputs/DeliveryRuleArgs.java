// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheExpirationActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheKeyQueryStringActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCookiesConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleHttpVersionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleIsDeviceConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRulePostArgsConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleQueryStringConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRemoteAddressConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestBodyConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestMethodConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestSchemeConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestUriConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleResponseHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileExtensionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileNameConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlPathConditionArgs;
import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRedirectActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRewriteActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlSigningActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule that specifies a set of actions and conditions
 * 
 */
public final class DeliveryRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleArgs Empty = new DeliveryRuleArgs();

    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    @InputImport(name="actions", required=true)
    private final Input<List<Object>> actions;

    public Input<List<Object>> getActions() {
        return this.actions;
    }

    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<Object>> conditions;

    public Input<List<Object>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * Name of the rule
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    @InputImport(name="order", required=true)
    private final Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order;
    }

    public DeliveryRuleArgs(
        Input<List<Object>> actions,
        @Nullable Input<List<Object>> conditions,
        @Nullable Input<String> name,
        Input<Integer> order) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = conditions;
        this.name = name;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private DeliveryRuleArgs() {
        this.actions = Input.empty();
        this.conditions = Input.empty();
        this.name = Input.empty();
        this.order = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Object>> actions;
        private @Nullable Input<List<Object>> conditions;
        private @Nullable Input<String> name;
        private Input<Integer> order;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
        }

        public Builder setActions(Input<List<Object>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<Object> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setConditions(@Nullable Input<List<Object>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<Object> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrder(Input<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Input.of(Objects.requireNonNull(order));
            return this;
        }

        public DeliveryRuleArgs build() {
            return new DeliveryRuleArgs(actions, conditions, name, order);
        }
    }
}
