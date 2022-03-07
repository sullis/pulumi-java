// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.HttpRouteMatchHeaderResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.HttpRouteMatchPathResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpRouteMatchRuleResponse {
    /**
     * headers and their values to match in request.
     * 
     */
    private final @Nullable List<HttpRouteMatchHeaderResponse> headers;
    /**
     * Path to match for routing.
     * 
     */
    private final HttpRouteMatchPathResponse path;

    @OutputCustomType.Constructor({"headers","path"})
    private HttpRouteMatchRuleResponse(
        @Nullable List<HttpRouteMatchHeaderResponse> headers,
        HttpRouteMatchPathResponse path) {
        this.headers = headers;
        this.path = Objects.requireNonNull(path);
    }

    /**
     * headers and their values to match in request.
     * 
    */
    public List<HttpRouteMatchHeaderResponse> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * Path to match for routing.
     * 
    */
    public HttpRouteMatchPathResponse getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HttpRouteMatchHeaderResponse> headers;
        private HttpRouteMatchPathResponse path;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.path = defaults.path;
        }

        public Builder setHeaders(@Nullable List<HttpRouteMatchHeaderResponse> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setPath(HttpRouteMatchPathResponse path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public HttpRouteMatchRuleResponse build() {
            return new HttpRouteMatchRuleResponse(headers, path);
        }
    }
}