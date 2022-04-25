// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs();

    /**
     * The criteria for determining a SAN&#39;s match.
     * 
     */
    @Import(name="match", required=true)
    private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs> match;

    /**
     * @return The criteria for determining a SAN&#39;s match.
     * 
     */
    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs> match() {
        return this.match;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs $) {
        this.match = $.match;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param match The criteria for determining a SAN&#39;s match.
         * 
         * @return builder
         * 
         */
        public Builder match(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match The criteria for determining a SAN&#39;s match.
         * 
         * @return builder
         * 
         */
        public Builder match(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchArgs match) {
            return match(Output.of(match));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs build() {
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
