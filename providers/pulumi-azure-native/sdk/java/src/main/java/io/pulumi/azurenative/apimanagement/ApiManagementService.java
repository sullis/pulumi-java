// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiManagementServiceArgs;
import io.pulumi.azurenative.apimanagement.outputs.AdditionalLocationResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceIdentityResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceSkuPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiVersionConstraintResponse;
import io.pulumi.azurenative.apimanagement.outputs.CertificateConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.HostnameConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A single API Management service resource in List or Get response.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiManagementService apimService1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiManagementService")
public class ApiManagementService extends io.pulumi.resources.CustomResource {
    /**
     * Additional datacenter locations of the API Management service.
     * 
     */
    @OutputExport(name="additionalLocations", type=List.class, parameters={AdditionalLocationResponse.class})
    private Output</* @Nullable */ List<AdditionalLocationResponse>> additionalLocations;

    /**
     * @return Additional datacenter locations of the API Management service.
     * 
     */
    public Output</* @Nullable */ List<AdditionalLocationResponse>> getAdditionalLocations() {
        return this.additionalLocations;
    }
    /**
     * Control Plane Apis version constraint for the API Management service.
     * 
     */
    @OutputExport(name="apiVersionConstraint", type=ApiVersionConstraintResponse.class, parameters={})
    private Output</* @Nullable */ ApiVersionConstraintResponse> apiVersionConstraint;

    /**
     * @return Control Plane Apis version constraint for the API Management service.
     * 
     */
    public Output</* @Nullable */ ApiVersionConstraintResponse> getApiVersionConstraint() {
        return this.apiVersionConstraint;
    }
    /**
     * List of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     * 
     */
    @OutputExport(name="certificates", type=List.class, parameters={CertificateConfigurationResponse.class})
    private Output</* @Nullable */ List<CertificateConfigurationResponse>> certificates;

    /**
     * @return List of Certificates that need to be installed in the API Management service. Max supported certificates that can be installed is 10.
     * 
     */
    public Output</* @Nullable */ List<CertificateConfigurationResponse>> getCertificates() {
        return this.certificates;
    }
    /**
     * Creation UTC date of the API Management service.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @OutputExport(name="createdAtUtc", type=String.class, parameters={})
    private Output<String> createdAtUtc;

    /**
     * @return Creation UTC date of the API Management service.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Output<String> getCreatedAtUtc() {
        return this.createdAtUtc;
    }
    /**
     * Custom properties of the API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.</br>Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.</br></br>You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384
     * 
     */
    @OutputExport(name="customProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> customProperties;

    /**
     * @return Custom properties of the API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TripleDes168` will disable the cipher TLS_RSA_WITH_3DES_EDE_CBC_SHA for all TLS(1.0, 1.1 and 1.2).</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls11` can be used to disable just TLS 1.1.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Protocols.Tls10` can be used to disable TLS 1.0 on an API Management service.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls11` can be used to disable just TLS 1.1 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Backend.Protocols.Tls10` can be used to disable TLS 1.0 for communications with backends.</br>Setting `Microsoft.WindowsAzure.ApiManagement.Gateway.Protocols.Server.Http2` can be used to enable HTTP2 protocol on an API Management service.</br>Not specifying any of these properties on PATCH operation will reset omitted properties' values to their defaults. For all the settings except Http2 the default value is `True` if the service was created on or before April 1st 2018 and `False` otherwise. Http2 setting's default value is `False`.</br></br>You can disable any of next ciphers by using settings `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.[cipher_name]`: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA256, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_CBC_SHA. For example, `Microsoft.WindowsAzure.ApiManagement.Gateway.Security.Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256`:`false`. The default value is `true` for them.  Note: next ciphers can't be disabled since they are required by Azure CloudService internal components: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384,TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256,TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384,TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256,TLS_RSA_WITH_AES_256_GCM_SHA384
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getCustomProperties() {
        return this.customProperties;
    }
    /**
     * DEveloper Portal endpoint URL of the API Management service.
     * 
     */
    @OutputExport(name="developerPortalUrl", type=String.class, parameters={})
    private Output<String> developerPortalUrl;

    /**
     * @return DEveloper Portal endpoint URL of the API Management service.
     * 
     */
    public Output<String> getDeveloperPortalUrl() {
        return this.developerPortalUrl;
    }
    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     * 
     */
    @OutputExport(name="disableGateway", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableGateway;

    /**
     * @return Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in master region.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableGateway() {
        return this.disableGateway;
    }
    /**
     * Property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     * 
     */
    @OutputExport(name="enableClientCertificate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableClientCertificate;

    /**
     * @return Property only meant to be used for Consumption SKU Service. This enforces a client certificate to be presented on each request to the gateway. This also enables the ability to authenticate the certificate in the policy on the gateway.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableClientCertificate() {
        return this.enableClientCertificate;
    }
    /**
     * ETag of the resource.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return ETag of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Gateway URL of the API Management service in the Default Region.
     * 
     */
    @OutputExport(name="gatewayRegionalUrl", type=String.class, parameters={})
    private Output<String> gatewayRegionalUrl;

    /**
     * @return Gateway URL of the API Management service in the Default Region.
     * 
     */
    public Output<String> getGatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    /**
     * Gateway URL of the API Management service.
     * 
     */
    @OutputExport(name="gatewayUrl", type=String.class, parameters={})
    private Output<String> gatewayUrl;

    /**
     * @return Gateway URL of the API Management service.
     * 
     */
    public Output<String> getGatewayUrl() {
        return this.gatewayUrl;
    }
    /**
     * Custom hostname configuration of the API Management service.
     * 
     */
    @OutputExport(name="hostnameConfigurations", type=List.class, parameters={HostnameConfigurationResponse.class})
    private Output</* @Nullable */ List<HostnameConfigurationResponse>> hostnameConfigurations;

    /**
     * @return Custom hostname configuration of the API Management service.
     * 
     */
    public Output</* @Nullable */ List<HostnameConfigurationResponse>> getHostnameConfigurations() {
        return this.hostnameConfigurations;
    }
    /**
     * Managed service identity of the Api Management service.
     * 
     */
    @OutputExport(name="identity", type=ApiManagementServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ApiManagementServiceIdentityResponse> identity;

    /**
     * @return Managed service identity of the Api Management service.
     * 
     */
    public Output</* @Nullable */ ApiManagementServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Management API endpoint URL of the API Management service.
     * 
     */
    @OutputExport(name="managementApiUrl", type=String.class, parameters={})
    private Output<String> managementApiUrl;

    /**
     * @return Management API endpoint URL of the API Management service.
     * 
     */
    public Output<String> getManagementApiUrl() {
        return this.managementApiUrl;
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
     * Email address from which the notification will be sent.
     * 
     */
    @OutputExport(name="notificationSenderEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationSenderEmail;

    /**
     * @return Email address from which the notification will be sent.
     * 
     */
    public Output</* @Nullable */ String> getNotificationSenderEmail() {
        return this.notificationSenderEmail;
    }
    /**
     * Publisher portal endpoint Url of the API Management service.
     * 
     */
    @OutputExport(name="portalUrl", type=String.class, parameters={})
    private Output<String> portalUrl;

    /**
     * @return Publisher portal endpoint Url of the API Management service.
     * 
     */
    public Output<String> getPortalUrl() {
        return this.portalUrl;
    }
    /**
     * Private Static Load Balanced IP addresses of the API Management service in Primary region which is deployed in an Internal Virtual Network. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @OutputExport(name="privateIPAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> privateIPAddresses;

    /**
     * @return Private Static Load Balanced IP addresses of the API Management service in Primary region which is deployed in an Internal Virtual Network. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    public Output<List<String>> getPrivateIPAddresses() {
        return this.privateIPAddresses;
    }
    /**
     * The current provisioning state of the API Management service which can be one of the following: Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current provisioning state of the API Management service which can be one of the following: Created/Activating/Succeeded/Updating/Failed/Stopped/Terminating/TerminationFailed/Deleted.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Public Static Load Balanced IP addresses of the API Management service in Primary region. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @OutputExport(name="publicIPAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> publicIPAddresses;

    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in Primary region. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    public Output<List<String>> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    /**
     * Publisher email.
     * 
     */
    @OutputExport(name="publisherEmail", type=String.class, parameters={})
    private Output<String> publisherEmail;

    /**
     * @return Publisher email.
     * 
     */
    public Output<String> getPublisherEmail() {
        return this.publisherEmail;
    }
    /**
     * Publisher name.
     * 
     */
    @OutputExport(name="publisherName", type=String.class, parameters={})
    private Output<String> publisherName;

    /**
     * @return Publisher name.
     * 
     */
    public Output<String> getPublisherName() {
        return this.publisherName;
    }
    /**
     * Undelete Api Management Service if it was previously soft-deleted. If this flag is specified and set to True all other properties will be ignored.
     * 
     */
    @OutputExport(name="restore", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restore;

    /**
     * @return Undelete Api Management Service if it was previously soft-deleted. If this flag is specified and set to True all other properties will be ignored.
     * 
     */
    public Output</* @Nullable */ Boolean> getRestore() {
        return this.restore;
    }
    /**
     * SCM endpoint URL of the API Management service.
     * 
     */
    @OutputExport(name="scmUrl", type=String.class, parameters={})
    private Output<String> scmUrl;

    /**
     * @return SCM endpoint URL of the API Management service.
     * 
     */
    public Output<String> getScmUrl() {
        return this.scmUrl;
    }
    /**
     * SKU properties of the API Management service.
     * 
     */
    @OutputExport(name="sku", type=ApiManagementServiceSkuPropertiesResponse.class, parameters={})
    private Output<ApiManagementServiceSkuPropertiesResponse> sku;

    /**
     * @return SKU properties of the API Management service.
     * 
     */
    public Output<ApiManagementServiceSkuPropertiesResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The provisioning state of the API Management service, which is targeted by the long running operation started on the service.
     * 
     */
    @OutputExport(name="targetProvisioningState", type=String.class, parameters={})
    private Output<String> targetProvisioningState;

    /**
     * @return The provisioning state of the API Management service, which is targeted by the long running operation started on the service.
     * 
     */
    public Output<String> getTargetProvisioningState() {
        return this.targetProvisioningState;
    }
    /**
     * Resource type for API Management resource is set to Microsoft.ApiManagement.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource is set to Microsoft.ApiManagement.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Virtual network configuration of the API Management service.
     * 
     */
    @OutputExport(name="virtualNetworkConfiguration", type=VirtualNetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkConfigurationResponse> virtualNetworkConfiguration;

    /**
     * @return Virtual network configuration of the API Management service.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }
    /**
     * The type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only.
     * 
     */
    @OutputExport(name="virtualNetworkType", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkType;

    /**
     * @return The type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only.
     * 
     */
    public Output</* @Nullable */ String> getVirtualNetworkType() {
        return this.virtualNetworkType;
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiManagementService(String name, ApiManagementServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiManagementService", name, args == null ? ApiManagementServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiManagementService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiManagementService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiManagementService").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiManagementService").build())
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
    public static ApiManagementService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiManagementService(name, id, options);
    }
}
