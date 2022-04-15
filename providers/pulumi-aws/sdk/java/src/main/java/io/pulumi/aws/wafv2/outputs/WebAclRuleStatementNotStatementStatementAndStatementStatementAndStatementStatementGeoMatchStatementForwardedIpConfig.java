// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private final String fallbackBehavior;
    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    private final String headerName;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig(
        @CustomType.Parameter("fallbackBehavior") String fallbackBehavior,
        @CustomType.Parameter("headerName") String headerName) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
    }

    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
    */
    public String fallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * - The name of the HTTP header to use for the IP address.
     * 
    */
    public String headerName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig(fallbackBehavior, headerName);
        }
    }
}
