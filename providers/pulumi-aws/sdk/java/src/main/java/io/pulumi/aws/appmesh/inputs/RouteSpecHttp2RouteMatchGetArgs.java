// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteMatchGetArgs Empty = new RouteSpecHttp2RouteMatchGetArgs();

    /**
     * The client request headers to match on.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<RouteSpecHttp2RouteMatchHeaderGetArgs>> headers;

    public Output<List<RouteSpecHttp2RouteMatchHeaderGetArgs>> headers() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<String> method;

    public Output<String> method() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix", required=true)
      private final Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     * The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    @Import(name="scheme")
      private final @Nullable Output<String> scheme;

    public Output<String> scheme() {
        return this.scheme == null ? Codegen.empty() : this.scheme;
    }

    public RouteSpecHttp2RouteMatchGetArgs(
        @Nullable Output<List<RouteSpecHttp2RouteMatchHeaderGetArgs>> headers,
        @Nullable Output<String> method,
        Output<String> prefix,
        @Nullable Output<String> scheme) {
        this.headers = headers;
        this.method = method;
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.scheme = scheme;
    }

    private RouteSpecHttp2RouteMatchGetArgs() {
        this.headers = Codegen.empty();
        this.method = Codegen.empty();
        this.prefix = Codegen.empty();
        this.scheme = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RouteSpecHttp2RouteMatchHeaderGetArgs>> headers;
        private @Nullable Output<String> method;
        private Output<String> prefix;
        private @Nullable Output<String> scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.prefix = defaults.prefix;
    	      this.scheme = defaults.scheme;
        }

        public Builder headers(@Nullable Output<List<RouteSpecHttp2RouteMatchHeaderGetArgs>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<RouteSpecHttp2RouteMatchHeaderGetArgs> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder headers(RouteSpecHttp2RouteMatchHeaderGetArgs... headers) {
            return headers(List.of(headers));
        }
        public Builder method(@Nullable Output<String> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder prefix(Output<String> prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Output.of(Objects.requireNonNull(prefix));
            return this;
        }
        public Builder scheme(@Nullable Output<String> scheme) {
            this.scheme = scheme;
            return this;
        }
        public Builder scheme(@Nullable String scheme) {
            this.scheme = Codegen.ofNullable(scheme);
            return this;
        }        public RouteSpecHttp2RouteMatchGetArgs build() {
            return new RouteSpecHttp2RouteMatchGetArgs(headers, method, prefix, scheme);
        }
    }
}
