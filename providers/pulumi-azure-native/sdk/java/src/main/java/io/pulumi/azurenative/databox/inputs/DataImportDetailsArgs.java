// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ManagedDiskDetailsArgs;
import io.pulumi.azurenative.databox.inputs.StorageAccountDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * Details of the data to be used for importing data to azure.
 * 
 */
public final class DataImportDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataImportDetailsArgs Empty = new DataImportDetailsArgs();

    /**
     * Account details of the data to be transferred
     * 
     */
    @InputImport(name="accountDetails", required=true)
    private final Input<Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs>> accountDetails;

    public Input<Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs>> getAccountDetails() {
        return this.accountDetails;
    }

    public DataImportDetailsArgs(Input<Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs>> accountDetails) {
        this.accountDetails = Objects.requireNonNull(accountDetails, "expected parameter 'accountDetails' to be non-null");
    }

    private DataImportDetailsArgs() {
        this.accountDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataImportDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs>> accountDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(DataImportDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDetails = defaults.accountDetails;
        }

        public Builder setAccountDetails(Input<Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs>> accountDetails) {
            this.accountDetails = Objects.requireNonNull(accountDetails);
            return this;
        }

        public Builder setAccountDetails(Either<ManagedDiskDetailsArgs,StorageAccountDetailsArgs> accountDetails) {
            this.accountDetails = Input.of(Objects.requireNonNull(accountDetails));
            return this;
        }

        public DataImportDetailsArgs build() {
            return new DataImportDetailsArgs(accountDetails);
        }
    }
}
