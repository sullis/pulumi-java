// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.azurenative.azurestack.outputs.ProductResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProductsResult {
    /**
     * URI to the next page.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of products.
     * 
     */
    private final @Nullable List<ProductResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private GetProductsResult(
        @Nullable String nextLink,
        @Nullable List<ProductResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * URI to the next page.
     * 
     */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of products.
     * 
     */
    public List<ProductResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<ProductResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<ProductResponse> value) {
            this.value = value;
            return this;
        }

        public GetProductsResult build() {
            return new GetProductsResult(nextLink, value);
        }
    }
}
