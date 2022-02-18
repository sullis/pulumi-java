// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFavoriteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFavoriteArgs Empty = new GetFavoriteArgs();

    /**
     * The Id of a specific favorite defined in the Application Insights component
     * 
     */
    @InputImport(name="favoriteId", required=true)
    private final String favoriteId;

    public String getFavoriteId() {
        return this.favoriteId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetFavoriteArgs(
        String favoriteId,
        String resourceGroupName,
        String resourceName) {
        this.favoriteId = Objects.requireNonNull(favoriteId, "expected parameter 'favoriteId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetFavoriteArgs() {
        this.favoriteId = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFavoriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String favoriteId;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFavoriteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.favoriteId = defaults.favoriteId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setFavoriteId(String favoriteId) {
            this.favoriteId = Objects.requireNonNull(favoriteId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public GetFavoriteArgs build() {
            return new GetFavoriteArgs(favoriteId, resourceGroupName, resourceName);
        }
    }
}
