// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.DataCenterResourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CassandraDataCenterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraDataCenterArgs Empty = new CassandraDataCenterArgs();

    /**
     * Managed Cassandra cluster name.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Data center name in a managed Cassandra cluster.
     * 
     */
    @InputImport(name="dataCenterName")
    private final @Nullable Input<String> dataCenterName;

    public Input<String> getDataCenterName() {
        return this.dataCenterName == null ? Input.empty() : this.dataCenterName;
    }

    /**
     * Properties of a managed Cassandra data center.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<DataCenterResourcePropertiesArgs> properties;

    public Input<DataCenterResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
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

    public CassandraDataCenterArgs(
        Input<String> clusterName,
        @Nullable Input<String> dataCenterName,
        @Nullable Input<DataCenterResourcePropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataCenterName = dataCenterName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private CassandraDataCenterArgs() {
        this.clusterName = Input.empty();
        this.dataCenterName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraDataCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> dataCenterName;
        private @Nullable Input<DataCenterResourcePropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraDataCenterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataCenterName = defaults.dataCenterName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setDataCenterName(@Nullable Input<String> dataCenterName) {
            this.dataCenterName = dataCenterName;
            return this;
        }

        public Builder setDataCenterName(@Nullable String dataCenterName) {
            this.dataCenterName = Input.ofNullable(dataCenterName);
            return this;
        }

        public Builder setProperties(@Nullable Input<DataCenterResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable DataCenterResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public CassandraDataCenterArgs build() {
            return new CassandraDataCenterArgs(clusterName, dataCenterName, properties, resourceGroupName);
        }
    }
}
