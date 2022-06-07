// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIotConnectorFhirDestinationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotConnectorFhirDestinationPlainArgs Empty = new GetIotConnectorFhirDestinationPlainArgs();

    /**
     * The name of IoT Connector FHIR destination resource.
     * 
     */
    @Import(name="fhirDestinationName", required=true)
    private String fhirDestinationName;

    /**
     * @return The name of IoT Connector FHIR destination resource.
     * 
     */
    public String fhirDestinationName() {
        return this.fhirDestinationName;
    }

    /**
     * The name of IoT Connector resource.
     * 
     */
    @Import(name="iotConnectorName", required=true)
    private String iotConnectorName;

    /**
     * @return The name of IoT Connector resource.
     * 
     */
    public String iotConnectorName() {
        return this.iotConnectorName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of workspace resource.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetIotConnectorFhirDestinationPlainArgs() {}

    private GetIotConnectorFhirDestinationPlainArgs(GetIotConnectorFhirDestinationPlainArgs $) {
        this.fhirDestinationName = $.fhirDestinationName;
        this.iotConnectorName = $.iotConnectorName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotConnectorFhirDestinationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotConnectorFhirDestinationPlainArgs $;

        public Builder() {
            $ = new GetIotConnectorFhirDestinationPlainArgs();
        }

        public Builder(GetIotConnectorFhirDestinationPlainArgs defaults) {
            $ = new GetIotConnectorFhirDestinationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fhirDestinationName The name of IoT Connector FHIR destination resource.
         * 
         * @return builder
         * 
         */
        public Builder fhirDestinationName(String fhirDestinationName) {
            $.fhirDestinationName = fhirDestinationName;
            return this;
        }

        /**
         * @param iotConnectorName The name of IoT Connector resource.
         * 
         * @return builder
         * 
         */
        public Builder iotConnectorName(String iotConnectorName) {
            $.iotConnectorName = iotConnectorName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetIotConnectorFhirDestinationPlainArgs build() {
            $.fhirDestinationName = Objects.requireNonNull($.fhirDestinationName, "expected parameter 'fhirDestinationName' to be non-null");
            $.iotConnectorName = Objects.requireNonNull($.iotConnectorName, "expected parameter 'iotConnectorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
