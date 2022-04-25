// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationConditionActionConditionPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationConditionLabelNameConditionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingConfigurationConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationConditionArgs Empty = new LoggingConfigurationConditionArgs();

    /**
     * A single action condition.
     * 
     */
    @Import(name="actionCondition")
    private @Nullable Output<LoggingConfigurationConditionActionConditionPropertiesArgs> actionCondition;

    /**
     * @return A single action condition.
     * 
     */
    public Optional<Output<LoggingConfigurationConditionActionConditionPropertiesArgs>> actionCondition() {
        return Optional.ofNullable(this.actionCondition);
    }

    /**
     * A single label name condition.
     * 
     */
    @Import(name="labelNameCondition")
    private @Nullable Output<LoggingConfigurationConditionLabelNameConditionPropertiesArgs> labelNameCondition;

    /**
     * @return A single label name condition.
     * 
     */
    public Optional<Output<LoggingConfigurationConditionLabelNameConditionPropertiesArgs>> labelNameCondition() {
        return Optional.ofNullable(this.labelNameCondition);
    }

    private LoggingConfigurationConditionArgs() {}

    private LoggingConfigurationConditionArgs(LoggingConfigurationConditionArgs $) {
        this.actionCondition = $.actionCondition;
        this.labelNameCondition = $.labelNameCondition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationConditionArgs $;

        public Builder() {
            $ = new LoggingConfigurationConditionArgs();
        }

        public Builder(LoggingConfigurationConditionArgs defaults) {
            $ = new LoggingConfigurationConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionCondition A single action condition.
         * 
         * @return builder
         * 
         */
        public Builder actionCondition(@Nullable Output<LoggingConfigurationConditionActionConditionPropertiesArgs> actionCondition) {
            $.actionCondition = actionCondition;
            return this;
        }

        /**
         * @param actionCondition A single action condition.
         * 
         * @return builder
         * 
         */
        public Builder actionCondition(LoggingConfigurationConditionActionConditionPropertiesArgs actionCondition) {
            return actionCondition(Output.of(actionCondition));
        }

        /**
         * @param labelNameCondition A single label name condition.
         * 
         * @return builder
         * 
         */
        public Builder labelNameCondition(@Nullable Output<LoggingConfigurationConditionLabelNameConditionPropertiesArgs> labelNameCondition) {
            $.labelNameCondition = labelNameCondition;
            return this;
        }

        /**
         * @param labelNameCondition A single label name condition.
         * 
         * @return builder
         * 
         */
        public Builder labelNameCondition(LoggingConfigurationConditionLabelNameConditionPropertiesArgs labelNameCondition) {
            return labelNameCondition(Output.of(labelNameCondition));
        }

        public LoggingConfigurationConditionArgs build() {
            return $;
        }
    }

}
