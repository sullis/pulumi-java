// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VM inventory details.
 * 
 */
public final class OSPolicyAssignmentInstanceFilterInventoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentInstanceFilterInventoryArgs Empty = new OSPolicyAssignmentInstanceFilterInventoryArgs();

    /**
     * The OS short name
     * 
     */
    @Import(name="osShortName", required=true)
    private Output<String> osShortName;

    /**
     * @return The OS short name
     * 
     */
    public Output<String> osShortName() {
        return this.osShortName;
    }

    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    @Import(name="osVersion")
    private @Nullable Output<String> osVersion;

    /**
     * @return The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    public Optional<Output<String>> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    private OSPolicyAssignmentInstanceFilterInventoryArgs() {}

    private OSPolicyAssignmentInstanceFilterInventoryArgs(OSPolicyAssignmentInstanceFilterInventoryArgs $) {
        this.osShortName = $.osShortName;
        this.osVersion = $.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyAssignmentInstanceFilterInventoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyAssignmentInstanceFilterInventoryArgs $;

        public Builder() {
            $ = new OSPolicyAssignmentInstanceFilterInventoryArgs();
        }

        public Builder(OSPolicyAssignmentInstanceFilterInventoryArgs defaults) {
            $ = new OSPolicyAssignmentInstanceFilterInventoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param osShortName The OS short name
         * 
         * @return builder
         * 
         */
        public Builder osShortName(Output<String> osShortName) {
            $.osShortName = osShortName;
            return this;
        }

        /**
         * @param osShortName The OS short name
         * 
         * @return builder
         * 
         */
        public Builder osShortName(String osShortName) {
            return osShortName(Output.of(osShortName));
        }

        /**
         * @param osVersion The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(@Nullable Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param osVersion The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        public OSPolicyAssignmentInstanceFilterInventoryArgs build() {
            $.osShortName = Objects.requireNonNull($.osShortName, "expected parameter 'osShortName' to be non-null");
            return $;
        }
    }

}
