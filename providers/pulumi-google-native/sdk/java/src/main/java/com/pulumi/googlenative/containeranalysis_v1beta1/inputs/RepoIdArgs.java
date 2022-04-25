// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ProjectRepoIdArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class RepoIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoIdArgs Empty = new RepoIdArgs();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @Import(name="projectRepoId")
    private @Nullable Output<ProjectRepoIdArgs> projectRepoId;

    /**
     * @return A combination of a project ID and a repo name.
     * 
     */
    public Optional<Output<ProjectRepoIdArgs>> projectRepoId() {
        return Optional.ofNullable(this.projectRepoId);
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return A server-assigned, globally unique identifier.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private RepoIdArgs() {}

    private RepoIdArgs(RepoIdArgs $) {
        this.projectRepoId = $.projectRepoId;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoIdArgs $;

        public Builder() {
            $ = new RepoIdArgs();
        }

        public Builder(RepoIdArgs defaults) {
            $ = new RepoIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectRepoId A combination of a project ID and a repo name.
         * 
         * @return builder
         * 
         */
        public Builder projectRepoId(@Nullable Output<ProjectRepoIdArgs> projectRepoId) {
            $.projectRepoId = projectRepoId;
            return this;
        }

        /**
         * @param projectRepoId A combination of a project ID and a repo name.
         * 
         * @return builder
         * 
         */
        public Builder projectRepoId(ProjectRepoIdArgs projectRepoId) {
            return projectRepoId(Output.of(projectRepoId));
        }

        /**
         * @param uid A server-assigned, globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid A server-assigned, globally unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public RepoIdArgs build() {
            return $;
        }
    }

}
