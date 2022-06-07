// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.GetDeployStagesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeployStagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeployStagesPlainArgs Empty = new GetDeployStagesPlainArgs();

    /**
     * The OCID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The OCID of the compartment in which to list resources.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The ID of the parent pipeline.
     * 
     */
    @Import(name="deployPipelineId")
    private @Nullable String deployPipelineId;

    /**
     * @return The ID of the parent pipeline.
     * 
     */
    public Optional<String> deployPipelineId() {
        return Optional.ofNullable(this.deployPipelineId);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetDeployStagesFilter> filters;

    public Optional<List<GetDeployStagesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to return only deployment stages that matches the given lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only deployment stages that matches the given lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDeployStagesPlainArgs() {}

    private GetDeployStagesPlainArgs(GetDeployStagesPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.deployPipelineId = $.deployPipelineId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeployStagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeployStagesPlainArgs $;

        public Builder() {
            $ = new GetDeployStagesPlainArgs();
        }

        public Builder(GetDeployStagesPlainArgs defaults) {
            $ = new GetDeployStagesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param deployPipelineId The ID of the parent pipeline.
         * 
         * @return builder
         * 
         */
        public Builder deployPipelineId(@Nullable String deployPipelineId) {
            $.deployPipelineId = deployPipelineId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetDeployStagesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDeployStagesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Unique identifier or OCID for listing a single resource by ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param state A filter to return only deployment stages that matches the given lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDeployStagesPlainArgs build() {
            return $;
        }
    }

}
