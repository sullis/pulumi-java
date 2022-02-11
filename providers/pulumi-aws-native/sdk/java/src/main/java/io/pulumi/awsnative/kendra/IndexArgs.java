// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.kendra.enums.IndexEdition;
import io.pulumi.awsnative.kendra.enums.IndexUserContextPolicy;
import io.pulumi.awsnative.kendra.inputs.IndexCapacityUnitsConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.IndexDocumentMetadataConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.IndexServerSideEncryptionConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.IndexTagArgs;
import io.pulumi.awsnative.kendra.inputs.IndexUserTokenConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexArgs Empty = new IndexArgs();

    @InputImport(name="capacityUnits")
    private final @Nullable Input<IndexCapacityUnitsConfigurationArgs> capacityUnits;

    public Input<IndexCapacityUnitsConfigurationArgs> getCapacityUnits() {
        return this.capacityUnits == null ? Input.empty() : this.capacityUnits;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="documentMetadataConfigurations")
    private final @Nullable Input<List<IndexDocumentMetadataConfigurationArgs>> documentMetadataConfigurations;

    public Input<List<IndexDocumentMetadataConfigurationArgs>> getDocumentMetadataConfigurations() {
        return this.documentMetadataConfigurations == null ? Input.empty() : this.documentMetadataConfigurations;
    }

    @InputImport(name="edition", required=true)
    private final Input<IndexEdition> edition;

    public Input<IndexEdition> getEdition() {
        return this.edition;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="serverSideEncryptionConfiguration")
    private final @Nullable Input<IndexServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Input<IndexServerSideEncryptionConfigurationArgs> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration == null ? Input.empty() : this.serverSideEncryptionConfiguration;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<IndexTagArgs>> tags;

    public Input<List<IndexTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="userContextPolicy")
    private final @Nullable Input<IndexUserContextPolicy> userContextPolicy;

    public Input<IndexUserContextPolicy> getUserContextPolicy() {
        return this.userContextPolicy == null ? Input.empty() : this.userContextPolicy;
    }

    @InputImport(name="userTokenConfigurations")
    private final @Nullable Input<List<IndexUserTokenConfigurationArgs>> userTokenConfigurations;

    public Input<List<IndexUserTokenConfigurationArgs>> getUserTokenConfigurations() {
        return this.userTokenConfigurations == null ? Input.empty() : this.userTokenConfigurations;
    }

    public IndexArgs(
        @Nullable Input<IndexCapacityUnitsConfigurationArgs> capacityUnits,
        @Nullable Input<String> description,
        @Nullable Input<List<IndexDocumentMetadataConfigurationArgs>> documentMetadataConfigurations,
        Input<IndexEdition> edition,
        @Nullable Input<String> name,
        Input<String> roleArn,
        @Nullable Input<IndexServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration,
        @Nullable Input<List<IndexTagArgs>> tags,
        @Nullable Input<IndexUserContextPolicy> userContextPolicy,
        @Nullable Input<List<IndexUserTokenConfigurationArgs>> userTokenConfigurations) {
        this.capacityUnits = capacityUnits;
        this.description = description;
        this.documentMetadataConfigurations = documentMetadataConfigurations;
        this.edition = Objects.requireNonNull(edition, "expected parameter 'edition' to be non-null");
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        this.tags = tags;
        this.userContextPolicy = userContextPolicy;
        this.userTokenConfigurations = userTokenConfigurations;
    }

    private IndexArgs() {
        this.capacityUnits = Input.empty();
        this.description = Input.empty();
        this.documentMetadataConfigurations = Input.empty();
        this.edition = Input.empty();
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.serverSideEncryptionConfiguration = Input.empty();
        this.tags = Input.empty();
        this.userContextPolicy = Input.empty();
        this.userTokenConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IndexCapacityUnitsConfigurationArgs> capacityUnits;
        private @Nullable Input<String> description;
        private @Nullable Input<List<IndexDocumentMetadataConfigurationArgs>> documentMetadataConfigurations;
        private Input<IndexEdition> edition;
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private @Nullable Input<IndexServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;
        private @Nullable Input<List<IndexTagArgs>> tags;
        private @Nullable Input<IndexUserContextPolicy> userContextPolicy;
        private @Nullable Input<List<IndexUserTokenConfigurationArgs>> userTokenConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityUnits = defaults.capacityUnits;
    	      this.description = defaults.description;
    	      this.documentMetadataConfigurations = defaults.documentMetadataConfigurations;
    	      this.edition = defaults.edition;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
    	      this.tags = defaults.tags;
    	      this.userContextPolicy = defaults.userContextPolicy;
    	      this.userTokenConfigurations = defaults.userTokenConfigurations;
        }

        public Builder setCapacityUnits(@Nullable Input<IndexCapacityUnitsConfigurationArgs> capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }

        public Builder setCapacityUnits(@Nullable IndexCapacityUnitsConfigurationArgs capacityUnits) {
            this.capacityUnits = Input.ofNullable(capacityUnits);
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

        public Builder setDocumentMetadataConfigurations(@Nullable Input<List<IndexDocumentMetadataConfigurationArgs>> documentMetadataConfigurations) {
            this.documentMetadataConfigurations = documentMetadataConfigurations;
            return this;
        }

        public Builder setDocumentMetadataConfigurations(@Nullable List<IndexDocumentMetadataConfigurationArgs> documentMetadataConfigurations) {
            this.documentMetadataConfigurations = Input.ofNullable(documentMetadataConfigurations);
            return this;
        }

        public Builder setEdition(Input<IndexEdition> edition) {
            this.edition = Objects.requireNonNull(edition);
            return this;
        }

        public Builder setEdition(IndexEdition edition) {
            this.edition = Input.of(Objects.requireNonNull(edition));
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

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(@Nullable Input<IndexServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(@Nullable IndexServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Input.ofNullable(serverSideEncryptionConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<List<IndexTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<IndexTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserContextPolicy(@Nullable Input<IndexUserContextPolicy> userContextPolicy) {
            this.userContextPolicy = userContextPolicy;
            return this;
        }

        public Builder setUserContextPolicy(@Nullable IndexUserContextPolicy userContextPolicy) {
            this.userContextPolicy = Input.ofNullable(userContextPolicy);
            return this;
        }

        public Builder setUserTokenConfigurations(@Nullable Input<List<IndexUserTokenConfigurationArgs>> userTokenConfigurations) {
            this.userTokenConfigurations = userTokenConfigurations;
            return this;
        }

        public Builder setUserTokenConfigurations(@Nullable List<IndexUserTokenConfigurationArgs> userTokenConfigurations) {
            this.userTokenConfigurations = Input.ofNullable(userTokenConfigurations);
            return this;
        }

        public IndexArgs build() {
            return new IndexArgs(capacityUnits, description, documentMetadataConfigurations, edition, name, roleArn, serverSideEncryptionConfiguration, tags, userContextPolicy, userTokenConfigurations);
        }
    }
}
