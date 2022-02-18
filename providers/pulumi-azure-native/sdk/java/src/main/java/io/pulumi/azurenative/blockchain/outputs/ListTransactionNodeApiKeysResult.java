// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.azurenative.blockchain.outputs.ApiKeyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListTransactionNodeApiKeysResult {
    /**
     * Gets or sets the collection of API key.
     * 
     */
    private final @Nullable List<ApiKeyResponse> keys;

    @OutputCustomType.Constructor({"keys"})
    private ListTransactionNodeApiKeysResult(@Nullable List<ApiKeyResponse> keys) {
        this.keys = keys;
    }

    /**
     * Gets or sets the collection of API key.
     * 
     */
    public List<ApiKeyResponse> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListTransactionNodeApiKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApiKeyResponse> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListTransactionNodeApiKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder setKeys(@Nullable List<ApiKeyResponse> keys) {
            this.keys = keys;
            return this;
        }

        public ListTransactionNodeApiKeysResult build() {
            return new ListTransactionNodeApiKeysResult(keys);
        }
    }
}
