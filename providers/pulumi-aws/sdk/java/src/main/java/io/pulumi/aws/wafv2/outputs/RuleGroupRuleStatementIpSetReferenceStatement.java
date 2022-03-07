// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementIpSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

    @OutputCustomType.Constructor({"arn","ipSetForwardedIpConfig"})
    private RuleGroupRuleStatementIpSetReferenceStatement(
        String arn,
        @Nullable RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
        this.arn = Objects.requireNonNull(arn);
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
    */
    public Optional<RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig> getIpSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementIpSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementIpSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setIpSetForwardedIpConfig(@Nullable RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfig ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public RuleGroupRuleStatementIpSetReferenceStatement build() {
            return new RuleGroupRuleStatementIpSetReferenceStatement(arn, ipSetForwardedIpConfig);
        }
    }
}