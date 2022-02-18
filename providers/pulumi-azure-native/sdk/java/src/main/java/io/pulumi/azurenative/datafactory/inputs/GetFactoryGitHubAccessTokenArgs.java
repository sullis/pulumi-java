// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.GitHubClientSecret;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFactoryGitHubAccessTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFactoryGitHubAccessTokenArgs Empty = new GetFactoryGitHubAccessTokenArgs();

    /**
     * The factory name.
     * 
     */
    @InputImport(name="factoryName", required=true)
    private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    /**
     * GitHub access code.
     * 
     */
    @InputImport(name="gitHubAccessCode", required=true)
    private final String gitHubAccessCode;

    public String getGitHubAccessCode() {
        return this.gitHubAccessCode;
    }

    /**
     * GitHub access token base URL.
     * 
     */
    @InputImport(name="gitHubAccessTokenBaseUrl", required=true)
    private final String gitHubAccessTokenBaseUrl;

    public String getGitHubAccessTokenBaseUrl() {
        return this.gitHubAccessTokenBaseUrl;
    }

    /**
     * GitHub application client ID.
     * 
     */
    @InputImport(name="gitHubClientId")
    private final @Nullable String gitHubClientId;

    public Optional<String> getGitHubClientId() {
        return this.gitHubClientId == null ? Optional.empty() : Optional.ofNullable(this.gitHubClientId);
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @InputImport(name="gitHubClientSecret")
    private final @Nullable GitHubClientSecret gitHubClientSecret;

    public Optional<GitHubClientSecret> getGitHubClientSecret() {
        return this.gitHubClientSecret == null ? Optional.empty() : Optional.ofNullable(this.gitHubClientSecret);
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetFactoryGitHubAccessTokenArgs(
        String factoryName,
        String gitHubAccessCode,
        String gitHubAccessTokenBaseUrl,
        @Nullable String gitHubClientId,
        @Nullable GitHubClientSecret gitHubClientSecret,
        String resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.gitHubAccessCode = Objects.requireNonNull(gitHubAccessCode, "expected parameter 'gitHubAccessCode' to be non-null");
        this.gitHubAccessTokenBaseUrl = Objects.requireNonNull(gitHubAccessTokenBaseUrl, "expected parameter 'gitHubAccessTokenBaseUrl' to be non-null");
        this.gitHubClientId = gitHubClientId;
        this.gitHubClientSecret = gitHubClientSecret;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFactoryGitHubAccessTokenArgs() {
        this.factoryName = null;
        this.gitHubAccessCode = null;
        this.gitHubAccessTokenBaseUrl = null;
        this.gitHubClientId = null;
        this.gitHubClientSecret = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryGitHubAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String gitHubAccessCode;
        private String gitHubAccessTokenBaseUrl;
        private @Nullable String gitHubClientId;
        private @Nullable GitHubClientSecret gitHubClientSecret;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryGitHubAccessTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.gitHubAccessCode = defaults.gitHubAccessCode;
    	      this.gitHubAccessTokenBaseUrl = defaults.gitHubAccessTokenBaseUrl;
    	      this.gitHubClientId = defaults.gitHubClientId;
    	      this.gitHubClientSecret = defaults.gitHubClientSecret;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setGitHubAccessCode(String gitHubAccessCode) {
            this.gitHubAccessCode = Objects.requireNonNull(gitHubAccessCode);
            return this;
        }

        public Builder setGitHubAccessTokenBaseUrl(String gitHubAccessTokenBaseUrl) {
            this.gitHubAccessTokenBaseUrl = Objects.requireNonNull(gitHubAccessTokenBaseUrl);
            return this;
        }

        public Builder setGitHubClientId(@Nullable String gitHubClientId) {
            this.gitHubClientId = gitHubClientId;
            return this;
        }

        public Builder setGitHubClientSecret(@Nullable GitHubClientSecret gitHubClientSecret) {
            this.gitHubClientSecret = gitHubClientSecret;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetFactoryGitHubAccessTokenArgs build() {
            return new GetFactoryGitHubAccessTokenArgs(factoryName, gitHubAccessCode, gitHubAccessTokenBaseUrl, gitHubClientId, gitHubClientSecret, resourceGroupName);
        }
    }
}
