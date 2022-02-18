// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.StorageAccountResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageProfileResponse {
    /**
     * The list of storage accounts in the cluster.
     * 
     */
    private final @Nullable List<StorageAccountResponse> storageaccounts;

    @OutputCustomType.Constructor({"storageaccounts"})
    private StorageProfileResponse(@Nullable List<StorageAccountResponse> storageaccounts) {
        this.storageaccounts = storageaccounts;
    }

    /**
     * The list of storage accounts in the cluster.
     * 
     */
    public List<StorageAccountResponse> getStorageaccounts() {
        return this.storageaccounts == null ? List.of() : this.storageaccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StorageAccountResponse> storageaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageaccounts = defaults.storageaccounts;
        }

        public Builder setStorageaccounts(@Nullable List<StorageAccountResponse> storageaccounts) {
            this.storageaccounts = storageaccounts;
            return this;
        }

        public StorageProfileResponse build() {
            return new StorageProfileResponse(storageaccounts);
        }
    }
}
