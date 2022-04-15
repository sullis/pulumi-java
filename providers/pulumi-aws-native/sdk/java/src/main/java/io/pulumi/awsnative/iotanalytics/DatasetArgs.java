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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    @Import(name="actions", required=true)
      private final Output<List<DatasetActionArgs>> actions;

    public Output<List<DatasetActionArgs>> actions() {
        return this.actions;
    }

    @Import(name="contentDeliveryRules")
      private final @Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules;

    public Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules() {
        return this.contentDeliveryRules == null ? Codegen.empty() : this.contentDeliveryRules;
    }

    @Import(name="datasetName")
      private final @Nullable Output<String> datasetName;

    public Output<String> datasetName() {
        return this.datasetName == null ? Codegen.empty() : this.datasetName;
    }

    @Import(name="lateDataRules")
      private final @Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules;

    public Output<List<DatasetLateDataRuleArgs>> lateDataRules() {
        return this.lateDataRules == null ? Codegen.empty() : this.lateDataRules;
    }

    @Import(name="retentionPeriod")
      private final @Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod;

    public Output<DatasetRetentionPeriodArgs> retentionPeriod() {
        return this.retentionPeriod == null ? Codegen.empty() : this.retentionPeriod;
    }

    @Import(name="tags")
      private final @Nullable Output<List<DatasetTagArgs>> tags;

    public Output<List<DatasetTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="triggers")
      private final @Nullable Output<List<DatasetTriggerArgs>> triggers;

    public Output<List<DatasetTriggerArgs>> triggers() {
        return this.triggers == null ? Codegen.empty() : this.triggers;
    }

    @Import(name="versioningConfiguration")
      private final @Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration;

    public Output<DatasetVersioningConfigurationArgs> versioningConfiguration() {
        return this.versioningConfiguration == null ? Codegen.empty() : this.versioningConfiguration;
    }

    public DatasetArgs(
        Output<List<DatasetActionArgs>> actions,
        @Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules,
        @Nullable Output<String> datasetName,
        @Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules,
        @Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod,
        @Nullable Output<List<DatasetTagArgs>> tags,
        @Nullable Output<List<DatasetTriggerArgs>> triggers,
        @Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration) {
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
        this.actions = Codegen.empty();
        this.contentDeliveryRules = Codegen.empty();
        this.datasetName = Codegen.empty();
        this.lateDataRules = Codegen.empty();
        this.retentionPeriod = Codegen.empty();
        this.tags = Codegen.empty();
        this.triggers = Codegen.empty();
        this.versioningConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<DatasetActionArgs>> actions;
        private @Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules;
        private @Nullable Output<String> datasetName;
        private @Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules;
        private @Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod;
        private @Nullable Output<List<DatasetTagArgs>> tags;
        private @Nullable Output<List<DatasetTriggerArgs>> triggers;
        private @Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration;

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

        public Builder actions(Output<List<DatasetActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<DatasetActionArgs> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(DatasetActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder contentDeliveryRules(@Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules) {
            this.contentDeliveryRules = contentDeliveryRules;
            return this;
        }
        public Builder contentDeliveryRules(@Nullable List<DatasetContentDeliveryRuleArgs> contentDeliveryRules) {
            this.contentDeliveryRules = Codegen.ofNullable(contentDeliveryRules);
            return this;
        }
        public Builder contentDeliveryRules(DatasetContentDeliveryRuleArgs... contentDeliveryRules) {
            return contentDeliveryRules(List.of(contentDeliveryRules));
        }
        public Builder datasetName(@Nullable Output<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = Codegen.ofNullable(datasetName);
            return this;
        }
        public Builder lateDataRules(@Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules) {
            this.lateDataRules = lateDataRules;
            return this;
        }
        public Builder lateDataRules(@Nullable List<DatasetLateDataRuleArgs> lateDataRules) {
            this.lateDataRules = Codegen.ofNullable(lateDataRules);
            return this;
        }
        public Builder lateDataRules(DatasetLateDataRuleArgs... lateDataRules) {
            return lateDataRules(List.of(lateDataRules));
        }
        public Builder retentionPeriod(@Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Builder retentionPeriod(@Nullable DatasetRetentionPeriodArgs retentionPeriod) {
            this.retentionPeriod = Codegen.ofNullable(retentionPeriod);
            return this;
        }
        public Builder tags(@Nullable Output<List<DatasetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DatasetTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DatasetTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder triggers(@Nullable Output<List<DatasetTriggerArgs>> triggers) {
            this.triggers = triggers;
            return this;
        }
        public Builder triggers(@Nullable List<DatasetTriggerArgs> triggers) {
            this.triggers = Codegen.ofNullable(triggers);
            return this;
        }
        public Builder triggers(DatasetTriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }
        public Builder versioningConfiguration(@Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }
        public Builder versioningConfiguration(@Nullable DatasetVersioningConfigurationArgs versioningConfiguration) {
            this.versioningConfiguration = Codegen.ofNullable(versioningConfiguration);
            return this;
        }        public DatasetArgs build() {
            return new DatasetArgs(actions, contentDeliveryRules, datasetName, lateDataRules, retentionPeriod, tags, triggers, versioningConfiguration);
        }
    }
}
