// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlDispatchRuleResponse {
    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*".
     * 
     */
    private final String domain;
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    private final String path;
    /**
     * Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private UrlDispatchRuleResponse(
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("service") String service) {
        this.domain = domain;
        this.path = path;
        this.service = service;
    }

    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*".
     * 
    */
    public String getDomain() {
        return this.domain;
    }
    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlDispatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlDispatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public UrlDispatchRuleResponse build() {
            return new UrlDispatchRuleResponse(domain, path, service);
        }
    }
}
