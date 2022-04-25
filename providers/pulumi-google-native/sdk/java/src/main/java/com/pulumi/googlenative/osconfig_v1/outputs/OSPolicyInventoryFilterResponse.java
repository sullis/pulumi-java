// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyInventoryFilterResponse {
    /**
     * @return The OS short name
     * 
     */
    private final String osShortName;
    /**
     * @return The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    private final String osVersion;

    @CustomType.Constructor
    private OSPolicyInventoryFilterResponse(
        @CustomType.Parameter("osShortName") String osShortName,
        @CustomType.Parameter("osVersion") String osVersion) {
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    /**
     * @return The OS short name
     * 
     */
    public String osShortName() {
        return this.osShortName;
    }
    /**
     * @return The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    public String osVersion() {
        return this.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyInventoryFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyInventoryFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }        public OSPolicyInventoryFilterResponse build() {
            return new OSPolicyInventoryFilterResponse(osShortName, osVersion);
        }
    }
}
