// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageArgs Empty = new GuestPoliciesPackageArgs();

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
    @InputImport(name="desiredState")
    private final @Nullable Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState == null ? Input.empty() : this.desiredState;
    }

    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager,
     * the package is not installed or removed no error message is returned. By default, or if you specify ANY,
     * the agent attempts to install and remove this package using the default package manager.
     * This is useful when creating a policy that applies to different types of systems.
     * The default behavior is ANY.
     * Default value is `ANY`.
     * Possible values are `ANY`, `APT`, `YUM`, `ZYPPER`, and `GOO`.
     * 
     */
    @InputImport(name="manager")
    private final @Nullable Input<String> manager;

    public Input<String> getManager() {
        return this.manager == null ? Input.empty() : this.manager;
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public GuestPoliciesPackageArgs(
        @Nullable Input<String> desiredState,
        @Nullable Input<String> manager,
        Input<String> name) {
        this.desiredState = desiredState;
        this.manager = manager;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GuestPoliciesPackageArgs() {
        this.desiredState = Input.empty();
        this.manager = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> desiredState;
        private @Nullable Input<String> manager;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.manager = defaults.manager;
    	      this.name = defaults.name;
        }

        public Builder setDesiredState(@Nullable Input<String> desiredState) {
            this.desiredState = desiredState;
            return this;
        }

        public Builder setDesiredState(@Nullable String desiredState) {
            this.desiredState = Input.ofNullable(desiredState);
            return this;
        }

        public Builder setManager(@Nullable Input<String> manager) {
            this.manager = manager;
            return this;
        }

        public Builder setManager(@Nullable String manager) {
            this.manager = Input.ofNullable(manager);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public GuestPoliciesPackageArgs build() {
            return new GuestPoliciesPackageArgs(desiredState, manager, name);
        }
    }
}
