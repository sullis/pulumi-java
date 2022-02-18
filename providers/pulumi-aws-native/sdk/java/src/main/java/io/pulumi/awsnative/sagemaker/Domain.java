// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.DomainArgs;
import io.pulumi.awsnative.sagemaker.enums.DomainAppNetworkAccessType;
import io.pulumi.awsnative.sagemaker.enums.DomainAuthMode;
import io.pulumi.awsnative.sagemaker.outputs.DomainTag;
import io.pulumi.awsnative.sagemaker.outputs.DomainUserSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::Domain
 * 
 */
@ResourceType(type="aws-native:sagemaker:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    @OutputExport(name="appNetworkAccessType", type=DomainAppNetworkAccessType.class, parameters={})
    private Output</* @Nullable */ DomainAppNetworkAccessType> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.
     * 
     */
    public Output</* @Nullable */ DomainAppNetworkAccessType> getAppNetworkAccessType() {
        return this.appNetworkAccessType;
    }
    /**
     * The mode of authentication that members use to access the domain.
     * 
     */
    @OutputExport(name="authMode", type=DomainAuthMode.class, parameters={})
    private Output<DomainAuthMode> authMode;

    /**
     * @return The mode of authentication that members use to access the domain.
     * 
     */
    public Output<DomainAuthMode> getAuthMode() {
        return this.authMode;
    }
    /**
     * The default user settings.
     * 
     */
    @OutputExport(name="defaultUserSettings", type=DomainUserSettings.class, parameters={})
    private Output<DomainUserSettings> defaultUserSettings;

    /**
     * @return The default user settings.
     * 
     */
    public Output<DomainUserSettings> getDefaultUserSettings() {
        return this.defaultUserSettings;
    }
    /**
     * The Amazon Resource Name (ARN) of the created domain.
     * 
     */
    @OutputExport(name="domainArn", type=String.class, parameters={})
    private Output<String> domainArn;

    /**
     * @return The Amazon Resource Name (ARN) of the created domain.
     * 
     */
    public Output<String> getDomainArn() {
        return this.domainArn;
    }
    /**
     * The domain name.
     * 
     */
    @OutputExport(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return The domain name.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * A name for the domain.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return A name for the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @OutputExport(name="homeEfsFileSystemId", type=String.class, parameters={})
    private Output<String> homeEfsFileSystemId;

    /**
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    public Output<String> getHomeEfsFileSystemId() {
        return this.homeEfsFileSystemId;
    }
    /**
     * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The SSO managed application instance ID.
     * 
     */
    @OutputExport(name="singleSignOnManagedApplicationInstanceId", type=String.class, parameters={})
    private Output<String> singleSignOnManagedApplicationInstanceId;

    /**
     * @return The SSO managed application instance ID.
     * 
     */
    public Output<String> getSingleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId;
    }
    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DomainTag.class})
    private Output</* @Nullable */ List<DomainTag>> tags;

    /**
     * @return A list of tags to apply to the user profile.
     * 
     */
    public Output</* @Nullable */ List<DomainTag>> getTags() {
        return this.tags;
    }
    /**
     * The URL to the created domain.
     * 
     */
    @OutputExport(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL to the created domain.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Domain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
