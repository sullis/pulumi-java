// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.WatchlistUserInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WatchlistItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final WatchlistItemArgs Empty = new WatchlistItemArgs();

    /**
     * The time the watchlist item was created
     * 
     */
    @InputImport(name="created")
      private final @Nullable Input<String> created;

    public Input<String> getCreated() {
        return this.created == null ? Input.empty() : this.created;
    }

    /**
     * Describes a user that created the watchlist item
     * 
     */
    @InputImport(name="createdBy")
      private final @Nullable Input<WatchlistUserInfoArgs> createdBy;

    public Input<WatchlistUserInfoArgs> getCreatedBy() {
        return this.createdBy == null ? Input.empty() : this.createdBy;
    }

    /**
     * key-value pairs for a watchlist item entity mapping
     * 
     */
    @InputImport(name="entityMapping")
      private final @Nullable Input<Object> entityMapping;

    public Input<Object> getEntityMapping() {
        return this.entityMapping == null ? Input.empty() : this.entityMapping;
    }

    /**
     * A flag that indicates if the watchlist item is deleted or not
     * 
     */
    @InputImport(name="isDeleted")
      private final @Nullable Input<Boolean> isDeleted;

    public Input<Boolean> getIsDeleted() {
        return this.isDeleted == null ? Input.empty() : this.isDeleted;
    }

    /**
     * key-value pairs for a watchlist item
     * 
     */
    @InputImport(name="itemsKeyValue", required=true)
      private final Input<Object> itemsKeyValue;

    public Input<Object> getItemsKeyValue() {
        return this.itemsKeyValue;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
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
     * The tenantId to which the watchlist item belongs to
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * The last time the watchlist item was updated
     * 
     */
    @InputImport(name="updated")
      private final @Nullable Input<String> updated;

    public Input<String> getUpdated() {
        return this.updated == null ? Input.empty() : this.updated;
    }

    /**
     * Describes a user that updated the watchlist item
     * 
     */
    @InputImport(name="updatedBy")
      private final @Nullable Input<WatchlistUserInfoArgs> updatedBy;

    public Input<WatchlistUserInfoArgs> getUpdatedBy() {
        return this.updatedBy == null ? Input.empty() : this.updatedBy;
    }

    /**
     * Watchlist Alias
     * 
     */
    @InputImport(name="watchlistAlias", required=true)
      private final Input<String> watchlistAlias;

    public Input<String> getWatchlistAlias() {
        return this.watchlistAlias;
    }

    /**
     * The id (a Guid) of the watchlist item
     * 
     */
    @InputImport(name="watchlistItemId")
      private final @Nullable Input<String> watchlistItemId;

    public Input<String> getWatchlistItemId() {
        return this.watchlistItemId == null ? Input.empty() : this.watchlistItemId;
    }

    /**
     * The type of the watchlist item
     * 
     */
    @InputImport(name="watchlistItemType")
      private final @Nullable Input<String> watchlistItemType;

    public Input<String> getWatchlistItemType() {
        return this.watchlistItemType == null ? Input.empty() : this.watchlistItemType;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public WatchlistItemArgs(
        @Nullable Input<String> created,
        @Nullable Input<WatchlistUserInfoArgs> createdBy,
        @Nullable Input<Object> entityMapping,
        @Nullable Input<Boolean> isDeleted,
        Input<Object> itemsKeyValue,
        Input<String> operationalInsightsResourceProvider,
        Input<String> resourceGroupName,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> updated,
        @Nullable Input<WatchlistUserInfoArgs> updatedBy,
        Input<String> watchlistAlias,
        @Nullable Input<String> watchlistItemId,
        @Nullable Input<String> watchlistItemType,
        Input<String> workspaceName) {
        this.created = created;
        this.createdBy = createdBy;
        this.entityMapping = entityMapping;
        this.isDeleted = isDeleted;
        this.itemsKeyValue = Objects.requireNonNull(itemsKeyValue, "expected parameter 'itemsKeyValue' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tenantId = tenantId;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.watchlistAlias = Objects.requireNonNull(watchlistAlias, "expected parameter 'watchlistAlias' to be non-null");
        this.watchlistItemId = watchlistItemId;
        this.watchlistItemType = watchlistItemType;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private WatchlistItemArgs() {
        this.created = Input.empty();
        this.createdBy = Input.empty();
        this.entityMapping = Input.empty();
        this.isDeleted = Input.empty();
        this.itemsKeyValue = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tenantId = Input.empty();
        this.updated = Input.empty();
        this.updatedBy = Input.empty();
        this.watchlistAlias = Input.empty();
        this.watchlistItemId = Input.empty();
        this.watchlistItemType = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WatchlistItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> created;
        private @Nullable Input<WatchlistUserInfoArgs> createdBy;
        private @Nullable Input<Object> entityMapping;
        private @Nullable Input<Boolean> isDeleted;
        private Input<Object> itemsKeyValue;
        private Input<String> operationalInsightsResourceProvider;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> updated;
        private @Nullable Input<WatchlistUserInfoArgs> updatedBy;
        private Input<String> watchlistAlias;
        private @Nullable Input<String> watchlistItemId;
        private @Nullable Input<String> watchlistItemType;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WatchlistItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.entityMapping = defaults.entityMapping;
    	      this.isDeleted = defaults.isDeleted;
    	      this.itemsKeyValue = defaults.itemsKeyValue;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tenantId = defaults.tenantId;
    	      this.updated = defaults.updated;
    	      this.updatedBy = defaults.updatedBy;
    	      this.watchlistAlias = defaults.watchlistAlias;
    	      this.watchlistItemId = defaults.watchlistItemId;
    	      this.watchlistItemType = defaults.watchlistItemType;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setCreated(@Nullable Input<String> created) {
            this.created = created;
            return this;
        }

        public Builder setCreated(@Nullable String created) {
            this.created = Input.ofNullable(created);
            return this;
        }

        public Builder setCreatedBy(@Nullable Input<WatchlistUserInfoArgs> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedBy(@Nullable WatchlistUserInfoArgs createdBy) {
            this.createdBy = Input.ofNullable(createdBy);
            return this;
        }

        public Builder setEntityMapping(@Nullable Input<Object> entityMapping) {
            this.entityMapping = entityMapping;
            return this;
        }

        public Builder setEntityMapping(@Nullable Object entityMapping) {
            this.entityMapping = Input.ofNullable(entityMapping);
            return this;
        }

        public Builder setIsDeleted(@Nullable Input<Boolean> isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder setIsDeleted(@Nullable Boolean isDeleted) {
            this.isDeleted = Input.ofNullable(isDeleted);
            return this;
        }

        public Builder setItemsKeyValue(Input<Object> itemsKeyValue) {
            this.itemsKeyValue = Objects.requireNonNull(itemsKeyValue);
            return this;
        }

        public Builder setItemsKeyValue(Object itemsKeyValue) {
            this.itemsKeyValue = Input.of(Objects.requireNonNull(itemsKeyValue));
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
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

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setUpdated(@Nullable Input<String> updated) {
            this.updated = updated;
            return this;
        }

        public Builder setUpdated(@Nullable String updated) {
            this.updated = Input.ofNullable(updated);
            return this;
        }

        public Builder setUpdatedBy(@Nullable Input<WatchlistUserInfoArgs> updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder setUpdatedBy(@Nullable WatchlistUserInfoArgs updatedBy) {
            this.updatedBy = Input.ofNullable(updatedBy);
            return this;
        }

        public Builder setWatchlistAlias(Input<String> watchlistAlias) {
            this.watchlistAlias = Objects.requireNonNull(watchlistAlias);
            return this;
        }

        public Builder setWatchlistAlias(String watchlistAlias) {
            this.watchlistAlias = Input.of(Objects.requireNonNull(watchlistAlias));
            return this;
        }

        public Builder setWatchlistItemId(@Nullable Input<String> watchlistItemId) {
            this.watchlistItemId = watchlistItemId;
            return this;
        }

        public Builder setWatchlistItemId(@Nullable String watchlistItemId) {
            this.watchlistItemId = Input.ofNullable(watchlistItemId);
            return this;
        }

        public Builder setWatchlistItemType(@Nullable Input<String> watchlistItemType) {
            this.watchlistItemType = watchlistItemType;
            return this;
        }

        public Builder setWatchlistItemType(@Nullable String watchlistItemType) {
            this.watchlistItemType = Input.ofNullable(watchlistItemType);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public WatchlistItemArgs build() {
            return new WatchlistItemArgs(created, createdBy, entityMapping, isDeleted, itemsKeyValue, operationalInsightsResourceProvider, resourceGroupName, tenantId, updated, updatedBy, watchlistAlias, watchlistItemId, watchlistItemType, workspaceName);
        }
    }
}