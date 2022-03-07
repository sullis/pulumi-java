// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
import io.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState;
import io.pulumi.gcp.organizations.outputs.AccessApprovalSettingsEnrolledService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
 * 
 * To get more information about OrganizationSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/organizations)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * OrganizationSettings can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default organizations/{{organization_id}}/accessApprovalSettings
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default {{organization_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/accessApprovalSettings:AccessApprovalSettings")
public class AccessApprovalSettings extends io.pulumi.resources.CustomResource {
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @OutputExport(name="enrolledAncestor", type=Boolean.class, parameters={})
    private Output<Boolean> enrolledAncestor;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> getEnrolledAncestor() {
        return this.enrolledAncestor;
    }
    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="enrolledServices", type=List.class, parameters={AccessApprovalSettingsEnrolledService.class})
    private Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledService>> getEnrolledServices() {
        return this.enrolledServices;
    }
    /**
     * The resource name of the settings. Format is "organizations/{organization_id}/accessApprovalSettings"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the settings. Format is "organizations/{organization_id}/accessApprovalSettings"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @OutputExport(name="notificationEmails", type=List.class, parameters={String.class})
    private Output<List<String>> notificationEmails;

    /**
     * @return A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    public Output<List<String>> getNotificationEmails() {
        return this.notificationEmails;
    }
    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @OutputExport(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return ID of the organization of the access approval settings.
     * 
     */
    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    public interface BuilderApplicator {
        public void apply(AccessApprovalSettingsArgs.Builder a);
    }
    private static io.pulumi.gcp.organizations.AccessApprovalSettingsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.organizations.AccessApprovalSettingsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessApprovalSettings(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessApprovalSettings(String name) {
        this(name, AccessApprovalSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, args == null ? AccessApprovalSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessApprovalSettings(String name, Input<String> id, @Nullable AccessApprovalSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, state, makeResourceOptions(options, id));
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
    public static AccessApprovalSettings get(String name, Input<String> id, @Nullable AccessApprovalSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessApprovalSettings(name, id, state, options);
    }
}