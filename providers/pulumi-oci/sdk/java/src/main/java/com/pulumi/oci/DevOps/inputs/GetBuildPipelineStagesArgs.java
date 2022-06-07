// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.GetBuildPipelineStagesFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBuildPipelineStagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBuildPipelineStagesArgs Empty = new GetBuildPipelineStagesArgs();

    /**
     * The OCID of the parent build pipeline.
     * 
     */
    @Import(name="buildPipelineId")
    private @Nullable Output<String> buildPipelineId;

    /**
     * @return The OCID of the parent build pipeline.
     * 
     */
    public Optional<Output<String>> buildPipelineId() {
        return Optional.ofNullable(this.buildPipelineId);
    }

    /**
     * The OCID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the compartment in which to list resources.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetBuildPipelineStagesFilterArgs>> filters;

    public Optional<Output<List<GetBuildPipelineStagesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to return the stages that matches the given lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return A filter to return the stages that matches the given lifecycle state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GetBuildPipelineStagesArgs() {}

    private GetBuildPipelineStagesArgs(GetBuildPipelineStagesArgs $) {
        this.buildPipelineId = $.buildPipelineId;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBuildPipelineStagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBuildPipelineStagesArgs $;

        public Builder() {
            $ = new GetBuildPipelineStagesArgs();
        }

        public Builder(GetBuildPipelineStagesArgs defaults) {
            $ = new GetBuildPipelineStagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildPipelineId The OCID of the parent build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineId(@Nullable Output<String> buildPipelineId) {
            $.buildPipelineId = buildPipelineId;
            return this;
        }

        /**
         * @param buildPipelineId The OCID of the parent build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineId(String buildPipelineId) {
            return buildPipelineId(Output.of(buildPipelineId));
        }

        /**
         * @param compartmentId The OCID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetBuildPipelineStagesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetBuildPipelineStagesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetBuildPipelineStagesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Unique identifier or OCID for listing a single resource by ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier or OCID for listing a single resource by ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param state A filter to return the stages that matches the given lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state A filter to return the stages that matches the given lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GetBuildPipelineStagesArgs build() {
            return $;
        }
    }

}
