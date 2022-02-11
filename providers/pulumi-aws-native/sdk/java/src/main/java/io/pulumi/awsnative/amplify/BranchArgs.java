// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.amplify.enums.BranchStage;
import io.pulumi.awsnative.amplify.inputs.BranchBasicAuthConfigArgs;
import io.pulumi.awsnative.amplify.inputs.BranchEnvironmentVariableArgs;
import io.pulumi.awsnative.amplify.inputs.BranchTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchArgs extends io.pulumi.resources.ResourceArgs {

    public static final BranchArgs Empty = new BranchArgs();

    @InputImport(name="appId", required=true)
    private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    @InputImport(name="basicAuthConfig")
    private final @Nullable Input<BranchBasicAuthConfigArgs> basicAuthConfig;

    public Input<BranchBasicAuthConfigArgs> getBasicAuthConfig() {
        return this.basicAuthConfig == null ? Input.empty() : this.basicAuthConfig;
    }

    @InputImport(name="branchName")
    private final @Nullable Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName == null ? Input.empty() : this.branchName;
    }

    @InputImport(name="buildSpec")
    private final @Nullable Input<String> buildSpec;

    public Input<String> getBuildSpec() {
        return this.buildSpec == null ? Input.empty() : this.buildSpec;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="enableAutoBuild")
    private final @Nullable Input<Boolean> enableAutoBuild;

    public Input<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Input.empty() : this.enableAutoBuild;
    }

    @InputImport(name="enablePerformanceMode")
    private final @Nullable Input<Boolean> enablePerformanceMode;

    public Input<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Input.empty() : this.enablePerformanceMode;
    }

    @InputImport(name="enablePullRequestPreview")
    private final @Nullable Input<Boolean> enablePullRequestPreview;

    public Input<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Input.empty() : this.enablePullRequestPreview;
    }

    @InputImport(name="environmentVariables")
    private final @Nullable Input<List<BranchEnvironmentVariableArgs>> environmentVariables;

    public Input<List<BranchEnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    @InputImport(name="pullRequestEnvironmentName")
    private final @Nullable Input<String> pullRequestEnvironmentName;

    public Input<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Input.empty() : this.pullRequestEnvironmentName;
    }

    @InputImport(name="stage")
    private final @Nullable Input<BranchStage> stage;

    public Input<BranchStage> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<BranchTagArgs>> tags;

    public Input<List<BranchTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public BranchArgs(
        Input<String> appId,
        @Nullable Input<BranchBasicAuthConfigArgs> basicAuthConfig,
        @Nullable Input<String> branchName,
        @Nullable Input<String> buildSpec,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableAutoBuild,
        @Nullable Input<Boolean> enablePerformanceMode,
        @Nullable Input<Boolean> enablePullRequestPreview,
        @Nullable Input<List<BranchEnvironmentVariableArgs>> environmentVariables,
        @Nullable Input<String> pullRequestEnvironmentName,
        @Nullable Input<BranchStage> stage,
        @Nullable Input<List<BranchTagArgs>> tags) {
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
        this.appId = Input.empty();
        this.basicAuthConfig = Input.empty();
        this.branchName = Input.empty();
        this.buildSpec = Input.empty();
        this.description = Input.empty();
        this.enableAutoBuild = Input.empty();
        this.enablePerformanceMode = Input.empty();
        this.enablePullRequestPreview = Input.empty();
        this.environmentVariables = Input.empty();
        this.pullRequestEnvironmentName = Input.empty();
        this.stage = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<BranchBasicAuthConfigArgs> basicAuthConfig;
        private @Nullable Input<String> branchName;
        private @Nullable Input<String> buildSpec;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableAutoBuild;
        private @Nullable Input<Boolean> enablePerformanceMode;
        private @Nullable Input<Boolean> enablePullRequestPreview;
        private @Nullable Input<List<BranchEnvironmentVariableArgs>> environmentVariables;
        private @Nullable Input<String> pullRequestEnvironmentName;
        private @Nullable Input<BranchStage> stage;
        private @Nullable Input<List<BranchTagArgs>> tags;

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

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setBasicAuthConfig(@Nullable Input<BranchBasicAuthConfigArgs> basicAuthConfig) {
            this.basicAuthConfig = basicAuthConfig;
            return this;
        }

        public Builder setBasicAuthConfig(@Nullable BranchBasicAuthConfigArgs basicAuthConfig) {
            this.basicAuthConfig = Input.ofNullable(basicAuthConfig);
            return this;
        }

        public Builder setBranchName(@Nullable Input<String> branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setBranchName(@Nullable String branchName) {
            this.branchName = Input.ofNullable(branchName);
            return this;
        }

        public Builder setBuildSpec(@Nullable Input<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder setBuildSpec(@Nullable String buildSpec) {
            this.buildSpec = Input.ofNullable(buildSpec);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Input<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Input.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Input<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Input.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Input<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Input.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<List<BranchEnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<BranchEnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable Input<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Input.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder setStage(@Nullable Input<BranchStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable BranchStage stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }

        public Builder setTags(@Nullable Input<List<BranchTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<BranchTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public BranchArgs build() {
            return new BranchArgs(appId, basicAuthConfig, branchName, buildSpec, description, enableAutoBuild, enablePerformanceMode, enablePullRequestPreview, environmentVariables, pullRequestEnvironmentName, stage, tags);
        }
    }
}
