// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.BinaryReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.DelimitedTextReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.JsonReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.inputs.XmlReadSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Activity to get metadata of dataset
 * 
 */
public final class GetMetadataActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataActivityResponse Empty = new GetMetadataActivityResponse();

    /**
     * GetMetadata activity dataset reference.
     * 
     */
    @Import(name="dataset", required=true)
    private DatasetReferenceResponse dataset;

    /**
     * @return GetMetadata activity dataset reference.
     * 
     */
    public DatasetReferenceResponse dataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<ActivityDependencyResponse> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<List<ActivityDependencyResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Fields of metadata to get from dataset.
     * 
     */
    @Import(name="fieldList")
    private @Nullable List<Object> fieldList;

    /**
     * @return Fields of metadata to get from dataset.
     * 
     */
    public Optional<List<Object>> fieldList() {
        return Optional.ofNullable(this.fieldList);
    }

    /**
     * GetMetadata activity format settings.
     * 
     */
    @Import(name="formatSettings")
    private @Nullable Object formatSettings;

    /**
     * @return GetMetadata activity format settings.
     * 
     */
    public Optional<Object> formatSettings() {
        return Optional.ofNullable(this.formatSettings);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable LinkedServiceReferenceResponse linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Activity name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable ActivityPolicyResponse policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * GetMetadata activity store settings.
     * 
     */
    @Import(name="storeSettings")
    private @Nullable Object storeSettings;

    /**
     * @return GetMetadata activity store settings.
     * 
     */
    public Optional<Object> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }

    /**
     * Type of activity.
     * Expected value is &#39;GetMetadata&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of activity.
     * Expected value is &#39;GetMetadata&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable List<UserPropertyResponse> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<List<UserPropertyResponse>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private GetMetadataActivityResponse() {}

    private GetMetadataActivityResponse(GetMetadataActivityResponse $) {
        this.dataset = $.dataset;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.fieldList = $.fieldList;
        this.formatSettings = $.formatSettings;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.storeSettings = $.storeSettings;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataActivityResponse $;

        public Builder() {
            $ = new GetMetadataActivityResponse();
        }

        public Builder(GetMetadataActivityResponse defaults) {
            $ = new GetMetadataActivityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset GetMetadata activity dataset reference.
         * 
         * @return builder
         * 
         */
        public Builder dataset(DatasetReferenceResponse dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param fieldList Fields of metadata to get from dataset.
         * 
         * @return builder
         * 
         */
        public Builder fieldList(@Nullable List<Object> fieldList) {
            $.fieldList = fieldList;
            return this;
        }

        /**
         * @param fieldList Fields of metadata to get from dataset.
         * 
         * @return builder
         * 
         */
        public Builder fieldList(Object... fieldList) {
            return fieldList(List.of(fieldList));
        }

        /**
         * @param formatSettings GetMetadata activity format settings.
         * 
         * @return builder
         * 
         */
        public Builder formatSettings(@Nullable Object formatSettings) {
            $.formatSettings = formatSettings;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param storeSettings GetMetadata activity store settings.
         * 
         * @return builder
         * 
         */
        public Builder storeSettings(@Nullable Object storeSettings) {
            $.storeSettings = storeSettings;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;GetMetadata&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public GetMetadataActivityResponse build() {
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
