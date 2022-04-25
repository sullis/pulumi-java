// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs();

    /**
     * The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs() {}

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs $) {
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs();
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs defaults) {
            $ = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretName The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the secret for a virtual node&#39;s Transport Layer Security (TLS) Secret Discovery Service validation context trust.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
