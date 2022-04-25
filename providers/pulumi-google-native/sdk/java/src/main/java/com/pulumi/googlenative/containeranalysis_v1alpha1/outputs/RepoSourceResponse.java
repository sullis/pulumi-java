// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RepoSourceResponse {
    /**
     * @return Name of the branch to build.
     * 
     */
    private final String branchName;
    /**
     * @return Explicit commit SHA to build.
     * 
     */
    private final String commitSha;
    /**
     * @return ID of the project that owns the repo.
     * 
     */
    private final String project;
    /**
     * @return Name of the repo.
     * 
     */
    private final String repoName;
    /**
     * @return Name of the tag to build.
     * 
     */
    private final String tagName;

    @CustomType.Constructor
    private RepoSourceResponse(
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("commitSha") String commitSha,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("repoName") String repoName,
        @CustomType.Parameter("tagName") String tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.project = project;
        this.repoName = repoName;
        this.tagName = tagName;
    }

    /**
     * @return Name of the branch to build.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return Explicit commit SHA to build.
     * 
     */
    public String commitSha() {
        return this.commitSha;
    }
    /**
     * @return ID of the project that owns the repo.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Name of the repo.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return Name of the tag to build.
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branchName;
        private String commitSha;
        private String project;
        private String repoName;
        private String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder commitSha(String commitSha) {
            this.commitSha = Objects.requireNonNull(commitSha);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }        public RepoSourceResponse build() {
            return new RepoSourceResponse(branchName, commitSha, project, repoName, tagName);
        }
    }
}
