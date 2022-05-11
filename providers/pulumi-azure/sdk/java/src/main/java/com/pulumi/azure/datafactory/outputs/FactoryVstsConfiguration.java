// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FactoryVstsConfiguration {
    /**
     * @return Specifies the VSTS account name.
     * 
     */
    private final String accountName;
    /**
     * @return Specifies the branch of the repository to get code from.
     * 
     */
    private final String branchName;
    /**
     * @return Specifies the name of the VSTS project.
     * 
     */
    private final String projectName;
    /**
     * @return Specifies the name of the git repository.
     * 
     */
    private final String repositoryName;
    /**
     * @return Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    private final String rootFolder;
    /**
     * @return Specifies the Tenant ID associated with the VSTS account.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private FactoryVstsConfiguration(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("branchName") String branchName,
        @CustomType.Parameter("projectName") String projectName,
        @CustomType.Parameter("repositoryName") String repositoryName,
        @CustomType.Parameter("rootFolder") String rootFolder,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.accountName = accountName;
        this.branchName = branchName;
        this.projectName = projectName;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
        this.tenantId = tenantId;
    }

    /**
     * @return Specifies the VSTS account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return Specifies the branch of the repository to get code from.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return Specifies the name of the VSTS project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }
    /**
     * @return Specifies the name of the git repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }
    /**
     * @return Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }
    /**
     * @return Specifies the Tenant ID associated with the VSTS account.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryVstsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String branchName;
        private String projectName;
        private String repositoryName;
        private String rootFolder;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryVstsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.branchName = defaults.branchName;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        public Builder projectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public FactoryVstsConfiguration build() {
            return new FactoryVstsConfiguration(accountName, branchName, projectName, repositoryName, rootFolder, tenantId);
        }
    }
}
