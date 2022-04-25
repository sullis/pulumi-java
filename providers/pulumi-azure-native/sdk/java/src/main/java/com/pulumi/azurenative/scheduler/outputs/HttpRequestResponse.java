// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.azurenative.scheduler.outputs.BasicAuthenticationResponse;
import com.pulumi.azurenative.scheduler.outputs.ClientCertAuthenticationResponse;
import com.pulumi.azurenative.scheduler.outputs.OAuthAuthenticationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpRequestResponse {
    /**
     * @return Gets or sets the authentication method of the request.
     * 
     */
    private final @Nullable Object authentication;
    /**
     * @return Gets or sets the request body.
     * 
     */
    private final @Nullable String body;
    /**
     * @return Gets or sets the headers.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * @return Gets or sets the method of the request.
     * 
     */
    private final @Nullable String method;
    /**
     * @return Gets or sets the URI of the request.
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private HttpRequestResponse(
        @CustomType.Parameter("authentication") @Nullable Object authentication,
        @CustomType.Parameter("body") @Nullable String body,
        @CustomType.Parameter("headers") @Nullable Map<String,String> headers,
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.authentication = authentication;
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.uri = uri;
    }

    /**
     * @return Gets or sets the authentication method of the request.
     * 
     */
    public Optional<Object> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * @return Gets or sets the request body.
     * 
     */
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Gets or sets the headers.
     * 
     */
    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * @return Gets or sets the method of the request.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Gets or sets the URI of the request.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
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

        public Builder authentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = body;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public HttpRequestResponse build() {
            return new HttpRequestResponse(authentication, body, headers, method, uri);
        }
    }
}
