// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs;
import com.pulumi.awsnative.sagemaker.inputs.FeatureGroupTagArgs;
import com.pulumi.awsnative.sagemaker.inputs.OfflineStoreConfigPropertiesArgs;
import com.pulumi.awsnative.sagemaker.inputs.OnlineStoreConfigPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureGroupArgs Empty = new FeatureGroupArgs();

    /**
     * Description about the FeatureGroup.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description about the FeatureGroup.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Event Time Feature Name.
     * 
     */
    @Import(name="eventTimeFeatureName", required=true)
    private Output<String> eventTimeFeatureName;

    /**
     * @return The Event Time Feature Name.
     * 
     */
    public Output<String> eventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * An Array of Feature Definition
     * 
     */
    @Import(name="featureDefinitions", required=true)
    private Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;

    /**
     * @return An Array of Feature Definition
     * 
     */
    public Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions() {
        return this.featureDefinitions;
    }

    /**
     * The Name of the FeatureGroup.
     * 
     */
    @Import(name="featureGroupName")
    private @Nullable Output<String> featureGroupName;

    /**
     * @return The Name of the FeatureGroup.
     * 
     */
    public Optional<Output<String>> featureGroupName() {
        return Optional.ofNullable(this.featureGroupName);
    }

    @Import(name="offlineStoreConfig")
    private @Nullable Output<OfflineStoreConfigPropertiesArgs> offlineStoreConfig;

    public Optional<Output<OfflineStoreConfigPropertiesArgs>> offlineStoreConfig() {
        return Optional.ofNullable(this.offlineStoreConfig);
    }

    @Import(name="onlineStoreConfig")
    private @Nullable Output<OnlineStoreConfigPropertiesArgs> onlineStoreConfig;

    public Optional<Output<OnlineStoreConfigPropertiesArgs>> onlineStoreConfig() {
        return Optional.ofNullable(this.onlineStoreConfig);
    }

    /**
     * The Record Identifier Feature Name.
     * 
     */
    @Import(name="recordIdentifierFeatureName", required=true)
    private Output<String> recordIdentifierFeatureName;

    /**
     * @return The Record Identifier Feature Name.
     * 
     */
    public Output<String> recordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * Role Arn
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Role Arn
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * An array of key-value pair to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FeatureGroupTagArgs>> tags;

    /**
     * @return An array of key-value pair to apply to this resource.
     * 
     */
    public Optional<Output<List<FeatureGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FeatureGroupArgs() {}

    private FeatureGroupArgs(FeatureGroupArgs $) {
        this.description = $.description;
        this.eventTimeFeatureName = $.eventTimeFeatureName;
        this.featureDefinitions = $.featureDefinitions;
        this.featureGroupName = $.featureGroupName;
        this.offlineStoreConfig = $.offlineStoreConfig;
        this.onlineStoreConfig = $.onlineStoreConfig;
        this.recordIdentifierFeatureName = $.recordIdentifierFeatureName;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureGroupArgs $;

        public Builder() {
            $ = new FeatureGroupArgs();
        }

        public Builder(FeatureGroupArgs defaults) {
            $ = new FeatureGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description about the FeatureGroup.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description about the FeatureGroup.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventTimeFeatureName The Event Time Feature Name.
         * 
         * @return builder
         * 
         */
        public Builder eventTimeFeatureName(Output<String> eventTimeFeatureName) {
            $.eventTimeFeatureName = eventTimeFeatureName;
            return this;
        }

        /**
         * @param eventTimeFeatureName The Event Time Feature Name.
         * 
         * @return builder
         * 
         */
        public Builder eventTimeFeatureName(String eventTimeFeatureName) {
            return eventTimeFeatureName(Output.of(eventTimeFeatureName));
        }

        /**
         * @param featureDefinitions An Array of Feature Definition
         * 
         * @return builder
         * 
         */
        public Builder featureDefinitions(Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions) {
            $.featureDefinitions = featureDefinitions;
            return this;
        }

        /**
         * @param featureDefinitions An Array of Feature Definition
         * 
         * @return builder
         * 
         */
        public Builder featureDefinitions(List<FeatureGroupFeatureDefinitionArgs> featureDefinitions) {
            return featureDefinitions(Output.of(featureDefinitions));
        }

        /**
         * @param featureDefinitions An Array of Feature Definition
         * 
         * @return builder
         * 
         */
        public Builder featureDefinitions(FeatureGroupFeatureDefinitionArgs... featureDefinitions) {
            return featureDefinitions(List.of(featureDefinitions));
        }

        /**
         * @param featureGroupName The Name of the FeatureGroup.
         * 
         * @return builder
         * 
         */
        public Builder featureGroupName(@Nullable Output<String> featureGroupName) {
            $.featureGroupName = featureGroupName;
            return this;
        }

        /**
         * @param featureGroupName The Name of the FeatureGroup.
         * 
         * @return builder
         * 
         */
        public Builder featureGroupName(String featureGroupName) {
            return featureGroupName(Output.of(featureGroupName));
        }

        public Builder offlineStoreConfig(@Nullable Output<OfflineStoreConfigPropertiesArgs> offlineStoreConfig) {
            $.offlineStoreConfig = offlineStoreConfig;
            return this;
        }

        public Builder offlineStoreConfig(OfflineStoreConfigPropertiesArgs offlineStoreConfig) {
            return offlineStoreConfig(Output.of(offlineStoreConfig));
        }

        public Builder onlineStoreConfig(@Nullable Output<OnlineStoreConfigPropertiesArgs> onlineStoreConfig) {
            $.onlineStoreConfig = onlineStoreConfig;
            return this;
        }

        public Builder onlineStoreConfig(OnlineStoreConfigPropertiesArgs onlineStoreConfig) {
            return onlineStoreConfig(Output.of(onlineStoreConfig));
        }

        /**
         * @param recordIdentifierFeatureName The Record Identifier Feature Name.
         * 
         * @return builder
         * 
         */
        public Builder recordIdentifierFeatureName(Output<String> recordIdentifierFeatureName) {
            $.recordIdentifierFeatureName = recordIdentifierFeatureName;
            return this;
        }

        /**
         * @param recordIdentifierFeatureName The Record Identifier Feature Name.
         * 
         * @return builder
         * 
         */
        public Builder recordIdentifierFeatureName(String recordIdentifierFeatureName) {
            return recordIdentifierFeatureName(Output.of(recordIdentifierFeatureName));
        }

        /**
         * @param roleArn Role Arn
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Role Arn
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param tags An array of key-value pair to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<FeatureGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pair to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<FeatureGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pair to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(FeatureGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public FeatureGroupArgs build() {
            $.eventTimeFeatureName = Objects.requireNonNull($.eventTimeFeatureName, "expected parameter 'eventTimeFeatureName' to be non-null");
            $.featureDefinitions = Objects.requireNonNull($.featureDefinitions, "expected parameter 'featureDefinitions' to be non-null");
            $.recordIdentifierFeatureName = Objects.requireNonNull($.recordIdentifierFeatureName, "expected parameter 'recordIdentifierFeatureName' to be non-null");
            return $;
        }
    }

}
