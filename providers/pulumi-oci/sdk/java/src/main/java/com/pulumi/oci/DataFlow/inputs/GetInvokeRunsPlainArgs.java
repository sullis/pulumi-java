// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataFlow.inputs.GetInvokeRunsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInvokeRunsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInvokeRunsPlainArgs Empty = new GetInvokeRunsPlainArgs();

    /**
     * The ID of the application.
     * 
     */
    @Import(name="applicationId")
    private @Nullable String applicationId;

    /**
     * @return The ID of the application.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The query parameter for the Spark application name.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The query parameter for the Spark application name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The displayName prefix.
     * 
     */
    @Import(name="displayNameStartsWith")
    private @Nullable String displayNameStartsWith;

    /**
     * @return The displayName prefix.
     * 
     */
    public Optional<String> displayNameStartsWith() {
        return Optional.ofNullable(this.displayNameStartsWith);
    }

    @Import(name="filters")
    private @Nullable List<GetInvokeRunsFilter> filters;

    public Optional<List<GetInvokeRunsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of the user who created the resource.
     * 
     */
    @Import(name="ownerPrincipalId")
    private @Nullable String ownerPrincipalId;

    /**
     * @return The OCID of the user who created the resource.
     * 
     */
    public Optional<String> ownerPrincipalId() {
        return Optional.ofNullable(this.ownerPrincipalId);
    }

    /**
     * The LifecycleState of the run.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The LifecycleState of the run.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The epoch time that the resource was created.
     * 
     */
    @Import(name="timeCreatedGreaterThan")
    private @Nullable String timeCreatedGreaterThan;

    /**
     * @return The epoch time that the resource was created.
     * 
     */
    public Optional<String> timeCreatedGreaterThan() {
        return Optional.ofNullable(this.timeCreatedGreaterThan);
    }

    private GetInvokeRunsPlainArgs() {}

    private GetInvokeRunsPlainArgs(GetInvokeRunsPlainArgs $) {
        this.applicationId = $.applicationId;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.displayNameStartsWith = $.displayNameStartsWith;
        this.filters = $.filters;
        this.ownerPrincipalId = $.ownerPrincipalId;
        this.state = $.state;
        this.timeCreatedGreaterThan = $.timeCreatedGreaterThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInvokeRunsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInvokeRunsPlainArgs $;

        public Builder() {
            $ = new GetInvokeRunsPlainArgs();
        }

        public Builder(GetInvokeRunsPlainArgs defaults) {
            $ = new GetInvokeRunsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The ID of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName The query parameter for the Spark application name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayNameStartsWith The displayName prefix.
         * 
         * @return builder
         * 
         */
        public Builder displayNameStartsWith(@Nullable String displayNameStartsWith) {
            $.displayNameStartsWith = displayNameStartsWith;
            return this;
        }

        public Builder filters(@Nullable List<GetInvokeRunsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetInvokeRunsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ownerPrincipalId The OCID of the user who created the resource.
         * 
         * @return builder
         * 
         */
        public Builder ownerPrincipalId(@Nullable String ownerPrincipalId) {
            $.ownerPrincipalId = ownerPrincipalId;
            return this;
        }

        /**
         * @param state The LifecycleState of the run.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param timeCreatedGreaterThan The epoch time that the resource was created.
         * 
         * @return builder
         * 
         */
        public Builder timeCreatedGreaterThan(@Nullable String timeCreatedGreaterThan) {
            $.timeCreatedGreaterThan = timeCreatedGreaterThan;
            return this;
        }

        public GetInvokeRunsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
