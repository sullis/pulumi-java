// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementGeoMatchStatement {
    /**
     * @return An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    private final List<String> countryCodes;
    /**
     * @return The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementGeoMatchStatement(
        @CustomType.Parameter("countryCodes") List<String> countryCodes,
        @CustomType.Parameter("forwardedIpConfig") @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig) {
        this.countryCodes = countryCodes;
        this.forwardedIpConfig = forwardedIpConfig;
    }

    /**
     * @return An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    public List<String> countryCodes() {
        return this.countryCodes;
    }
    /**
     * @return The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig> forwardedIpConfig() {
        return Optional.ofNullable(this.forwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementGeoMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> countryCodes;
        private @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementGeoMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }
        public Builder forwardedIpConfig(@Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }        public RuleGroupRuleStatementNotStatementStatementGeoMatchStatement build() {
            return new RuleGroupRuleStatementNotStatementStatementGeoMatchStatement(countryCodes, forwardedIpConfig);
        }
    }
}
