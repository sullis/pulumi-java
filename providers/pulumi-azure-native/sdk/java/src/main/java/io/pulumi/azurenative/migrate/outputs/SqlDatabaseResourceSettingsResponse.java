// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlDatabaseResourceSettingsResponse {
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Sql/servers/databases'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * Defines the zone redundant resource setting.
     * 
     */
    private final @Nullable String zoneRedundant;

    @OutputCustomType.Constructor({"resourceType","targetResourceName","zoneRedundant"})
    private SqlDatabaseResourceSettingsResponse(
        String resourceType,
        String targetResourceName,
        @Nullable String zoneRedundant) {
        this.resourceType = Objects.requireNonNull(resourceType);
        this.targetResourceName = Objects.requireNonNull(targetResourceName);
        this.zoneRedundant = zoneRedundant;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Sql/servers/databases'.
     * 
     */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets the target Resource name.
     * 
     */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }
    /**
     * Defines the zone redundant resource setting.
     * 
     */
    public Optional<String> getZoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDatabaseResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;
        private @Nullable String zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDatabaseResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setZoneRedundant(@Nullable String zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public SqlDatabaseResourceSettingsResponse build() {
            return new SqlDatabaseResourceSettingsResponse(resourceType, targetResourceName, zoneRedundant);
        }
    }
}
