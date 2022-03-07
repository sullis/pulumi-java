// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
 * 
 */
public final class WorkloadIdentityConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkloadIdentityConfigResponse Empty = new WorkloadIdentityConfigResponse();

    /**
     * IAM Identity Namespace to attach all Kubernetes Service Accounts to.
     * 
     */
    @InputImport(name="identityNamespace", required=true)
      private final String identityNamespace;

    public String getIdentityNamespace() {
        return this.identityNamespace;
    }

    /**
     * identity provider is the third party identity provider.
     * 
     */
    @InputImport(name="identityProvider", required=true)
      private final String identityProvider;

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    @InputImport(name="workloadPool", required=true)
      private final String workloadPool;

    public String getWorkloadPool() {
        return this.workloadPool;
    }

    public WorkloadIdentityConfigResponse(
        String identityNamespace,
        String identityProvider,
        String workloadPool) {
        this.identityNamespace = Objects.requireNonNull(identityNamespace, "expected parameter 'identityNamespace' to be non-null");
        this.identityProvider = Objects.requireNonNull(identityProvider, "expected parameter 'identityProvider' to be non-null");
        this.workloadPool = Objects.requireNonNull(workloadPool, "expected parameter 'workloadPool' to be non-null");
    }

    private WorkloadIdentityConfigResponse() {
        this.identityNamespace = null;
        this.identityProvider = null;
        this.workloadPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identityNamespace;
        private String identityProvider;
        private String workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityNamespace = defaults.identityNamespace;
    	      this.identityProvider = defaults.identityProvider;
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder setIdentityNamespace(String identityNamespace) {
            this.identityNamespace = Objects.requireNonNull(identityNamespace);
            return this;
        }

        public Builder setIdentityProvider(String identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }

        public Builder setWorkloadPool(String workloadPool) {
            this.workloadPool = Objects.requireNonNull(workloadPool);
            return this;
        }
        public WorkloadIdentityConfigResponse build() {
            return new WorkloadIdentityConfigResponse(identityNamespace, identityProvider, workloadPool);
        }
    }
}