// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notificationhubs.NotificationHubArgs;
import io.pulumi.azurenative.notificationhubs.outputs.AdmCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.ApnsCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.BaiduCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.GcmCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.MpnsCredentialResponse;
import io.pulumi.azurenative.notificationhubs.outputs.SharedAccessAuthorizationRulePropertiesResponse;
import io.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import io.pulumi.azurenative.notificationhubs.outputs.WnsCredentialResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Description of a NotificationHub Resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:notificationhubs:NotificationHub nh-sdk-hub /subscriptions/29cfa613-cbbc-4512-b1d6-1b3a92c7fa40/resourceGroups/sdkresourceGroup/providers/Microsoft.NotificationHubs/namespaces/nh-sdk-ns/notificationHubs/nh-sdk-hub 
 * ```
 * 
 */
@ResourceType(type="azure-native:notificationhubs:NotificationHub")
public class NotificationHub extends io.pulumi.resources.CustomResource {
    /**
     * The AdmCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="admCredential", type=AdmCredentialResponse.class, parameters={})
    private Output</* @Nullable */ AdmCredentialResponse> admCredential;

    /**
     * @return The AdmCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ AdmCredentialResponse> getAdmCredential() {
        return this.admCredential;
    }
    /**
     * The ApnsCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="apnsCredential", type=ApnsCredentialResponse.class, parameters={})
    private Output</* @Nullable */ ApnsCredentialResponse> apnsCredential;

    /**
     * @return The ApnsCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ ApnsCredentialResponse> getApnsCredential() {
        return this.apnsCredential;
    }
    /**
     * The AuthorizationRules of the created NotificationHub
     * 
     */
    @OutputExport(name="authorizationRules", type=List.class, parameters={SharedAccessAuthorizationRulePropertiesResponse.class})
    private Output</* @Nullable */ List<SharedAccessAuthorizationRulePropertiesResponse>> authorizationRules;

    /**
     * @return The AuthorizationRules of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ List<SharedAccessAuthorizationRulePropertiesResponse>> getAuthorizationRules() {
        return this.authorizationRules;
    }
    /**
     * The BaiduCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="baiduCredential", type=BaiduCredentialResponse.class, parameters={})
    private Output</* @Nullable */ BaiduCredentialResponse> baiduCredential;

    /**
     * @return The BaiduCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ BaiduCredentialResponse> getBaiduCredential() {
        return this.baiduCredential;
    }
    /**
     * The GcmCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="gcmCredential", type=GcmCredentialResponse.class, parameters={})
    private Output</* @Nullable */ GcmCredentialResponse> gcmCredential;

    /**
     * @return The GcmCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ GcmCredentialResponse> getGcmCredential() {
        return this.gcmCredential;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The MpnsCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="mpnsCredential", type=MpnsCredentialResponse.class, parameters={})
    private Output</* @Nullable */ MpnsCredentialResponse> mpnsCredential;

    /**
     * @return The MpnsCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ MpnsCredentialResponse> getMpnsCredential() {
        return this.mpnsCredential;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The RegistrationTtl of the created NotificationHub
     * 
     */
    @OutputExport(name="registrationTtl", type=String.class, parameters={})
    private Output</* @Nullable */ String> registrationTtl;

    /**
     * @return The RegistrationTtl of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ String> getRegistrationTtl() {
        return this.registrationTtl;
    }
    /**
     * The sku of the created namespace
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the created namespace
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The WnsCredential of the created NotificationHub
     * 
     */
    @OutputExport(name="wnsCredential", type=WnsCredentialResponse.class, parameters={})
    private Output</* @Nullable */ WnsCredentialResponse> wnsCredential;

    /**
     * @return The WnsCredential of the created NotificationHub
     * 
     */
    public Output</* @Nullable */ WnsCredentialResponse> getWnsCredential() {
        return this.wnsCredential;
    }

    public interface BuilderApplicator {
        public void apply(NotificationHubArgs.Builder a);
    }
    private static io.pulumi.azurenative.notificationhubs.NotificationHubArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.notificationhubs.NotificationHubArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NotificationHub(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationHub(String name) {
        this(name, NotificationHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationHub(String name, NotificationHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationHub(String name, NotificationHubArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:NotificationHub", name, args == null ? NotificationHubArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NotificationHub(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:NotificationHub", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:notificationhubs/v20140901:NotificationHub").build()),
                Input.of(Alias.builder().setType("azure-native:notificationhubs/v20160301:NotificationHub").build()),
                Input.of(Alias.builder().setType("azure-native:notificationhubs/v20170401:NotificationHub").build())
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
    public static NotificationHub get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NotificationHub(name, id, options);
    }
}