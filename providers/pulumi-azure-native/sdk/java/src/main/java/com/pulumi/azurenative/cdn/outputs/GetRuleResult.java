// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheExpirationActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheKeyQueryStringActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCookiesConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleHttpVersionConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleIsDeviceConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRulePostArgsConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleQueryStringConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRemoteAddressConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestBodyConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestMethodConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestSchemeConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestUriConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleResponseHeaderActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileExtensionConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileNameConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlPathConditionResponse;
import com.pulumi.azurenative.cdn.outputs.OriginGroupOverrideActionResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.azurenative.cdn.outputs.UrlRedirectActionResponse;
import com.pulumi.azurenative.cdn.outputs.UrlRewriteActionResponse;
import com.pulumi.azurenative.cdn.outputs.UrlSigningActionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleResult {
    /**
     * @return A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    private final List<Object> actions;
    /**
     * @return A list of conditions that must be matched for the actions to be executed
     * 
     */
    private final @Nullable List<Object> conditions;
    private final String deploymentStatus;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    private final @Nullable String matchProcessingBehavior;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    private final Integer order;
    /**
     * @return Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * @return Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRuleResult(
        @CustomType.Parameter("actions") List<Object> actions,
        @CustomType.Parameter("conditions") @Nullable List<Object> conditions,
        @CustomType.Parameter("deploymentStatus") String deploymentStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("matchProcessingBehavior") @Nullable String matchProcessingBehavior,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("order") Integer order,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.actions = actions;
        this.conditions = conditions;
        this.deploymentStatus = deploymentStatus;
        this.id = id;
        this.matchProcessingBehavior = matchProcessingBehavior;
        this.name = name;
        this.order = order;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    public List<Object> actions() {
        return this.actions;
    }
    /**
     * @return A list of conditions that must be matched for the actions to be executed
     * 
     */
    public List<Object> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public String deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    public Optional<String> matchProcessingBehavior() {
        return Optional.ofNullable(this.matchProcessingBehavior);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return Provisioning status
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Read only system data
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> actions;
        private @Nullable List<Object> conditions;
        private String deploymentStatus;
        private String id;
        private @Nullable String matchProcessingBehavior;
        private String name;
        private Integer order;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.id = defaults.id;
    	      this.matchProcessingBehavior = defaults.matchProcessingBehavior;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder actions(List<Object> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(Object... actions) {
            return actions(List.of(actions));
        }
        public Builder conditions(@Nullable List<Object> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(Object... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder deploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder matchProcessingBehavior(@Nullable String matchProcessingBehavior) {
            this.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRuleResult build() {
            return new GetRuleResult(actions, conditions, deploymentStatus, id, matchProcessingBehavior, name, order, provisioningState, systemData, type);
        }
    }
}
