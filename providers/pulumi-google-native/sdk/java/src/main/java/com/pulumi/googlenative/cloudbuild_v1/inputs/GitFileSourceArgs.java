// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.enums.GitFileSourceRepoType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GitFileSource describes a file within a (possibly remote) code repository.
 * 
 */
public final class GitFileSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitFileSourceArgs Empty = new GitFileSourceArgs();

    /**
     * The path of the file, with the repo root as the root of the path.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path of the file, with the repo root as the root of the path.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * See RepoType above.
     * 
     */
    @Import(name="repoType")
    private @Nullable Output<GitFileSourceRepoType> repoType;

    /**
     * @return See RepoType above.
     * 
     */
    public Optional<Output<GitFileSourceRepoType>> repoType() {
        return Optional.ofNullable(this.repoType);
    }

    /**
     * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<String> revision;

    /**
     * @return The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
     * 
     */
    public Optional<Output<String>> revision() {
        return Optional.ofNullable(this.revision);
    }

    /**
     * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private GitFileSourceArgs() {}

    private GitFileSourceArgs(GitFileSourceArgs $) {
        this.path = $.path;
        this.repoType = $.repoType;
        this.revision = $.revision;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitFileSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitFileSourceArgs $;

        public Builder() {
            $ = new GitFileSourceArgs();
        }

        public Builder(GitFileSourceArgs defaults) {
            $ = new GitFileSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path of the file, with the repo root as the root of the path.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the file, with the repo root as the root of the path.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param repoType See RepoType above.
         * 
         * @return builder
         * 
         */
        public Builder repoType(@Nullable Output<GitFileSourceRepoType> repoType) {
            $.repoType = repoType;
            return this;
        }

        /**
         * @param repoType See RepoType above.
         * 
         * @return builder
         * 
         */
        public Builder repoType(GitFileSourceRepoType repoType) {
            return repoType(Output.of(repoType));
        }

        /**
         * @param revision The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<String> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename (optional). This field respects the same syntax/resolution as described here: https://git-scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation originated is assumed to be the revision from which to read the specified path.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param uri The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI of the repo (optional). If unspecified, the repo from which the trigger invocation originated is assumed to be the repo from which to read the specified path.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GitFileSourceArgs build() {
            return $;
        }
    }

}
