// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs();

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    @Import(name="cloudRepo")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> getCloudRepo() {
        return this.cloudRepo == null ? Output.empty() : this.cloudRepo;
    }

    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    @Import(name="gerrit")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> getGerrit() {
        return this.gerrit == null ? Output.empty() : this.gerrit;
    }

    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    @Import(name="git")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> getGit() {
        return this.git == null ? Output.empty() : this.git;
    }

    /**
     * Labels with user defined metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo,
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit,
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git,
        @Nullable Output<Map<String,String>> labels) {
        this.cloudRepo = cloudRepo;
        this.gerrit = gerrit;
        this.git = git;
        this.labels = labels;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs() {
        this.cloudRepo = Output.empty();
        this.gerrit = Output.empty();
        this.git = Output.empty();
        this.labels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo;
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit;
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git;
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        public Builder cloudRepo(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo) {
            this.cloudRepo = cloudRepo;
            return this;
        }
        public Builder cloudRepo(@Nullable GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs cloudRepo) {
            this.cloudRepo = Output.ofNullable(cloudRepo);
            return this;
        }
        public Builder gerrit(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit) {
            this.gerrit = gerrit;
            return this;
        }
        public Builder gerrit(@Nullable GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs gerrit) {
            this.gerrit = Output.ofNullable(gerrit);
            return this;
        }
        public Builder git(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git) {
            this.git = git;
            return this;
        }
        public Builder git(@Nullable GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs git) {
            this.git = Output.ofNullable(git);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(cloudRepo, gerrit, git, labels);
        }
    }
}
