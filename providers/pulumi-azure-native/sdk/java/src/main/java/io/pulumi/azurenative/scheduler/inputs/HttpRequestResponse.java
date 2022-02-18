// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.BasicAuthenticationResponse;
import io.pulumi.azurenative.scheduler.inputs.ClientCertAuthenticationResponse;
import io.pulumi.azurenative.scheduler.inputs.OAuthAuthenticationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRequestResponse Empty = new HttpRequestResponse();

    /**
     * Gets or sets the authentication method of the request.
     * 
     */
    @InputImport(name="authentication")
    private final @Nullable Object authentication;

    public Object getAuthentication() {
        return this.authentication == null ? null : this.authentication;
    }

    /**
     * Gets or sets the request body.
     * 
     */
    @InputImport(name="body")
    private final @Nullable String body;

    public Optional<String> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    /**
     * Gets or sets the headers.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Map<String,String> headers;

    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }

    /**
     * Gets or sets the method of the request.
     * 
     */
    @InputImport(name="method")
    private final @Nullable String method;

    public Optional<String> getMethod() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * Gets or sets the URI of the request.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public HttpRequestResponse(
        @Nullable Object authentication,
        @Nullable String body,
        @Nullable Map<String,String> headers,
        @Nullable String method,
        @Nullable String uri) {
        this.authentication = authentication;
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.uri = uri;
    }

    private HttpRequestResponse() {
        this.authentication = null;
        this.body = null;
        this.headers = Map.of();
        this.method = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authentication;
        private @Nullable String body;
        private @Nullable Map<String,String> headers;
        private @Nullable String method;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public HttpRequestResponse build() {
            return new HttpRequestResponse(authentication, body, headers, method, uri);
        }
    }
}
