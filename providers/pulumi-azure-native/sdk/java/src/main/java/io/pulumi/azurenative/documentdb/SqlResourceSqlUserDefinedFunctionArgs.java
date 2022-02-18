// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.SqlUserDefinedFunctionResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlResourceSqlUserDefinedFunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlResourceSqlUserDefinedFunctionArgs Empty = new SqlResourceSqlUserDefinedFunctionArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @InputImport(name="containerName", required=true)
    private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<CreateUpdateOptionsArgs> options;

    public Input<CreateUpdateOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * The standard JSON format of a userDefinedFunction
     * 
     */
    @InputImport(name="resource", required=true)
    private final Input<SqlUserDefinedFunctionResourceArgs> resource;

    public Input<SqlUserDefinedFunctionResourceArgs> getResource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Cosmos DB userDefinedFunction name.
     * 
     */
    @InputImport(name="userDefinedFunctionName")
    private final @Nullable Input<String> userDefinedFunctionName;

    public Input<String> getUserDefinedFunctionName() {
        return this.userDefinedFunctionName == null ? Input.empty() : this.userDefinedFunctionName;
    }

    public SqlResourceSqlUserDefinedFunctionArgs(
        Input<String> accountName,
        Input<String> containerName,
        Input<String> databaseName,
        @Nullable Input<String> location,
        @Nullable Input<CreateUpdateOptionsArgs> options,
        Input<SqlUserDefinedFunctionResourceArgs> resource,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> userDefinedFunctionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.userDefinedFunctionName = userDefinedFunctionName;
    }

    private SqlResourceSqlUserDefinedFunctionArgs() {
        this.accountName = Input.empty();
        this.containerName = Input.empty();
        this.databaseName = Input.empty();
        this.location = Input.empty();
        this.options = Input.empty();
        this.resource = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.userDefinedFunctionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlResourceSqlUserDefinedFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> containerName;
        private Input<String> databaseName;
        private @Nullable Input<String> location;
        private @Nullable Input<CreateUpdateOptionsArgs> options;
        private Input<SqlUserDefinedFunctionResourceArgs> resource;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> userDefinedFunctionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlResourceSqlUserDefinedFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.userDefinedFunctionName = defaults.userDefinedFunctionName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOptions(@Nullable Input<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setResource(Input<SqlUserDefinedFunctionResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(SqlUserDefinedFunctionResourceArgs resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserDefinedFunctionName(@Nullable Input<String> userDefinedFunctionName) {
            this.userDefinedFunctionName = userDefinedFunctionName;
            return this;
        }

        public Builder setUserDefinedFunctionName(@Nullable String userDefinedFunctionName) {
            this.userDefinedFunctionName = Input.ofNullable(userDefinedFunctionName);
            return this;
        }

        public SqlResourceSqlUserDefinedFunctionArgs build() {
            return new SqlResourceSqlUserDefinedFunctionArgs(accountName, containerName, databaseName, location, options, resource, resourceGroupName, tags, userDefinedFunctionName);
        }
    }
}
