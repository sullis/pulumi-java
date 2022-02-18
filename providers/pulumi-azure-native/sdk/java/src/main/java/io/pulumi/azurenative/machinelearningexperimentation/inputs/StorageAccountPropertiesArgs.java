// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The properties of a storage account for a machine learning team account.
 * 
 */
public final class StorageAccountPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountPropertiesArgs Empty = new StorageAccountPropertiesArgs();

    /**
     * The access key to the storage account.
     * 
     */
    @InputImport(name="accessKey", required=true)
    private final Input<String> accessKey;

    public Input<String> getAccessKey() {
        return this.accessKey;
    }

    /**
     * The fully qualified arm Id of the storage account.
     * 
     */
    @InputImport(name="storageAccountId", required=true)
    private final Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId;
    }

    public StorageAccountPropertiesArgs(
        Input<String> accessKey,
        Input<String> storageAccountId) {
        this.accessKey = Objects.requireNonNull(accessKey, "expected parameter 'accessKey' to be non-null");
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
    }

    private StorageAccountPropertiesArgs() {
        this.accessKey = Input.empty();
        this.storageAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessKey;
        private Input<String> storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setAccessKey(Input<String> accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }

        public Builder setAccessKey(String accessKey) {
            this.accessKey = Input.of(Objects.requireNonNull(accessKey));
            return this;
        }

        public Builder setStorageAccountId(Input<String> storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Input.of(Objects.requireNonNull(storageAccountId));
            return this;
        }

        public StorageAccountPropertiesArgs build() {
            return new StorageAccountPropertiesArgs(accessKey, storageAccountId);
        }
    }
}
