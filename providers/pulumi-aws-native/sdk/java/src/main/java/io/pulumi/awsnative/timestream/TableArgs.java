// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream;

import io.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesArgs;
import io.pulumi.awsnative.timestream.inputs.RetentionPropertiesPropertiesArgs;
import io.pulumi.awsnative.timestream.inputs.TableTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * The name for the database which the table to be created belongs to.
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The properties that determine whether magnetic store writes are enabled.
     * 
     */
    @InputImport(name="magneticStoreWriteProperties")
      private final @Nullable Input<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties;

    public Input<MagneticStoreWritePropertiesPropertiesArgs> getMagneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties == null ? Input.empty() : this.magneticStoreWriteProperties;
    }

    /**
     * The retention duration of the memory store and the magnetic store.
     * 
     */
    @InputImport(name="retentionProperties")
      private final @Nullable Input<RetentionPropertiesPropertiesArgs> retentionProperties;

    public Input<RetentionPropertiesPropertiesArgs> getRetentionProperties() {
        return this.retentionProperties == null ? Input.empty() : this.retentionProperties;
    }

    /**
     * The name for the table. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the table name.
     * 
     */
    @InputImport(name="tableName")
      private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<TableTagArgs>> tags;

    public Input<List<TableTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TableArgs(
        Input<String> databaseName,
        @Nullable Input<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties,
        @Nullable Input<RetentionPropertiesPropertiesArgs> retentionProperties,
        @Nullable Input<String> tableName,
        @Nullable Input<List<TableTagArgs>> tags) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.magneticStoreWriteProperties = magneticStoreWriteProperties;
        this.retentionProperties = retentionProperties;
        this.tableName = tableName;
        this.tags = tags;
    }

    private TableArgs() {
        this.databaseName = Input.empty();
        this.magneticStoreWriteProperties = Input.empty();
        this.retentionProperties = Input.empty();
        this.tableName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseName;
        private @Nullable Input<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties;
        private @Nullable Input<RetentionPropertiesPropertiesArgs> retentionProperties;
        private @Nullable Input<String> tableName;
        private @Nullable Input<List<TableTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.magneticStoreWriteProperties = defaults.magneticStoreWriteProperties;
    	      this.retentionProperties = defaults.retentionProperties;
    	      this.tableName = defaults.tableName;
    	      this.tags = defaults.tags;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setMagneticStoreWriteProperties(@Nullable Input<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = magneticStoreWriteProperties;
            return this;
        }

        public Builder setMagneticStoreWriteProperties(@Nullable MagneticStoreWritePropertiesPropertiesArgs magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = Input.ofNullable(magneticStoreWriteProperties);
            return this;
        }

        public Builder setRetentionProperties(@Nullable Input<RetentionPropertiesPropertiesArgs> retentionProperties) {
            this.retentionProperties = retentionProperties;
            return this;
        }

        public Builder setRetentionProperties(@Nullable RetentionPropertiesPropertiesArgs retentionProperties) {
            this.retentionProperties = Input.ofNullable(retentionProperties);
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<TableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TableTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public TableArgs build() {
            return new TableArgs(databaseName, magneticStoreWriteProperties, retentionProperties, tableName, tags);
        }
    }
}