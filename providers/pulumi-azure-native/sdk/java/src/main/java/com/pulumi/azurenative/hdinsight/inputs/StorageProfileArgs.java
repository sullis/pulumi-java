// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.StorageAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage profile.
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * The list of storage accounts in the cluster.
     * 
     */
    @Import(name="storageaccounts")
    private @Nullable Output<List<StorageAccountArgs>> storageaccounts;

    /**
     * @return The list of storage accounts in the cluster.
     * 
     */
    public Optional<Output<List<StorageAccountArgs>>> storageaccounts() {
        return Optional.ofNullable(this.storageaccounts);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.storageaccounts = $.storageaccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileArgs $;

        public Builder() {
            $ = new StorageProfileArgs();
        }

        public Builder(StorageProfileArgs defaults) {
            $ = new StorageProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageaccounts The list of storage accounts in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageaccounts(@Nullable Output<List<StorageAccountArgs>> storageaccounts) {
            $.storageaccounts = storageaccounts;
            return this;
        }

        /**
         * @param storageaccounts The list of storage accounts in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageaccounts(List<StorageAccountArgs> storageaccounts) {
            return storageaccounts(Output.of(storageaccounts));
        }

        /**
         * @param storageaccounts The list of storage accounts in the cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageaccounts(StorageAccountArgs... storageaccounts) {
            return storageaccounts(List.of(storageaccounts));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
