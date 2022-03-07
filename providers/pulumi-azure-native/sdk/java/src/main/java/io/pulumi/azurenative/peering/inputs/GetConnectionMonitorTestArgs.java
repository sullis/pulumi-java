// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionMonitorTestArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionMonitorTestArgs Empty = new GetConnectionMonitorTestArgs();

    /**
     * The name of the connection monitor test
     * 
     */
    @InputImport(name="connectionMonitorTestName", required=true)
      private final String connectionMonitorTestName;

    public String getConnectionMonitorTestName() {
        return this.connectionMonitorTestName;
    }

    /**
     * The name of the peering service.
     * 
     */
    @InputImport(name="peeringServiceName", required=true)
      private final String peeringServiceName;

    public String getPeeringServiceName() {
        return this.peeringServiceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConnectionMonitorTestArgs(
        String connectionMonitorTestName,
        String peeringServiceName,
        String resourceGroupName) {
        this.connectionMonitorTestName = Objects.requireNonNull(connectionMonitorTestName, "expected parameter 'connectionMonitorTestName' to be non-null");
        this.peeringServiceName = Objects.requireNonNull(peeringServiceName, "expected parameter 'peeringServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConnectionMonitorTestArgs() {
        this.connectionMonitorTestName = null;
        this.peeringServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionMonitorTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionMonitorTestName;
        private String peeringServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionMonitorTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionMonitorTestName = defaults.connectionMonitorTestName;
    	      this.peeringServiceName = defaults.peeringServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConnectionMonitorTestName(String connectionMonitorTestName) {
            this.connectionMonitorTestName = Objects.requireNonNull(connectionMonitorTestName);
            return this;
        }

        public Builder setPeeringServiceName(String peeringServiceName) {
            this.peeringServiceName = Objects.requireNonNull(peeringServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetConnectionMonitorTestArgs build() {
            return new GetConnectionMonitorTestArgs(connectionMonitorTestName, peeringServiceName, resourceGroupName);
        }
    }
}