// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
 * 
 */
public final class WorkloadCertificatesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkloadCertificatesResponse Empty = new WorkloadCertificatesResponse();

    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    @InputImport(name="enableCertificates", required=true)
      private final Boolean enableCertificates;

    public Boolean getEnableCertificates() {
        return this.enableCertificates;
    }

    public WorkloadCertificatesResponse(Boolean enableCertificates) {
        this.enableCertificates = Objects.requireNonNull(enableCertificates, "expected parameter 'enableCertificates' to be non-null");
    }

    private WorkloadCertificatesResponse() {
        this.enableCertificates = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadCertificatesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadCertificatesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCertificates = defaults.enableCertificates;
        }

        public Builder setEnableCertificates(Boolean enableCertificates) {
            this.enableCertificates = Objects.requireNonNull(enableCertificates);
            return this;
        }
        public WorkloadCertificatesResponse build() {
            return new WorkloadCertificatesResponse(enableCertificates);
        }
    }
}