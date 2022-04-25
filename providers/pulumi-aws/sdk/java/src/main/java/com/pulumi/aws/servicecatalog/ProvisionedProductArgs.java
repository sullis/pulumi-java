// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs;
import com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProvisionedProductArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductArgs Empty = new ProvisionedProductArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    @Import(name="ignoreErrors")
    private @Nullable Output<Boolean> ignoreErrors;

    /**
     * @return _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreErrors() {
        return Optional.ofNullable(this.ignoreErrors);
    }

    /**
     * User-friendly name of the provisioned product.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User-friendly name of the provisioned product.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    @Import(name="notificationArns")
    private @Nullable Output<List<String>> notificationArns;

    /**
     * @return Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    public Optional<Output<List<String>>> notificationArns() {
        return Optional.ofNullable(this.notificationArns);
    }

    /**
     * Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Import(name="pathId")
    private @Nullable Output<String> pathId;

    /**
     * @return Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    public Optional<Output<String>> pathId() {
        return Optional.ofNullable(this.pathId);
    }

    /**
     * Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Import(name="pathName")
    private @Nullable Output<String> pathName;

    /**
     * @return Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    public Optional<Output<String>> pathName() {
        return Optional.ofNullable(this.pathName);
    }

    /**
     * Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Import(name="productName")
    private @Nullable Output<String> productName;

    /**
     * @return Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    public Optional<Output<String>> productName() {
        return Optional.ofNullable(this.productName);
    }

    /**
     * Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Import(name="provisioningArtifactId")
    private @Nullable Output<String> provisioningArtifactId;

    /**
     * @return Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    public Optional<Output<String>> provisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }

    /**
     * Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Import(name="provisioningArtifactName")
    private @Nullable Output<String> provisioningArtifactName;

    /**
     * @return Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    public Optional<Output<String>> provisioningArtifactName() {
        return Optional.ofNullable(this.provisioningArtifactName);
    }

    /**
     * Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    @Import(name="provisioningParameters")
    private @Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters;

    /**
     * @return Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    public Optional<Output<List<ProvisionedProductProvisioningParameterArgs>>> provisioningParameters() {
        return Optional.ofNullable(this.provisioningParameters);
    }

    /**
     * _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    @Import(name="retainPhysicalResources")
    private @Nullable Output<Boolean> retainPhysicalResources;

    /**
     * @return _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> retainPhysicalResources() {
        return Optional.ofNullable(this.retainPhysicalResources);
    }

    /**
     * Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    @Import(name="stackSetProvisioningPreferences")
    private @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences;

    /**
     * @return Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    public Optional<Output<ProvisionedProductStackSetProvisioningPreferencesArgs>> stackSetProvisioningPreferences() {
        return Optional.ofNullable(this.stackSetProvisioningPreferences);
    }

    /**
     * Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProvisionedProductArgs() {}

    private ProvisionedProductArgs(ProvisionedProductArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.ignoreErrors = $.ignoreErrors;
        this.name = $.name;
        this.notificationArns = $.notificationArns;
        this.pathId = $.pathId;
        this.pathName = $.pathName;
        this.productId = $.productId;
        this.productName = $.productName;
        this.provisioningArtifactId = $.provisioningArtifactId;
        this.provisioningArtifactName = $.provisioningArtifactName;
        this.provisioningParameters = $.provisioningParameters;
        this.retainPhysicalResources = $.retainPhysicalResources;
        this.stackSetProvisioningPreferences = $.stackSetProvisioningPreferences;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProvisionedProductArgs $;

        public Builder() {
            $ = new ProvisionedProductArgs();
        }

        public Builder(ProvisionedProductArgs defaults) {
            $ = new ProvisionedProductArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param ignoreErrors _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreErrors(@Nullable Output<Boolean> ignoreErrors) {
            $.ignoreErrors = ignoreErrors;
            return this;
        }

        /**
         * @param ignoreErrors _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreErrors(Boolean ignoreErrors) {
            return ignoreErrors(Output.of(ignoreErrors));
        }

        /**
         * @param name User-friendly name of the provisioned product.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User-friendly name of the provisioned product.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationArns Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         * 
         * @return builder
         * 
         */
        public Builder notificationArns(@Nullable Output<List<String>> notificationArns) {
            $.notificationArns = notificationArns;
            return this;
        }

        /**
         * @param notificationArns Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         * 
         * @return builder
         * 
         */
        public Builder notificationArns(List<String> notificationArns) {
            return notificationArns(Output.of(notificationArns));
        }

        /**
         * @param notificationArns Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
         * 
         * @return builder
         * 
         */
        public Builder notificationArns(String... notificationArns) {
            return notificationArns(List.of(notificationArns));
        }

        /**
         * @param pathId Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder pathId(@Nullable Output<String> pathId) {
            $.pathId = pathId;
            return this;
        }

        /**
         * @param pathId Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder pathId(String pathId) {
            return pathId(Output.of(pathId));
        }

        /**
         * @param pathName Name of the path. You must provide `path_id` or `path_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder pathName(@Nullable Output<String> pathName) {
            $.pathName = pathName;
            return this;
        }

        /**
         * @param pathName Name of the path. You must provide `path_id` or `path_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder pathName(String pathName) {
            return pathName(Output.of(pathName));
        }

        /**
         * @param productId Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param productName Name of the product. You must provide `product_id` or `product_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder productName(@Nullable Output<String> productName) {
            $.productName = productName;
            return this;
        }

        /**
         * @param productName Name of the product. You must provide `product_id` or `product_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder productName(String productName) {
            return productName(Output.of(productName));
        }

        /**
         * @param provisioningArtifactId Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactId(@Nullable Output<String> provisioningArtifactId) {
            $.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        /**
         * @param provisioningArtifactId Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactId(String provisioningArtifactId) {
            return provisioningArtifactId(Output.of(provisioningArtifactId));
        }

        /**
         * @param provisioningArtifactName Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactName(@Nullable Output<String> provisioningArtifactName) {
            $.provisioningArtifactName = provisioningArtifactName;
            return this;
        }

        /**
         * @param provisioningArtifactName Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactName(String provisioningArtifactName) {
            return provisioningArtifactName(Output.of(provisioningArtifactName));
        }

        /**
         * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(@Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters) {
            $.provisioningParameters = provisioningParameters;
            return this;
        }

        /**
         * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(List<ProvisionedProductProvisioningParameterArgs> provisioningParameters) {
            return provisioningParameters(Output.of(provisioningParameters));
        }

        /**
         * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningParameters(ProvisionedProductProvisioningParameterArgs... provisioningParameters) {
            return provisioningParameters(List.of(provisioningParameters));
        }

        /**
         * @param retainPhysicalResources _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder retainPhysicalResources(@Nullable Output<Boolean> retainPhysicalResources) {
            $.retainPhysicalResources = retainPhysicalResources;
            return this;
        }

        /**
         * @param retainPhysicalResources _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder retainPhysicalResources(Boolean retainPhysicalResources) {
            return retainPhysicalResources(Output.of(retainPhysicalResources));
        }

        /**
         * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See details below.
         * 
         * @return builder
         * 
         */
        public Builder stackSetProvisioningPreferences(@Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences) {
            $.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
            return this;
        }

        /**
         * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See details below.
         * 
         * @return builder
         * 
         */
        public Builder stackSetProvisioningPreferences(ProvisionedProductStackSetProvisioningPreferencesArgs stackSetProvisioningPreferences) {
            return stackSetProvisioningPreferences(Output.of(stackSetProvisioningPreferences));
        }

        /**
         * @param tags Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ProvisionedProductArgs build() {
            return $;
        }
    }

}
