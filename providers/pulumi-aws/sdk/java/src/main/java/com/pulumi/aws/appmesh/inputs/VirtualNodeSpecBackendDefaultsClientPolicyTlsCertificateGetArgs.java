// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs();

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;

    /**
     * @return A local file certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

    /**
     * @return A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs>> sds() {
        return Optional.ofNullable(this.sds);
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs $) {
        this.file = $.file;
        this.sds = $.sds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param file A local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file A local file certificate.
         * 
         * @return builder
         * 
         */
        public Builder file(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
            $.sds = sds;
            return this;
        }

        /**
         * @param sds A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
         * 
         * @return builder
         * 
         */
        public Builder sds(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs sds) {
            return sds(Output.of(sds));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs build() {
            return $;
        }
    }

}
