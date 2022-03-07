// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.azurearcdata.inputs.PostgresInstancePropertiesArgs;
import io.pulumi.azurenative.azurearcdata.inputs.PostgresInstanceSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PostgresInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PostgresInstanceArgs Empty = new PostgresInstanceArgs();

    /**
     * The extendedLocation of the resource.
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

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
     * Name of PostgresInstance
     * 
     */
    @InputImport(name="postgresInstanceName")
      private final @Nullable Input<String> postgresInstanceName;

    public Input<String> getPostgresInstanceName() {
        return this.postgresInstanceName == null ? Input.empty() : this.postgresInstanceName;
    }

    /**
     * null
     * 
     */
    @InputImport(name="properties", required=true)
      private final Input<PostgresInstancePropertiesArgs> properties;

    public Input<PostgresInstancePropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource sku.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<PostgresInstanceSkuArgs> sku;

    public Input<PostgresInstanceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
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

    public PostgresInstanceArgs(
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> location,
        @Nullable Input<String> postgresInstanceName,
        Input<PostgresInstancePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<PostgresInstanceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.extendedLocation = extendedLocation;
        this.location = location;
        this.postgresInstanceName = postgresInstanceName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private PostgresInstanceArgs() {
        this.extendedLocation = Input.empty();
        this.location = Input.empty();
        this.postgresInstanceName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgresInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> location;
        private @Nullable Input<String> postgresInstanceName;
        private Input<PostgresInstancePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<PostgresInstanceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgresInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.location = defaults.location;
    	      this.postgresInstanceName = defaults.postgresInstanceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
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

        public Builder setPostgresInstanceName(@Nullable Input<String> postgresInstanceName) {
            this.postgresInstanceName = postgresInstanceName;
            return this;
        }

        public Builder setPostgresInstanceName(@Nullable String postgresInstanceName) {
            this.postgresInstanceName = Input.ofNullable(postgresInstanceName);
            return this;
        }

        public Builder setProperties(Input<PostgresInstancePropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(PostgresInstancePropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public Builder setSku(@Nullable Input<PostgresInstanceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable PostgresInstanceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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
        public PostgresInstanceArgs build() {
            return new PostgresInstanceArgs(extendedLocation, location, postgresInstanceName, properties, resourceGroupName, sku, tags);
        }
    }
}