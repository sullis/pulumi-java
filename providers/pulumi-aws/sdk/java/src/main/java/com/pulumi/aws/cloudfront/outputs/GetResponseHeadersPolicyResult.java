// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfig;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCustomHeadersConfig;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicySecurityHeadersConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyResult {
    /**
     * @return A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
     * 
     */
    private final String comment;
    /**
     * @return A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
     * 
     */
    private final List<GetResponseHeadersPolicyCorsConfig> corsConfigs;
    /**
     * @return Object that contains an attribute `items` that contains a list of Custom Headers See Custom Header for more information.
     * 
     */
    private final List<GetResponseHeadersPolicyCustomHeadersConfig> customHeadersConfigs;
    /**
     * @return The current version of the response headers policy.
     * 
     */
    private final String etag;
    private final String id;
    private final String name;
    /**
     * @return A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
     * 
     */
    private final List<GetResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfigs;

    @CustomType.Constructor
    private GetResponseHeadersPolicyResult(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("corsConfigs") List<GetResponseHeadersPolicyCorsConfig> corsConfigs,
        @CustomType.Parameter("customHeadersConfigs") List<GetResponseHeadersPolicyCustomHeadersConfig> customHeadersConfigs,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("securityHeadersConfigs") List<GetResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfigs) {
        this.comment = comment;
        this.corsConfigs = corsConfigs;
        this.customHeadersConfigs = customHeadersConfigs;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.securityHeadersConfigs = securityHeadersConfigs;
    }

    /**
     * @return A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
     * 
     */
    public List<GetResponseHeadersPolicyCorsConfig> corsConfigs() {
        return this.corsConfigs;
    }
    /**
     * @return Object that contains an attribute `items` that contains a list of Custom Headers See Custom Header for more information.
     * 
     */
    public List<GetResponseHeadersPolicyCustomHeadersConfig> customHeadersConfigs() {
        return this.customHeadersConfigs;
    }
    /**
     * @return The current version of the response headers policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
     * 
     */
    public List<GetResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfigs() {
        return this.securityHeadersConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private List<GetResponseHeadersPolicyCorsConfig> corsConfigs;
        private List<GetResponseHeadersPolicyCustomHeadersConfig> customHeadersConfigs;
        private String etag;
        private String id;
        private String name;
        private List<GetResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.corsConfigs = defaults.corsConfigs;
    	      this.customHeadersConfigs = defaults.customHeadersConfigs;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.securityHeadersConfigs = defaults.securityHeadersConfigs;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder corsConfigs(List<GetResponseHeadersPolicyCorsConfig> corsConfigs) {
            this.corsConfigs = Objects.requireNonNull(corsConfigs);
            return this;
        }
        public Builder corsConfigs(GetResponseHeadersPolicyCorsConfig... corsConfigs) {
            return corsConfigs(List.of(corsConfigs));
        }
        public Builder customHeadersConfigs(List<GetResponseHeadersPolicyCustomHeadersConfig> customHeadersConfigs) {
            this.customHeadersConfigs = Objects.requireNonNull(customHeadersConfigs);
            return this;
        }
        public Builder customHeadersConfigs(GetResponseHeadersPolicyCustomHeadersConfig... customHeadersConfigs) {
            return customHeadersConfigs(List.of(customHeadersConfigs));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder securityHeadersConfigs(List<GetResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfigs) {
            this.securityHeadersConfigs = Objects.requireNonNull(securityHeadersConfigs);
            return this;
        }
        public Builder securityHeadersConfigs(GetResponseHeadersPolicySecurityHeadersConfig... securityHeadersConfigs) {
            return securityHeadersConfigs(List.of(securityHeadersConfigs));
        }        public GetResponseHeadersPolicyResult build() {
            return new GetResponseHeadersPolicyResult(comment, corsConfigs, customHeadersConfigs, etag, id, name, securityHeadersConfigs);
        }
    }
}
