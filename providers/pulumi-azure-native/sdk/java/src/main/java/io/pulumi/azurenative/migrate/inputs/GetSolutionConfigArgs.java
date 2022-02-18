// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSolutionConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSolutionConfigArgs Empty = new GetSolutionConfigArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="migrateProjectName", required=true)
    private final String migrateProjectName;

    public String getMigrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a migration solution within a migrate project.
     * 
     */
    @InputImport(name="solutionName", required=true)
    private final String solutionName;

    public String getSolutionName() {
        return this.solutionName;
    }

    public GetSolutionConfigArgs(
        String migrateProjectName,
        String resourceGroupName,
        String solutionName) {
        this.migrateProjectName = Objects.requireNonNull(migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = Objects.requireNonNull(solutionName, "expected parameter 'solutionName' to be non-null");
    }

    private GetSolutionConfigArgs() {
        this.migrateProjectName = null;
        this.resourceGroupName = null;
        this.solutionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String migrateProjectName;
        private String resourceGroupName;
        private String solutionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrateProjectName = defaults.migrateProjectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
        }

        public Builder setMigrateProjectName(String migrateProjectName) {
            this.migrateProjectName = Objects.requireNonNull(migrateProjectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSolutionName(String solutionName) {
            this.solutionName = Objects.requireNonNull(solutionName);
            return this;
        }

        public GetSolutionConfigArgs build() {
            return new GetSolutionConfigArgs(migrateProjectName, resourceGroupName, solutionName);
        }
    }
}
