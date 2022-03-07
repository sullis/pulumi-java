// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerTrustCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerTrustCertificateArgs Empty = new GetServerTrustCertificateArgs();

    /**
     * Name of of the certificate to get.
     * 
     */
    @InputImport(name="certificateName", required=true)
      private final String certificateName;

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
      private final String managedInstanceName;

    public String getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetServerTrustCertificateArgs(
        String certificateName,
        String managedInstanceName,
        String resourceGroupName) {
        this.certificateName = Objects.requireNonNull(certificateName, "expected parameter 'certificateName' to be non-null");
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetServerTrustCertificateArgs() {
        this.certificateName = null;
        this.managedInstanceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerTrustCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateName;
        private String managedInstanceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerTrustCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCertificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetServerTrustCertificateArgs build() {
            return new GetServerTrustCertificateArgs(certificateName, managedInstanceName, resourceGroupName);
        }
    }
}