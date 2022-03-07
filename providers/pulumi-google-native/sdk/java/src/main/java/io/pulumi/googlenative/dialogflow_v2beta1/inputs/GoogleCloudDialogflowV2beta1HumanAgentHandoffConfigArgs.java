// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the hand off to a live agent, typically on which external agent service provider to connect to a conversation. Currently, this feature is not general available, please contact Google to get access.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs();

    /**
     * Uses LivePerson (https://www.liveperson.com).
     * 
     */
    @InputImport(name="livePersonConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> getLivePersonConfig() {
        return this.livePersonConfig == null ? Input.empty() : this.livePersonConfig;
    }

    /**
     * Uses Salesforce Live Agent.
     * 
     */
    @InputImport(name="salesforceLiveAgentConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> getSalesforceLiveAgentConfig() {
        return this.salesforceLiveAgentConfig == null ? Input.empty() : this.salesforceLiveAgentConfig;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs(
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig) {
        this.livePersonConfig = livePersonConfig;
        this.salesforceLiveAgentConfig = salesforceLiveAgentConfig;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs() {
        this.livePersonConfig = Input.empty();
        this.salesforceLiveAgentConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.livePersonConfig = defaults.livePersonConfig;
    	      this.salesforceLiveAgentConfig = defaults.salesforceLiveAgentConfig;
        }

        public Builder setLivePersonConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig) {
            this.livePersonConfig = livePersonConfig;
            return this;
        }

        public Builder setLivePersonConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigLivePersonConfigArgs livePersonConfig) {
            this.livePersonConfig = Input.ofNullable(livePersonConfig);
            return this;
        }

        public Builder setSalesforceLiveAgentConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig) {
            this.salesforceLiveAgentConfig = salesforceLiveAgentConfig;
            return this;
        }

        public Builder setSalesforceLiveAgentConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs salesforceLiveAgentConfig) {
            this.salesforceLiveAgentConfig = Input.ofNullable(salesforceLiveAgentConfig);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs(livePersonConfig, salesforceLiveAgentConfig);
        }
    }
}