// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplify;

import io.pulumi.awsnative.amplify.inputs.AppAutoBranchCreationConfigArgs;
import io.pulumi.awsnative.amplify.inputs.AppBasicAuthConfigArgs;
import io.pulumi.awsnative.amplify.inputs.AppCustomRuleArgs;
import io.pulumi.awsnative.amplify.inputs.AppEnvironmentVariableArgs;
import io.pulumi.awsnative.amplify.inputs.AppTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> accessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    @Import(name="autoBranchCreationConfig")
      private final @Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig;

    public Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig() {
        return this.autoBranchCreationConfig == null ? Codegen.empty() : this.autoBranchCreationConfig;
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

    @Import(name="customHeaders")
      private final @Nullable Output<String> customHeaders;

    public Output<String> customHeaders() {
        return this.customHeaders == null ? Codegen.empty() : this.customHeaders;
    }

    @Import(name="customRules")
      private final @Nullable Output<List<AppCustomRuleArgs>> customRules;

    public Output<List<AppCustomRuleArgs>> customRules() {
        return this.customRules == null ? Codegen.empty() : this.customRules;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="enableBranchAutoDeletion")
      private final @Nullable Output<Boolean> enableBranchAutoDeletion;

    public Output<Boolean> enableBranchAutoDeletion() {
        return this.enableBranchAutoDeletion == null ? Codegen.empty() : this.enableBranchAutoDeletion;
    }

    @Import(name="environmentVariables")
      private final @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables;

    public Output<List<AppEnvironmentVariableArgs>> environmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    @Import(name="iAMServiceRole")
      private final @Nullable Output<String> iAMServiceRole;

    public Output<String> iAMServiceRole() {
        return this.iAMServiceRole == null ? Codegen.empty() : this.iAMServiceRole;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="oauthToken")
      private final @Nullable Output<String> oauthToken;

    public Output<String> oauthToken() {
        return this.oauthToken == null ? Codegen.empty() : this.oauthToken;
    }

    @Import(name="repository")
      private final @Nullable Output<String> repository;

    public Output<String> repository() {
        return this.repository == null ? Codegen.empty() : this.repository;
    }

    @Import(name="tags")
      private final @Nullable Output<List<AppTagArgs>> tags;

    public Output<List<AppTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AppArgs(
        @Nullable Output<String> accessToken,
        @Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig,
        @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig,
        @Nullable Output<String> buildSpec,
        @Nullable Output<String> customHeaders,
        @Nullable Output<List<AppCustomRuleArgs>> customRules,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableBranchAutoDeletion,
        @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables,
        @Nullable Output<String> iAMServiceRole,
        @Nullable Output<String> name,
        @Nullable Output<String> oauthToken,
        @Nullable Output<String> repository,
        @Nullable Output<List<AppTagArgs>> tags) {
        this.accessToken = accessToken;
        this.autoBranchCreationConfig = autoBranchCreationConfig;
        this.basicAuthConfig = basicAuthConfig;
        this.buildSpec = buildSpec;
        this.customHeaders = customHeaders;
        this.customRules = customRules;
        this.description = description;
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
        this.environmentVariables = environmentVariables;
        this.iAMServiceRole = iAMServiceRole;
        this.name = name;
        this.oauthToken = oauthToken;
        this.repository = repository;
        this.tags = tags;
    }

    private AppArgs() {
        this.accessToken = Codegen.empty();
        this.autoBranchCreationConfig = Codegen.empty();
        this.basicAuthConfig = Codegen.empty();
        this.buildSpec = Codegen.empty();
        this.customHeaders = Codegen.empty();
        this.customRules = Codegen.empty();
        this.description = Codegen.empty();
        this.enableBranchAutoDeletion = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.iAMServiceRole = Codegen.empty();
        this.name = Codegen.empty();
        this.oauthToken = Codegen.empty();
        this.repository = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private @Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig;
        private @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig;
        private @Nullable Output<String> buildSpec;
        private @Nullable Output<String> customHeaders;
        private @Nullable Output<List<AppCustomRuleArgs>> customRules;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableBranchAutoDeletion;
        private @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables;
        private @Nullable Output<String> iAMServiceRole;
        private @Nullable Output<String> name;
        private @Nullable Output<String> oauthToken;
        private @Nullable Output<String> repository;
        private @Nullable Output<List<AppTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.autoBranchCreationConfig = defaults.autoBranchCreationConfig;
    	      this.basicAuthConfig = defaults.basicAuthConfig;
    	      this.buildSpec = defaults.buildSpec;
    	      this.customHeaders = defaults.customHeaders;
    	      this.customRules = defaults.customRules;
    	      this.description = defaults.description;
    	      this.enableBranchAutoDeletion = defaults.enableBranchAutoDeletion;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.iAMServiceRole = defaults.iAMServiceRole;
    	      this.name = defaults.name;
    	      this.oauthToken = defaults.oauthToken;
    	      this.repository = defaults.repository;
    	      this.tags = defaults.tags;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder autoBranchCreationConfig(@Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig) {
            this.autoBranchCreationConfig = autoBranchCreationConfig;
            return this;
        }
        public Builder autoBranchCreationConfig(@Nullable AppAutoBranchCreationConfigArgs autoBranchCreationConfig) {
            this.autoBranchCreationConfig = Codegen.ofNullable(autoBranchCreationConfig);
            return this;
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
        public Builder customHeaders(@Nullable Output<String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(@Nullable String customHeaders) {
            this.customHeaders = Codegen.ofNullable(customHeaders);
            return this;
        }
        public Builder customRules(@Nullable Output<List<AppCustomRuleArgs>> customRules) {
            this.customRules = customRules;
            return this;
        }
        public Builder customRules(@Nullable List<AppCustomRuleArgs> customRules) {
            this.customRules = Codegen.ofNullable(customRules);
            return this;
        }
        public Builder customRules(AppCustomRuleArgs... customRules) {
            return customRules(List.of(customRules));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableBranchAutoDeletion(@Nullable Output<Boolean> enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = enableBranchAutoDeletion;
            return this;
        }
        public Builder enableBranchAutoDeletion(@Nullable Boolean enableBranchAutoDeletion) {
            this.enableBranchAutoDeletion = Codegen.ofNullable(enableBranchAutoDeletion);
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
        public Builder iAMServiceRole(@Nullable Output<String> iAMServiceRole) {
            this.iAMServiceRole = iAMServiceRole;
            return this;
        }
        public Builder iAMServiceRole(@Nullable String iAMServiceRole) {
            this.iAMServiceRole = Codegen.ofNullable(iAMServiceRole);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder oauthToken(@Nullable Output<String> oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }
        public Builder oauthToken(@Nullable String oauthToken) {
            this.oauthToken = Codegen.ofNullable(oauthToken);
            return this;
        }
        public Builder repository(@Nullable Output<String> repository) {
            this.repository = repository;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = Codegen.ofNullable(repository);
            return this;
        }
        public Builder tags(@Nullable Output<List<AppTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<AppTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(AppTagArgs... tags) {
            return tags(List.of(tags));
        }        public AppArgs build() {
            return new AppArgs(accessToken, autoBranchCreationConfig, basicAuthConfig, buildSpec, customHeaders, customRules, description, enableBranchAutoDeletion, environmentVariables, iAMServiceRole, name, oauthToken, repository, tags);
        }
    }
}
