// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls;

    /**
     * @return The Transport Layer Security (TLS) client policy.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs>> tls() {
        return Optional.ofNullable(this.tls);
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyArgs(VirtualNodeSpecBackendDefaultsClientPolicyArgs $) {
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tls The Transport Layer Security (TLS) client policy.
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls The Transport Layer Security (TLS) client policy.
         * 
         * @return builder
         * 
         */
        public Builder tls(VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs tls) {
            return tls(Output.of(tls));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyArgs build() {
            return $;
        }
    }

}
