// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.inputs.ConditionResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Conditions in alert instance to be matched for a given action rule. Default value is all. Multiple values could be provided with comma separation.
 * 
 */
public final class ConditionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConditionsResponse Empty = new ConditionsResponse();

    /**
     * filter alerts by alert context (payload)
     * 
     */
    @Import(name="alertContext")
    private @Nullable ConditionResponse alertContext;

    /**
     * @return filter alerts by alert context (payload)
     * 
     */
    public Optional<ConditionResponse> alertContext() {
        return Optional.ofNullable(this.alertContext);
    }

    /**
     * filter alerts by alert rule id
     * 
     */
    @Import(name="alertRuleId")
    private @Nullable ConditionResponse alertRuleId;

    /**
     * @return filter alerts by alert rule id
     * 
     */
    public Optional<ConditionResponse> alertRuleId() {
        return Optional.ofNullable(this.alertRuleId);
    }

    /**
     * filter alerts by alert rule description
     * 
     */
    @Import(name="description")
    private @Nullable ConditionResponse description;

    /**
     * @return filter alerts by alert rule description
     * 
     */
    public Optional<ConditionResponse> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * filter alerts by monitor condition
     * 
     */
    @Import(name="monitorCondition")
    private @Nullable ConditionResponse monitorCondition;

    /**
     * @return filter alerts by monitor condition
     * 
     */
    public Optional<ConditionResponse> monitorCondition() {
        return Optional.ofNullable(this.monitorCondition);
    }

    /**
     * filter alerts by monitor service
     * 
     */
    @Import(name="monitorService")
    private @Nullable ConditionResponse monitorService;

    /**
     * @return filter alerts by monitor service
     * 
     */
    public Optional<ConditionResponse> monitorService() {
        return Optional.ofNullable(this.monitorService);
    }

    /**
     * filter alerts by severity
     * 
     */
    @Import(name="severity")
    private @Nullable ConditionResponse severity;

    /**
     * @return filter alerts by severity
     * 
     */
    public Optional<ConditionResponse> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * filter alerts by target resource type
     * 
     */
    @Import(name="targetResourceType")
    private @Nullable ConditionResponse targetResourceType;

    /**
     * @return filter alerts by target resource type
     * 
     */
    public Optional<ConditionResponse> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    private ConditionsResponse() {}

    private ConditionsResponse(ConditionsResponse $) {
        this.alertContext = $.alertContext;
        this.alertRuleId = $.alertRuleId;
        this.description = $.description;
        this.monitorCondition = $.monitorCondition;
        this.monitorService = $.monitorService;
        this.severity = $.severity;
        this.targetResourceType = $.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionsResponse $;

        public Builder() {
            $ = new ConditionsResponse();
        }

        public Builder(ConditionsResponse defaults) {
            $ = new ConditionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContext filter alerts by alert context (payload)
         * 
         * @return builder
         * 
         */
        public Builder alertContext(@Nullable ConditionResponse alertContext) {
            $.alertContext = alertContext;
            return this;
        }

        /**
         * @param alertRuleId filter alerts by alert rule id
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(@Nullable ConditionResponse alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param description filter alerts by alert rule description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable ConditionResponse description) {
            $.description = description;
            return this;
        }

        /**
         * @param monitorCondition filter alerts by monitor condition
         * 
         * @return builder
         * 
         */
        public Builder monitorCondition(@Nullable ConditionResponse monitorCondition) {
            $.monitorCondition = monitorCondition;
            return this;
        }

        /**
         * @param monitorService filter alerts by monitor service
         * 
         * @return builder
         * 
         */
        public Builder monitorService(@Nullable ConditionResponse monitorService) {
            $.monitorService = monitorService;
            return this;
        }

        /**
         * @param severity filter alerts by severity
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable ConditionResponse severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param targetResourceType filter alerts by target resource type
         * 
         * @return builder
         * 
         */
        public Builder targetResourceType(@Nullable ConditionResponse targetResourceType) {
            $.targetResourceType = targetResourceType;
            return this;
        }

        public ConditionsResponse build() {
            return $;
        }
    }

}
