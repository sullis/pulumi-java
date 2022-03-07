// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.TagResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSavedSearchResult {
    /**
     * The category of the saved search. This helps the user to find a saved search faster.
     * 
     */
    private final String category;
    /**
     * Saved search display name.
     * 
     */
    private final String displayName;
    /**
     * The ETag of the saved search. To override an existing saved search, use "*" or specify the current Etag
     * 
     */
    private final @Nullable String etag;
    /**
     * The function alias if query serves as a function.
     * 
     */
    private final @Nullable String functionAlias;
    /**
     * The optional function parameters if query serves as a function. Value should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For more examples and proper syntax please refer to https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     * 
     */
    private final @Nullable String functionParameters;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The query expression for the saved search.
     * 
     */
    private final String query;
    /**
     * The tags attached to the saved search.
     * 
     */
    private final @Nullable List<TagResponse> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * The version number of the query language. The current version is 2 and is the default.
     * 
     */
    private final @Nullable Double version;

    @OutputCustomType.Constructor({"category","displayName","etag","functionAlias","functionParameters","id","name","query","tags","type","version"})
    private GetSavedSearchResult(
        String category,
        String displayName,
        @Nullable String etag,
        @Nullable String functionAlias,
        @Nullable String functionParameters,
        String id,
        String name,
        String query,
        @Nullable List<TagResponse> tags,
        String type,
        @Nullable Double version) {
        this.category = Objects.requireNonNull(category);
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = etag;
        this.functionAlias = functionAlias;
        this.functionParameters = functionParameters;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.query = Objects.requireNonNull(query);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * The category of the saved search. This helps the user to find a saved search faster.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * Saved search display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The ETag of the saved search. To override an existing saved search, use "*" or specify the current Etag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The function alias if query serves as a function.
     * 
    */
    public Optional<String> getFunctionAlias() {
        return Optional.ofNullable(this.functionAlias);
    }
    /**
     * The optional function parameters if query serves as a function. Value should be in the following format: 'param-name1:type1 = default_value1, param-name2:type2 = default_value2'. For more examples and proper syntax please refer to https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     * 
    */
    public Optional<String> getFunctionParameters() {
        return Optional.ofNullable(this.functionParameters);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The query expression for the saved search.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * The tags attached to the saved search.
     * 
    */
    public List<TagResponse> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The version number of the query language. The current version is 2 and is the default.
     * 
    */
    public Optional<Double> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSavedSearchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String displayName;
        private @Nullable String etag;
        private @Nullable String functionAlias;
        private @Nullable String functionParameters;
        private String id;
        private String name;
        private String query;
        private @Nullable List<TagResponse> tags;
        private String type;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSavedSearchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.functionAlias = defaults.functionAlias;
    	      this.functionParameters = defaults.functionParameters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setCategory(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }

        public Builder setFunctionParameters(@Nullable String functionParameters) {
            this.functionParameters = functionParameters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setTags(@Nullable List<TagResponse> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }
        public GetSavedSearchResult build() {
            return new GetSavedSearchResult(category, displayName, etag, functionAlias, functionParameters, id, name, query, tags, type, version);
        }
    }
}