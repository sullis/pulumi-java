// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceRepositoryConfigurationResponse {
    /**
     * Account name
     * 
     */
    private final @Nullable String accountName;
    /**
     * Collaboration branch
     * 
     */
    private final @Nullable String collaborationBranch;
    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    private final @Nullable String hostName;
    /**
     * The last commit ID
     * 
     */
    private final @Nullable String lastCommitId;
    /**
     * VSTS project name
     * 
     */
    private final @Nullable String projectName;
    /**
     * Repository name
     * 
     */
    private final @Nullable String repositoryName;
    /**
     * Root folder to use in the repository
     * 
     */
    private final @Nullable String rootFolder;
    /**
     * The VSTS tenant ID
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"accountName","collaborationBranch","hostName","lastCommitId","projectName","repositoryName","rootFolder","tenantId","type"})
    private WorkspaceRepositoryConfigurationResponse(
        @Nullable String accountName,
        @Nullable String collaborationBranch,
        @Nullable String hostName,
        @Nullable String lastCommitId,
        @Nullable String projectName,
        @Nullable String repositoryName,
        @Nullable String rootFolder,
        @Nullable String tenantId,
        @Nullable String type) {
        this.accountName = accountName;
        this.collaborationBranch = collaborationBranch;
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.projectName = projectName;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * Account name
     * 
     */
    public Optional<String> getAccountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * Collaboration branch
     * 
     */
    public Optional<String> getCollaborationBranch() {
        return Optional.ofNullable(this.collaborationBranch);
    }
    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * The last commit ID
     * 
     */
    public Optional<String> getLastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }
    /**
     * VSTS project name
     * 
     */
    public Optional<String> getProjectName() {
        return Optional.ofNullable(this.projectName);
    }
    /**
     * Repository name
     * 
     */
    public Optional<String> getRepositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    /**
     * Root folder to use in the repository
     * 
     */
    public Optional<String> getRootFolder() {
        return Optional.ofNullable(this.rootFolder);
    }
    /**
     * The VSTS tenant ID
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceRepositoryConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable String collaborationBranch;
        private @Nullable String hostName;
        private @Nullable String lastCommitId;
        private @Nullable String projectName;
        private @Nullable String repositoryName;
        private @Nullable String rootFolder;
        private @Nullable String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceRepositoryConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setCollaborationBranch(@Nullable String collaborationBranch) {
            this.collaborationBranch = collaborationBranch;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setLastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }

        public Builder setProjectName(@Nullable String projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setRootFolder(@Nullable String rootFolder) {
            this.rootFolder = rootFolder;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public WorkspaceRepositoryConfigurationResponse build() {
            return new WorkspaceRepositoryConfigurationResponse(accountName, collaborationBranch, hostName, lastCommitId, projectName, repositoryName, rootFolder, tenantId, type);
        }
    }
}
