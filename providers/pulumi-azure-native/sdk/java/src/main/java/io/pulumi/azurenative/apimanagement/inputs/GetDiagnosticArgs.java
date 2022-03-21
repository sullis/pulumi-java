// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticArgs Empty = new GetDiagnosticArgs();

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId", required=true)
      private final String diagnosticId;

    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetDiagnosticArgs(
        String diagnosticId,
        String resourceGroupName,
        String serviceName) {
        this.diagnosticId = Objects.requireNonNull(diagnosticId, "expected parameter 'diagnosticId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetDiagnosticArgs() {
        this.diagnosticId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diagnosticId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiagnosticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticId = defaults.diagnosticId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder diagnosticId(String diagnosticId) {
            this.diagnosticId = Objects.requireNonNull(diagnosticId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetDiagnosticArgs build() {
            return new GetDiagnosticArgs(diagnosticId, resourceGroupName, serviceName);
        }
    }
}
