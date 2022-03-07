// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Hierarchy: Agent->Flow->Page->Fulfillment/Parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs Empty = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs();

    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    @InputImport(name="loggingSettings")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings;

    public Input<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> getLoggingSettings() {
        return this.loggingSettings == null ? Input.empty() : this.loggingSettings;
    }

    public GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs(@Nullable Input<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings) {
        this.loggingSettings = loggingSettings;
    }

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs() {
        this.loggingSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingSettings = defaults.loggingSettings;
        }

        public Builder setLoggingSettings(@Nullable Input<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings) {
            this.loggingSettings = loggingSettings;
            return this;
        }

        public Builder setLoggingSettings(@Nullable GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs loggingSettings) {
            this.loggingSettings = Input.ofNullable(loggingSettings);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs(loggingSettings);
        }
    }
}