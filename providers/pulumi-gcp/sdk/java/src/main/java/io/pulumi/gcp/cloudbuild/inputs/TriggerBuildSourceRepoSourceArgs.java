// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSourceRepoSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceRepoSourceArgs Empty = new TriggerBuildSourceRepoSourceArgs();

    /**
     * Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branchName")
      private final @Nullable Output<String> branchName;

    public Output<String> getBranchName() {
        return this.branchName == null ? Output.empty() : this.branchName;
    }

    /**
     * Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    @Import(name="commitSha")
      private final @Nullable Output<String> commitSha;

    public Output<String> getCommitSha() {
        return this.commitSha == null ? Output.empty() : this.commitSha;
    }

    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
     */
    @Import(name="dir")
      private final @Nullable Output<String> dir;

    public Output<String> getDir() {
        return this.dir == null ? Output.empty() : this.dir;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
      private final @Nullable Output<Boolean> invertRegex;

    public Output<Boolean> getInvertRegex() {
        return this.invertRegex == null ? Output.empty() : this.invertRegex;
    }

    /**
     * ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId == null ? Output.empty() : this.projectId;
    }

    /**
     * Name of the Cloud Source Repository.
     * 
     */
    @Import(name="repoName", required=true)
      private final Output<String> repoName;

    public Output<String> getRepoName() {
        return this.repoName;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Output.empty() : this.substitutions;
    }

    /**
     * Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="tagName")
      private final @Nullable Output<String> tagName;

    public Output<String> getTagName() {
        return this.tagName == null ? Output.empty() : this.tagName;
    }

    public TriggerBuildSourceRepoSourceArgs(
        @Nullable Output<String> branchName,
        @Nullable Output<String> commitSha,
        @Nullable Output<String> dir,
        @Nullable Output<Boolean> invertRegex,
        @Nullable Output<String> projectId,
        Output<String> repoName,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<String> tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = Objects.requireNonNull(repoName, "expected parameter 'repoName' to be non-null");
        this.substitutions = substitutions;
        this.tagName = tagName;
    }

    private TriggerBuildSourceRepoSourceArgs() {
        this.branchName = Output.empty();
        this.commitSha = Output.empty();
        this.dir = Output.empty();
        this.invertRegex = Output.empty();
        this.projectId = Output.empty();
        this.repoName = Output.empty();
        this.substitutions = Output.empty();
        this.tagName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceRepoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> branchName;
        private @Nullable Output<String> commitSha;
        private @Nullable Output<String> dir;
        private @Nullable Output<Boolean> invertRegex;
        private @Nullable Output<String> projectId;
        private Output<String> repoName;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<String> tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceRepoSourceArgs defaults) {
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

        public Builder branchName(@Nullable Output<String> branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder branchName(@Nullable String branchName) {
            this.branchName = Output.ofNullable(branchName);
            return this;
        }
        public Builder commitSha(@Nullable Output<String> commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public Builder commitSha(@Nullable String commitSha) {
            this.commitSha = Output.ofNullable(commitSha);
            return this;
        }
        public Builder dir(@Nullable Output<String> dir) {
            this.dir = dir;
            return this;
        }
        public Builder dir(@Nullable String dir) {
            this.dir = Output.ofNullable(dir);
            return this;
        }
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Output.ofNullable(invertRegex);
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Output.ofNullable(projectId);
            return this;
        }
        public Builder repoName(Output<String> repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        public Builder repoName(String repoName) {
            this.repoName = Output.of(Objects.requireNonNull(repoName));
            return this;
        }
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Output.ofNullable(substitutions);
            return this;
        }
        public Builder tagName(@Nullable Output<String> tagName) {
            this.tagName = tagName;
            return this;
        }
        public Builder tagName(@Nullable String tagName) {
            this.tagName = Output.ofNullable(tagName);
            return this;
        }        public TriggerBuildSourceRepoSourceArgs build() {
            return new TriggerBuildSourceRepoSourceArgs(branchName, commitSha, dir, invertRegex, projectId, repoName, substitutions, tagName);
        }
    }
}
