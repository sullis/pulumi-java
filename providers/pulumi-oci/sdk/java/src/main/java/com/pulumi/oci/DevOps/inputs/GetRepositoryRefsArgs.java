// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.GetRepositoryRefsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryRefsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryRefsArgs Empty = new GetRepositoryRefsArgs();

    /**
     * Commit ID in a repository.
     * 
     */
    @Import(name="commitId")
    private @Nullable Output<String> commitId;

    /**
     * @return Commit ID in a repository.
     * 
     */
    public Optional<Output<String>> commitId() {
        return Optional.ofNullable(this.commitId);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetRepositoryRefsFilterArgs>> filters;

    public Optional<Output<List<GetRepositoryRefsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given reference name.
     * 
     */
    @Import(name="refName")
    private @Nullable Output<String> refName;

    /**
     * @return A filter to return only resources that match the given reference name.
     * 
     */
    public Optional<Output<String>> refName() {
        return Optional.ofNullable(this.refName);
    }

    /**
     * Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
     * 
     */
    @Import(name="refType")
    private @Nullable Output<String> refType;

    /**
     * @return Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
     * 
     */
    public Optional<Output<String>> refType() {
        return Optional.ofNullable(this.refType);
    }

    /**
     * Unique repository identifier.
     * 
     */
    @Import(name="repositoryId", required=true)
    private Output<String> repositoryId;

    /**
     * @return Unique repository identifier.
     * 
     */
    public Output<String> repositoryId() {
        return this.repositoryId;
    }

    private GetRepositoryRefsArgs() {}

    private GetRepositoryRefsArgs(GetRepositoryRefsArgs $) {
        this.commitId = $.commitId;
        this.filters = $.filters;
        this.refName = $.refName;
        this.refType = $.refType;
        this.repositoryId = $.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryRefsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryRefsArgs $;

        public Builder() {
            $ = new GetRepositoryRefsArgs();
        }

        public Builder(GetRepositoryRefsArgs defaults) {
            $ = new GetRepositoryRefsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commitId Commit ID in a repository.
         * 
         * @return builder
         * 
         */
        public Builder commitId(@Nullable Output<String> commitId) {
            $.commitId = commitId;
            return this;
        }

        /**
         * @param commitId Commit ID in a repository.
         * 
         * @return builder
         * 
         */
        public Builder commitId(String commitId) {
            return commitId(Output.of(commitId));
        }

        public Builder filters(@Nullable Output<List<GetRepositoryRefsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetRepositoryRefsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetRepositoryRefsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param refName A filter to return only resources that match the given reference name.
         * 
         * @return builder
         * 
         */
        public Builder refName(@Nullable Output<String> refName) {
            $.refName = refName;
            return this;
        }

        /**
         * @param refName A filter to return only resources that match the given reference name.
         * 
         * @return builder
         * 
         */
        public Builder refName(String refName) {
            return refName(Output.of(refName));
        }

        /**
         * @param refType Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
         * 
         * @return builder
         * 
         */
        public Builder refType(@Nullable Output<String> refType) {
            $.refType = refType;
            return this;
        }

        /**
         * @param refType Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
         * 
         * @return builder
         * 
         */
        public Builder refType(String refType) {
            return refType(Output.of(refType));
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId Unique repository identifier.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        public GetRepositoryRefsArgs build() {
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}
