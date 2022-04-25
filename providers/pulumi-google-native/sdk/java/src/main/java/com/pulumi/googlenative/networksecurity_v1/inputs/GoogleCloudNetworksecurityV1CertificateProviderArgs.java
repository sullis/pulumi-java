// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity_v1.inputs.CertificateProviderInstanceArgs;
import com.pulumi.googlenative.networksecurity_v1.inputs.GoogleCloudNetworksecurityV1GrpcEndpointArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of certificate provider. Defines the mechanism to obtain the certificate and private key for peer to peer authentication.
 * 
 */
public final class GoogleCloudNetworksecurityV1CertificateProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudNetworksecurityV1CertificateProviderArgs Empty = new GoogleCloudNetworksecurityV1CertificateProviderArgs();

    /**
     * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    @Import(name="certificateProviderInstance")
    private @Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance;

    /**
     * @return The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    public Optional<Output<CertificateProviderInstanceArgs>> certificateProviderInstance() {
        return Optional.ofNullable(this.certificateProviderInstance);
    }

    /**
     * gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    @Import(name="grpcEndpoint")
    private @Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint;

    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    public Optional<Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs>> grpcEndpoint() {
        return Optional.ofNullable(this.grpcEndpoint);
    }

    private GoogleCloudNetworksecurityV1CertificateProviderArgs() {}

    private GoogleCloudNetworksecurityV1CertificateProviderArgs(GoogleCloudNetworksecurityV1CertificateProviderArgs $) {
        this.certificateProviderInstance = $.certificateProviderInstance;
        this.grpcEndpoint = $.grpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudNetworksecurityV1CertificateProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudNetworksecurityV1CertificateProviderArgs $;

        public Builder() {
            $ = new GoogleCloudNetworksecurityV1CertificateProviderArgs();
        }

        public Builder(GoogleCloudNetworksecurityV1CertificateProviderArgs defaults) {
            $ = new GoogleCloudNetworksecurityV1CertificateProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
         * 
         * @return builder
         * 
         */
        public Builder certificateProviderInstance(@Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance) {
            $.certificateProviderInstance = certificateProviderInstance;
            return this;
        }

        /**
         * @param certificateProviderInstance The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
         * 
         * @return builder
         * 
         */
        public Builder certificateProviderInstance(CertificateProviderInstanceArgs certificateProviderInstance) {
            return certificateProviderInstance(Output.of(certificateProviderInstance));
        }

        /**
         * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
         * 
         * @return builder
         * 
         */
        public Builder grpcEndpoint(@Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint) {
            $.grpcEndpoint = grpcEndpoint;
            return this;
        }

        /**
         * @param grpcEndpoint gRPC specific configuration to access the gRPC server to obtain the cert and private key.
         * 
         * @return builder
         * 
         */
        public Builder grpcEndpoint(GoogleCloudNetworksecurityV1GrpcEndpointArgs grpcEndpoint) {
            return grpcEndpoint(Output.of(grpcEndpoint));
        }

        public GoogleCloudNetworksecurityV1CertificateProviderArgs build() {
            return $;
        }
    }

}
