// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A region in which the Azure Cosmos DB database account is deployed.
 * 
 */
public final class LocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationArgs Empty = new LocationArgs();

    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    @InputImport(name="failoverPriority")
      private final @Nullable Input<Integer> failoverPriority;

    public Input<Integer> getFailoverPriority() {
        return this.failoverPriority == null ? Input.empty() : this.failoverPriority;
    }

    /**
     * Flag to indicate whether or not this region is an AvailabilityZone region
     * 
     */
    @InputImport(name="isZoneRedundant")
      private final @Nullable Input<Boolean> isZoneRedundant;

    public Input<Boolean> getIsZoneRedundant() {
        return this.isZoneRedundant == null ? Input.empty() : this.isZoneRedundant;
    }

    /**
     * The name of the region.
     * 
     */
    @InputImport(name="locationName")
      private final @Nullable Input<String> locationName;

    public Input<String> getLocationName() {
        return this.locationName == null ? Input.empty() : this.locationName;
    }

    public LocationArgs(
        @Nullable Input<Integer> failoverPriority,
        @Nullable Input<Boolean> isZoneRedundant,
        @Nullable Input<String> locationName) {
        this.failoverPriority = failoverPriority;
        this.isZoneRedundant = isZoneRedundant;
        this.locationName = locationName;
    }

    private LocationArgs() {
        this.failoverPriority = Input.empty();
        this.isZoneRedundant = Input.empty();
        this.locationName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> failoverPriority;
        private @Nullable Input<Boolean> isZoneRedundant;
        private @Nullable Input<String> locationName;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPriority = defaults.failoverPriority;
    	      this.isZoneRedundant = defaults.isZoneRedundant;
    	      this.locationName = defaults.locationName;
        }

        public Builder setFailoverPriority(@Nullable Input<Integer> failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }

        public Builder setFailoverPriority(@Nullable Integer failoverPriority) {
            this.failoverPriority = Input.ofNullable(failoverPriority);
            return this;
        }

        public Builder setIsZoneRedundant(@Nullable Input<Boolean> isZoneRedundant) {
            this.isZoneRedundant = isZoneRedundant;
            return this;
        }

        public Builder setIsZoneRedundant(@Nullable Boolean isZoneRedundant) {
            this.isZoneRedundant = Input.ofNullable(isZoneRedundant);
            return this;
        }

        public Builder setLocationName(@Nullable Input<String> locationName) {
            this.locationName = locationName;
            return this;
        }

        public Builder setLocationName(@Nullable String locationName) {
            this.locationName = Input.ofNullable(locationName);
            return this;
        }
        public LocationArgs build() {
            return new LocationArgs(failoverPriority, isZoneRedundant, locationName);
        }
    }
}