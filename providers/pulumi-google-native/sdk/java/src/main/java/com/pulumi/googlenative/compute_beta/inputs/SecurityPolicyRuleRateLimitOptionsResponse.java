// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRateLimitOptionsThresholdResponse;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRateLimitOptionsResponse Empty = new SecurityPolicyRuleRateLimitOptionsResponse();

    /**
     * Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @Import(name="banDurationSec", required=true)
    private Integer banDurationSec;

    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    public Integer banDurationSec() {
        return this.banDurationSec;
    }

    /**
     * Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    @Import(name="banThreshold", required=true)
    private SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;

    /**
     * @return Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold() {
        return this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    @Import(name="conformAction", required=true)
    private String conformAction;

    /**
     * @return Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
     * 
     */
    public String conformAction() {
        return this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @Import(name="enforceOnKey", required=true)
    private String enforceOnKey;

    /**
     * @return Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    public String enforceOnKey() {
        return this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    @Import(name="enforceOnKeyName", required=true)
    private String enforceOnKeyName;

    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    public String enforceOnKeyName() {
        return this.enforceOnKeyName;
    }

    /**
     * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny()&#34; where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceed_redirect_options below.
     * 
     */
    @Import(name="exceedAction", required=true)
    private String exceedAction;

    /**
     * @return Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny()&#34; where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceed_redirect_options below.
     * 
     */
    public String exceedAction() {
        return this.exceedAction;
    }

    /**
     * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    @Import(name="exceedRedirectOptions", required=true)
    private SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;

    /**
     * @return Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    public SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions() {
        return this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting.
     * 
     */
    @Import(name="rateLimitThreshold", required=true)
    private SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

    /**
     * @return Threshold at which to begin ratelimiting.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    private SecurityPolicyRuleRateLimitOptionsResponse() {}

    private SecurityPolicyRuleRateLimitOptionsResponse(SecurityPolicyRuleRateLimitOptionsResponse $) {
        this.banDurationSec = $.banDurationSec;
        this.banThreshold = $.banThreshold;
        this.conformAction = $.conformAction;
        this.enforceOnKey = $.enforceOnKey;
        this.enforceOnKeyName = $.enforceOnKeyName;
        this.exceedAction = $.exceedAction;
        this.exceedRedirectOptions = $.exceedRedirectOptions;
        this.rateLimitThreshold = $.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRateLimitOptionsResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleRateLimitOptionsResponse();
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
            $ = new SecurityPolicyRuleRateLimitOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param banDurationSec Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
         * 
         * @return builder
         * 
         */
        public Builder banDurationSec(Integer banDurationSec) {
            $.banDurationSec = banDurationSec;
            return this;
        }

        /**
         * @param banThreshold Can only be specified if the action for the rule is &#34;rate_based_ban&#34;. If specified, the key will be banned for the configured &#39;ban_duration_sec&#39; when the number of requests that exceed the &#39;rate_limit_threshold&#39; also exceed this &#39;ban_threshold&#39;.
         * 
         * @return builder
         * 
         */
        public Builder banThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold) {
            $.banThreshold = banThreshold;
            return this;
        }

        /**
         * @param conformAction Action to take for requests that are under the configured rate limit threshold. Valid option is &#34;allow&#34; only.
         * 
         * @return builder
         * 
         */
        public Builder conformAction(String conformAction) {
            $.conformAction = conformAction;
            return this;
        }

        /**
         * @param enforceOnKey Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field &#39;enforce_on_key&#39; is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under &#34;enforce_on_key_name&#34;. The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKey(String enforceOnKey) {
            $.enforceOnKey = enforceOnKey;
            return this;
        }

        /**
         * @param enforceOnKeyName Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
         * 
         * @return builder
         * 
         */
        public Builder enforceOnKeyName(String enforceOnKeyName) {
            $.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        /**
         * @param exceedAction Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are &#34;deny()&#34; where valid values for status are 403, 404, 429, and 502, and &#34;redirect&#34; where the redirect parameters come from exceed_redirect_options below.
         * 
         * @return builder
         * 
         */
        public Builder exceedAction(String exceedAction) {
            $.exceedAction = exceedAction;
            return this;
        }

        /**
         * @param exceedRedirectOptions Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
         * 
         * @return builder
         * 
         */
        public Builder exceedRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions) {
            $.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        /**
         * @param rateLimitThreshold Threshold at which to begin ratelimiting.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
            $.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        public SecurityPolicyRuleRateLimitOptionsResponse build() {
            $.banDurationSec = Objects.requireNonNull($.banDurationSec, "expected parameter 'banDurationSec' to be non-null");
            $.banThreshold = Objects.requireNonNull($.banThreshold, "expected parameter 'banThreshold' to be non-null");
            $.conformAction = Objects.requireNonNull($.conformAction, "expected parameter 'conformAction' to be non-null");
            $.enforceOnKey = Objects.requireNonNull($.enforceOnKey, "expected parameter 'enforceOnKey' to be non-null");
            $.enforceOnKeyName = Objects.requireNonNull($.enforceOnKeyName, "expected parameter 'enforceOnKeyName' to be non-null");
            $.exceedAction = Objects.requireNonNull($.exceedAction, "expected parameter 'exceedAction' to be non-null");
            $.exceedRedirectOptions = Objects.requireNonNull($.exceedRedirectOptions, "expected parameter 'exceedRedirectOptions' to be non-null");
            $.rateLimitThreshold = Objects.requireNonNull($.rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
            return $;
        }
    }

}
