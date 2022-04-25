// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.GitHubClientSecretResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Factory&#39;s GitHub repo information.
 * 
 */
public final class FactoryGitHubConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FactoryGitHubConfigurationResponse Empty = new FactoryGitHubConfigurationResponse();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * GitHub bring your own app client id.
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    /**
     * @return GitHub bring your own app client id.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable GitHubClientSecretResponse clientSecret;

    /**
     * @return GitHub bring your own app client secret information.
     * 
     */
    public Optional<GitHubClientSecretResponse> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
    private String collaborationBranch;

    /**
     * @return Collaboration branch.
     * 
     */
    public String collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @Import(name="hostName")
    private @Nullable String hostName;

    /**
     * @return GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable String lastCommitId;

    /**
     * @return Last commit id.
     * 
     */
    public Optional<String> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
    private String repositoryName;

    /**
     * @return Repository name.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
    private String rootFolder;

    /**
     * @return Root folder.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    /**
     * Type of repo configuration.
     * Expected value is &#39;FactoryGitHubConfiguration&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of repo configuration.
     * Expected value is &#39;FactoryGitHubConfiguration&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private FactoryGitHubConfigurationResponse() {}

    private FactoryGitHubConfigurationResponse(FactoryGitHubConfigurationResponse $) {
        this.accountName = $.accountName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.collaborationBranch = $.collaborationBranch;
        this.hostName = $.hostName;
        this.lastCommitId = $.lastCommitId;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryGitHubConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryGitHubConfigurationResponse $;

        public Builder() {
            $ = new FactoryGitHubConfigurationResponse();
        }

        public Builder(FactoryGitHubConfigurationResponse defaults) {
            $ = new FactoryGitHubConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param clientId GitHub bring your own app client id.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientSecret GitHub bring your own app client secret information.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable GitHubClientSecretResponse clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param collaborationBranch Collaboration branch.
         * 
         * @return builder
         * 
         */
        public Builder collaborationBranch(String collaborationBranch) {
            $.collaborationBranch = collaborationBranch;
            return this;
        }

        /**
         * @param hostName GitHub Enterprise host name. For example: https://github.mydomain.com
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param lastCommitId Last commit id.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(@Nullable String lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param repositoryName Repository name.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param rootFolder Root folder.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(String rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        /**
         * @param type Type of repo configuration.
         * Expected value is &#39;FactoryGitHubConfiguration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FactoryGitHubConfigurationResponse build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.collaborationBranch = Objects.requireNonNull($.collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            $.rootFolder = Objects.requireNonNull($.rootFolder, "expected parameter 'rootFolder' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
