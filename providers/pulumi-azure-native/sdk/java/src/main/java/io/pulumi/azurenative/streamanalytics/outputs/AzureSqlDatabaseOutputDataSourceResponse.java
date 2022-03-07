// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureSqlDatabaseOutputDataSourceResponse {
    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String database;
    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String password;
    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String server;
    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String table;
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
     */
    private final String type;
    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String user;

    @OutputCustomType.Constructor({"database","password","server","table","type","user"})
    private AzureSqlDatabaseOutputDataSourceResponse(
        @Nullable String database,
        @Nullable String password,
        @Nullable String server,
        @Nullable String table,
        String type,
        @Nullable String user) {
        this.database = database;
        this.password = password;
        this.server = server;
        this.table = table;
        this.type = Objects.requireNonNull(type);
        this.user = user;
    }

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getDatabase() {
        return Optional.ofNullable(this.database);
    }
    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getServer() {
        return Optional.ofNullable(this.server);
    }
    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getTable() {
        return Optional.ofNullable(this.table);
    }
    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String database;
        private @Nullable String password;
        private @Nullable String server;
        private @Nullable String table;
        private String type;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = database;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setServer(@Nullable String server) {
            this.server = server;
            return this;
        }

        public Builder setTable(@Nullable String table) {
            this.table = table;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = user;
            return this;
        }
        public AzureSqlDatabaseOutputDataSourceResponse build() {
            return new AzureSqlDatabaseOutputDataSourceResponse(database, password, server, table, type, user);
        }
    }
}