// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeArtifact;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeInstallStep;
import io.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStep;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipe {
    /**
     * Resources available to be used in the steps in the recipe.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GuestPoliciesRecipeArtifact> artifacts;
    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won't be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    private final @Nullable String desiredState;
    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GuestPoliciesRecipeInstallStep> installSteps;
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    private final String name;
    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GuestPoliciesRecipeUpdateStep> updateSteps;
    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"artifacts","desiredState","installSteps","name","updateSteps","version"})
    private GuestPoliciesRecipe(
        @Nullable List<GuestPoliciesRecipeArtifact> artifacts,
        @Nullable String desiredState,
        @Nullable List<GuestPoliciesRecipeInstallStep> installSteps,
        String name,
        @Nullable List<GuestPoliciesRecipeUpdateStep> updateSteps,
        @Nullable String version) {
        this.artifacts = artifacts;
        this.desiredState = desiredState;
        this.installSteps = installSteps;
        this.name = Objects.requireNonNull(name);
        this.updateSteps = updateSteps;
        this.version = version;
    }

    /**
     * Resources available to be used in the steps in the recipe.
     * Structure is documented below.
     * 
     */
    public List<GuestPoliciesRecipeArtifact> getArtifacts() {
        return this.artifacts == null ? List.of() : this.artifacts;
    }
    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won't be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    public Optional<String> getDesiredState() {
        return Optional.ofNullable(this.desiredState);
    }
    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    public List<GuestPoliciesRecipeInstallStep> getInstallSteps() {
        return this.installSteps == null ? List.of() : this.installSteps;
    }
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    public List<GuestPoliciesRecipeUpdateStep> getUpdateSteps() {
        return this.updateSteps == null ? List.of() : this.updateSteps;
    }
    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GuestPoliciesRecipeArtifact> artifacts;
        private @Nullable String desiredState;
        private @Nullable List<GuestPoliciesRecipeInstallStep> installSteps;
        private String name;
        private @Nullable List<GuestPoliciesRecipeUpdateStep> updateSteps;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.desiredState = defaults.desiredState;
    	      this.installSteps = defaults.installSteps;
    	      this.name = defaults.name;
    	      this.updateSteps = defaults.updateSteps;
    	      this.version = defaults.version;
        }

        public Builder setArtifacts(@Nullable List<GuestPoliciesRecipeArtifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setDesiredState(@Nullable String desiredState) {
            this.desiredState = desiredState;
            return this;
        }

        public Builder setInstallSteps(@Nullable List<GuestPoliciesRecipeInstallStep> installSteps) {
            this.installSteps = installSteps;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateSteps(@Nullable List<GuestPoliciesRecipeUpdateStep> updateSteps) {
            this.updateSteps = updateSteps;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GuestPoliciesRecipe build() {
            return new GuestPoliciesRecipe(artifacts, desiredState, installSteps, name, updateSteps, version);
        }
    }
}
