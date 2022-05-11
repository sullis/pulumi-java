// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FactoryVstsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FactoryVstsConfigurationArgs Empty = new FactoryVstsConfigurationArgs();

    /**
     * Specifies the VSTS account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Specifies the VSTS account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Specifies the branch of the repository to get code from.
     * 
     */
    @Import(name="branchName", required=true)
    private Output<String> branchName;

    /**
     * @return Specifies the branch of the repository to get code from.
     * 
     */
    public Output<String> branchName() {
        return this.branchName;
    }

    /**
     * Specifies the name of the VSTS project.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return Specifies the name of the VSTS project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Specifies the name of the git repository.
     * 
     */
    @Import(name="repositoryName", required=true)
    private Output<String> repositoryName;

    /**
     * @return Specifies the name of the git repository.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    @Import(name="rootFolder", required=true)
    private Output<String> rootFolder;

    /**
     * @return Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    public Output<String> rootFolder() {
        return this.rootFolder;
    }

    /**
     * Specifies the Tenant ID associated with the VSTS account.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return Specifies the Tenant ID associated with the VSTS account.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private FactoryVstsConfigurationArgs() {}

    private FactoryVstsConfigurationArgs(FactoryVstsConfigurationArgs $) {
        this.accountName = $.accountName;
        this.branchName = $.branchName;
        this.projectName = $.projectName;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryVstsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryVstsConfigurationArgs $;

        public Builder() {
            $ = new FactoryVstsConfigurationArgs();
        }

        public Builder(FactoryVstsConfigurationArgs defaults) {
            $ = new FactoryVstsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Specifies the VSTS account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Specifies the VSTS account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param branchName Specifies the branch of the repository to get code from.
         * 
         * @return builder
         * 
         */
        public Builder branchName(Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param branchName Specifies the branch of the repository to get code from.
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        /**
         * @param projectName Specifies the name of the VSTS project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Specifies the name of the VSTS project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param repositoryName Specifies the name of the git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName Specifies the name of the git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        /**
         * @param rootFolder Specifies the root folder within the repository. Set to `/` for the top level.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(Output<String> rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        /**
         * @param rootFolder Specifies the root folder within the repository. Set to `/` for the top level.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(String rootFolder) {
            return rootFolder(Output.of(rootFolder));
        }

        /**
         * @param tenantId Specifies the Tenant ID associated with the VSTS account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Specifies the Tenant ID associated with the VSTS account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public FactoryVstsConfigurationArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.branchName = Objects.requireNonNull($.branchName, "expected parameter 'branchName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            $.rootFolder = Objects.requireNonNull($.rootFolder, "expected parameter 'rootFolder' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
