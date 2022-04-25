// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.NodeMonitoringDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListSqlMigrationServiceMonitoringDataResult {
    /**
     * @return The name of Integration Runtime.
     * 
     */
    private final String name;
    /**
     * @return Integration Runtime node monitoring data.
     * 
     */
    private final List<NodeMonitoringDataResponse> nodes;

    @CustomType.Constructor
    private ListSqlMigrationServiceMonitoringDataResult(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodes") List<NodeMonitoringDataResponse> nodes) {
        this.name = name;
        this.nodes = nodes;
    }

    /**
     * @return The name of Integration Runtime.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Integration Runtime node monitoring data.
     * 
     */
    public List<NodeMonitoringDataResponse> nodes() {
        return this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSqlMigrationServiceMonitoringDataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<NodeMonitoringDataResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSqlMigrationServiceMonitoringDataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodes(List<NodeMonitoringDataResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(NodeMonitoringDataResponse... nodes) {
            return nodes(List.of(nodes));
        }        public ListSqlMigrationServiceMonitoringDataResult build() {
            return new ListSqlMigrationServiceMonitoringDataResult(name, nodes);
        }
    }
}
