// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewayCorsPropertiesResponse {
    /**
     * Whether user credentials are supported on cross-site requests. Valid values: `true`, `false`.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * Allowed headers in cross-site requests. The special value `*` allows actual requests to send any header.
     * 
     */
    private final @Nullable List<String> allowedHeaders;
    /**
     * Allowed HTTP methods on cross-site requests. The special value `*` allows all methods. If not set, `GET` and `HEAD` are allowed by default.
     * 
     */
    private final @Nullable List<String> allowedMethods;
    /**
     * Allowed origins to make cross-site requests. The special value `*` allows all domains.
     * 
     */
    private final @Nullable List<String> allowedOrigins;
    /**
     * HTTP response headers to expose for cross-site requests.
     * 
     */
    private final @Nullable List<String> exposedHeaders;
    /**
     * How long, in seconds, the response from a pre-flight request can be cached by clients.
     * 
     */
    private final @Nullable Integer maxAge;

    @OutputCustomType.Constructor({"allowCredentials","allowedHeaders","allowedMethods","allowedOrigins","exposedHeaders","maxAge"})
    private GatewayCorsPropertiesResponse(
        @Nullable Boolean allowCredentials,
        @Nullable List<String> allowedHeaders,
        @Nullable List<String> allowedMethods,
        @Nullable List<String> allowedOrigins,
        @Nullable List<String> exposedHeaders,
        @Nullable Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = allowedMethods;
        this.allowedOrigins = allowedOrigins;
        this.exposedHeaders = exposedHeaders;
        this.maxAge = maxAge;
    }

    /**
     * Whether user credentials are supported on cross-site requests. Valid values: `true`, `false`.
     * 
     */
    public Optional<Boolean> getAllowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * Allowed headers in cross-site requests. The special value `*` allows actual requests to send any header.
     * 
     */
    public List<String> getAllowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * Allowed HTTP methods on cross-site requests. The special value `*` allows all methods. If not set, `GET` and `HEAD` are allowed by default.
     * 
     */
    public List<String> getAllowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }
    /**
     * Allowed origins to make cross-site requests. The special value `*` allows all domains.
     * 
     */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * HTTP response headers to expose for cross-site requests.
     * 
     */
    public List<String> getExposedHeaders() {
        return this.exposedHeaders == null ? List.of() : this.exposedHeaders;
    }
    /**
     * How long, in seconds, the response from a pre-flight request can be cached by clients.
     * 
     */
    public Optional<Integer> getMaxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCorsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowedHeaders;
        private @Nullable List<String> allowedMethods;
        private @Nullable List<String> allowedOrigins;
        private @Nullable List<String> exposedHeaders;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCorsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedMethods(@Nullable List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder setAllowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        public Builder setExposedHeaders(@Nullable List<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public GatewayCorsPropertiesResponse build() {
            return new GatewayCorsPropertiesResponse(allowCredentials, allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAge);
        }
    }
}
