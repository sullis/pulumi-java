// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerBuildSourceRepoSource {
    /**
     * @return Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final @Nullable String branchName;
    /**
     * @return Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    private final @Nullable String commitSha;
    /**
     * @return Working directory to use when running this step&#39;s container.
     * If this value is a relative path, it is relative to the build&#39;s working
     * directory. If this value is absolute, it may be outside the build&#39;s working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step&#39;s execution.
     * 
     */
    private final @Nullable String dir;
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private final @Nullable Boolean invertRegex;
    /**
     * @return ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    private final @Nullable String projectId;
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    private final String repoName;
    /**
     * @return Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    private final @Nullable Map<String,String> substitutions;
    /**
     * @return Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final @Nullable String tagName;

    @CustomType.Constructor
    private TriggerBuildSourceRepoSource(
        @CustomType.Parameter("branchName") @Nullable String branchName,
        @CustomType.Parameter("commitSha") @Nullable String commitSha,
        @CustomType.Parameter("dir") @Nullable String dir,
        @CustomType.Parameter("invertRegex") @Nullable Boolean invertRegex,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("repoName") String repoName,
        @CustomType.Parameter("substitutions") @Nullable Map<String,String> substitutions,
        @CustomType.Parameter("tagName") @Nullable String tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = repoName;
        this.substitutions = substitutions;
        this.tagName = tagName;
    }

    /**
     * @return Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    public Optional<String> commitSha() {
        return Optional.ofNullable(this.commitSha);
    }
    /**
     * @return Working directory to use when running this step&#39;s container.
     * If this value is a relative path, it is relative to the build&#39;s working
     * directory. If this value is absolute, it may be outside the build&#39;s working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step&#39;s execution.
     * 
     */
    public Optional<String> dir() {
        return Optional.ofNullable(this.dir);
    }
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Optional<Boolean> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }
    /**
     * @return ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    public Map<String,String> substitutions() {
        return this.substitutions == null ? Map.of() : this.substitutions;
    }
    /**
     * @return Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<String> tagName() {
        return Optional.ofNullable(this.tagName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceRepoSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitSha;
        private @Nullable String dir;
        private @Nullable Boolean invertRegex;
        private @Nullable String projectId;
        private String repoName;
        private @Nullable Map<String,String> substitutions;
        private @Nullable String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceRepoSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.substitutions = defaults.substitutions;
    	      this.tagName = defaults.tagName;
        }

        public Builder branchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder commitSha(@Nullable String commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public Builder dir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder tagName(@Nullable String tagName) {
            this.tagName = tagName;
            return this;
        }        public TriggerBuildSourceRepoSource build() {
            return new TriggerBuildSourceRepoSource(branchName, commitSha, dir, invertRegex, projectId, repoName, substitutions, tagName);
        }
    }
}
