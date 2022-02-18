// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs;
import io.pulumi.gcp.identityplatform.inputs.TenantOauthIdpConfigState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * OIDC IdP configuration for a Identity Toolkit project within a tenant.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TenantOauthIdpConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default projects/{{project}}/tenants/{{tenant}}/oauthIdpConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{project}}/{{tenant}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{tenant}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig")
public class TenantOauthIdpConfig extends io.pulumi.resources.CustomResource {
    /**
     * The client id of an OAuth client.
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The client id of an OAuth client.
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Human friendly display name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human friendly display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If this config allows users to sign in with the provider.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * For OIDC Idps, the issuer identifier.
     * 
     */
    @OutputExport(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    /**
     * @return For OIDC Idps, the issuer identifier.
     * 
     */
    public Output<String> getIssuer() {
        return this.issuer;
    }
    /**
     * The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    @OutputExport(name="tenant", type=String.class, parameters={})
    private Output<String> tenant;

    /**
     * @return The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    public Output<String> getTenant() {
        return this.tenant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TenantOauthIdpConfig(String name, TenantOauthIdpConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, args == null ? TenantOauthIdpConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TenantOauthIdpConfig(String name, Input<String> id, @Nullable TenantOauthIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TenantOauthIdpConfig get(String name, Input<String> id, @Nullable TenantOauthIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TenantOauthIdpConfig(name, id, state, options);
    }
}
