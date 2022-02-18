// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.UniqueKeyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
 * 
 */
public final class UniqueKeyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final UniqueKeyPolicyResponse Empty = new UniqueKeyPolicyResponse();

    /**
     * List of unique keys on that enforces uniqueness constraint on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @InputImport(name="uniqueKeys")
    private final @Nullable List<UniqueKeyResponse> uniqueKeys;

    public List<UniqueKeyResponse> getUniqueKeys() {
        return this.uniqueKeys == null ? List.of() : this.uniqueKeys;
    }

    public UniqueKeyPolicyResponse(@Nullable List<UniqueKeyResponse> uniqueKeys) {
        this.uniqueKeys = uniqueKeys;
    }

    private UniqueKeyPolicyResponse() {
        this.uniqueKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniqueKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<UniqueKeyResponse> uniqueKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(UniqueKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uniqueKeys = defaults.uniqueKeys;
        }

        public Builder setUniqueKeys(@Nullable List<UniqueKeyResponse> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            return this;
        }

        public UniqueKeyPolicyResponse build() {
            return new UniqueKeyPolicyResponse(uniqueKeys);
        }
    }
}
