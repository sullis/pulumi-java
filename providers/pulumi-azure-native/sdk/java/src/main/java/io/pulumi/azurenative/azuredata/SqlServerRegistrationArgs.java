// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlServerRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerRegistrationArgs Empty = new SqlServerRegistrationArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional Properties as JSON string
     * 
     */
    @InputImport(name="propertyBag")
    private final @Nullable Input<String> propertyBag;

    public Input<String> getPropertyBag() {
        return this.propertyBag == null ? Input.empty() : this.propertyBag;
    }

    /**
     * Resource Group Name
     * 
     */
    @InputImport(name="resourceGroup")
    private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Server registration.
     * 
     */
    @InputImport(name="sqlServerRegistrationName")
    private final @Nullable Input<String> sqlServerRegistrationName;

    public Input<String> getSqlServerRegistrationName() {
        return this.sqlServerRegistrationName == null ? Input.empty() : this.sqlServerRegistrationName;
    }

    /**
     * Subscription Id
     * 
     */
    @InputImport(name="subscriptionId")
    private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SqlServerRegistrationArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> propertyBag,
        @Nullable Input<String> resourceGroup,
        Input<String> resourceGroupName,
        @Nullable Input<String> sqlServerRegistrationName,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.propertyBag = propertyBag;
        this.resourceGroup = resourceGroup;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlServerRegistrationName = sqlServerRegistrationName;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    private SqlServerRegistrationArgs() {
        this.location = Input.empty();
        this.propertyBag = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sqlServerRegistrationName = Input.empty();
        this.subscriptionId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> propertyBag;
        private @Nullable Input<String> resourceGroup;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sqlServerRegistrationName;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.propertyBag = defaults.propertyBag;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlServerRegistrationName = defaults.sqlServerRegistrationName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPropertyBag(@Nullable Input<String> propertyBag) {
            this.propertyBag = propertyBag;
            return this;
        }

        public Builder setPropertyBag(@Nullable String propertyBag) {
            this.propertyBag = Input.ofNullable(propertyBag);
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
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

        public Builder setSqlServerRegistrationName(@Nullable Input<String> sqlServerRegistrationName) {
            this.sqlServerRegistrationName = sqlServerRegistrationName;
            return this;
        }

        public Builder setSqlServerRegistrationName(@Nullable String sqlServerRegistrationName) {
            this.sqlServerRegistrationName = Input.ofNullable(sqlServerRegistrationName);
            return this;
        }

        public Builder setSubscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
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

        public SqlServerRegistrationArgs build() {
            return new SqlServerRegistrationArgs(location, propertyBag, resourceGroup, resourceGroupName, sqlServerRegistrationName, subscriptionId, tags);
        }
    }
}
