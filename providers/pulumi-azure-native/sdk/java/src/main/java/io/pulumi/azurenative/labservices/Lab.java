// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.LabArgs;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a lab.
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:Lab myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName}/labs/{labName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:Lab")
public class Lab extends io.pulumi.resources.CustomResource {
    /**
     * Object id of the user that created the lab.
     * 
     */
    @OutputExport(name="createdByObjectId", type=String.class, parameters={})
    private Output<String> createdByObjectId;

    /**
     * @return Object id of the user that created the lab.
     * 
     */
    public Output<String> getCreatedByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * Lab creator name
     * 
     */
    @OutputExport(name="createdByUserPrincipalName", type=String.class, parameters={})
    private Output<String> createdByUserPrincipalName;

    /**
     * @return Lab creator name
     * 
     */
    public Output<String> getCreatedByUserPrincipalName() {
        return this.createdByUserPrincipalName;
    }
    /**
     * Creation date for the lab
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Creation date for the lab
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Invitation code that users can use to join a lab.
     * 
     */
    @OutputExport(name="invitationCode", type=String.class, parameters={})
    private Output<String> invitationCode;

    /**
     * @return Invitation code that users can use to join a lab.
     * 
     */
    public Output<String> getInvitationCode() {
        return this.invitationCode;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @OutputExport(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Maximum number of users allowed in the lab.
     * 
     */
    @OutputExport(name="maxUsersInLab", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxUsersInLab;

    /**
     * @return Maximum number of users allowed in the lab.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxUsersInLab() {
        return this.maxUsersInLab;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
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
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
     */
    @OutputExport(name="usageQuota", type=String.class, parameters={})
    private Output</* @Nullable */ String> usageQuota;

    /**
     * @return Maximum duration a user can use an environment for in the lab.
     * 
     */
    public Output</* @Nullable */ String> getUsageQuota() {
        return this.usageQuota;
    }
    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    @OutputExport(name="userAccessMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAccessMode;

    /**
     * @return Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    public Output</* @Nullable */ String> getUserAccessMode() {
        return this.userAccessMode;
    }
    /**
     * Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
     */
    @OutputExport(name="userQuota", type=Integer.class, parameters={})
    private Output<Integer> userQuota;

    /**
     * @return Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
     */
    public Output<Integer> getUserQuota() {
        return this.userQuota;
    }

    public interface BuilderApplicator {
        public void apply(LabArgs.Builder a);
    }
    private static io.pulumi.azurenative.labservices.LabArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.labservices.LabArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Lab(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lab(String name) {
        this(name, LabArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lab(String name, LabArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lab(String name, LabArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Lab(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Lab", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20181015:Lab").build())
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
    public static Lab get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, options);
    }
}