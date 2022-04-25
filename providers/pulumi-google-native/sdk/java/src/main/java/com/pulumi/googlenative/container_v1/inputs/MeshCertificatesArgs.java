// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
 * 
 */
public final class MeshCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MeshCertificatesArgs Empty = new MeshCertificatesArgs();

    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    @Import(name="enableCertificates")
    private @Nullable Output<Boolean> enableCertificates;

    /**
     * @return enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    public Optional<Output<Boolean>> enableCertificates() {
        return Optional.ofNullable(this.enableCertificates);
    }

    private MeshCertificatesArgs() {}

    private MeshCertificatesArgs(MeshCertificatesArgs $) {
        this.enableCertificates = $.enableCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MeshCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MeshCertificatesArgs $;

        public Builder() {
            $ = new MeshCertificatesArgs();
        }

        public Builder(MeshCertificatesArgs defaults) {
            $ = new MeshCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableCertificates enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
         * 
         * @return builder
         * 
         */
        public Builder enableCertificates(@Nullable Output<Boolean> enableCertificates) {
            $.enableCertificates = enableCertificates;
            return this;
        }

        /**
         * @param enableCertificates enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
         * 
         * @return builder
         * 
         */
        public Builder enableCertificates(Boolean enableCertificates) {
            return enableCertificates(Output.of(enableCertificates));
        }

        public MeshCertificatesArgs build() {
            return $;
        }
    }

}
