// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssignmentOsTypeResponse {
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    private final String osArchitecture;
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    private final String osShortName;
    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    private final String osVersion;

    @OutputCustomType.Constructor({"osArchitecture","osShortName","osVersion"})
    private AssignmentOsTypeResponse(
        String osArchitecture,
        String osShortName,
        String osVersion) {
        this.osArchitecture = Objects.requireNonNull(osArchitecture);
        this.osShortName = Objects.requireNonNull(osShortName);
        this.osVersion = Objects.requireNonNull(osVersion);
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
    */
    public String getOsArchitecture() {
        return this.osArchitecture;
    }
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
    */
    public String getOsShortName() {
        return this.osShortName;
    }
    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
    */
    public String getOsVersion() {
        return this.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentOsTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osArchitecture;
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentOsTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsArchitecture(String osArchitecture) {
            this.osArchitecture = Objects.requireNonNull(osArchitecture);
            return this;
        }

        public Builder setOsShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        public AssignmentOsTypeResponse build() {
            return new AssignmentOsTypeResponse(osArchitecture, osShortName, osVersion);
        }
    }
}