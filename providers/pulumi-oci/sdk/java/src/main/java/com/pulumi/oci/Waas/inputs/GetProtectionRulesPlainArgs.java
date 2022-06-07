// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Waas.inputs.GetProtectionRulesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProtectionRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProtectionRulesPlainArgs Empty = new GetProtectionRulesPlainArgs();

    /**
     * Filter rules using a list of actions.
     * 
     */
    @Import(name="actions")
    private @Nullable List<String> actions;

    /**
     * @return Filter rules using a list of actions.
     * 
     */
    public Optional<List<String>> actions() {
        return Optional.ofNullable(this.actions);
    }

    @Import(name="filters")
    private @Nullable List<GetProtectionRulesFilter> filters;

    public Optional<List<GetProtectionRulesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Filter rules using a list of ModSecurity rule IDs.
     * 
     */
    @Import(name="modSecurityRuleIds")
    private @Nullable List<String> modSecurityRuleIds;

    /**
     * @return Filter rules using a list of ModSecurity rule IDs.
     * 
     */
    public Optional<List<String>> modSecurityRuleIds() {
        return Optional.ofNullable(this.modSecurityRuleIds);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     * 
     */
    @Import(name="waasPolicyId", required=true)
    private String waasPolicyId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     * 
     */
    public String waasPolicyId() {
        return this.waasPolicyId;
    }

    private GetProtectionRulesPlainArgs() {}

    private GetProtectionRulesPlainArgs(GetProtectionRulesPlainArgs $) {
        this.actions = $.actions;
        this.filters = $.filters;
        this.modSecurityRuleIds = $.modSecurityRuleIds;
        this.waasPolicyId = $.waasPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProtectionRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProtectionRulesPlainArgs $;

        public Builder() {
            $ = new GetProtectionRulesPlainArgs();
        }

        public Builder(GetProtectionRulesPlainArgs defaults) {
            $ = new GetProtectionRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Filter rules using a list of actions.
         * 
         * @return builder
         * 
         */
        public Builder actions(@Nullable List<String> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Filter rules using a list of actions.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder filters(@Nullable List<GetProtectionRulesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetProtectionRulesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param modSecurityRuleIds Filter rules using a list of ModSecurity rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder modSecurityRuleIds(@Nullable List<String> modSecurityRuleIds) {
            $.modSecurityRuleIds = modSecurityRuleIds;
            return this;
        }

        /**
         * @param modSecurityRuleIds Filter rules using a list of ModSecurity rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder modSecurityRuleIds(String... modSecurityRuleIds) {
            return modSecurityRuleIds(List.of(modSecurityRuleIds));
        }

        /**
         * @param waasPolicyId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         * 
         * @return builder
         * 
         */
        public Builder waasPolicyId(String waasPolicyId) {
            $.waasPolicyId = waasPolicyId;
            return this;
        }

        public GetProtectionRulesPlainArgs build() {
            $.waasPolicyId = Objects.requireNonNull($.waasPolicyId, "expected parameter 'waasPolicyId' to be non-null");
            return $;
        }
    }

}
