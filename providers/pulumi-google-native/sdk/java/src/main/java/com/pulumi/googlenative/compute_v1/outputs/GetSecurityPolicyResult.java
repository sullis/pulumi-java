// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.SecurityPolicyAdaptiveProtectionConfigResponse;
import com.pulumi.googlenative.compute_v1.outputs.SecurityPolicyAdvancedOptionsConfigResponse;
import com.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRecaptchaOptionsConfigResponse;
import com.pulumi.googlenative.compute_v1.outputs.SecurityPolicyRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityPolicyResult {
    private final SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
    private final SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    private final String fingerprint;
    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    private final SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    private final List<SecurityPolicyRuleResponse> rules;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSecurityPolicyResult(
        @CustomType.Parameter("adaptiveProtectionConfig") SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig,
        @CustomType.Parameter("advancedOptionsConfig") SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recaptchaOptionsConfig") SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig,
        @CustomType.Parameter("rules") List<SecurityPolicyRuleResponse> rules,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("type") String type) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.advancedOptionsConfig = advancedOptionsConfig;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.name = name;
        this.recaptchaOptionsConfig = recaptchaOptionsConfig;
        this.rules = rules;
        this.selfLink = selfLink;
        this.type = type;
    }

    public SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    public SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig() {
        return this.advancedOptionsConfig;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyfor security policies
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    public SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig;
    }
    /**
     * @return A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    public List<SecurityPolicyRuleResponse> rules() {
        return this.rules;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
        private SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String name;
        private SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
        private List<SecurityPolicyRuleResponse> rules;
        private String selfLink;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.type = defaults.type;
        }

        public Builder adaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Objects.requireNonNull(adaptiveProtectionConfig);
            return this;
        }
        public Builder advancedOptionsConfig(SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig) {
            this.advancedOptionsConfig = Objects.requireNonNull(advancedOptionsConfig);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recaptchaOptionsConfig(SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Objects.requireNonNull(recaptchaOptionsConfig);
            return this;
        }
        public Builder rules(List<SecurityPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(SecurityPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSecurityPolicyResult build() {
            return new GetSecurityPolicyResult(adaptiveProtectionConfig, advancedOptionsConfig, creationTimestamp, description, fingerprint, kind, name, recaptchaOptionsConfig, rules, selfLink, type);
        }
    }
}
