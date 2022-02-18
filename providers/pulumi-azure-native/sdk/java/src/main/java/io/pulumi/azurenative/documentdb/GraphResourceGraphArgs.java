// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.GraphResourceArgs;
import io.pulumi.azurenative.documentdb.inputs.ManagedServiceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphResourceGraphArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphResourceGraphArgs Empty = new GraphResourceGraphArgs();

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
     * Cosmos DB graph resource name.
     * 
     */
    @InputImport(name="graphName")
    private final @Nullable Input<String> graphName;

    public Input<String> getGraphName() {
        return this.graphName == null ? Input.empty() : this.graphName;
    }

    /**
     * Identity for the resource.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
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
     * The standard JSON format of a Graph resource
     * 
     */
    @InputImport(name="resource", required=true)
    private final Input<GraphResourceArgs> resource;

    public Input<GraphResourceArgs> getResource() {
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

    public GraphResourceGraphArgs(
        Input<String> accountName,
        @Nullable Input<String> graphName,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<CreateUpdateOptionsArgs> options,
        Input<GraphResourceArgs> resource,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.graphName = graphName;
        this.identity = identity;
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private GraphResourceGraphArgs() {
        this.accountName = Input.empty();
        this.graphName = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.options = Input.empty();
        this.resource = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphResourceGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> graphName;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<CreateUpdateOptionsArgs> options;
        private Input<GraphResourceArgs> resource;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphResourceGraphArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.graphName = defaults.graphName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setGraphName(@Nullable Input<String> graphName) {
            this.graphName = graphName;
            return this;
        }

        public Builder setGraphName(@Nullable String graphName) {
            this.graphName = Input.ofNullable(graphName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setResource(Input<GraphResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(GraphResourceArgs resource) {
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

        public GraphResourceGraphArgs build() {
            return new GraphResourceGraphArgs(accountName, graphName, identity, location, options, resource, resourceGroupName, tags);
        }
    }
}
