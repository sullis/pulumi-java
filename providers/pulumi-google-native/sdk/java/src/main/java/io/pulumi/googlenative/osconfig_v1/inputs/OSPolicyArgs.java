// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.enums.OSPolicyMode;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceGroupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An OS policy defines the desired state configuration for a VM.
 * 
 */
public final class OSPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyArgs Empty = new OSPolicyArgs();

    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
     */
    @InputImport(name="allowNoResourceGroupMatch")
      private final @Nullable Input<Boolean> allowNoResourceGroupMatch;

    public Input<Boolean> getAllowNoResourceGroupMatch() {
        return this.allowNoResourceGroupMatch == null ? Input.empty() : this.allowNoResourceGroupMatch;
    }

    /**
     * Policy description. Length of the description is limited to 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The id of the OS policy with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the assignment.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Policy mode
     * 
     */
    @InputImport(name="mode", required=true)
      private final Input<OSPolicyMode> mode;

    public Input<OSPolicyMode> getMode() {
        return this.mode;
    }

    /**
     * List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
     */
    @InputImport(name="resourceGroups", required=true)
      private final Input<List<OSPolicyResourceGroupArgs>> resourceGroups;

    public Input<List<OSPolicyResourceGroupArgs>> getResourceGroups() {
        return this.resourceGroups;
    }

    public OSPolicyArgs(
        @Nullable Input<Boolean> allowNoResourceGroupMatch,
        @Nullable Input<String> description,
        Input<String> id,
        Input<OSPolicyMode> mode,
        Input<List<OSPolicyResourceGroupArgs>> resourceGroups) {
        this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.resourceGroups = Objects.requireNonNull(resourceGroups, "expected parameter 'resourceGroups' to be non-null");
    }

    private OSPolicyArgs() {
        this.allowNoResourceGroupMatch = Input.empty();
        this.description = Input.empty();
        this.id = Input.empty();
        this.mode = Input.empty();
        this.resourceGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowNoResourceGroupMatch;
        private @Nullable Input<String> description;
        private Input<String> id;
        private Input<OSPolicyMode> mode;
        private Input<List<OSPolicyResourceGroupArgs>> resourceGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNoResourceGroupMatch = defaults.allowNoResourceGroupMatch;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        public Builder setAllowNoResourceGroupMatch(@Nullable Input<Boolean> allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
            return this;
        }

        public Builder setAllowNoResourceGroupMatch(@Nullable Boolean allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = Input.ofNullable(allowNoResourceGroupMatch);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setMode(Input<OSPolicyMode> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(OSPolicyMode mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder setResourceGroups(Input<List<OSPolicyResourceGroupArgs>> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }

        public Builder setResourceGroups(List<OSPolicyResourceGroupArgs> resourceGroups) {
            this.resourceGroups = Input.of(Objects.requireNonNull(resourceGroups));
            return this;
        }
        public OSPolicyArgs build() {
            return new OSPolicyArgs(allowNoResourceGroupMatch, description, id, mode, resourceGroups);
        }
    }
}