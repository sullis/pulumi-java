// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.HttpHeaderOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpHeaderActionResponse {
    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    private final List<HttpHeaderOptionResponse> requestHeadersToAdd;
    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    private final List<String> requestHeadersToRemove;
    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    private final List<HttpHeaderOptionResponse> responseHeadersToAdd;
    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    private final List<String> responseHeadersToRemove;

    @OutputCustomType.Constructor({"requestHeadersToAdd","requestHeadersToRemove","responseHeadersToAdd","responseHeadersToRemove"})
    private HttpHeaderActionResponse(
        List<HttpHeaderOptionResponse> requestHeadersToAdd,
        List<String> requestHeadersToRemove,
        List<HttpHeaderOptionResponse> responseHeadersToAdd,
        List<String> responseHeadersToRemove) {
        this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd);
        this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove);
        this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd);
        this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove);
    }

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
    */
    public List<HttpHeaderOptionResponse> getRequestHeadersToAdd() {
        return this.requestHeadersToAdd;
    }
    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
    */
    public List<String> getRequestHeadersToRemove() {
        return this.requestHeadersToRemove;
    }
    /**
     * Headers to add the response before sending the response back to the client.
     * 
    */
    public List<HttpHeaderOptionResponse> getResponseHeadersToAdd() {
        return this.responseHeadersToAdd;
    }
    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
    */
    public List<String> getResponseHeadersToRemove() {
        return this.responseHeadersToRemove;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHeaderOptionResponse> requestHeadersToAdd;
        private List<String> requestHeadersToRemove;
        private List<HttpHeaderOptionResponse> responseHeadersToAdd;
        private List<String> responseHeadersToRemove;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        public Builder setRequestHeadersToAdd(List<HttpHeaderOptionResponse> requestHeadersToAdd) {
            this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd);
            return this;
        }

        public Builder setRequestHeadersToRemove(List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove);
            return this;
        }

        public Builder setResponseHeadersToAdd(List<HttpHeaderOptionResponse> responseHeadersToAdd) {
            this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd);
            return this;
        }

        public Builder setResponseHeadersToRemove(List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove);
            return this;
        }
        public HttpHeaderActionResponse build() {
            return new HttpHeaderActionResponse(requestHeadersToAdd, requestHeadersToRemove, responseHeadersToAdd, responseHeadersToRemove);
        }
    }
}