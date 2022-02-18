// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.DatabaseType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database backup settings.
 * 
 */
public final class DatabaseBackupSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseBackupSettingArgs Empty = new DatabaseBackupSettingArgs();

    /**
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable Input<String> connectionString;

    public Input<String> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    @InputImport(name="connectionStringName")
    private final @Nullable Input<String> connectionStringName;

    public Input<String> getConnectionStringName() {
        return this.connectionStringName == null ? Input.empty() : this.connectionStringName;
    }

    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    @InputImport(name="databaseType", required=true)
    private final Input<Either<String,DatabaseType>> databaseType;

    public Input<Either<String,DatabaseType>> getDatabaseType() {
        return this.databaseType;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DatabaseBackupSettingArgs(
        @Nullable Input<String> connectionString,
        @Nullable Input<String> connectionStringName,
        Input<Either<String,DatabaseType>> databaseType,
        @Nullable Input<String> name) {
        this.connectionString = connectionString;
        this.connectionStringName = connectionStringName;
        this.databaseType = Objects.requireNonNull(databaseType, "expected parameter 'databaseType' to be non-null");
        this.name = name;
    }

    private DatabaseBackupSettingArgs() {
        this.connectionString = Input.empty();
        this.connectionStringName = Input.empty();
        this.databaseType = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionString;
        private @Nullable Input<String> connectionStringName;
        private Input<Either<String,DatabaseType>> databaseType;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBackupSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.connectionStringName = defaults.connectionStringName;
    	      this.databaseType = defaults.databaseType;
    	      this.name = defaults.name;
        }

        public Builder setConnectionString(@Nullable Input<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder setConnectionStringName(@Nullable Input<String> connectionStringName) {
            this.connectionStringName = connectionStringName;
            return this;
        }

        public Builder setConnectionStringName(@Nullable String connectionStringName) {
            this.connectionStringName = Input.ofNullable(connectionStringName);
            return this;
        }

        public Builder setDatabaseType(Input<Either<String,DatabaseType>> databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder setDatabaseType(Either<String,DatabaseType> databaseType) {
            this.databaseType = Input.of(Objects.requireNonNull(databaseType));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public DatabaseBackupSettingArgs build() {
            return new DatabaseBackupSettingArgs(connectionString, connectionStringName, databaseType, name);
        }
    }
}
