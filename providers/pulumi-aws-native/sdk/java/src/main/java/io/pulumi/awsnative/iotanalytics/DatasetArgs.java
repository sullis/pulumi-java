// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetActionArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetContentDeliveryRuleArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetLateDataRuleArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetRetentionPeriodArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetTagArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetTriggerArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatasetVersioningConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    @InputImport(name="actions", required=true)
    private final Input<List<DatasetActionArgs>> actions;

    public Input<List<DatasetActionArgs>> getActions() {
        return this.actions;
    }

    @InputImport(name="contentDeliveryRules")
    private final @Nullable Input<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules;

    public Input<List<DatasetContentDeliveryRuleArgs>> getContentDeliveryRules() {
        return this.contentDeliveryRules == null ? Input.empty() : this.contentDeliveryRules;
    }

    @InputImport(name="datasetName")
    private final @Nullable Input<String> datasetName;

    public Input<String> getDatasetName() {
        return this.datasetName == null ? Input.empty() : this.datasetName;
    }

    @InputImport(name="lateDataRules")
    private final @Nullable Input<List<DatasetLateDataRuleArgs>> lateDataRules;

    public Input<List<DatasetLateDataRuleArgs>> getLateDataRules() {
        return this.lateDataRules == null ? Input.empty() : this.lateDataRules;
    }

    @InputImport(name="retentionPeriod")
    private final @Nullable Input<DatasetRetentionPeriodArgs> retentionPeriod;

    public Input<DatasetRetentionPeriodArgs> getRetentionPeriod() {
        return this.retentionPeriod == null ? Input.empty() : this.retentionPeriod;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<DatasetTagArgs>> tags;

    public Input<List<DatasetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="triggers")
    private final @Nullable Input<List<DatasetTriggerArgs>> triggers;

    public Input<List<DatasetTriggerArgs>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    @InputImport(name="versioningConfiguration")
    private final @Nullable Input<DatasetVersioningConfigurationArgs> versioningConfiguration;

    public Input<DatasetVersioningConfigurationArgs> getVersioningConfiguration() {
        return this.versioningConfiguration == null ? Input.empty() : this.versioningConfiguration;
    }

    public DatasetArgs(
        Input<List<DatasetActionArgs>> actions,
        @Nullable Input<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules,
        @Nullable Input<String> datasetName,
        @Nullable Input<List<DatasetLateDataRuleArgs>> lateDataRules,
        @Nullable Input<DatasetRetentionPeriodArgs> retentionPeriod,
        @Nullable Input<List<DatasetTagArgs>> tags,
        @Nullable Input<List<DatasetTriggerArgs>> triggers,
        @Nullable Input<DatasetVersioningConfigurationArgs> versioningConfiguration) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.contentDeliveryRules = contentDeliveryRules;
        this.datasetName = datasetName;
        this.lateDataRules = lateDataRules;
        this.retentionPeriod = retentionPeriod;
        this.tags = tags;
        this.triggers = triggers;
        this.versioningConfiguration = versioningConfiguration;
    }

    private DatasetArgs() {
        this.actions = Input.empty();
        this.contentDeliveryRules = Input.empty();
        this.datasetName = Input.empty();
        this.lateDataRules = Input.empty();
        this.retentionPeriod = Input.empty();
        this.tags = Input.empty();
        this.triggers = Input.empty();
        this.versioningConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<DatasetActionArgs>> actions;
        private @Nullable Input<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules;
        private @Nullable Input<String> datasetName;
        private @Nullable Input<List<DatasetLateDataRuleArgs>> lateDataRules;
        private @Nullable Input<DatasetRetentionPeriodArgs> retentionPeriod;
        private @Nullable Input<List<DatasetTagArgs>> tags;
        private @Nullable Input<List<DatasetTriggerArgs>> triggers;
        private @Nullable Input<DatasetVersioningConfigurationArgs> versioningConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentDeliveryRules = defaults.contentDeliveryRules;
    	      this.datasetName = defaults.datasetName;
    	      this.lateDataRules = defaults.lateDataRules;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.tags = defaults.tags;
    	      this.triggers = defaults.triggers;
    	      this.versioningConfiguration = defaults.versioningConfiguration;
        }

        public Builder setActions(Input<List<DatasetActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<DatasetActionArgs> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setContentDeliveryRules(@Nullable Input<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules) {
            this.contentDeliveryRules = contentDeliveryRules;
            return this;
        }

        public Builder setContentDeliveryRules(@Nullable List<DatasetContentDeliveryRuleArgs> contentDeliveryRules) {
            this.contentDeliveryRules = Input.ofNullable(contentDeliveryRules);
            return this;
        }

        public Builder setDatasetName(@Nullable Input<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        public Builder setDatasetName(@Nullable String datasetName) {
            this.datasetName = Input.ofNullable(datasetName);
            return this;
        }

        public Builder setLateDataRules(@Nullable Input<List<DatasetLateDataRuleArgs>> lateDataRules) {
            this.lateDataRules = lateDataRules;
            return this;
        }

        public Builder setLateDataRules(@Nullable List<DatasetLateDataRuleArgs> lateDataRules) {
            this.lateDataRules = Input.ofNullable(lateDataRules);
            return this;
        }

        public Builder setRetentionPeriod(@Nullable Input<DatasetRetentionPeriodArgs> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder setRetentionPeriod(@Nullable DatasetRetentionPeriodArgs retentionPeriod) {
            this.retentionPeriod = Input.ofNullable(retentionPeriod);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DatasetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DatasetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTriggers(@Nullable Input<List<DatasetTriggerArgs>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable List<DatasetTriggerArgs> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }

        public Builder setVersioningConfiguration(@Nullable Input<DatasetVersioningConfigurationArgs> versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public Builder setVersioningConfiguration(@Nullable DatasetVersioningConfigurationArgs versioningConfiguration) {
            this.versioningConfiguration = Input.ofNullable(versioningConfiguration);
            return this;
        }

        public DatasetArgs build() {
            return new DatasetArgs(actions, contentDeliveryRules, datasetName, lateDataRules, retentionPeriod, tags, triggers, versioningConfiguration);
        }
    }
}
