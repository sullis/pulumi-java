// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentOsTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentOsTypeArgs Empty = new GuestPoliciesAssignmentOsTypeArgs();

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    @Import(name="osArchitecture")
      private final @Nullable Output<String> osArchitecture;

    public Output<String> getOsArchitecture() {
        return this.osArchitecture == null ? Output.empty() : this.osArchitecture;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    @Import(name="osShortName")
      private final @Nullable Output<String> osShortName;

    public Output<String> getOsShortName() {
        return this.osShortName == null ? Output.empty() : this.osShortName;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable Output<String> osVersion;

    public Output<String> getOsVersion() {
        return this.osVersion == null ? Output.empty() : this.osVersion;
    }

    public GuestPoliciesAssignmentOsTypeArgs(
        @Nullable Output<String> osArchitecture,
        @Nullable Output<String> osShortName,
        @Nullable Output<String> osVersion) {
        this.osArchitecture = osArchitecture;
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    private GuestPoliciesAssignmentOsTypeArgs() {
        this.osArchitecture = Output.empty();
        this.osShortName = Output.empty();
        this.osVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> osArchitecture;
        private @Nullable Output<String> osShortName;
        private @Nullable Output<String> osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentOsTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osArchitecture(@Nullable Output<String> osArchitecture) {
            this.osArchitecture = osArchitecture;
            return this;
        }
        public Builder osArchitecture(@Nullable String osArchitecture) {
            this.osArchitecture = Output.ofNullable(osArchitecture);
            return this;
        }
        public Builder osShortName(@Nullable Output<String> osShortName) {
            this.osShortName = osShortName;
            return this;
        }
        public Builder osShortName(@Nullable String osShortName) {
            this.osShortName = Output.ofNullable(osShortName);
            return this;
        }
        public Builder osVersion(@Nullable Output<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = Output.ofNullable(osVersion);
            return this;
        }        public GuestPoliciesAssignmentOsTypeArgs build() {
            return new GuestPoliciesAssignmentOsTypeArgs(osArchitecture, osShortName, osVersion);
        }
    }
}
