// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIotConnectorFhirDestinationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIotConnectorFhirDestinationArgs Empty = new GetIotConnectorFhirDestinationArgs();

    /**
     * The name of IoT Connector FHIR destination resource.
     * 
     */
    @InputImport(name="fhirDestinationName", required=true)
    private final String fhirDestinationName;

    public String getFhirDestinationName() {
        return this.fhirDestinationName;
    }

    /**
     * The name of IoT Connector resource.
     * 
     */
    @InputImport(name="iotConnectorName", required=true)
    private final String iotConnectorName;

    public String getIotConnectorName() {
        return this.iotConnectorName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetIotConnectorFhirDestinationArgs(
        String fhirDestinationName,
        String iotConnectorName,
        String resourceGroupName,
        String workspaceName) {
        this.fhirDestinationName = Objects.requireNonNull(fhirDestinationName, "expected parameter 'fhirDestinationName' to be non-null");
        this.iotConnectorName = Objects.requireNonNull(iotConnectorName, "expected parameter 'iotConnectorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetIotConnectorFhirDestinationArgs() {
        this.fhirDestinationName = null;
        this.iotConnectorName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotConnectorFhirDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fhirDestinationName;
        private String iotConnectorName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotConnectorFhirDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fhirDestinationName = defaults.fhirDestinationName;
    	      this.iotConnectorName = defaults.iotConnectorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setFhirDestinationName(String fhirDestinationName) {
            this.fhirDestinationName = Objects.requireNonNull(fhirDestinationName);
            return this;
        }

        public Builder setIotConnectorName(String iotConnectorName) {
            this.iotConnectorName = Objects.requireNonNull(iotConnectorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetIotConnectorFhirDestinationArgs build() {
            return new GetIotConnectorFhirDestinationArgs(fhirDestinationName, iotConnectorName, resourceGroupName, workspaceName);
        }
    }
}
