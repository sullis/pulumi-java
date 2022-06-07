// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.GetRegistryDataAssetsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryDataAssetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryDataAssetsPlainArgs Empty = new GetRegistryDataAssetsPlainArgs();

    /**
     * Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
     * 
     */
    @Import(name="endpointIds")
    private @Nullable List<String> endpointIds;

    /**
     * @return Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
     * 
     */
    public Optional<List<String>> endpointIds() {
        return Optional.ofNullable(this.endpointIds);
    }

    /**
     * Endpoints which will be excluded while listing dataAssets
     * 
     */
    @Import(name="excludeEndpointIds")
    private @Nullable List<String> excludeEndpointIds;

    /**
     * @return Endpoints which will be excluded while listing dataAssets
     * 
     */
    public Optional<List<String>> excludeEndpointIds() {
        return Optional.ofNullable(this.excludeEndpointIds);
    }

    /**
     * Types which wont be listed while listing dataAsset/Connection
     * 
     */
    @Import(name="excludeTypes")
    private @Nullable List<String> excludeTypes;

    /**
     * @return Types which wont be listed while listing dataAsset/Connection
     * 
     */
    public Optional<List<String>> excludeTypes() {
        return Optional.ofNullable(this.excludeTypes);
    }

    /**
     * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     * 
     */
    @Import(name="favoritesQueryParam")
    private @Nullable String favoritesQueryParam;

    /**
     * @return If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     * 
     */
    public Optional<String> favoritesQueryParam() {
        return Optional.ofNullable(this.favoritesQueryParam);
    }

    /**
     * Specifies the fields to get for an object.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return Specifies the fields to get for an object.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    @Import(name="filters")
    private @Nullable List<GetRegistryDataAssetsFilter> filters;

    public Optional<List<GetRegistryDataAssetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Unique key of the folder.
     * 
     */
    @Import(name="folderId")
    private @Nullable String folderId;

    /**
     * @return Unique key of the folder.
     * 
     */
    public Optional<String> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * DataAsset type which needs to be listed while listing dataAssets
     * 
     */
    @Import(name="includeTypes")
    private @Nullable List<String> includeTypes;

    /**
     * @return DataAsset type which needs to be listed while listing dataAssets
     * 
     */
    public Optional<List<String>> includeTypes() {
        return Optional.ofNullable(this.includeTypes);
    }

    /**
     * Used to filter by the name of the object.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Used to filter by the name of the object.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    /**
     * Specific DataAsset Type
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Specific DataAsset Type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetRegistryDataAssetsPlainArgs() {}

    private GetRegistryDataAssetsPlainArgs(GetRegistryDataAssetsPlainArgs $) {
        this.endpointIds = $.endpointIds;
        this.excludeEndpointIds = $.excludeEndpointIds;
        this.excludeTypes = $.excludeTypes;
        this.favoritesQueryParam = $.favoritesQueryParam;
        this.fields = $.fields;
        this.filters = $.filters;
        this.folderId = $.folderId;
        this.includeTypes = $.includeTypes;
        this.name = $.name;
        this.registryId = $.registryId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryDataAssetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryDataAssetsPlainArgs $;

        public Builder() {
            $ = new GetRegistryDataAssetsPlainArgs();
        }

        public Builder(GetRegistryDataAssetsPlainArgs defaults) {
            $ = new GetRegistryDataAssetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointIds Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointIds(@Nullable List<String> endpointIds) {
            $.endpointIds = endpointIds;
            return this;
        }

        /**
         * @param endpointIds Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointIds(String... endpointIds) {
            return endpointIds(List.of(endpointIds));
        }

        /**
         * @param excludeEndpointIds Endpoints which will be excluded while listing dataAssets
         * 
         * @return builder
         * 
         */
        public Builder excludeEndpointIds(@Nullable List<String> excludeEndpointIds) {
            $.excludeEndpointIds = excludeEndpointIds;
            return this;
        }

        /**
         * @param excludeEndpointIds Endpoints which will be excluded while listing dataAssets
         * 
         * @return builder
         * 
         */
        public Builder excludeEndpointIds(String... excludeEndpointIds) {
            return excludeEndpointIds(List.of(excludeEndpointIds));
        }

        /**
         * @param excludeTypes Types which wont be listed while listing dataAsset/Connection
         * 
         * @return builder
         * 
         */
        public Builder excludeTypes(@Nullable List<String> excludeTypes) {
            $.excludeTypes = excludeTypes;
            return this;
        }

        /**
         * @param excludeTypes Types which wont be listed while listing dataAsset/Connection
         * 
         * @return builder
         * 
         */
        public Builder excludeTypes(String... excludeTypes) {
            return excludeTypes(List.of(excludeTypes));
        }

        /**
         * @param favoritesQueryParam If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
         * 
         * @return builder
         * 
         */
        public Builder favoritesQueryParam(@Nullable String favoritesQueryParam) {
            $.favoritesQueryParam = favoritesQueryParam;
            return this;
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        public Builder filters(@Nullable List<GetRegistryDataAssetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRegistryDataAssetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param folderId Unique key of the folder.
         * 
         * @return builder
         * 
         */
        public Builder folderId(@Nullable String folderId) {
            $.folderId = folderId;
            return this;
        }

        /**
         * @param includeTypes DataAsset type which needs to be listed while listing dataAssets
         * 
         * @return builder
         * 
         */
        public Builder includeTypes(@Nullable List<String> includeTypes) {
            $.includeTypes = includeTypes;
            return this;
        }

        /**
         * @param includeTypes DataAsset type which needs to be listed while listing dataAssets
         * 
         * @return builder
         * 
         */
        public Builder includeTypes(String... includeTypes) {
            return includeTypes(List.of(includeTypes));
        }

        /**
         * @param name Used to filter by the name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param type Specific DataAsset Type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetRegistryDataAssetsPlainArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
