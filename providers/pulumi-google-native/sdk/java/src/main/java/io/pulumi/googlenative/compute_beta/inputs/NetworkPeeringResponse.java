// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A network peering attached to a network resource. The message includes the peering name, peer network, peering state, and a flag indicating whether Google Compute Engine should automatically create routes for the peering.
 * 
 */
public final class NetworkPeeringResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkPeeringResponse Empty = new NetworkPeeringResponse();

    /**
     * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    @Import(name="autoCreateRoutes", required=true)
      private final Boolean autoCreateRoutes;

    public Boolean getAutoCreateRoutes() {
        return this.autoCreateRoutes;
    }

    /**
     * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    @Import(name="exchangeSubnetRoutes", required=true)
      private final Boolean exchangeSubnetRoutes;

    public Boolean getExchangeSubnetRoutes() {
        return this.exchangeSubnetRoutes;
    }

    /**
     * Whether to export the custom routes to peer network. The default value is false.
     * 
     */
    @Import(name="exportCustomRoutes", required=true)
      private final Boolean exportCustomRoutes;

    public Boolean getExportCustomRoutes() {
        return this.exportCustomRoutes;
    }

    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. IPv4 special-use ranges are always exported to peers and are not controlled by this field.
     * 
     */
    @Import(name="exportSubnetRoutesWithPublicIp", required=true)
      private final Boolean exportSubnetRoutesWithPublicIp;

    public Boolean getExportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp;
    }

    /**
     * Whether to import the custom routes from peer network. The default value is false.
     * 
     */
    @Import(name="importCustomRoutes", required=true)
      private final Boolean importCustomRoutes;

    public Boolean getImportCustomRoutes() {
        return this.importCustomRoutes;
    }

    /**
     * Whether subnet routes with public IP range are imported. The default value is false. IPv4 special-use ranges are always imported from peers and are not controlled by this field.
     * 
     */
    @Import(name="importSubnetRoutesWithPublicIp", required=true)
      private final Boolean importSubnetRoutesWithPublicIp;

    public Boolean getImportSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp;
    }

    /**
     * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * Maximum Transmission Unit in bytes.
     * 
     */
    @Import(name="peerMtu", required=true)
      private final Integer peerMtu;

    public Integer getPeerMtu() {
        return this.peerMtu;
    }

    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Details about the current state of the peering.
     * 
     */
    @Import(name="stateDetails", required=true)
      private final String stateDetails;

    public String getStateDetails() {
        return this.stateDetails;
    }

    public NetworkPeeringResponse(
        Boolean autoCreateRoutes,
        Boolean exchangeSubnetRoutes,
        Boolean exportCustomRoutes,
        Boolean exportSubnetRoutesWithPublicIp,
        Boolean importCustomRoutes,
        Boolean importSubnetRoutesWithPublicIp,
        String name,
        String network,
        Integer peerMtu,
        String state,
        String stateDetails) {
        this.autoCreateRoutes = Objects.requireNonNull(autoCreateRoutes, "expected parameter 'autoCreateRoutes' to be non-null");
        this.exchangeSubnetRoutes = Objects.requireNonNull(exchangeSubnetRoutes, "expected parameter 'exchangeSubnetRoutes' to be non-null");
        this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes, "expected parameter 'exportCustomRoutes' to be non-null");
        this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp, "expected parameter 'exportSubnetRoutesWithPublicIp' to be non-null");
        this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes, "expected parameter 'importCustomRoutes' to be non-null");
        this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp, "expected parameter 'importSubnetRoutesWithPublicIp' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.peerMtu = Objects.requireNonNull(peerMtu, "expected parameter 'peerMtu' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateDetails = Objects.requireNonNull(stateDetails, "expected parameter 'stateDetails' to be non-null");
    }

    private NetworkPeeringResponse() {
        this.autoCreateRoutes = null;
        this.exchangeSubnetRoutes = null;
        this.exportCustomRoutes = null;
        this.exportSubnetRoutesWithPublicIp = null;
        this.importCustomRoutes = null;
        this.importSubnetRoutesWithPublicIp = null;
        this.name = null;
        this.network = null;
        this.peerMtu = null;
        this.state = null;
        this.stateDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateRoutes;
        private Boolean exchangeSubnetRoutes;
        private Boolean exportCustomRoutes;
        private Boolean exportSubnetRoutesWithPublicIp;
        private Boolean importCustomRoutes;
        private Boolean importSubnetRoutesWithPublicIp;
        private String name;
        private String network;
        private Integer peerMtu;
        private String state;
        private String stateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateRoutes = defaults.autoCreateRoutes;
    	      this.exchangeSubnetRoutes = defaults.exchangeSubnetRoutes;
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.exportSubnetRoutesWithPublicIp = defaults.exportSubnetRoutesWithPublicIp;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.importSubnetRoutesWithPublicIp = defaults.importSubnetRoutesWithPublicIp;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerMtu = defaults.peerMtu;
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        public Builder autoCreateRoutes(Boolean autoCreateRoutes) {
            this.autoCreateRoutes = Objects.requireNonNull(autoCreateRoutes);
            return this;
        }
        public Builder exchangeSubnetRoutes(Boolean exchangeSubnetRoutes) {
            this.exchangeSubnetRoutes = Objects.requireNonNull(exchangeSubnetRoutes);
            return this;
        }
        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
            return this;
        }
        public Builder exportSubnetRoutesWithPublicIp(Boolean exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp);
            return this;
        }
        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
            return this;
        }
        public Builder importSubnetRoutesWithPublicIp(Boolean importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder peerMtu(Integer peerMtu) {
            this.peerMtu = Objects.requireNonNull(peerMtu);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateDetails(String stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }        public NetworkPeeringResponse build() {
            return new NetworkPeeringResponse(autoCreateRoutes, exchangeSubnetRoutes, exportCustomRoutes, exportSubnetRoutesWithPublicIp, importCustomRoutes, importSubnetRoutesWithPublicIp, name, network, peerMtu, state, stateDetails);
        }
    }
}
