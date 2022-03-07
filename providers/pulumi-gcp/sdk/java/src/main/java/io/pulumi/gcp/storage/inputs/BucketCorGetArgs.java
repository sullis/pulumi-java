// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketCorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorGetArgs Empty = new BucketCorGetArgs();

    /**
     * The value, in seconds, to return in the [Access-Control-Max-Age header](https://www.w3.org/TR/cors/#access-control-max-age-response-header) used in preflight responses.
     * 
     */
    @InputImport(name="maxAgeSeconds")
      private final @Nullable Input<Integer> maxAgeSeconds;

    public Input<Integer> getMaxAgeSeconds() {
        return this.maxAgeSeconds == null ? Input.empty() : this.maxAgeSeconds;
    }

    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
     */
    @InputImport(name="methods")
      private final @Nullable Input<List<String>> methods;

    public Input<List<String>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * The list of [Origins](https://tools.ietf.org/html/rfc6454) eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
     */
    @InputImport(name="origins")
      private final @Nullable Input<List<String>> origins;

    public Input<List<String>> getOrigins() {
        return this.origins == null ? Input.empty() : this.origins;
    }

    /**
     * The list of HTTP headers other than the [simple response headers](https://www.w3.org/TR/cors/#simple-response-header) to give permission for the user-agent to share across domains.
     * 
     */
    @InputImport(name="responseHeaders")
      private final @Nullable Input<List<String>> responseHeaders;

    public Input<List<String>> getResponseHeaders() {
        return this.responseHeaders == null ? Input.empty() : this.responseHeaders;
    }

    public BucketCorGetArgs(
        @Nullable Input<Integer> maxAgeSeconds,
        @Nullable Input<List<String>> methods,
        @Nullable Input<List<String>> origins,
        @Nullable Input<List<String>> responseHeaders) {
        this.maxAgeSeconds = maxAgeSeconds;
        this.methods = methods;
        this.origins = origins;
        this.responseHeaders = responseHeaders;
    }

    private BucketCorGetArgs() {
        this.maxAgeSeconds = Input.empty();
        this.methods = Input.empty();
        this.origins = Input.empty();
        this.responseHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxAgeSeconds;
        private @Nullable Input<List<String>> methods;
        private @Nullable Input<List<String>> origins;
        private @Nullable Input<List<String>> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder setMaxAgeSeconds(@Nullable Input<Integer> maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public Builder setMaxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = Input.ofNullable(maxAgeSeconds);
            return this;
        }

        public Builder setMethods(@Nullable Input<List<String>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<String> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder setOrigins(@Nullable Input<List<String>> origins) {
            this.origins = origins;
            return this;
        }

        public Builder setOrigins(@Nullable List<String> origins) {
            this.origins = Input.ofNullable(origins);
            return this;
        }

        public Builder setResponseHeaders(@Nullable Input<List<String>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }

        public Builder setResponseHeaders(@Nullable List<String> responseHeaders) {
            this.responseHeaders = Input.ofNullable(responseHeaders);
            return this;
        }
        public BucketCorGetArgs build() {
            return new BucketCorGetArgs(maxAgeSeconds, methods, origins, responseHeaders);
        }
    }
}