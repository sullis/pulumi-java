// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iot.DomainConfigurationArgs;
import io.pulumi.awsnative.iot.enums.DomainConfigurationDomainType;
import io.pulumi.awsnative.iot.enums.DomainConfigurationServiceType;
import io.pulumi.awsnative.iot.enums.DomainConfigurationStatus;
import io.pulumi.awsnative.iot.outputs.DomainConfigurationAuthorizerConfig;
import io.pulumi.awsnative.iot.outputs.DomainConfigurationServerCertificateSummary;
import io.pulumi.awsnative.iot.outputs.DomainConfigurationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create and manage a Domain Configuration
 * 
 */
@ResourceType(type="aws-native:iot:DomainConfiguration")
public class DomainConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="authorizerConfig", type=DomainConfigurationAuthorizerConfig.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationAuthorizerConfig> authorizerConfig;

    public Output</* @Nullable */ DomainConfigurationAuthorizerConfig> getAuthorizerConfig() {
        return this.authorizerConfig;
    }
    @OutputExport(name="domainConfigurationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainConfigurationName;

    public Output</* @Nullable */ String> getDomainConfigurationName() {
        return this.domainConfigurationName;
    }
    @OutputExport(name="domainConfigurationStatus", type=DomainConfigurationStatus.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationStatus> domainConfigurationStatus;

    public Output</* @Nullable */ DomainConfigurationStatus> getDomainConfigurationStatus() {
        return this.domainConfigurationStatus;
    }
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    public Output</* @Nullable */ String> getDomainName() {
        return this.domainName;
    }
    @OutputExport(name="domainType", type=DomainConfigurationDomainType.class, parameters={})
    private Output<DomainConfigurationDomainType> domainType;

    public Output<DomainConfigurationDomainType> getDomainType() {
        return this.domainType;
    }
    @OutputExport(name="serverCertificateArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> serverCertificateArns;

    public Output</* @Nullable */ List<String>> getServerCertificateArns() {
        return this.serverCertificateArns;
    }
    @OutputExport(name="serverCertificates", type=List.class, parameters={DomainConfigurationServerCertificateSummary.class})
    private Output<List<DomainConfigurationServerCertificateSummary>> serverCertificates;

    public Output<List<DomainConfigurationServerCertificateSummary>> getServerCertificates() {
        return this.serverCertificates;
    }
    @OutputExport(name="serviceType", type=DomainConfigurationServiceType.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationServiceType> serviceType;

    public Output</* @Nullable */ DomainConfigurationServiceType> getServiceType() {
        return this.serviceType;
    }
    @OutputExport(name="tags", type=List.class, parameters={DomainConfigurationTag.class})
    private Output</* @Nullable */ List<DomainConfigurationTag>> tags;

    public Output</* @Nullable */ List<DomainConfigurationTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="validationCertificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationCertificateArn;

    public Output</* @Nullable */ String> getValidationCertificateArn() {
        return this.validationCertificateArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainConfiguration(String name, @Nullable DomainConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:DomainConfiguration", name, args == null ? DomainConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:DomainConfiguration", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainConfiguration(name, id, options);
    }
}
