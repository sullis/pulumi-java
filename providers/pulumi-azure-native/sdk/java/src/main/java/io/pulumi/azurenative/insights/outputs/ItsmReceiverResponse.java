// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ItsmReceiverResponse {
    /**
     * Unique identification of ITSM connection among multiple defined in above workspace.
     * 
     */
    private final String connectionId;
    /**
     * The name of the Itsm receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * Region in which workspace resides. Supported values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'
     * 
     */
    private final String region;
    /**
     * JSON blob for the configurations of the ITSM action. CreateMultipleWorkItems option will be part of this blob as well.
     * 
     */
    private final String ticketConfiguration;
    /**
     * OMS LA instance identifier.
     * 
     */
    private final String workspaceId;

    @OutputCustomType.Constructor({"connectionId","name","region","ticketConfiguration","workspaceId"})
    private ItsmReceiverResponse(
        String connectionId,
        String name,
        String region,
        String ticketConfiguration,
        String workspaceId) {
        this.connectionId = Objects.requireNonNull(connectionId);
        this.name = Objects.requireNonNull(name);
        this.region = Objects.requireNonNull(region);
        this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration);
        this.workspaceId = Objects.requireNonNull(workspaceId);
    }

    /**
     * Unique identification of ITSM connection among multiple defined in above workspace.
     * 
    */
    public String getConnectionId() {
        return this.connectionId;
    }
    /**
     * The name of the Itsm receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Region in which workspace resides. Supported values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * JSON blob for the configurations of the ITSM action. CreateMultipleWorkItems option will be part of this blob as well.
     * 
    */
    public String getTicketConfiguration() {
        return this.ticketConfiguration;
    }
    /**
     * OMS LA instance identifier.
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ItsmReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionId;
        private String name;
        private String region;
        private String ticketConfiguration;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ItsmReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.ticketConfiguration = defaults.ticketConfiguration;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder setConnectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setTicketConfiguration(String ticketConfiguration) {
            this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration);
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public ItsmReceiverResponse build() {
            return new ItsmReceiverResponse(connectionId, name, region, ticketConfiguration, workspaceId);
        }
    }
}