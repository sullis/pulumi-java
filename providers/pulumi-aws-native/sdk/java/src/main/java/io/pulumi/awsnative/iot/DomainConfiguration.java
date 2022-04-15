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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create and manage a Domain Configuration
 * 
 */
@ResourceType(type="aws-native:iot:DomainConfiguration")
public class DomainConfiguration extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="authorizerConfig", type=DomainConfigurationAuthorizerConfig.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationAuthorizerConfig> authorizerConfig;

    public Output</* @Nullable */ DomainConfigurationAuthorizerConfig> authorizerConfig() {
        return this.authorizerConfig;
    }
    @Export(name="domainConfigurationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainConfigurationName;

    public Output</* @Nullable */ String> domainConfigurationName() {
        return this.domainConfigurationName;
    }
    @Export(name="domainConfigurationStatus", type=DomainConfigurationStatus.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationStatus> domainConfigurationStatus;

    public Output</* @Nullable */ DomainConfigurationStatus> domainConfigurationStatus() {
        return this.domainConfigurationStatus;
    }
    @Export(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    public Output</* @Nullable */ String> domainName() {
        return this.domainName;
    }
    @Export(name="domainType", type=DomainConfigurationDomainType.class, parameters={})
    private Output<DomainConfigurationDomainType> domainType;

    public Output<DomainConfigurationDomainType> domainType() {
        return this.domainType;
    }
    @Export(name="serverCertificateArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> serverCertificateArns;

    public Output</* @Nullable */ List<String>> serverCertificateArns() {
        return this.serverCertificateArns;
    }
    @Export(name="serverCertificates", type=List.class, parameters={DomainConfigurationServerCertificateSummary.class})
    private Output<List<DomainConfigurationServerCertificateSummary>> serverCertificates;

    public Output<List<DomainConfigurationServerCertificateSummary>> serverCertificates() {
        return this.serverCertificates;
    }
    @Export(name="serviceType", type=DomainConfigurationServiceType.class, parameters={})
    private Output</* @Nullable */ DomainConfigurationServiceType> serviceType;

    public Output</* @Nullable */ DomainConfigurationServiceType> serviceType() {
        return this.serviceType;
    }
    @Export(name="tags", type=List.class, parameters={DomainConfigurationTag.class})
    private Output</* @Nullable */ List<DomainConfigurationTag>> tags;

    public Output</* @Nullable */ List<DomainConfigurationTag>> tags() {
        return this.tags;
    }
    @Export(name="validationCertificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> validationCertificateArn;

    public Output</* @Nullable */ String> validationCertificateArn() {
        return this.validationCertificateArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainConfiguration(String name) {
        this(name, DomainConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainConfiguration(String name, @Nullable DomainConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainConfiguration(String name, @Nullable DomainConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:DomainConfiguration", name, args == null ? DomainConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iot:DomainConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DomainConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainConfiguration(name, id, options);
    }
}
