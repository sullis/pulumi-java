// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a CORS rule for the Blob service.
 * 
 */
public final class CorsRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final CorsRuleResponse Empty = new CorsRuleResponse();

    /**
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    @InputImport(name="allowedHeaders", required=true)
      private final List<String> allowedHeaders;

    public List<String> getAllowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    @InputImport(name="allowedMethods", required=true)
      private final List<String> allowedMethods;

    public List<String> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or "*" to allow all domains
     * 
     */
    @InputImport(name="allowedOrigins", required=true)
      private final List<String> allowedOrigins;

    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    @InputImport(name="exposedHeaders", required=true)
      private final List<String> exposedHeaders;

    public List<String> getExposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    @InputImport(name="maxAgeInSeconds", required=true)
      private final Integer maxAgeInSeconds;

    public Integer getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public CorsRuleResponse(
        List<String> allowedHeaders,
        List<String> allowedMethods,
        List<String> allowedOrigins,
        List<String> exposedHeaders,
        Integer maxAgeInSeconds) {
        this.allowedHeaders = Objects.requireNonNull(allowedHeaders, "expected parameter 'allowedHeaders' to be non-null");
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposedHeaders = Objects.requireNonNull(exposedHeaders, "expected parameter 'exposedHeaders' to be non-null");
        this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds, "expected parameter 'maxAgeInSeconds' to be non-null");
    }

    private CorsRuleResponse() {
        this.allowedHeaders = List.of();
        this.allowedMethods = List.of();
        this.allowedOrigins = List.of();
        this.exposedHeaders = List.of();
        this.maxAgeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder setAllowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }

        public Builder setAllowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setExposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }

        public Builder setMaxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }
        public CorsRuleResponse build() {
            return new CorsRuleResponse(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}