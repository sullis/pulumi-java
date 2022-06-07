// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.GetDiscoveryJobsResultsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiscoveryJobsResultsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiscoveryJobsResultsPlainArgs Empty = new GetDiscoveryJobsResultsPlainArgs();

    /**
     * A filter to return only a specific column based on column name.
     * 
     */
    @Import(name="columnNames")
    private @Nullable List<String> columnNames;

    /**
     * @return A filter to return only a specific column based on column name.
     * 
     */
    public Optional<List<String>> columnNames() {
        return Optional.ofNullable(this.columnNames);
    }

    /**
     * The OCID of the discovery job.
     * 
     */
    @Import(name="discoveryJobId", required=true)
    private String discoveryJobId;

    /**
     * @return The OCID of the discovery job.
     * 
     */
    public String discoveryJobId() {
        return this.discoveryJobId;
    }

    /**
     * A filter to return only the resources that match the specified discovery type.
     * 
     */
    @Import(name="discoveryType")
    private @Nullable String discoveryType;

    /**
     * @return A filter to return only the resources that match the specified discovery type.
     * 
     */
    public Optional<String> discoveryType() {
        return Optional.ofNullable(this.discoveryType);
    }

    @Import(name="filters")
    private @Nullable List<GetDiscoveryJobsResultsFilter> filters;

    public Optional<List<GetDiscoveryJobsResultsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return the discovery result resources based on the value of their isResultApplied attribute.
     * 
     */
    @Import(name="isResultApplied")
    private @Nullable Boolean isResultApplied;

    /**
     * @return A filter to return the discovery result resources based on the value of their isResultApplied attribute.
     * 
     */
    public Optional<Boolean> isResultApplied() {
        return Optional.ofNullable(this.isResultApplied);
    }

    /**
     * A filter to return only items related to a specific object name.
     * 
     */
    @Import(name="objects")
    private @Nullable List<String> objects;

    /**
     * @return A filter to return only items related to a specific object name.
     * 
     */
    public Optional<List<String>> objects() {
        return Optional.ofNullable(this.objects);
    }

    /**
     * A filter to return only the resources that match the specified planned action.
     * 
     */
    @Import(name="plannedAction")
    private @Nullable String plannedAction;

    /**
     * @return A filter to return only the resources that match the specified planned action.
     * 
     */
    public Optional<String> plannedAction() {
        return Optional.ofNullable(this.plannedAction);
    }

    /**
     * A filter to return only items related to specific schema name.
     * 
     */
    @Import(name="schemaNames")
    private @Nullable List<String> schemaNames;

    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    public Optional<List<String>> schemaNames() {
        return Optional.ofNullable(this.schemaNames);
    }

    private GetDiscoveryJobsResultsPlainArgs() {}

    private GetDiscoveryJobsResultsPlainArgs(GetDiscoveryJobsResultsPlainArgs $) {
        this.columnNames = $.columnNames;
        this.discoveryJobId = $.discoveryJobId;
        this.discoveryType = $.discoveryType;
        this.filters = $.filters;
        this.isResultApplied = $.isResultApplied;
        this.objects = $.objects;
        this.plannedAction = $.plannedAction;
        this.schemaNames = $.schemaNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiscoveryJobsResultsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiscoveryJobsResultsPlainArgs $;

        public Builder() {
            $ = new GetDiscoveryJobsResultsPlainArgs();
        }

        public Builder(GetDiscoveryJobsResultsPlainArgs defaults) {
            $ = new GetDiscoveryJobsResultsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnNames A filter to return only a specific column based on column name.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(@Nullable List<String> columnNames) {
            $.columnNames = columnNames;
            return this;
        }

        /**
         * @param columnNames A filter to return only a specific column based on column name.
         * 
         * @return builder
         * 
         */
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }

        /**
         * @param discoveryJobId The OCID of the discovery job.
         * 
         * @return builder
         * 
         */
        public Builder discoveryJobId(String discoveryJobId) {
            $.discoveryJobId = discoveryJobId;
            return this;
        }

        /**
         * @param discoveryType A filter to return only the resources that match the specified discovery type.
         * 
         * @return builder
         * 
         */
        public Builder discoveryType(@Nullable String discoveryType) {
            $.discoveryType = discoveryType;
            return this;
        }

        public Builder filters(@Nullable List<GetDiscoveryJobsResultsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDiscoveryJobsResultsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isResultApplied A filter to return the discovery result resources based on the value of their isResultApplied attribute.
         * 
         * @return builder
         * 
         */
        public Builder isResultApplied(@Nullable Boolean isResultApplied) {
            $.isResultApplied = isResultApplied;
            return this;
        }

        /**
         * @param objects A filter to return only items related to a specific object name.
         * 
         * @return builder
         * 
         */
        public Builder objects(@Nullable List<String> objects) {
            $.objects = objects;
            return this;
        }

        /**
         * @param objects A filter to return only items related to a specific object name.
         * 
         * @return builder
         * 
         */
        public Builder objects(String... objects) {
            return objects(List.of(objects));
        }

        /**
         * @param plannedAction A filter to return only the resources that match the specified planned action.
         * 
         * @return builder
         * 
         */
        public Builder plannedAction(@Nullable String plannedAction) {
            $.plannedAction = plannedAction;
            return this;
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(@Nullable List<String> schemaNames) {
            $.schemaNames = schemaNames;
            return this;
        }

        /**
         * @param schemaNames A filter to return only items related to specific schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaNames(String... schemaNames) {
            return schemaNames(List.of(schemaNames));
        }

        public GetDiscoveryJobsResultsPlainArgs build() {
            $.discoveryJobId = Objects.requireNonNull($.discoveryJobId, "expected parameter 'discoveryJobId' to be non-null");
            return $;
        }
    }

}
