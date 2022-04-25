// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs();

    /**
     * The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
     */
    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    /**
     * @return The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
     */
    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
     */
    @Import(name="toPort")
    private @Nullable Output<Integer> toPort;

    /**
     * @return The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
     */
    public Optional<Output<Integer>> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs() {}

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs $) {
        this.fromPort = $.fromPort;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromPort The lower limit of the port range. This must be less than or equal to the `to_port`.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        /**
         * @param fromPort The lower limit of the port range. This must be less than or equal to the `to_port`.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        /**
         * @param toPort The upper limit of the port range. This must be greater than or equal to the `from_port`.
         * 
         * @return builder
         * 
         */
        public Builder toPort(@Nullable Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        /**
         * @param toPort The upper limit of the port range. This must be greater than or equal to the `from_port`.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs build() {
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            return $;
        }
    }

}
