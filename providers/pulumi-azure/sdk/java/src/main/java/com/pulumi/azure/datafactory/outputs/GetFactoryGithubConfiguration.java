// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFactoryGithubConfiguration {
    /**
     * @return The VSTS account name.
     * 
     */
    private final String accountName;
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    private final String branchName;
    /**
     * @return The GitHub Enterprise host name.
     * 
     */
    private final String gitUrl;
    /**
     * @return The name of the git repository.
     * 
     */
    private final String repositoryName;
    /**
     * @return The root folder within the repository.
     * 
     */
    private final String rootFolder;

    @CustomType.Constructor
    private GetFactoryGithubConfiguration(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("gitUrl") String gitUrl,
        @CustomType.Parameter("repositoryName") String repositoryName,
        @CustomType.Parameter("rootFolder") String rootFolder) {
        this.accountName = accountName;
        this.branchName = branchName;
        this.gitUrl = gitUrl;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
    }

    /**
     * @return The VSTS account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return The GitHub Enterprise host name.
     * 
     */
    public String gitUrl() {
        return this.gitUrl;
    }
    /**
     * @return The name of the git repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }
    /**
     * @return The root folder within the repository.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryGithubConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String branchName;
        private String gitUrl;
        private String repositoryName;
        private String rootFolder;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryGithubConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.branchName = defaults.branchName;
    	      this.gitUrl = defaults.gitUrl;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder gitUrl(String gitUrl) {
            this.gitUrl = Objects.requireNonNull(gitUrl);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }        public GetFactoryGithubConfiguration build() {
            return new GetFactoryGithubConfiguration(accountName, branchName, gitUrl, repositoryName, rootFolder);
        }
    }
}
