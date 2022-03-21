// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.ProvisioningState;
import io.pulumi.azurenative.providerhub.enums.ResourceProviderType;
import io.pulumi.azurenative.providerhub.inputs.ProviderRegistrationPropertiesProviderHubMetadataArgs;
import io.pulumi.azurenative.providerhub.inputs.ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderAuthorizationArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderCapabilitiesArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesFeaturesRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesManagementArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesProviderAuthenticationArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesRequestHeaderOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderRegistrationPropertiesArgs Empty = new ProviderRegistrationPropertiesArgs();

    @Import(name="capabilities")
      private final @Nullable Output<List<ResourceProviderCapabilitiesArgs>> capabilities;

    public Output<List<ResourceProviderCapabilitiesArgs>> getCapabilities() {
        return this.capabilities == null ? Output.empty() : this.capabilities;
    }

    @Import(name="featuresRule")
      private final @Nullable Output<ResourceProviderManifestPropertiesFeaturesRuleArgs> featuresRule;

    public Output<ResourceProviderManifestPropertiesFeaturesRuleArgs> getFeaturesRule() {
        return this.featuresRule == null ? Output.empty() : this.featuresRule;
    }

    @Import(name="management")
      private final @Nullable Output<ResourceProviderManifestPropertiesManagementArgs> management;

    public Output<ResourceProviderManifestPropertiesManagementArgs> getManagement() {
        return this.management == null ? Output.empty() : this.management;
    }

    @Import(name="metadata")
      private final @Nullable Output<Object> metadata;

    public Output<Object> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    @Import(name="providerAuthentication")
      private final @Nullable Output<ResourceProviderManifestPropertiesProviderAuthenticationArgs> providerAuthentication;

    public Output<ResourceProviderManifestPropertiesProviderAuthenticationArgs> getProviderAuthentication() {
        return this.providerAuthentication == null ? Output.empty() : this.providerAuthentication;
    }

    @Import(name="providerAuthorizations")
      private final @Nullable Output<List<ResourceProviderAuthorizationArgs>> providerAuthorizations;

    public Output<List<ResourceProviderAuthorizationArgs>> getProviderAuthorizations() {
        return this.providerAuthorizations == null ? Output.empty() : this.providerAuthorizations;
    }

    @Import(name="providerHubMetadata")
      private final @Nullable Output<ProviderRegistrationPropertiesProviderHubMetadataArgs> providerHubMetadata;

    public Output<ProviderRegistrationPropertiesProviderHubMetadataArgs> getProviderHubMetadata() {
        return this.providerHubMetadata == null ? Output.empty() : this.providerHubMetadata;
    }

    @Import(name="providerType")
      private final @Nullable Output<Either<String,ResourceProviderType>> providerType;

    public Output<Either<String,ResourceProviderType>> getProviderType() {
        return this.providerType == null ? Output.empty() : this.providerType;
    }

    @Import(name="providerVersion")
      private final @Nullable Output<String> providerVersion;

    public Output<String> getProviderVersion() {
        return this.providerVersion == null ? Output.empty() : this.providerVersion;
    }

    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Output<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    @Import(name="requestHeaderOptions")
      private final @Nullable Output<ResourceProviderManifestPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;

    public Output<ResourceProviderManifestPropertiesRequestHeaderOptionsArgs> getRequestHeaderOptions() {
        return this.requestHeaderOptions == null ? Output.empty() : this.requestHeaderOptions;
    }

    @Import(name="requiredFeatures")
      private final @Nullable Output<List<String>> requiredFeatures;

    public Output<List<String>> getRequiredFeatures() {
        return this.requiredFeatures == null ? Output.empty() : this.requiredFeatures;
    }

    @Import(name="subscriptionLifecycleNotificationSpecifications")
      private final @Nullable Output<ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;

    public Output<ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> getSubscriptionLifecycleNotificationSpecifications() {
        return this.subscriptionLifecycleNotificationSpecifications == null ? Output.empty() : this.subscriptionLifecycleNotificationSpecifications;
    }

    @Import(name="templateDeploymentOptions")
      private final @Nullable Output<ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;

    public Output<ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs> getTemplateDeploymentOptions() {
        return this.templateDeploymentOptions == null ? Output.empty() : this.templateDeploymentOptions;
    }

    public ProviderRegistrationPropertiesArgs(
        @Nullable Output<List<ResourceProviderCapabilitiesArgs>> capabilities,
        @Nullable Output<ResourceProviderManifestPropertiesFeaturesRuleArgs> featuresRule,
        @Nullable Output<ResourceProviderManifestPropertiesManagementArgs> management,
        @Nullable Output<Object> metadata,
        @Nullable Output<String> namespace,
        @Nullable Output<ResourceProviderManifestPropertiesProviderAuthenticationArgs> providerAuthentication,
        @Nullable Output<List<ResourceProviderAuthorizationArgs>> providerAuthorizations,
        @Nullable Output<ProviderRegistrationPropertiesProviderHubMetadataArgs> providerHubMetadata,
        @Nullable Output<Either<String,ResourceProviderType>> providerType,
        @Nullable Output<String> providerVersion,
        @Nullable Output<Either<String,ProvisioningState>> provisioningState,
        @Nullable Output<ResourceProviderManifestPropertiesRequestHeaderOptionsArgs> requestHeaderOptions,
        @Nullable Output<List<String>> requiredFeatures,
        @Nullable Output<ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications,
        @Nullable Output<ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions) {
        this.capabilities = capabilities;
        this.featuresRule = featuresRule;
        this.management = management;
        this.metadata = metadata;
        this.namespace = namespace;
        this.providerAuthentication = providerAuthentication;
        this.providerAuthorizations = providerAuthorizations;
        this.providerHubMetadata = providerHubMetadata;
        this.providerType = providerType;
        this.providerVersion = providerVersion;
        this.provisioningState = provisioningState;
        this.requestHeaderOptions = requestHeaderOptions;
        this.requiredFeatures = requiredFeatures;
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        this.templateDeploymentOptions = templateDeploymentOptions;
    }

    private ProviderRegistrationPropertiesArgs() {
        this.capabilities = Output.empty();
        this.featuresRule = Output.empty();
        this.management = Output.empty();
        this.metadata = Output.empty();
        this.namespace = Output.empty();
        this.providerAuthentication = Output.empty();
        this.providerAuthorizations = Output.empty();
        this.providerHubMetadata = Output.empty();
        this.providerType = Output.empty();
        this.providerVersion = Output.empty();
        this.provisioningState = Output.empty();
        this.requestHeaderOptions = Output.empty();
        this.requiredFeatures = Output.empty();
        this.subscriptionLifecycleNotificationSpecifications = Output.empty();
        this.templateDeploymentOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ResourceProviderCapabilitiesArgs>> capabilities;
        private @Nullable Output<ResourceProviderManifestPropertiesFeaturesRuleArgs> featuresRule;
        private @Nullable Output<ResourceProviderManifestPropertiesManagementArgs> management;
        private @Nullable Output<Object> metadata;
        private @Nullable Output<String> namespace;
        private @Nullable Output<ResourceProviderManifestPropertiesProviderAuthenticationArgs> providerAuthentication;
        private @Nullable Output<List<ResourceProviderAuthorizationArgs>> providerAuthorizations;
        private @Nullable Output<ProviderRegistrationPropertiesProviderHubMetadataArgs> providerHubMetadata;
        private @Nullable Output<Either<String,ResourceProviderType>> providerType;
        private @Nullable Output<String> providerVersion;
        private @Nullable Output<Either<String,ProvisioningState>> provisioningState;
        private @Nullable Output<ResourceProviderManifestPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;
        private @Nullable Output<List<String>> requiredFeatures;
        private @Nullable Output<ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;
        private @Nullable Output<ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.featuresRule = defaults.featuresRule;
    	      this.management = defaults.management;
    	      this.metadata = defaults.metadata;
    	      this.namespace = defaults.namespace;
    	      this.providerAuthentication = defaults.providerAuthentication;
    	      this.providerAuthorizations = defaults.providerAuthorizations;
    	      this.providerHubMetadata = defaults.providerHubMetadata;
    	      this.providerType = defaults.providerType;
    	      this.providerVersion = defaults.providerVersion;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestHeaderOptions = defaults.requestHeaderOptions;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.subscriptionLifecycleNotificationSpecifications = defaults.subscriptionLifecycleNotificationSpecifications;
    	      this.templateDeploymentOptions = defaults.templateDeploymentOptions;
        }

        public Builder capabilities(@Nullable Output<List<ResourceProviderCapabilitiesArgs>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(@Nullable List<ResourceProviderCapabilitiesArgs> capabilities) {
            this.capabilities = Output.ofNullable(capabilities);
            return this;
        }
        public Builder capabilities(ResourceProviderCapabilitiesArgs... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder featuresRule(@Nullable Output<ResourceProviderManifestPropertiesFeaturesRuleArgs> featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }
        public Builder featuresRule(@Nullable ResourceProviderManifestPropertiesFeaturesRuleArgs featuresRule) {
            this.featuresRule = Output.ofNullable(featuresRule);
            return this;
        }
        public Builder management(@Nullable Output<ResourceProviderManifestPropertiesManagementArgs> management) {
            this.management = management;
            return this;
        }
        public Builder management(@Nullable ResourceProviderManifestPropertiesManagementArgs management) {
            this.management = Output.ofNullable(management);
            return this;
        }
        public Builder metadata(@Nullable Output<Object> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }
        public Builder providerAuthentication(@Nullable Output<ResourceProviderManifestPropertiesProviderAuthenticationArgs> providerAuthentication) {
            this.providerAuthentication = providerAuthentication;
            return this;
        }
        public Builder providerAuthentication(@Nullable ResourceProviderManifestPropertiesProviderAuthenticationArgs providerAuthentication) {
            this.providerAuthentication = Output.ofNullable(providerAuthentication);
            return this;
        }
        public Builder providerAuthorizations(@Nullable Output<List<ResourceProviderAuthorizationArgs>> providerAuthorizations) {
            this.providerAuthorizations = providerAuthorizations;
            return this;
        }
        public Builder providerAuthorizations(@Nullable List<ResourceProviderAuthorizationArgs> providerAuthorizations) {
            this.providerAuthorizations = Output.ofNullable(providerAuthorizations);
            return this;
        }
        public Builder providerAuthorizations(ResourceProviderAuthorizationArgs... providerAuthorizations) {
            return providerAuthorizations(List.of(providerAuthorizations));
        }
        public Builder providerHubMetadata(@Nullable Output<ProviderRegistrationPropertiesProviderHubMetadataArgs> providerHubMetadata) {
            this.providerHubMetadata = providerHubMetadata;
            return this;
        }
        public Builder providerHubMetadata(@Nullable ProviderRegistrationPropertiesProviderHubMetadataArgs providerHubMetadata) {
            this.providerHubMetadata = Output.ofNullable(providerHubMetadata);
            return this;
        }
        public Builder providerType(@Nullable Output<Either<String,ResourceProviderType>> providerType) {
            this.providerType = providerType;
            return this;
        }
        public Builder providerType(@Nullable Either<String,ResourceProviderType> providerType) {
            this.providerType = Output.ofNullable(providerType);
            return this;
        }
        public Builder providerVersion(@Nullable Output<String> providerVersion) {
            this.providerVersion = providerVersion;
            return this;
        }
        public Builder providerVersion(@Nullable String providerVersion) {
            this.providerVersion = Output.ofNullable(providerVersion);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }
        public Builder requestHeaderOptions(@Nullable Output<ResourceProviderManifestPropertiesRequestHeaderOptionsArgs> requestHeaderOptions) {
            this.requestHeaderOptions = requestHeaderOptions;
            return this;
        }
        public Builder requestHeaderOptions(@Nullable ResourceProviderManifestPropertiesRequestHeaderOptionsArgs requestHeaderOptions) {
            this.requestHeaderOptions = Output.ofNullable(requestHeaderOptions);
            return this;
        }
        public Builder requiredFeatures(@Nullable Output<List<String>> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = Output.ofNullable(requiredFeatures);
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable Output<ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = Output.ofNullable(subscriptionLifecycleNotificationSpecifications);
            return this;
        }
        public Builder templateDeploymentOptions(@Nullable Output<ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }
        public Builder templateDeploymentOptions(@Nullable ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs templateDeploymentOptions) {
            this.templateDeploymentOptions = Output.ofNullable(templateDeploymentOptions);
            return this;
        }        public ProviderRegistrationPropertiesArgs build() {
            return new ProviderRegistrationPropertiesArgs(capabilities, featuresRule, management, metadata, namespace, providerAuthentication, providerAuthorizations, providerHubMetadata, providerType, providerVersion, provisioningState, requestHeaderOptions, requiredFeatures, subscriptionLifecycleNotificationSpecifications, templateDeploymentOptions);
        }
    }
}
