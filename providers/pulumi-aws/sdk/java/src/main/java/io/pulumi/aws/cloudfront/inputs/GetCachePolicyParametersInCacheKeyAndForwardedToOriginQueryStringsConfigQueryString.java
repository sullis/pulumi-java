// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString extends io.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString Empty = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString();

    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
     */
    @InputImport(name="items", required=true)
      private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString(List<String> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString(items);
        }
    }
}