// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Artifacts.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Artifacts.inputs.GetGenericArtifactsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGenericArtifactsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGenericArtifactsPlainArgs Empty = new GetGenericArtifactsPlainArgs();

    /**
     * Filter results by a prefix for the `artifactPath` and and return artifacts that begin with the specified prefix in their path.
     * 
     */
    @Import(name="artifactPath")
    private @Nullable String artifactPath;

    /**
     * @return Filter results by a prefix for the `artifactPath` and and return artifacts that begin with the specified prefix in their path.
     * 
     */
    public Optional<String> artifactPath() {
        return Optional.ofNullable(this.artifactPath);
    }

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
    private @Nullable List<GetGenericArtifactsFilter> filters;

    public Optional<List<GetGenericArtifactsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return the resources for the specified OCID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return A filter to return the resources for the specified OCID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to return the artifacts only for the specified repository OCID.
     * 
     */
    @Import(name="repositoryId", required=true)
    private String repositoryId;

    /**
     * @return A filter to return the artifacts only for the specified repository OCID.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }

    /**
     * Filter results by a specified SHA256 digest for the artifact.
     * 
     */
    @Import(name="sha256")
    private @Nullable String sha256;

    /**
     * @return Filter results by a specified SHA256 digest for the artifact.
     * 
     */
    public Optional<String> sha256() {
        return Optional.ofNullable(this.sha256);
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

    /**
     * Filter results by a prefix for `version` and return artifacts that that begin with the specified prefix in their version.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return Filter results by a prefix for `version` and return artifacts that that begin with the specified prefix in their version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetGenericArtifactsPlainArgs() {}

    private GetGenericArtifactsPlainArgs(GetGenericArtifactsPlainArgs $) {
        this.artifactPath = $.artifactPath;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.repositoryId = $.repositoryId;
        this.sha256 = $.sha256;
        this.state = $.state;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGenericArtifactsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGenericArtifactsPlainArgs $;

        public Builder() {
            $ = new GetGenericArtifactsPlainArgs();
        }

        public Builder(GetGenericArtifactsPlainArgs defaults) {
            $ = new GetGenericArtifactsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactPath Filter results by a prefix for the `artifactPath` and and return artifacts that begin with the specified prefix in their path.
         * 
         * @return builder
         * 
         */
        public Builder artifactPath(@Nullable String artifactPath) {
            $.artifactPath = artifactPath;
            return this;
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
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetGenericArtifactsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetGenericArtifactsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id A filter to return the resources for the specified OCID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param repositoryId A filter to return the artifacts only for the specified repository OCID.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param sha256 Filter results by a specified SHA256 digest for the artifact.
         * 
         * @return builder
         * 
         */
        public Builder sha256(@Nullable String sha256) {
            $.sha256 = sha256;
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

        /**
         * @param version Filter results by a prefix for `version` and return artifacts that that begin with the specified prefix in their version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetGenericArtifactsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}
