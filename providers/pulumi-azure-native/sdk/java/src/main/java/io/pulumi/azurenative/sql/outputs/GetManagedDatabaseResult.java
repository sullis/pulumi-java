// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedDatabaseResult {
    /**
     * Collation of the metadata catalog.
     * 
     */
    private final @Nullable String catalogCollation;
    /**
     * Collation of the managed database.
     * 
     */
    private final @Nullable String collation;
    /**
     * Creation date of the database.
     * 
     */
    private final String creationDate;
    /**
     * Geo paired region.
     * 
     */
    private final String defaultSecondaryLocation;
    /**
     * Earliest restore point in time for point in time restore.
     * 
     */
    private final String earliestRestorePoint;
    /**
     * Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    private final String failoverGroupId;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Status of the database.
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"catalogCollation","collation","creationDate","defaultSecondaryLocation","earliestRestorePoint","failoverGroupId","id","location","name","status","tags","type"})
    private GetManagedDatabaseResult(
        @Nullable String catalogCollation,
        @Nullable String collation,
        String creationDate,
        String defaultSecondaryLocation,
        String earliestRestorePoint,
        String failoverGroupId,
        String id,
        String location,
        String name,
        String status,
        @Nullable Map<String,String> tags,
        String type) {
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.creationDate = Objects.requireNonNull(creationDate);
        this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
        this.earliestRestorePoint = Objects.requireNonNull(earliestRestorePoint);
        this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Collation of the metadata catalog.
     * 
     */
    public Optional<String> getCatalogCollation() {
        return Optional.ofNullable(this.catalogCollation);
    }
    /**
     * Collation of the managed database.
     * 
     */
    public Optional<String> getCollation() {
        return Optional.ofNullable(this.collation);
    }
    /**
     * Creation date of the database.
     * 
     */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Geo paired region.
     * 
     */
    public String getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * Earliest restore point in time for point in time restore.
     * 
     */
    public String getEarliestRestorePoint() {
        return this.earliestRestorePoint;
    }
    /**
     * Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    public String getFailoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Status of the database.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogCollation;
        private @Nullable String collation;
        private String creationDate;
        private String defaultSecondaryLocation;
        private String earliestRestorePoint;
        private String failoverGroupId;
        private String id;
        private String location;
        private String name;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.creationDate = defaults.creationDate;
    	      this.defaultSecondaryLocation = defaults.defaultSecondaryLocation;
    	      this.earliestRestorePoint = defaults.earliestRestorePoint;
    	      this.failoverGroupId = defaults.failoverGroupId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCatalogCollation(@Nullable String catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setDefaultSecondaryLocation(String defaultSecondaryLocation) {
            this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
            return this;
        }

        public Builder setEarliestRestorePoint(String earliestRestorePoint) {
            this.earliestRestorePoint = Objects.requireNonNull(earliestRestorePoint);
            return this;
        }

        public Builder setFailoverGroupId(String failoverGroupId) {
            this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetManagedDatabaseResult build() {
            return new GetManagedDatabaseResult(catalogCollation, collation, creationDate, defaultSecondaryLocation, earliestRestorePoint, failoverGroupId, id, location, name, status, tags, type);
        }
    }
}
