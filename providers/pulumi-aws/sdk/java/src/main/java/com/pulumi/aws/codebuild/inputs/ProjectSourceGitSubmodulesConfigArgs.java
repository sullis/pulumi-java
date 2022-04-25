// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ProjectSourceGitSubmodulesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSourceGitSubmodulesConfigArgs Empty = new ProjectSourceGitSubmodulesConfigArgs();

    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     * 
     */
    @Import(name="fetchSubmodules", required=true)
    private Output<Boolean> fetchSubmodules;

    /**
     * @return Whether to fetch Git submodules for the AWS CodeBuild build project.
     * 
     */
    public Output<Boolean> fetchSubmodules() {
        return this.fetchSubmodules;
    }

    private ProjectSourceGitSubmodulesConfigArgs() {}

    private ProjectSourceGitSubmodulesConfigArgs(ProjectSourceGitSubmodulesConfigArgs $) {
        this.fetchSubmodules = $.fetchSubmodules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSourceGitSubmodulesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSourceGitSubmodulesConfigArgs $;

        public Builder() {
            $ = new ProjectSourceGitSubmodulesConfigArgs();
        }

        public Builder(ProjectSourceGitSubmodulesConfigArgs defaults) {
            $ = new ProjectSourceGitSubmodulesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchSubmodules Whether to fetch Git submodules for the AWS CodeBuild build project.
         * 
         * @return builder
         * 
         */
        public Builder fetchSubmodules(Output<Boolean> fetchSubmodules) {
            $.fetchSubmodules = fetchSubmodules;
            return this;
        }

        /**
         * @param fetchSubmodules Whether to fetch Git submodules for the AWS CodeBuild build project.
         * 
         * @return builder
         * 
         */
        public Builder fetchSubmodules(Boolean fetchSubmodules) {
            return fetchSubmodules(Output.of(fetchSubmodules));
        }

        public ProjectSourceGitSubmodulesConfigArgs build() {
            $.fetchSubmodules = Objects.requireNonNull($.fetchSubmodules, "expected parameter 'fetchSubmodules' to be non-null");
            return $;
        }
    }

}
