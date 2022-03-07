// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheExpirationActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheKeyQueryStringActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleCookiesConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleHttpVersionConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleIsDeviceConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRulePostArgsConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleQueryStringConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRemoteAddressConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestBodyConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestMethodConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestSchemeConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestUriConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleResponseHeaderActionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileExtensionConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileNameConditionResponse;
import io.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlPathConditionResponse;
import io.pulumi.azurenative.cdn.outputs.OriginGroupOverrideActionResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlRedirectActionResponse;
import io.pulumi.azurenative.cdn.outputs.UrlRewriteActionResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRuleResult {
    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    private final List<Object> actions;
    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    private final @Nullable List<Object> conditions;
    private final String deploymentStatus;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    private final @Nullable String matchProcessingBehavior;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    private final Integer order;
    /**
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"actions","conditions","deploymentStatus","id","matchProcessingBehavior","name","order","provisioningState","systemData","type"})
    private GetRuleResult(
        List<Object> actions,
        @Nullable List<Object> conditions,
        String deploymentStatus,
        String id,
        @Nullable String matchProcessingBehavior,
        String name,
        Integer order,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.actions = Objects.requireNonNull(actions);
        this.conditions = conditions;
        this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
        this.id = Objects.requireNonNull(id);
        this.matchProcessingBehavior = matchProcessingBehavior;
        this.name = Objects.requireNonNull(name);
        this.order = Objects.requireNonNull(order);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
    */
    public List<Object> getActions() {
        return this.actions;
    }
    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
    */
    public List<Object> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
    */
    public Optional<String> getMatchProcessingBehavior() {
        return Optional.ofNullable(this.matchProcessingBehavior);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
    */
    public Integer getOrder() {
        return this.order;
    }
    /**
     * Provisioning status
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
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

        public Builder setActions(List<Object> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setConditions(@Nullable List<Object> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMatchProcessingBehavior(@Nullable String matchProcessingBehavior) {
            this.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRuleResult build() {
            return new GetRuleResult(actions, conditions, deploymentStatus, id, matchProcessingBehavior, name, order, provisioningState, systemData, type);
        }
    }
}