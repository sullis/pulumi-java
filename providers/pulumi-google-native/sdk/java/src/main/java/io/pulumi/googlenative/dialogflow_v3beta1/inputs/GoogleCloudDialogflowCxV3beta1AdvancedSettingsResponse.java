// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse;
import java.util.Objects;


/**
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Hierarchy: Agent->Flow->Page->Fulfillment/Parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse Empty = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse();

    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    @InputImport(name="loggingSettings", required=true)
      private final GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse loggingSettings;

    public GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse getLoggingSettings() {
        return this.loggingSettings;
    }

    public GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse loggingSettings) {
        this.loggingSettings = Objects.requireNonNull(loggingSettings, "expected parameter 'loggingSettings' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse() {
        this.loggingSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse loggingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingSettings = defaults.loggingSettings;
        }

        public Builder setLoggingSettings(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsResponse loggingSettings) {
            this.loggingSettings = Objects.requireNonNull(loggingSettings);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse(loggingSettings);
        }
    }
}