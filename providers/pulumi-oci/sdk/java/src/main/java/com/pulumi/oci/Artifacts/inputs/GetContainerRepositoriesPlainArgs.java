// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Artifacts.inputs.GetContainerRepositoriesFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContainerRepositoriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerRepositoriesPlainArgs Empty = new GetContainerRepositoriesPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are inspected depending on the the setting of `accessLevel`. Default is false. Can only be set to true when calling the API on the tenancy (root compartment).
     * 
     */
    @Import(name="compartmentIdInSubtree")
    private @Nullable Boolean compartmentIdInSubtree;

    /**
     * @return When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are inspected depending on the the setting of `accessLevel`. Default is false. Can only be set to true when calling the API on the tenancy (root compartment).
     * 
     */
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetContainerRepositoriesFilter> filters;

    public Optional<List<GetContainerRepositoriesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return resources that match the isPublic value.
     * 
     */
    @Import(name="isPublic")
    private @Nullable Boolean isPublic;

    /**
     * @return A filter to return resources that match the isPublic value.
     * 
     */
    public Optional<Boolean> isPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    /**
     * A filter to return container images only for the specified container repository OCID.
     * 
     */
    @Import(name="repositoryId")
    private @Nullable String repositoryId;

    /**
     * @return A filter to return container images only for the specified container repository OCID.
     * 
     */
    public Optional<String> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * A filter to return only resources that match the given lifecycle state name exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state name exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetContainerRepositoriesPlainArgs() {}

    private GetContainerRepositoriesPlainArgs(GetContainerRepositoriesPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.compartmentIdInSubtree = $.compartmentIdInSubtree;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.isPublic = $.isPublic;
        this.repositoryId = $.repositoryId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerRepositoriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerRepositoriesPlainArgs $;

        public Builder() {
            $ = new GetContainerRepositoriesPlainArgs();
        }

        public Builder(GetContainerRepositoriesPlainArgs defaults) {
            $ = new GetContainerRepositoriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentIdInSubtree When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are inspected depending on the the setting of `accessLevel`. Default is false. Can only be set to true when calling the API on the tenancy (root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            $.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetContainerRepositoriesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetContainerRepositoriesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isPublic A filter to return resources that match the isPublic value.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(@Nullable Boolean isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param repositoryId A filter to return container images only for the specified container repository OCID.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(@Nullable String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state name exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetContainerRepositoriesPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
