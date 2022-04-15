// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.amplify.enums.BranchStage;
import io.pulumi.awsnative.amplify.inputs.BranchBasicAuthConfigArgs;
import io.pulumi.awsnative.amplify.inputs.BranchEnvironmentVariableArgs;
import io.pulumi.awsnative.amplify.inputs.BranchTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchArgs extends io.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    @Import(name="basicAuthConfig")
      private final @Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig;

    public Output<BranchBasicAuthConfigArgs> basicAuthConfig() {
        return this.basicAuthConfig == null ? Codegen.empty() : this.basicAuthConfig;
    }

    @Import(name="branchName")
      private final @Nullable Output<String> branchName;

    public Output<String> branchName() {
        return this.branchName == null ? Codegen.empty() : this.branchName;
    }

    @Import(name="buildSpec")
      private final @Nullable Output<String> buildSpec;

    public Output<String> buildSpec() {
        return this.buildSpec == null ? Codegen.empty() : this.buildSpec;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
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
      private final @Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables;

    public Output<List<BranchEnvironmentVariableArgs>> environmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    @Import(name="pullRequestEnvironmentName")
      private final @Nullable Output<String> pullRequestEnvironmentName;

    public Output<String> pullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Codegen.empty() : this.pullRequestEnvironmentName;
    }

    @Import(name="stage")
      private final @Nullable Output<BranchStage> stage;

    public Output<BranchStage> stage() {
        return this.stage == null ? Codegen.empty() : this.stage;
    }

    @Import(name="tags")
      private final @Nullable Output<List<BranchTagArgs>> tags;

    public Output<List<BranchTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public BranchArgs(
        Output<String> appId,
        @Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig,
        @Nullable Output<String> branchName,
        @Nullable Output<String> buildSpec,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableAutoBuild,
        @Nullable Output<Boolean> enablePerformanceMode,
        @Nullable Output<Boolean> enablePullRequestPreview,
        @Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables,
        @Nullable Output<String> pullRequestEnvironmentName,
        @Nullable Output<BranchStage> stage,
        @Nullable Output<List<BranchTagArgs>> tags) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.basicAuthConfig = basicAuthConfig;
        this.branchName = branchName;
        this.buildSpec = buildSpec;
        this.description = description;
        this.enableAutoBuild = enableAutoBuild;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
        this.tags = tags;
    }

    private BranchArgs() {
        this.appId = Codegen.empty();
        this.basicAuthConfig = Codegen.empty();
        this.branchName = Codegen.empty();
        this.buildSpec = Codegen.empty();
        this.description = Codegen.empty();
        this.enableAutoBuild = Codegen.empty();
        this.enablePerformanceMode = Codegen.empty();
        this.enablePullRequestPreview = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.pullRequestEnvironmentName = Codegen.empty();
        this.stage = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig;
        private @Nullable Output<String> branchName;
        private @Nullable Output<String> buildSpec;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableAutoBuild;
        private @Nullable Output<Boolean> enablePerformanceMode;
        private @Nullable Output<Boolean> enablePullRequestPreview;
        private @Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables;
        private @Nullable Output<String> pullRequestEnvironmentName;
        private @Nullable Output<BranchStage> stage;
        private @Nullable Output<List<BranchTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.basicAuthConfig = defaults.basicAuthConfig;
    	      this.branchName = defaults.branchName;
    	      this.buildSpec = defaults.buildSpec;
    	      this.description = defaults.description;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
    	      this.tags = defaults.tags;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder basicAuthConfig(@Nullable Output<BranchBasicAuthConfigArgs> basicAuthConfig) {
            this.basicAuthConfig = basicAuthConfig;
            return this;
        }
        public Builder basicAuthConfig(@Nullable BranchBasicAuthConfigArgs basicAuthConfig) {
            this.basicAuthConfig = Codegen.ofNullable(basicAuthConfig);
            return this;
        }
        public Builder branchName(@Nullable Output<String> branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder branchName(@Nullable String branchName) {
            this.branchName = Codegen.ofNullable(branchName);
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder environmentVariables(@Nullable Output<List<BranchEnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable List<BranchEnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder environmentVariables(BranchEnvironmentVariableArgs... environmentVariables) {
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
        public Builder stage(@Nullable Output<BranchStage> stage) {
            this.stage = stage;
            return this;
        }
        public Builder stage(@Nullable BranchStage stage) {
            this.stage = Codegen.ofNullable(stage);
            return this;
        }
        public Builder tags(@Nullable Output<List<BranchTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<BranchTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(BranchTagArgs... tags) {
            return tags(List.of(tags));
        }        public BranchArgs build() {
            return new BranchArgs(appId, basicAuthConfig, branchName, buildSpec, description, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage, tags);
        }
    }
}
