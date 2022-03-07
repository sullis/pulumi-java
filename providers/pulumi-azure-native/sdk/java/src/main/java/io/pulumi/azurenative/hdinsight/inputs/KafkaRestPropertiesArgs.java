// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.ClientGroupInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The kafka rest proxy configuration which contains AAD security group information.
 * 
 */
public final class KafkaRestPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KafkaRestPropertiesArgs Empty = new KafkaRestPropertiesArgs();

    /**
     * The information of AAD security group.
     * 
     */
    @InputImport(name="clientGroupInfo")
      private final @Nullable Input<ClientGroupInfoArgs> clientGroupInfo;

    public Input<ClientGroupInfoArgs> getClientGroupInfo() {
        return this.clientGroupInfo == null ? Input.empty() : this.clientGroupInfo;
    }

    /**
     * The configurations that need to be overriden.
     * 
     */
    @InputImport(name="configurationOverride")
      private final @Nullable Input<Map<String,String>> configurationOverride;

    public Input<Map<String,String>> getConfigurationOverride() {
        return this.configurationOverride == null ? Input.empty() : this.configurationOverride;
    }

    public KafkaRestPropertiesArgs(
        @Nullable Input<ClientGroupInfoArgs> clientGroupInfo,
        @Nullable Input<Map<String,String>> configurationOverride) {
        this.clientGroupInfo = clientGroupInfo;
        this.configurationOverride = configurationOverride;
    }

    private KafkaRestPropertiesArgs() {
        this.clientGroupInfo = Input.empty();
        this.configurationOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaRestPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClientGroupInfoArgs> clientGroupInfo;
        private @Nullable Input<Map<String,String>> configurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaRestPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientGroupInfo = defaults.clientGroupInfo;
    	      this.configurationOverride = defaults.configurationOverride;
        }

        public Builder setClientGroupInfo(@Nullable Input<ClientGroupInfoArgs> clientGroupInfo) {
            this.clientGroupInfo = clientGroupInfo;
            return this;
        }

        public Builder setClientGroupInfo(@Nullable ClientGroupInfoArgs clientGroupInfo) {
            this.clientGroupInfo = Input.ofNullable(clientGroupInfo);
            return this;
        }

        public Builder setConfigurationOverride(@Nullable Input<Map<String,String>> configurationOverride) {
            this.configurationOverride = configurationOverride;
            return this;
        }

        public Builder setConfigurationOverride(@Nullable Map<String,String> configurationOverride) {
            this.configurationOverride = Input.ofNullable(configurationOverride);
            return this;
        }
        public KafkaRestPropertiesArgs build() {
            return new KafkaRestPropertiesArgs(clientGroupInfo, configurationOverride);
        }
    }
}