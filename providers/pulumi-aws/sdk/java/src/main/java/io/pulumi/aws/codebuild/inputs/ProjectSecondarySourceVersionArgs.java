// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProjectSecondarySourceVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondarySourceVersionArgs Empty = new ProjectSecondarySourceVersionArgs();

    /**
     * An identifier for a source in the build project.
     * 
     */
    @Import(name="sourceIdentifier", required=true)
      private final Output<String> sourceIdentifier;

    public Output<String> getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @Import(name="sourceVersion", required=true)
      private final Output<String> sourceVersion;

    public Output<String> getSourceVersion() {
        return this.sourceVersion;
    }

    public ProjectSecondarySourceVersionArgs(
        Output<String> sourceIdentifier,
        Output<String> sourceVersion) {
        this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier, "expected parameter 'sourceIdentifier' to be non-null");
        this.sourceVersion = Objects.requireNonNull(sourceVersion, "expected parameter 'sourceVersion' to be non-null");
    }

    private ProjectSecondarySourceVersionArgs() {
        this.sourceIdentifier = Output.empty();
        this.sourceVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> sourceIdentifier;
        private Output<String> sourceVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceIdentifier = defaults.sourceIdentifier;
    	      this.sourceVersion = defaults.sourceVersion;
        }

        public Builder sourceIdentifier(Output<String> sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }
        public Builder sourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Output.of(Objects.requireNonNull(sourceIdentifier));
            return this;
        }
        public Builder sourceVersion(Output<String> sourceVersion) {
            this.sourceVersion = Objects.requireNonNull(sourceVersion);
            return this;
        }
        public Builder sourceVersion(String sourceVersion) {
            this.sourceVersion = Output.of(Objects.requireNonNull(sourceVersion));
            return this;
        }        public ProjectSecondarySourceVersionArgs build() {
            return new ProjectSecondarySourceVersionArgs(sourceIdentifier, sourceVersion);
        }
    }
}
