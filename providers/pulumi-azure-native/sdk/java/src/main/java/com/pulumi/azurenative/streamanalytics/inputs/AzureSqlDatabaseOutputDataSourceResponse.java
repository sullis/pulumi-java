// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Azure SQL database output data source.
 * 
 */
public final class AzureSqlDatabaseOutputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureSqlDatabaseOutputDataSourceResponse Empty = new AzureSqlDatabaseOutputDataSourceResponse();

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="database")
    private @Nullable String database;

    /**
     * @return The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="password")
    private @Nullable String password;

    /**
     * @return The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="server")
    private @Nullable String server;

    /**
     * @return The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }

    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
    private @Nullable String table;

    /**
     * @return The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Sql/Server/Database&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Sql/Server/Database&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="user")
    private @Nullable String user;

    /**
     * @return The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    private AzureSqlDatabaseOutputDataSourceResponse() {}

    private AzureSqlDatabaseOutputDataSourceResponse(AzureSqlDatabaseOutputDataSourceResponse $) {
        this.database = $.database;
        this.password = $.password;
        this.server = $.server;
        this.table = $.table;
        this.type = $.type;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSqlDatabaseOutputDataSourceResponse $;

        public Builder() {
            $ = new AzureSqlDatabaseOutputDataSourceResponse();
        }

        public Builder(AzureSqlDatabaseOutputDataSourceResponse defaults) {
            $ = new AzureSqlDatabaseOutputDataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable String database) {
            $.database = database;
            return this;
        }

        /**
         * @param password The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable String password) {
            $.password = password;
            return this;
        }

        /**
         * @param server The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable String server) {
            $.server = server;
            return this;
        }

        /**
         * @param table The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable String table) {
            $.table = table;
            return this;
        }

        /**
         * @param type Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Sql/Server/Database&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param user The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable String user) {
            $.user = user;
            return this;
        }

        public AzureSqlDatabaseOutputDataSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
