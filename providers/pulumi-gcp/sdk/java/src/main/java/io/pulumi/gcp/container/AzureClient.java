// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.AzureClientArgs;
import io.pulumi.gcp.container.inputs.AzureClientState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AzureClient resources hold client authentication information needed by the Anthos Multi-Cloud API to manage Azure resources on your Azure subscription.When an AzureCluster is created, an AzureClient resource needs to be provided and all operations on Azure resources associated to that cluster will authenticate to Azure services using the given client.AzureClient resources are immutable and cannot be modified upon creation.Each AzureClient resource is bound to a single Azure Active Directory Application and tenant.
 * 
 * For more information, see:
 * * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
 * ## Example Usage
 * 
 * ## Import
 * 
 * Client can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default projects/{{project}}/locations/{{location}}/azureClients/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:container/azureClient:AzureClient")
public class AzureClient extends io.pulumi.resources.CustomResource {
    /**
     * Required. The Azure Active Directory Application ID.
     * 
     */
    @OutputExport(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return Required. The Azure Active Directory Application ID.
     * 
     */
    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    /**
     * Output only. The PEM encoded x509 certificate.
     * 
     */
    @OutputExport(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return Output only. The PEM encoded x509 certificate.
     * 
     */
    public Output<String> getCertificate() {
        return this.certificate;
    }
    /**
     * Output only. The time at which this resource was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time at which this resource was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The location for the resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Required. The Azure Active Directory Tenant ID.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return Required. The Azure Active Directory Tenant ID.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * Output only. A globally unique identifier for the client.
     * 
     */
    @OutputExport(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Output only. A globally unique identifier for the client.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureClient(String name, AzureClientArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureClient:AzureClient", name, args == null ? AzureClientArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AzureClient(String name, Input<String> id, @Nullable AzureClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureClient:AzureClient", name, state, makeResourceOptions(options, id));
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
    public static AzureClient get(String name, Input<String> id, @Nullable AzureClientState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzureClient(name, id, state, options);
    }
}
