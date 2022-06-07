// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCassandraResourceCassandraTablePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCassandraResourceCassandraTablePlainArgs Empty = new GetCassandraResourceCassandraTablePlainArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB keyspace name.
     * 
     */
    @Import(name="keyspaceName", required=true)
    private String keyspaceName;

    /**
     * @return Cosmos DB keyspace name.
     * 
     */
    public String keyspaceName() {
        return this.keyspaceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB table name.
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    /**
     * @return Cosmos DB table name.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    private GetCassandraResourceCassandraTablePlainArgs() {}

    private GetCassandraResourceCassandraTablePlainArgs(GetCassandraResourceCassandraTablePlainArgs $) {
        this.accountName = $.accountName;
        this.keyspaceName = $.keyspaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCassandraResourceCassandraTablePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCassandraResourceCassandraTablePlainArgs $;

        public Builder() {
            $ = new GetCassandraResourceCassandraTablePlainArgs();
        }

        public Builder(GetCassandraResourceCassandraTablePlainArgs defaults) {
            $ = new GetCassandraResourceCassandraTablePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param keyspaceName Cosmos DB keyspace name.
         * 
         * @return builder
         * 
         */
        public Builder keyspaceName(String keyspaceName) {
            $.keyspaceName = keyspaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tableName Cosmos DB table name.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public GetCassandraResourceCassandraTablePlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.keyspaceName = Objects.requireNonNull($.keyspaceName, "expected parameter 'keyspaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
