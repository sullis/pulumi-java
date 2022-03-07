// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse {
    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo;
    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit;
    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git;
    /**
     * Labels with user defined metadata.
     * 
     */
    private final Map<String,String> labels;

    @OutputCustomType.Constructor({"cloudRepo","gerrit","git","labels"})
    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse(
        GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo,
        GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit,
        GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git,
        Map<String,String> labels) {
        this.cloudRepo = Objects.requireNonNull(cloudRepo);
        this.gerrit = Objects.requireNonNull(gerrit);
        this.git = Objects.requireNonNull(git);
        this.labels = Objects.requireNonNull(labels);
    }

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
    */
    public GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse getCloudRepo() {
        return this.cloudRepo;
    }
    /**
     * A SourceContext referring to a Gerrit project.
     * 
    */
    public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse getGerrit() {
        return this.gerrit;
    }
    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
    */
    public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse getGit() {
        return this.git;
    }
    /**
     * Labels with user defined metadata.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo;
        private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit;
        private GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git;
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        public Builder setCloudRepo(GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo) {
            this.cloudRepo = Objects.requireNonNull(cloudRepo);
            return this;
        }

        public Builder setGerrit(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit) {
            this.gerrit = Objects.requireNonNull(gerrit);
            return this;
        }

        public Builder setGit(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git) {
            this.git = Objects.requireNonNull(git);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse(cloudRepo, gerrit, git, labels);
        }
    }
}