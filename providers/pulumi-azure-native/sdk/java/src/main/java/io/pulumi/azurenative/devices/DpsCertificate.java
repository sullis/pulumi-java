// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.DpsCertificateArgs;
import io.pulumi.azurenative.devices.outputs.CertificatePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The X509 Certificate.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devices:DpsCertificate cert /subscriptions/91d12660-3dec-467a-be2a-213b5544ddc0/resourceGroups/myResourceGroup/providers/Microsoft.Devices/ProvisioningServives/myFirstProvisioningService/certificates/cert 
 * ```
 * 
 */
@ResourceType(type="azure-native:devices:DpsCertificate")
public class DpsCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The entity tag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The entity tag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the certificate.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the certificate.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * properties of a certificate
     * 
     */
    @OutputExport(name="properties", type=CertificatePropertiesResponse.class, parameters={})
    private Output<CertificatePropertiesResponse> properties;

    /**
     * @return properties of a certificate
     * 
     */
    public Output<CertificatePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
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
    public DpsCertificate(String name, DpsCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:DpsCertificate", name, args == null ? DpsCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DpsCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:DpsCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devices/v20170821preview:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20171115:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20180122:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200101:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200301:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200901preview:DpsCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20211015:DpsCertificate").build())
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
    public static DpsCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DpsCertificate(name, id, options);
    }
}
