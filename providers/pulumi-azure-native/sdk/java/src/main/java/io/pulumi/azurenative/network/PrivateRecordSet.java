// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateRecordSetArgs;
import io.pulumi.azurenative.network.outputs.ARecordResponse;
import io.pulumi.azurenative.network.outputs.AaaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CnameRecordResponse;
import io.pulumi.azurenative.network.outputs.MxRecordResponse;
import io.pulumi.azurenative.network.outputs.PtrRecordResponse;
import io.pulumi.azurenative.network.outputs.SoaRecordResponse;
import io.pulumi.azurenative.network.outputs.SrvRecordResponse;
import io.pulumi.azurenative.network.outputs.TxtRecordResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a DNS record set (a collection of DNS records with the same name and type) in a Private DNS zone.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PrivateRecordSet recordtxt /subscriptions/subscriptionId/resourceGroups/resourceGroup1/providers/Microsoft.Network/privateDnsZones/privatezone1.com/TXT/recordtxt 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateRecordSet")
public class PrivateRecordSet extends io.pulumi.resources.CustomResource {
    /**
     * The list of A records in the record set.
     * 
     */
    @OutputExport(name="aRecords", type=List.class, parameters={ARecordResponse.class})
    private Output</* @Nullable */ List<ARecordResponse>> aRecords;

    /**
     * @return The list of A records in the record set.
     * 
     */
    public Output</* @Nullable */ List<ARecordResponse>> getARecords() {
        return this.aRecords;
    }
    /**
     * The list of AAAA records in the record set.
     * 
     */
    @OutputExport(name="aaaaRecords", type=List.class, parameters={AaaaRecordResponse.class})
    private Output</* @Nullable */ List<AaaaRecordResponse>> aaaaRecords;

    /**
     * @return The list of AAAA records in the record set.
     * 
     */
    public Output</* @Nullable */ List<AaaaRecordResponse>> getAaaaRecords() {
        return this.aaaaRecords;
    }
    /**
     * The CNAME record in the record set.
     * 
     */
    @OutputExport(name="cnameRecord", type=CnameRecordResponse.class, parameters={})
    private Output</* @Nullable */ CnameRecordResponse> cnameRecord;

    /**
     * @return The CNAME record in the record set.
     * 
     */
    public Output</* @Nullable */ CnameRecordResponse> getCnameRecord() {
        return this.cnameRecord;
    }
    /**
     * The ETag of the record set.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The ETag of the record set.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified domain name of the record set.
     * 
     */
    @OutputExport(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return Fully qualified domain name of the record set.
     * 
     */
    public Output<String> getFqdn() {
        return this.fqdn;
    }
    /**
     * Is the record set auto-registered in the Private DNS zone through a virtual network link?
     * 
     */
    @OutputExport(name="isAutoRegistered", type=Boolean.class, parameters={})
    private Output<Boolean> isAutoRegistered;

    /**
     * @return Is the record set auto-registered in the Private DNS zone through a virtual network link?
     * 
     */
    public Output<Boolean> getIsAutoRegistered() {
        return this.isAutoRegistered;
    }
    /**
     * The metadata attached to the record set.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return The metadata attached to the record set.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The list of MX records in the record set.
     * 
     */
    @OutputExport(name="mxRecords", type=List.class, parameters={MxRecordResponse.class})
    private Output</* @Nullable */ List<MxRecordResponse>> mxRecords;

    /**
     * @return The list of MX records in the record set.
     * 
     */
    public Output</* @Nullable */ List<MxRecordResponse>> getMxRecords() {
        return this.mxRecords;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of PTR records in the record set.
     * 
     */
    @OutputExport(name="ptrRecords", type=List.class, parameters={PtrRecordResponse.class})
    private Output</* @Nullable */ List<PtrRecordResponse>> ptrRecords;

    /**
     * @return The list of PTR records in the record set.
     * 
     */
    public Output</* @Nullable */ List<PtrRecordResponse>> getPtrRecords() {
        return this.ptrRecords;
    }
    /**
     * The SOA record in the record set.
     * 
     */
    @OutputExport(name="soaRecord", type=SoaRecordResponse.class, parameters={})
    private Output</* @Nullable */ SoaRecordResponse> soaRecord;

    /**
     * @return The SOA record in the record set.
     * 
     */
    public Output</* @Nullable */ SoaRecordResponse> getSoaRecord() {
        return this.soaRecord;
    }
    /**
     * The list of SRV records in the record set.
     * 
     */
    @OutputExport(name="srvRecords", type=List.class, parameters={SrvRecordResponse.class})
    private Output</* @Nullable */ List<SrvRecordResponse>> srvRecords;

    /**
     * @return The list of SRV records in the record set.
     * 
     */
    public Output</* @Nullable */ List<SrvRecordResponse>> getSrvRecords() {
        return this.srvRecords;
    }
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    @OutputExport(name="ttl", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> ttl;

    /**
     * @return The TTL (time-to-live) of the records in the record set.
     * 
     */
    public Output</* @Nullable */ Double> getTtl() {
        return this.ttl;
    }
    /**
     * The list of TXT records in the record set.
     * 
     */
    @OutputExport(name="txtRecords", type=List.class, parameters={TxtRecordResponse.class})
    private Output</* @Nullable */ List<TxtRecordResponse>> txtRecords;

    /**
     * @return The list of TXT records in the record set.
     * 
     */
    public Output</* @Nullable */ List<TxtRecordResponse>> getTxtRecords() {
        return this.txtRecords;
    }
    /**
     * The type of the resource. Example - 'Microsoft.Network/privateDnsZones'.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Example - 'Microsoft.Network/privateDnsZones'.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PrivateRecordSetArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.PrivateRecordSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.PrivateRecordSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrivateRecordSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateRecordSet(String name) {
        this(name, PrivateRecordSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateRecordSet(String name, PrivateRecordSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateRecordSet(String name, PrivateRecordSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateRecordSet", name, args == null ? PrivateRecordSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateRecordSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateRecordSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180901:PrivateRecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200101:PrivateRecordSet").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateRecordSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateRecordSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateRecordSet(name, id, options);
    }
}