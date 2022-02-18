// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.SolutionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SolutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionArgs Empty = new SolutionArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="migrateProjectName", required=true)
    private final Input<String> migrateProjectName;

    public Input<String> getMigrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Gets or sets the properties of the solution.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<SolutionPropertiesArgs> properties;

    public Input<SolutionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a migration solution within a migrate project.
     * 
     */
    @InputImport(name="solutionName")
    private final @Nullable Input<String> solutionName;

    public Input<String> getSolutionName() {
        return this.solutionName == null ? Input.empty() : this.solutionName;
    }

    public SolutionArgs(
        Input<String> migrateProjectName,
        @Nullable Input<SolutionPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> solutionName) {
        this.migrateProjectName = Objects.requireNonNull(migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = solutionName;
    }

    private SolutionArgs() {
        this.migrateProjectName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.solutionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> migrateProjectName;
        private @Nullable Input<SolutionPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> solutionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrateProjectName = defaults.migrateProjectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
        }

        public Builder setMigrateProjectName(Input<String> migrateProjectName) {
            this.migrateProjectName = Objects.requireNonNull(migrateProjectName);
            return this;
        }

        public Builder setMigrateProjectName(String migrateProjectName) {
            this.migrateProjectName = Input.of(Objects.requireNonNull(migrateProjectName));
            return this;
        }

        public Builder setProperties(@Nullable Input<SolutionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable SolutionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSolutionName(@Nullable Input<String> solutionName) {
            this.solutionName = solutionName;
            return this;
        }

        public Builder setSolutionName(@Nullable String solutionName) {
            this.solutionName = Input.ofNullable(solutionName);
            return this;
        }

        public SolutionArgs build() {
            return new SolutionArgs(migrateProjectName, properties, resourceGroupName, solutionName);
        }
    }
}
