// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class KafkaClusterStorageAccountGen2Args extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterStorageAccountGen2Args Empty = new KafkaClusterStorageAccountGen2Args();

    /**
     * The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="filesystemId", required=true)
    private Output<String> filesystemId;

    /**
     * @return The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> filesystemId() {
        return this.filesystemId;
    }

    /**
     * Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    @Import(name="isDefault", required=true)
    private Output<Boolean> isDefault;

    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }

    /**
     * The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managedIdentityResourceId", required=true)
    private Output<String> managedIdentityResourceId;

    /**
     * @return The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managedIdentityResourceId() {
        return this.managedIdentityResourceId;
    }

    /**
     * The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageResourceId", required=true)
    private Output<String> storageResourceId;

    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageResourceId() {
        return this.storageResourceId;
    }

    private KafkaClusterStorageAccountGen2Args() {}

    private KafkaClusterStorageAccountGen2Args(KafkaClusterStorageAccountGen2Args $) {
        this.filesystemId = $.filesystemId;
        this.isDefault = $.isDefault;
        this.managedIdentityResourceId = $.managedIdentityResourceId;
        this.storageResourceId = $.storageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterStorageAccountGen2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterStorageAccountGen2Args $;

        public Builder() {
            $ = new KafkaClusterStorageAccountGen2Args();
        }

        public Builder(KafkaClusterStorageAccountGen2Args defaults) {
            $ = new KafkaClusterStorageAccountGen2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param filesystemId The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filesystemId(Output<String> filesystemId) {
            $.filesystemId = filesystemId;
            return this;
        }

        /**
         * @param filesystemId The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filesystemId(String filesystemId) {
            return filesystemId(Output.of(filesystemId));
        }

        /**
         * @param isDefault Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param managedIdentityResourceId The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedIdentityResourceId(Output<String> managedIdentityResourceId) {
            $.managedIdentityResourceId = managedIdentityResourceId;
            return this;
        }

        /**
         * @param managedIdentityResourceId The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedIdentityResourceId(String managedIdentityResourceId) {
            return managedIdentityResourceId(Output.of(managedIdentityResourceId));
        }

        /**
         * @param storageResourceId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(Output<String> storageResourceId) {
            $.storageResourceId = storageResourceId;
            return this;
        }

        /**
         * @param storageResourceId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(String storageResourceId) {
            return storageResourceId(Output.of(storageResourceId));
        }

        public KafkaClusterStorageAccountGen2Args build() {
            $.filesystemId = Objects.requireNonNull($.filesystemId, "expected parameter 'filesystemId' to be non-null");
            $.isDefault = Objects.requireNonNull($.isDefault, "expected parameter 'isDefault' to be non-null");
            $.managedIdentityResourceId = Objects.requireNonNull($.managedIdentityResourceId, "expected parameter 'managedIdentityResourceId' to be non-null");
            $.storageResourceId = Objects.requireNonNull($.storageResourceId, "expected parameter 'storageResourceId' to be non-null");
            return $;
        }
    }

}
