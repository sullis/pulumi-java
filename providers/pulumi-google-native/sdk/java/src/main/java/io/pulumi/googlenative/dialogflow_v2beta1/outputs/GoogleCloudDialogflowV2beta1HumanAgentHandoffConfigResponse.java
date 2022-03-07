// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse {
    /**
     * Uses LivePerson (https://www.liveperson.com).
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse livePersonConfig;
    /**
     * Uses Salesforce Live Agent.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse salesforceLiveAgentConfig;

    @OutputCustomType.Constructor({"livePersonConfig","salesforceLiveAgentConfig"})
    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse(
        GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse livePersonConfig,
        GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse salesforceLiveAgentConfig) {
        this.livePersonConfig = Objects.requireNonNull(livePersonConfig);
        this.salesforceLiveAgentConfig = Objects.requireNonNull(salesforceLiveAgentConfig);
    }

    /**
     * Uses LivePerson (https://www.liveperson.com).
     * 
    */
    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse getLivePersonConfig() {
        return this.livePersonConfig;
    }
    /**
     * Uses Salesforce Live Agent.
     * 
    */
    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse getSalesforceLiveAgentConfig() {
        return this.salesforceLiveAgentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse livePersonConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse salesforceLiveAgentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.livePersonConfig = defaults.livePersonConfig;
    	      this.salesforceLiveAgentConfig = defaults.salesforceLiveAgentConfig;
        }

        public Builder setLivePersonConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigResponse livePersonConfig) {
            this.livePersonConfig = Objects.requireNonNull(livePersonConfig);
            return this;
        }

        public Builder setSalesforceLiveAgentConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse salesforceLiveAgentConfig) {
            this.salesforceLiveAgentConfig = Objects.requireNonNull(salesforceLiveAgentConfig);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse(livePersonConfig, salesforceLiveAgentConfig);
        }
    }
}