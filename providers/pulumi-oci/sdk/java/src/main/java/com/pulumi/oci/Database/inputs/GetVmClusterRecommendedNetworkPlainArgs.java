// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetVmClusterRecommendedNetworkNetwork;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVmClusterRecommendedNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterRecommendedNetworkPlainArgs Empty = new GetVmClusterRecommendedNetworkPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Import(name="definedTags")
    private @Nullable Map<String,Object> definedTags;

    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Optional<Map<String,Object>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * The user-friendly name for the VM cluster network. The name does not need to be unique.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return The user-friendly name for the VM cluster network. The name does not need to be unique.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     * 
     */
    @Import(name="dns")
    private @Nullable List<String> dns;

    /**
     * @return The list of DNS server IP addresses. Maximum of 3 allowed.
     * 
     */
    public Optional<List<String>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="exadataInfrastructureId", required=true)
    private String exadataInfrastructureId;

    /**
     * @return The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String exadataInfrastructureId() {
        return this.exadataInfrastructureId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Map<String,Object> freeformTags;

    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Map<String,Object>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * List of parameters for generation of the client and backup networks.
     * 
     */
    @Import(name="networks", required=true)
    private List<GetVmClusterRecommendedNetworkNetwork> networks;

    /**
     * @return List of parameters for generation of the client and backup networks.
     * 
     */
    public List<GetVmClusterRecommendedNetworkNetwork> networks() {
        return this.networks;
    }

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     * 
     */
    @Import(name="ntps")
    private @Nullable List<String> ntps;

    /**
     * @return The list of NTP server IP addresses. Maximum of 3 allowed.
     * 
     */
    public Optional<List<String>> ntps() {
        return Optional.ofNullable(this.ntps);
    }

    /**
     * The SCAN TCPIP port. Default is 1521.
     * 
     */
    @Import(name="scanListenerPortTcp")
    private @Nullable Integer scanListenerPortTcp;

    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    public Optional<Integer> scanListenerPortTcp() {
        return Optional.ofNullable(this.scanListenerPortTcp);
    }

    /**
     * The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    @Import(name="scanListenerPortTcpSsl")
    private @Nullable Integer scanListenerPortTcpSsl;

    /**
     * @return The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    public Optional<Integer> scanListenerPortTcpSsl() {
        return Optional.ofNullable(this.scanListenerPortTcpSsl);
    }

    private GetVmClusterRecommendedNetworkPlainArgs() {}

    private GetVmClusterRecommendedNetworkPlainArgs(GetVmClusterRecommendedNetworkPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.dns = $.dns;
        this.exadataInfrastructureId = $.exadataInfrastructureId;
        this.freeformTags = $.freeformTags;
        this.networks = $.networks;
        this.ntps = $.ntps;
        this.scanListenerPortTcp = $.scanListenerPortTcp;
        this.scanListenerPortTcpSsl = $.scanListenerPortTcpSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterRecommendedNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterRecommendedNetworkPlainArgs $;

        public Builder() {
            $ = new GetVmClusterRecommendedNetworkPlainArgs();
        }

        public Builder(GetVmClusterRecommendedNetworkPlainArgs defaults) {
            $ = new GetVmClusterRecommendedNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Map<String,Object> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param displayName The user-friendly name for the VM cluster network. The name does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param dns The list of DNS server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable List<String> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns The list of DNS server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder dns(String... dns) {
            return dns(List.of(dns));
        }

        /**
         * @param exadataInfrastructureId The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            $.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }

        /**
         * @param freeformTags Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Map<String,Object> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param networks List of parameters for generation of the client and backup networks.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<GetVmClusterRecommendedNetworkNetwork> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks List of parameters for generation of the client and backup networks.
         * 
         * @return builder
         * 
         */
        public Builder networks(GetVmClusterRecommendedNetworkNetwork... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param ntps The list of NTP server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder ntps(@Nullable List<String> ntps) {
            $.ntps = ntps;
            return this;
        }

        /**
         * @param ntps The list of NTP server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder ntps(String... ntps) {
            return ntps(List.of(ntps));
        }

        /**
         * @param scanListenerPortTcp The SCAN TCPIP port. Default is 1521.
         * 
         * @return builder
         * 
         */
        public Builder scanListenerPortTcp(@Nullable Integer scanListenerPortTcp) {
            $.scanListenerPortTcp = scanListenerPortTcp;
            return this;
        }

        /**
         * @param scanListenerPortTcpSsl The SCAN TCPIP SSL port. Default is 2484.
         * 
         * @return builder
         * 
         */
        public Builder scanListenerPortTcpSsl(@Nullable Integer scanListenerPortTcpSsl) {
            $.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            return this;
        }

        public GetVmClusterRecommendedNetworkPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.exadataInfrastructureId = Objects.requireNonNull($.exadataInfrastructureId, "expected parameter 'exadataInfrastructureId' to be non-null");
            $.networks = Objects.requireNonNull($.networks, "expected parameter 'networks' to be non-null");
            return $;
        }
    }

}
