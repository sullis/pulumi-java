// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.AutomationAccountArgs;
import io.pulumi.azurenative.automation.outputs.EncryptionPropertiesResponse;
import io.pulumi.azurenative.automation.outputs.IdentityResponse;
import io.pulumi.azurenative.automation.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.automation.outputs.SkuResponse;
import io.pulumi.azurenative.automation.outputs.SystemDataResponse;
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
 * Definition of the automation account type.
 * API Version: 2021-06-22.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:AutomationAccount ContoseAutomationAccount /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount9 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:AutomationAccount")
public class AutomationAccount extends io.pulumi.resources.CustomResource {
    /**
     * URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
     */
    @OutputExport(name="automationHybridServiceUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> automationHybridServiceUrl;

    /**
     * @return URL of automation hybrid service which is used for hybrid worker on-boarding.
     * 
     */
    public Output</* @Nullable */ String> getAutomationHybridServiceUrl() {
        return this.automationHybridServiceUrl;
    }
    /**
     * Gets the creation time.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation time.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    @OutputExport(name="disableLocalAuth", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableLocalAuth;

    /**
     * @return Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth;
    }
    /**
     * Encryption properties for the automation account
     * 
     */
    @OutputExport(name="encryption", type=EncryptionPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionPropertiesResponse> encryption;

    /**
     * @return Encryption properties for the automation account
     * 
     */
    public Output</* @Nullable */ EncryptionPropertiesResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Identity for the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Gets or sets the last modified by.
     * 
     */
    @OutputExport(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return Gets or sets the last modified by.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the last modified time.
     * 
     */
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Gets the last modified time.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
     * List of Automation operations supported by the Automation resource provider.
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of Automation operations supported by the Automation resource provider.
     * 
     */
    public Output</* @Nullable */ List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccess;

    /**
     * @return Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    public Output</* @Nullable */ Boolean> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * Gets or sets the SKU of account.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return Gets or sets the SKU of account.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Gets status of account.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Gets status of account.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Resource system metadata.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Resource system metadata.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
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
    public AutomationAccount(String name, AutomationAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:AutomationAccount", name, args == null ? AutomationAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AutomationAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:AutomationAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20151031:AutomationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:AutomationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:AutomationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20210622:AutomationAccount").build())
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
    public static AutomationAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutomationAccount(name, id, options);
    }
}
