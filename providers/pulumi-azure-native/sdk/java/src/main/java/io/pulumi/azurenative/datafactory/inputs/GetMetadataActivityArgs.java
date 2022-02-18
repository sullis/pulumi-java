// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.BinaryReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.JsonReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.XmlReadSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Activity to get metadata of dataset
 * 
 */
public final class GetMetadataActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final GetMetadataActivityArgs Empty = new GetMetadataActivityArgs();

    /**
     * GetMetadata activity dataset reference.
     * 
     */
    @InputImport(name="dataset", required=true)
    private final Input<DatasetReferenceArgs> dataset;

    public Input<DatasetReferenceArgs> getDataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Fields of metadata to get from dataset.
     * 
     */
    @InputImport(name="fieldList")
    private final @Nullable Input<List<Object>> fieldList;

    public Input<List<Object>> getFieldList() {
        return this.fieldList == null ? Input.empty() : this.fieldList;
    }

    /**
     * GetMetadata activity format settings.
     * 
     */
    @InputImport(name="formatSettings")
    private final @Nullable Input<Object> formatSettings;

    public Input<Object> getFormatSettings() {
        return this.formatSettings == null ? Input.empty() : this.formatSettings;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * GetMetadata activity store settings.
     * 
     */
    @InputImport(name="storeSettings")
    private final @Nullable Input<Object> storeSettings;

    public Input<Object> getStoreSettings() {
        return this.storeSettings == null ? Input.empty() : this.storeSettings;
    }

    /**
     * Type of activity.
     * Expected value is 'GetMetadata'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public GetMetadataActivityArgs(
        Input<DatasetReferenceArgs> dataset,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<List<Object>> fieldList,
        @Nullable Input<Object> formatSettings,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<Object> storeSettings,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.fieldList = fieldList;
        this.formatSettings = formatSettings;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private GetMetadataActivityArgs() {
        this.dataset = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.fieldList = Input.empty();
        this.formatSettings = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.storeSettings = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasetReferenceArgs> dataset;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<List<Object>> fieldList;
        private @Nullable Input<Object> formatSettings;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<Object> storeSettings;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.fieldList = defaults.fieldList;
    	      this.formatSettings = defaults.formatSettings;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setDataset(Input<DatasetReferenceArgs> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDataset(DatasetReferenceArgs dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setFieldList(@Nullable Input<List<Object>> fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        public Builder setFieldList(@Nullable List<Object> fieldList) {
            this.fieldList = Input.ofNullable(fieldList);
            return this;
        }

        public Builder setFormatSettings(@Nullable Input<Object> formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder setFormatSettings(@Nullable Object formatSettings) {
            this.formatSettings = Input.ofNullable(formatSettings);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setStoreSettings(@Nullable Input<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = Input.ofNullable(storeSettings);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public GetMetadataActivityArgs build() {
            return new GetMetadataActivityArgs(dataset, dependsOn, description, fieldList, formatSettings, linkedServiceName, name, policy, storeSettings, type, userProperties);
        }
    }
}
