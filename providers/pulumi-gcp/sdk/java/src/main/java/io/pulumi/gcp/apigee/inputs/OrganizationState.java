// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationState Empty = new OrganizationState();

    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @InputImport(name="analyticsRegion")
      private final @Nullable Input<String> analyticsRegion;

    public Input<String> getAnalyticsRegion() {
        return this.analyticsRegion == null ? Input.empty() : this.analyticsRegion;
    }

    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
     * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
     * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: "default".
     * 
     */
    @InputImport(name="authorizedNetwork")
      private final @Nullable Input<String> authorizedNetwork;

    public Input<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Input.empty() : this.authorizedNetwork;
    }

    /**
     * Output only. Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when 'RuntimeType'
     * is CLOUD. A base64-encoded string.
     * 
     */
    @InputImport(name="caCertificate")
      private final @Nullable Input<String> caCertificate;

    public Input<String> getCaCertificate() {
        return this.caCertificate == null ? Input.empty() : this.caCertificate;
    }

    /**
     * Description of the Apigee organization.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name of the Apigee organization.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Output only. Name of the Apigee organization.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project ID associated with the Apigee organization.
     * 
     */
    @InputImport(name="projectId")
      private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
     * Update is not allowed after the organization is created.
     * If not specified, a Google-Managed encryption key will be used.
     * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
     * 
     */
    @InputImport(name="runtimeDatabaseEncryptionKeyName")
      private final @Nullable Input<String> runtimeDatabaseEncryptionKeyName;

    public Input<String> getRuntimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName == null ? Input.empty() : this.runtimeDatabaseEncryptionKeyName;
    }

    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * Default value is `CLOUD`.
     * Possible values are `CLOUD` and `HYBRID`.
     * 
     */
    @InputImport(name="runtimeType")
      private final @Nullable Input<String> runtimeType;

    public Input<String> getRuntimeType() {
        return this.runtimeType == null ? Input.empty() : this.runtimeType;
    }

    /**
     * Output only. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation
     * purposes only) or paid (full subscription has been purchased).
     * 
     */
    @InputImport(name="subscriptionType")
      private final @Nullable Input<String> subscriptionType;

    public Input<String> getSubscriptionType() {
        return this.subscriptionType == null ? Input.empty() : this.subscriptionType;
    }

    public OrganizationState(
        @Nullable Input<String> analyticsRegion,
        @Nullable Input<String> authorizedNetwork,
        @Nullable Input<String> caCertificate,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> projectId,
        @Nullable Input<String> runtimeDatabaseEncryptionKeyName,
        @Nullable Input<String> runtimeType,
        @Nullable Input<String> subscriptionType) {
        this.analyticsRegion = analyticsRegion;
        this.authorizedNetwork = authorizedNetwork;
        this.caCertificate = caCertificate;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.projectId = projectId;
        this.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
        this.runtimeType = runtimeType;
        this.subscriptionType = subscriptionType;
    }

    private OrganizationState() {
        this.analyticsRegion = Input.empty();
        this.authorizedNetwork = Input.empty();
        this.caCertificate = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.projectId = Input.empty();
        this.runtimeDatabaseEncryptionKeyName = Input.empty();
        this.runtimeType = Input.empty();
        this.subscriptionType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> analyticsRegion;
        private @Nullable Input<String> authorizedNetwork;
        private @Nullable Input<String> caCertificate;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> projectId;
        private @Nullable Input<String> runtimeDatabaseEncryptionKeyName;
        private @Nullable Input<String> runtimeType;
        private @Nullable Input<String> subscriptionType;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticsRegion = defaults.analyticsRegion;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.caCertificate = defaults.caCertificate;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.runtimeDatabaseEncryptionKeyName = defaults.runtimeDatabaseEncryptionKeyName;
    	      this.runtimeType = defaults.runtimeType;
    	      this.subscriptionType = defaults.subscriptionType;
        }

        public Builder setAnalyticsRegion(@Nullable Input<String> analyticsRegion) {
            this.analyticsRegion = analyticsRegion;
            return this;
        }

        public Builder setAnalyticsRegion(@Nullable String analyticsRegion) {
            this.analyticsRegion = Input.ofNullable(analyticsRegion);
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable Input<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder setAuthorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Input.ofNullable(authorizedNetwork);
            return this;
        }

        public Builder setCaCertificate(@Nullable Input<String> caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        public Builder setCaCertificate(@Nullable String caCertificate) {
            this.caCertificate = Input.ofNullable(caCertificate);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public Builder setRuntimeDatabaseEncryptionKeyName(@Nullable Input<String> runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
            return this;
        }

        public Builder setRuntimeDatabaseEncryptionKeyName(@Nullable String runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = Input.ofNullable(runtimeDatabaseEncryptionKeyName);
            return this;
        }

        public Builder setRuntimeType(@Nullable Input<String> runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }

        public Builder setRuntimeType(@Nullable String runtimeType) {
            this.runtimeType = Input.ofNullable(runtimeType);
            return this;
        }

        public Builder setSubscriptionType(@Nullable Input<String> subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        public Builder setSubscriptionType(@Nullable String subscriptionType) {
            this.subscriptionType = Input.ofNullable(subscriptionType);
            return this;
        }
        public OrganizationState build() {
            return new OrganizationState(analyticsRegion, authorizedNetwork, caCertificate, description, displayName, name, projectId, runtimeDatabaseEncryptionKeyName, runtimeType, subscriptionType);
        }
    }
}