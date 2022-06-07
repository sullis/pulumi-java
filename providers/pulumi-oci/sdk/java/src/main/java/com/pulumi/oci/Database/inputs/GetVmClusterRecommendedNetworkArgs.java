// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetVmClusterRecommendedNetworkNetworkArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVmClusterRecommendedNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterRecommendedNetworkArgs Empty = new GetVmClusterRecommendedNetworkArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * The user-friendly name for the VM cluster network. The name does not need to be unique.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The user-friendly name for the VM cluster network. The name does not need to be unique.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     * 
     */
    @Import(name="dns")
    private @Nullable Output<List<String>> dns;

    /**
     * @return The list of DNS server IP addresses. Maximum of 3 allowed.
     * 
     */
    public Optional<Output<List<String>>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="exadataInfrastructureId", required=true)
    private Output<String> exadataInfrastructureId;

    /**
     * @return The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> exadataInfrastructureId() {
        return this.exadataInfrastructureId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * List of parameters for generation of the client and backup networks.
     * 
     */
    @Import(name="networks", required=true)
    private Output<List<GetVmClusterRecommendedNetworkNetworkArgs>> networks;

    /**
     * @return List of parameters for generation of the client and backup networks.
     * 
     */
    public Output<List<GetVmClusterRecommendedNetworkNetworkArgs>> networks() {
        return this.networks;
    }

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     * 
     */
    @Import(name="ntps")
    private @Nullable Output<List<String>> ntps;

    /**
     * @return The list of NTP server IP addresses. Maximum of 3 allowed.
     * 
     */
    public Optional<Output<List<String>>> ntps() {
        return Optional.ofNullable(this.ntps);
    }

    /**
     * The SCAN TCPIP port. Default is 1521.
     * 
     */
    @Import(name="scanListenerPortTcp")
    private @Nullable Output<Integer> scanListenerPortTcp;

    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    public Optional<Output<Integer>> scanListenerPortTcp() {
        return Optional.ofNullable(this.scanListenerPortTcp);
    }

    /**
     * The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    @Import(name="scanListenerPortTcpSsl")
    private @Nullable Output<Integer> scanListenerPortTcpSsl;

    /**
     * @return The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    public Optional<Output<Integer>> scanListenerPortTcpSsl() {
        return Optional.ofNullable(this.scanListenerPortTcpSsl);
    }

    private GetVmClusterRecommendedNetworkArgs() {}

    private GetVmClusterRecommendedNetworkArgs(GetVmClusterRecommendedNetworkArgs $) {
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
    public static Builder builder(GetVmClusterRecommendedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterRecommendedNetworkArgs $;

        public Builder() {
            $ = new GetVmClusterRecommendedNetworkArgs();
        }

        public Builder(GetVmClusterRecommendedNetworkArgs defaults) {
            $ = new GetVmClusterRecommendedNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName The user-friendly name for the VM cluster network. The name does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user-friendly name for the VM cluster network. The name does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dns The list of DNS server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<List<String>> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns The list of DNS server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder dns(List<String> dns) {
            return dns(Output.of(dns));
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
        public Builder exadataInfrastructureId(Output<String> exadataInfrastructureId) {
            $.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }

        /**
         * @param exadataInfrastructureId The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            return exadataInfrastructureId(Output.of(exadataInfrastructureId));
        }

        /**
         * @param freeformTags Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param networks List of parameters for generation of the client and backup networks.
         * 
         * @return builder
         * 
         */
        public Builder networks(Output<List<GetVmClusterRecommendedNetworkNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks List of parameters for generation of the client and backup networks.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<GetVmClusterRecommendedNetworkNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks List of parameters for generation of the client and backup networks.
         * 
         * @return builder
         * 
         */
        public Builder networks(GetVmClusterRecommendedNetworkNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param ntps The list of NTP server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder ntps(@Nullable Output<List<String>> ntps) {
            $.ntps = ntps;
            return this;
        }

        /**
         * @param ntps The list of NTP server IP addresses. Maximum of 3 allowed.
         * 
         * @return builder
         * 
         */
        public Builder ntps(List<String> ntps) {
            return ntps(Output.of(ntps));
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
        public Builder scanListenerPortTcp(@Nullable Output<Integer> scanListenerPortTcp) {
            $.scanListenerPortTcp = scanListenerPortTcp;
            return this;
        }

        /**
         * @param scanListenerPortTcp The SCAN TCPIP port. Default is 1521.
         * 
         * @return builder
         * 
         */
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            return scanListenerPortTcp(Output.of(scanListenerPortTcp));
        }

        /**
         * @param scanListenerPortTcpSsl The SCAN TCPIP SSL port. Default is 2484.
         * 
         * @return builder
         * 
         */
        public Builder scanListenerPortTcpSsl(@Nullable Output<Integer> scanListenerPortTcpSsl) {
            $.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            return this;
        }

        /**
         * @param scanListenerPortTcpSsl The SCAN TCPIP SSL port. Default is 2484.
         * 
         * @return builder
         * 
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            return scanListenerPortTcpSsl(Output.of(scanListenerPortTcpSsl));
        }

        public GetVmClusterRecommendedNetworkArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.exadataInfrastructureId = Objects.requireNonNull($.exadataInfrastructureId, "expected parameter 'exadataInfrastructureId' to be non-null");
            $.networks = Objects.requireNonNull($.networks, "expected parameter 'networks' to be non-null");
            return $;
        }
    }

}
