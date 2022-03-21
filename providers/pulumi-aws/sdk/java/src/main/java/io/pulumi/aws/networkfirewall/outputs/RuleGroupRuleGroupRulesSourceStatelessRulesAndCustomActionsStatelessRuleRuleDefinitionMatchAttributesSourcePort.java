// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort {
    /**
     * The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
     */
    private final Integer fromPort;
    /**
     * The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
     */
    private final @Nullable Integer toPort;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort(
        @CustomType.Parameter("fromPort") Integer fromPort,
        @CustomType.Parameter("toPort") @Nullable Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    /**
     * The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
    */
    public Optional<Integer> getToPort() {
        return Optional.ofNullable(this.toPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private @Nullable Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = toPort;
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePort(fromPort, toPort);
        }
    }
}
