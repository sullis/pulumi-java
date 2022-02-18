// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.DomainNameArgs;
import io.pulumi.awsnative.apigateway.outputs.DomainNameEndpointConfiguration;
import io.pulumi.awsnative.apigateway.outputs.DomainNameMutualTlsAuthentication;
import io.pulumi.awsnative.apigateway.outputs.DomainNameTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::DomainName.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:apigateway:DomainName")
public class DomainName extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateArn;

    public Output</* @Nullable */ String> getCertificateArn() {
        return this.certificateArn;
    }
    @OutputExport(name="distributionDomainName", type=String.class, parameters={})
    private Output<String> distributionDomainName;

    public Output<String> getDistributionDomainName() {
        return this.distributionDomainName;
    }
    @OutputExport(name="distributionHostedZoneId", type=String.class, parameters={})
    private Output<String> distributionHostedZoneId;

    public Output<String> getDistributionHostedZoneId() {
        return this.distributionHostedZoneId;
    }
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    public Output</* @Nullable */ String> getDomainName() {
        return this.domainName;
    }
    @OutputExport(name="endpointConfiguration", type=DomainNameEndpointConfiguration.class, parameters={})
    private Output</* @Nullable */ DomainNameEndpointConfiguration> endpointConfiguration;

    public Output</* @Nullable */ DomainNameEndpointConfiguration> getEndpointConfiguration() {
        return this.endpointConfiguration;
    }
    @OutputExport(name="mutualTlsAuthentication", type=DomainNameMutualTlsAuthentication.class, parameters={})
    private Output</* @Nullable */ DomainNameMutualTlsAuthentication> mutualTlsAuthentication;

    public Output</* @Nullable */ DomainNameMutualTlsAuthentication> getMutualTlsAuthentication() {
        return this.mutualTlsAuthentication;
    }
    @OutputExport(name="ownershipVerificationCertificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownershipVerificationCertificateArn;

    public Output</* @Nullable */ String> getOwnershipVerificationCertificateArn() {
        return this.ownershipVerificationCertificateArn;
    }
    @OutputExport(name="regionalCertificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> regionalCertificateArn;

    public Output</* @Nullable */ String> getRegionalCertificateArn() {
        return this.regionalCertificateArn;
    }
    @OutputExport(name="regionalDomainName", type=String.class, parameters={})
    private Output<String> regionalDomainName;

    public Output<String> getRegionalDomainName() {
        return this.regionalDomainName;
    }
    @OutputExport(name="regionalHostedZoneId", type=String.class, parameters={})
    private Output<String> regionalHostedZoneId;

    public Output<String> getRegionalHostedZoneId() {
        return this.regionalHostedZoneId;
    }
    @OutputExport(name="securityPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityPolicy;

    public Output</* @Nullable */ String> getSecurityPolicy() {
        return this.securityPolicy;
    }
    @OutputExport(name="tags", type=List.class, parameters={DomainNameTag.class})
    private Output</* @Nullable */ List<DomainNameTag>> tags;

    public Output</* @Nullable */ List<DomainNameTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainName(String name, @Nullable DomainNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:DomainName", name, args == null ? DomainNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainName(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:DomainName", name, null, makeResourceOptions(options, id));
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
    public static DomainName get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainName(name, id, options);
    }
}
