// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify.inputs;

import io.pulumi.awsnative.amplify.enums.AppAutoBranchCreationConfigStage;
import io.pulumi.awsnative.amplify.inputs.AppBasicAuthConfigArgs;
import io.pulumi.awsnative.amplify.inputs.AppEnvironmentVariableArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppAutoBranchCreationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppAutoBranchCreationConfigArgs Empty = new AppAutoBranchCreationConfigArgs();

    @Import(name="autoBranchCreationPatterns")
      private final @Nullable Output<List<String>> autoBranchCreationPatterns;

    public Output<List<String>> autoBranchCreationPatterns() {
        return this.autoBranchCreationPatterns == null ? Codegen.empty() : this.autoBranchCreationPatterns;
    }

    @Import(name="basicAuthConfig")
      private final @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig;

    public Output<AppBasicAuthConfigArgs> basicAuthConfig() {
        return this.basicAuthConfig == null ? Codegen.empty() : this.basicAuthConfig;
    }

    @Import(name="buildSpec")
      private final @Nullable Output<String> buildSpec;

    public Output<String> buildSpec() {
        return this.buildSpec == null ? Codegen.empty() : this.buildSpec;
    }

    @Import(name="enableAutoBranchCreation")
      private final @Nullable Output<Boolean> enableAutoBranchCreation;

    public Output<Boolean> enableAutoBranchCreation() {
        return this.enableAutoBranchCreation == null ? Codegen.empty() : this.enableAutoBranchCreation;
    }

    @Import(name="enableAutoBuild")
      private final @Nullable Output<Boolean> enableAutoBuild;

    public Output<Boolean> enableAutoBuild() {
        return this.enableAutoBuild == null ? Codegen.empty() : this.enableAutoBuild;
    }

    @Import(name="enablePerformanceMode")
      private final @Nullable Output<Boolean> enablePerformanceMode;

    public Output<Boolean> enablePerformanceMode() {
        return this.enablePerformanceMode == null ? Codegen.empty() : this.enablePerformanceMode;
    }

    @Import(name="enablePullRequestPreview")
      private final @Nullable Output<Boolean> enablePullRequestPreview;

    public Output<Boolean> enablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Codegen.empty() : this.enablePullRequestPreview;
    }

    @Import(name="environmentVariables")
      private final @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables;

    public Output<List<AppEnvironmentVariableArgs>> environmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    @Import(name="pullRequestEnvironmentName")
      private final @Nullable Output<String> pullRequestEnvironmentName;

    public Output<String> pullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Codegen.empty() : this.pullRequestEnvironmentName;
    }

    @Import(name="stage")
      private final @Nullable Output<AppAutoBranchCreationConfigStage> stage;

    public Output<AppAutoBranchCreationConfigStage> stage() {
        return this.stage == null ? Codegen.empty() : this.stage;
    }

    public AppAutoBranchCreationConfigArgs(
        @Nullable Output<List<String>> autoBranchCreationPatterns,
        @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig,
        @Nullable Output<String> buildSpec,
        @Nullable Output<Boolean> enableAutoBranchCreation,
        @Nullable Output<Boolean> enableAutoBuild,
        @Nullable Output<Boolean> enablePerformanceMode,
        @Nullable Output<Boolean> enablePullRequestPreview,
        @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables,
        @Nullable Output<String> pullRequestEnvironmentName,
        @Nullable Output<AppAutoBranchCreationConfigStage> stage) {
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        this.basicAuthConfig = basicAuthConfig;
        this.buildSpec = buildSpec;
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        this.enableAutoBuild = enableAutoBuild;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
    }

    private AppAutoBranchCreationConfigArgs() {
        this.autoBranchCreationPatterns = Codegen.empty();
        this.basicAuthConfig = Codegen.empty();
        this.buildSpec = Codegen.empty();
        this.enableAutoBranchCreation = Codegen.empty();
        this.enableAutoBuild = Codegen.empty();
        this.enablePerformanceMode = Codegen.empty();
        this.enablePullRequestPreview = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.pullRequestEnvironmentName = Codegen.empty();
        this.stage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> autoBranchCreationPatterns;
        private @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig;
        private @Nullable Output<String> buildSpec;
        private @Nullable Output<Boolean> enableAutoBranchCreation;
        private @Nullable Output<Boolean> enableAutoBuild;
        private @Nullable Output<Boolean> enablePerformanceMode;
        private @Nullable Output<Boolean> enablePullRequestPreview;
        private @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables;
        private @Nullable Output<String> pullRequestEnvironmentName;
        private @Nullable Output<AppAutoBranchCreationConfigStage> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoBranchCreationPatterns = defaults.autoBranchCreationPatterns;
    	      this.basicAuthConfig = defaults.basicAuthConfig;
    	      this.buildSpec = defaults.buildSpec;
    	      this.enableAutoBranchCreation = defaults.enableAutoBranchCreation;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
        }

        public Builder autoBranchCreationPatterns(@Nullable Output<List<String>> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = autoBranchCreationPatterns;
            return this;
        }
        public Builder autoBranchCreationPatterns(@Nullable List<String> autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns = Codegen.ofNullable(autoBranchCreationPatterns);
            return this;
        }
        public Builder autoBranchCreationPatterns(String... autoBranchCreationPatterns) {
            return autoBranchCreationPatterns(List.of(autoBranchCreationPatterns));
        }
        public Builder basicAuthConfig(@Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig) {
            this.basicAuthConfig = basicAuthConfig;
            return this;
        }
        public Builder basicAuthConfig(@Nullable AppBasicAuthConfigArgs basicAuthConfig) {
            this.basicAuthConfig = Codegen.ofNullable(basicAuthConfig);
            return this;
        }
        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }
        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = Codegen.ofNullable(buildSpec);
            return this;
        }
        public Builder enableAutoBranchCreation(@Nullable Output<Boolean> enableAutoBranchCreation) {
            this.enableAutoBranchCreation = enableAutoBranchCreation;
            return this;
        }
        public Builder enableAutoBranchCreation(@Nullable Boolean enableAutoBranchCreation) {
            this.enableAutoBranchCreation = Codegen.ofNullable(enableAutoBranchCreation);
            return this;
        }
        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }
        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Codegen.ofNullable(enableAutoBuild);
            return this;
        }
        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }
        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Codegen.ofNullable(enablePerformanceMode);
            return this;
        }
        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }
        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Codegen.ofNullable(enablePullRequestPreview);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable List<AppEnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder environmentVariables(AppEnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }
        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Codegen.ofNullable(pullRequestEnvironmentName);
            return this;
        }
        public Builder stage(@Nullable Output<AppAutoBranchCreationConfigStage> stage) {
            this.stage = stage;
            return this;
        }
        public Builder stage(@Nullable AppAutoBranchCreationConfigStage stage) {
            this.stage = Codegen.ofNullable(stage);
            return this;
        }        public AppAutoBranchCreationConfigArgs build() {
            return new AppAutoBranchCreationConfigArgs(autoBranchCreationPatterns, basicAuthConfig, buildSpec, enableAutoBranchCreation, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage);
        }
    }
}
