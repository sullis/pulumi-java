// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.BlobInventoryPolicyFilterResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * An object that defines the blob inventory rule. Each definition consists of a set of filters.
 * 
 */
public final class BlobInventoryPolicyDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobInventoryPolicyDefinitionResponse Empty = new BlobInventoryPolicyDefinitionResponse();

    /**
     * An object that defines the filter set.
     * 
     */
    @InputImport(name="filters", required=true)
      private final BlobInventoryPolicyFilterResponse filters;

    public BlobInventoryPolicyFilterResponse getFilters() {
        return this.filters;
    }

    public BlobInventoryPolicyDefinitionResponse(BlobInventoryPolicyFilterResponse filters) {
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
    }

    private BlobInventoryPolicyDefinitionResponse() {
        this.filters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyFilterResponse filters;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(BlobInventoryPolicyFilterResponse filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public BlobInventoryPolicyDefinitionResponse build() {
            return new BlobInventoryPolicyDefinitionResponse(filters);
        }
    }
}