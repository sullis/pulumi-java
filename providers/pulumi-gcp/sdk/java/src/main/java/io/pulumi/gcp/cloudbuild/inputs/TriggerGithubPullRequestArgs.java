// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerGithubPullRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPullRequestArgs Empty = new TriggerGithubPullRequestArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @InputImport(name="branch", required=true)
    private final Input<String> branch;

    public Input<String> getBranch() {
        return this.branch;
    }

    /**
     * Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    @InputImport(name="commentControl")
    private final @Nullable Input<String> commentControl;

    public Input<String> getCommentControl() {
        return this.commentControl == null ? Input.empty() : this.commentControl;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @InputImport(name="invertRegex")
    private final @Nullable Input<Boolean> invertRegex;

    public Input<Boolean> getInvertRegex() {
        return this.invertRegex == null ? Input.empty() : this.invertRegex;
    }

    public TriggerGithubPullRequestArgs(
        Input<String> branch,
        @Nullable Input<String> commentControl,
        @Nullable Input<Boolean> invertRegex) {
        this.branch = Objects.requireNonNull(branch, "expected parameter 'branch' to be non-null");
        this.commentControl = commentControl;
        this.invertRegex = invertRegex;
    }

    private TriggerGithubPullRequestArgs() {
        this.branch = Input.empty();
        this.commentControl = Input.empty();
        this.invertRegex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> branch;
        private @Nullable Input<String> commentControl;
        private @Nullable Input<Boolean> invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPullRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder setBranch(Input<String> branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = Input.of(Objects.requireNonNull(branch));
            return this;
        }

        public Builder setCommentControl(@Nullable Input<String> commentControl) {
            this.commentControl = commentControl;
            return this;
        }

        public Builder setCommentControl(@Nullable String commentControl) {
            this.commentControl = Input.ofNullable(commentControl);
            return this;
        }

        public Builder setInvertRegex(@Nullable Input<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }

        public Builder setInvertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Input.ofNullable(invertRegex);
            return this;
        }

        public TriggerGithubPullRequestArgs build() {
            return new TriggerGithubPullRequestArgs(branch, commentControl, invertRegex);
        }
    }
}
