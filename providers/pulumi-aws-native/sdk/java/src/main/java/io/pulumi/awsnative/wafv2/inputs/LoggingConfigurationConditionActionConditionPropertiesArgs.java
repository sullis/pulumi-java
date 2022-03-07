// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationConditionActionConditionPropertiesAction;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A single action condition.
 * 
 */
public final class LoggingConfigurationConditionActionConditionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationConditionActionConditionPropertiesArgs Empty = new LoggingConfigurationConditionActionConditionPropertiesArgs();

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<LoggingConfigurationConditionActionConditionPropertiesAction> action;

    public Input<LoggingConfigurationConditionActionConditionPropertiesAction> getAction() {
        return this.action;
    }

    public LoggingConfigurationConditionActionConditionPropertiesArgs(Input<LoggingConfigurationConditionActionConditionPropertiesAction> action) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
    }

    private LoggingConfigurationConditionActionConditionPropertiesArgs() {
        this.action = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationConditionActionConditionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LoggingConfigurationConditionActionConditionPropertiesAction> action;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationConditionActionConditionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder setAction(Input<LoggingConfigurationConditionActionConditionPropertiesAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(LoggingConfigurationConditionActionConditionPropertiesAction action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }
        public LoggingConfigurationConditionActionConditionPropertiesArgs build() {
            return new LoggingConfigurationConditionActionConditionPropertiesArgs(action);
        }
    }
}