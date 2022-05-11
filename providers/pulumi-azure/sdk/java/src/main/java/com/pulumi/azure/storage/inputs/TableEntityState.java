// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableEntityState extends com.pulumi.resources.ResourceArgs {

    public static final TableEntityState Empty = new TableEntityState();

    /**
     * A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
     * 
     */
    @Import(name="entity")
    private @Nullable Output<Map<String,String>> entity;

    /**
     * @return A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
     * 
     */
    public Optional<Output<Map<String,String>>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The key for the partition where the entity will be inserted/merged. Changing this forces a new resource.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<String> partitionKey;

    /**
     * @return The key for the partition where the entity will be inserted/merged. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * The key for the row where the entity will be inserted/merged. Changing this forces a new resource.
     * 
     */
    @Import(name="rowKey")
    private @Nullable Output<String> rowKey;

    /**
     * @return The key for the row where the entity will be inserted/merged. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> rowKey() {
        return Optional.ofNullable(this.rowKey);
    }

    /**
     * Specifies the storage account in which to create the storage table entity.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return Specifies the storage account in which to create the storage table entity.
     * Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * The name of the storage table in which to create the storage table entity.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return The name of the storage table in which to create the storage table entity.
     * Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private TableEntityState() {}

    private TableEntityState(TableEntityState $) {
        this.entity = $.entity;
        this.partitionKey = $.partitionKey;
        this.rowKey = $.rowKey;
        this.storageAccountName = $.storageAccountName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableEntityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableEntityState $;

        public Builder() {
            $ = new TableEntityState();
        }

        public Builder(TableEntityState defaults) {
            $ = new TableEntityState(Objects.requireNonNull(defaults));
        }

        /**
         * @param entity A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
         * 
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<Map<String,String>> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
         * 
         * @return builder
         * 
         */
        public Builder entity(Map<String,String> entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param partitionKey The key for the partition where the entity will be inserted/merged. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The key for the partition where the entity will be inserted/merged. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param rowKey The key for the row where the entity will be inserted/merged. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(@Nullable Output<String> rowKey) {
            $.rowKey = rowKey;
            return this;
        }

        /**
         * @param rowKey The key for the row where the entity will be inserted/merged. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(String rowKey) {
            return rowKey(Output.of(rowKey));
        }

        /**
         * @param storageAccountName Specifies the storage account in which to create the storage table entity.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName Specifies the storage account in which to create the storage table entity.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param tableName The name of the storage table in which to create the storage table entity.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The name of the storage table in which to create the storage table entity.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public TableEntityState build() {
            return $;
        }
    }

}
