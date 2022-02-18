// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.GatewayHostnameConfigurationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Gateway hostname configuration details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:GatewayHostnameConfiguration default /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/gateways/gw1/hostnameConfigurations/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:GatewayHostnameConfiguration")
public class GatewayHostnameConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Identifier of Certificate entity that will be used for TLS connection establishment
     * 
     */
    @OutputExport(name="certificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateId;

    /**
     * @return Identifier of Certificate entity that will be used for TLS connection establishment
     * 
     */
    public Output</* @Nullable */ String> getCertificateId() {
        return this.certificateId;
    }
    /**
     * Hostname value. Supports valid domain name, partial or full wildcard
     * 
     */
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    /**
     * @return Hostname value. Supports valid domain name, partial or full wildcard
     * 
     */
    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    /**
     * Specifies if HTTP/2.0 is supported
     * 
     */
    @OutputExport(name="http2Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> http2Enabled;

    /**
     * @return Specifies if HTTP/2.0 is supported
     * 
     */
    public Output</* @Nullable */ Boolean> getHttp2Enabled() {
        return this.http2Enabled;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Determines whether gateway requests client certificate
     * 
     */
    @OutputExport(name="negotiateClientCertificate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> negotiateClientCertificate;

    /**
     * @return Determines whether gateway requests client certificate
     * 
     */
    public Output</* @Nullable */ Boolean> getNegotiateClientCertificate() {
        return this.negotiateClientCertificate;
    }
    /**
     * Specifies if TLS 1.0 is supported
     * 
     */
    @OutputExport(name="tls10Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tls10Enabled;

    /**
     * @return Specifies if TLS 1.0 is supported
     * 
     */
    public Output</* @Nullable */ Boolean> getTls10Enabled() {
        return this.tls10Enabled;
    }
    /**
     * Specifies if TLS 1.1 is supported
     * 
     */
    @OutputExport(name="tls11Enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tls11Enabled;

    /**
     * @return Specifies if TLS 1.1 is supported
     * 
     */
    public Output</* @Nullable */ Boolean> getTls11Enabled() {
        return this.tls11Enabled;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayHostnameConfiguration(String name, GatewayHostnameConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayHostnameConfiguration", name, args == null ? GatewayHostnameConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayHostnameConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayHostnameConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:GatewayHostnameConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:GatewayHostnameConfiguration").build())
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
    public static GatewayHostnameConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayHostnameConfiguration(name, id, options);
    }
}
