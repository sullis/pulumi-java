// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PullRequestFilterResponse {
    /**
     * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String branch;
    /**
     * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
     * 
     */
    private final String commentControl;
    /**
     * If true, branches that do NOT match the git_ref will trigger a build.
     * 
     */
    private final Boolean invertRegex;

    @OutputCustomType.Constructor({"branch","commentControl","invertRegex"})
    private PullRequestFilterResponse(
        String branch,
        String commentControl,
        Boolean invertRegex) {
        this.branch = Objects.requireNonNull(branch);
        this.commentControl = Objects.requireNonNull(commentControl);
        this.invertRegex = Objects.requireNonNull(invertRegex);
    }

    /**
     * Regex of branches to match. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
    */
    public String getBranch() {
        return this.branch;
    }
    /**
     * Configure builds to run whether a repository owner or collaborator need to comment `/gcbrun`.
     * 
    */
    public String getCommentControl() {
        return this.commentControl;
    }
    /**
     * If true, branches that do NOT match the git_ref will trigger a build.
     * 
    */
    public Boolean getInvertRegex() {
        return this.invertRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullRequestFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private String commentControl;
        private Boolean invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(PullRequestFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder setBranch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }

        public Builder setCommentControl(String commentControl) {
            this.commentControl = Objects.requireNonNull(commentControl);
            return this;
        }

        public Builder setInvertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }
        public PullRequestFilterResponse build() {
            return new PullRequestFilterResponse(branch, commentControl, invertRegex);
        }
    }
}