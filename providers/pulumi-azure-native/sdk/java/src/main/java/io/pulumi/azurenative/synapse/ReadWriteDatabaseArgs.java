// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadWriteDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReadWriteDatabaseArgs Empty = new ReadWriteDatabaseArgs();

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    @InputImport(name="hotCachePeriod")
      private final @Nullable Input<String> hotCachePeriod;

    public Input<String> getHotCachePeriod() {
        return this.hotCachePeriod == null ? Input.empty() : this.hotCachePeriod;
    }

    /**
     * Kind of the database
     * Expected value is 'ReadWrite'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @InputImport(name="kustoPoolName", required=true)
      private final Input<String> kustoPoolName;

    public Input<String> getKustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    @InputImport(name="softDeletePeriod")
      private final @Nullable Input<String> softDeletePeriod;

    public Input<String> getSoftDeletePeriod() {
        return this.softDeletePeriod == null ? Input.empty() : this.softDeletePeriod;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ReadWriteDatabaseArgs(
        @Nullable Input<String> databaseName,
        @Nullable Input<String> hotCachePeriod,
        Input<String> kind,
        Input<String> kustoPoolName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> softDeletePeriod,
        Input<String> workspaceName) {
        this.databaseName = databaseName;
        this.hotCachePeriod = hotCachePeriod;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.softDeletePeriod = softDeletePeriod;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ReadWriteDatabaseArgs() {
        this.databaseName = Input.empty();
        this.hotCachePeriod = Input.empty();
        this.kind = Input.empty();
        this.kustoPoolName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.softDeletePeriod = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadWriteDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> hotCachePeriod;
        private Input<String> kind;
        private Input<String> kustoPoolName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> softDeletePeriod;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadWriteDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.hotCachePeriod = defaults.hotCachePeriod;
    	      this.kind = defaults.kind;
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.softDeletePeriod = defaults.softDeletePeriod;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setHotCachePeriod(@Nullable Input<String> hotCachePeriod) {
            this.hotCachePeriod = hotCachePeriod;
            return this;
        }

        public Builder setHotCachePeriod(@Nullable String hotCachePeriod) {
            this.hotCachePeriod = Input.ofNullable(hotCachePeriod);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setKustoPoolName(Input<String> kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }

        public Builder setKustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Input.of(Objects.requireNonNull(kustoPoolName));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSoftDeletePeriod(@Nullable Input<String> softDeletePeriod) {
            this.softDeletePeriod = softDeletePeriod;
            return this;
        }

        public Builder setSoftDeletePeriod(@Nullable String softDeletePeriod) {
            this.softDeletePeriod = Input.ofNullable(softDeletePeriod);
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
        public ReadWriteDatabaseArgs build() {
            return new ReadWriteDatabaseArgs(databaseName, hotCachePeriod, kind, kustoPoolName, location, resourceGroupName, softDeletePeriod, workspaceName);
        }
    }
}