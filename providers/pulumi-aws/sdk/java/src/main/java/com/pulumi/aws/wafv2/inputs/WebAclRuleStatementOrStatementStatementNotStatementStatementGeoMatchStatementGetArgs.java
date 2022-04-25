// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs();

    /**
     * An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @Import(name="countryCodes", required=true)
    private Output<List<String>> countryCodes;

    /**
     * @return An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    public Output<List<String>> countryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @Import(name="forwardedIpConfig")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

    /**
     * @return The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs>> forwardedIpConfig() {
        return Optional.ofNullable(this.forwardedIpConfig);
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs() {}

    private WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs $) {
        this.countryCodes = $.countryCodes;
        this.forwardedIpConfig = $.forwardedIpConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param countryCodes An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(Output<List<String>> countryCodes) {
            $.countryCodes = countryCodes;
            return this;
        }

        /**
         * @param countryCodes An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(List<String> countryCodes) {
            return countryCodes(Output.of(countryCodes));
        }

        /**
         * @param countryCodes An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }

        /**
         * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
         * 
         * @return builder
         * 
         */
        public Builder forwardedIpConfig(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
            $.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        /**
         * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
         * 
         * @return builder
         * 
         */
        public Builder forwardedIpConfig(WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs forwardedIpConfig) {
            return forwardedIpConfig(Output.of(forwardedIpConfig));
        }

        public WebAclRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatementGetArgs build() {
            $.countryCodes = Objects.requireNonNull($.countryCodes, "expected parameter 'countryCodes' to be non-null");
            return $;
        }
    }

}
