// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.SnapshotStorageAccountTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
 * 
 */
public final class SnapshotSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotSkuArgs Empty = new SnapshotSkuArgs();

    /**
     * The sku name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<Either<String,SnapshotStorageAccountTypes>> name;

    public Input<Either<String,SnapshotStorageAccountTypes>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SnapshotSkuArgs(@Nullable Input<Either<String,SnapshotStorageAccountTypes>> name) {
        this.name = name;
    }

    private SnapshotSkuArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,SnapshotStorageAccountTypes>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<Either<String,SnapshotStorageAccountTypes>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,SnapshotStorageAccountTypes> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public SnapshotSkuArgs build() {
            return new SnapshotSkuArgs(name);
        }
    }
}
