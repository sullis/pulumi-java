// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Package is a reference to the software package to be installed or removed. The agent on the VM instance uses the system package manager to apply the config. These are the commands that the agent uses to install or remove packages. Apt install: `apt-get update && apt-get -y install package1 package2 package3` remove: `apt-get -y remove package1 package2 package3` Yum install: `yum -y install package1 package2 package3` remove: `yum -y remove package1 package2 package3` Zypper install: `zypper install package1 package2 package3` remove: `zypper rm package1 package2` Googet install: `googet -noconfirm install package1 package2 package3` remove: `googet -noconfirm remove package1 package2 package3`
 * 
 */
public final class PackageResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageResponse Empty = new PackageResponse();

    /**
     * The desired_state the agent should maintain for this package. The default is to ensure the package is installed.
     * 
     */
    @Import(name="desiredState", required=true)
      private final String desiredState;

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager, the package is not installed or removed no error message is returned. By default, or if you specify `ANY`, the agent attempts to install and remove this package using the default package manager. This is useful when creating a policy that applies to different types of systems. The default behavior is ANY.
     * 
     */
    @Import(name="manager", required=true)
      private final String manager;

    public String getManager() {
        return this.manager;
    }

    /**
     * The name of the package. A package is uniquely identified for conflict validation by checking the package name and the manager(s) that the package targets.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PackageResponse(
        String desiredState,
        String manager,
        String name) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.manager = Objects.requireNonNull(manager, "expected parameter 'manager' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PackageResponse() {
        this.desiredState = null;
        this.manager = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desiredState;
        private String manager;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.manager = defaults.manager;
    	      this.name = defaults.name;
        }

        public Builder desiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder manager(String manager) {
            this.manager = Objects.requireNonNull(manager);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public PackageResponse build() {
            return new PackageResponse(desiredState, manager, name);
        }
    }
}
