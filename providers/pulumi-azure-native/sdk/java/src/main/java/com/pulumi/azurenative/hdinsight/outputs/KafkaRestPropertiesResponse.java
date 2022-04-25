// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.azurenative.hdinsight.outputs.ClientGroupInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaRestPropertiesResponse {
    /**
     * @return The information of AAD security group.
     * 
     */
    private final @Nullable ClientGroupInfoResponse clientGroupInfo;
    /**
     * @return The configurations that need to be overriden.
     * 
     */
    private final @Nullable Map<String,String> configurationOverride;

    @CustomType.Constructor
    private KafkaRestPropertiesResponse(
        @CustomType.Parameter("clientGroupInfo") @Nullable ClientGroupInfoResponse clientGroupInfo,
        @CustomType.Parameter("configurationOverride") @Nullable Map<String,String> configurationOverride) {
        this.clientGroupInfo = clientGroupInfo;
        this.configurationOverride = configurationOverride;
    }

    /**
     * @return The information of AAD security group.
     * 
     */
    public Optional<ClientGroupInfoResponse> clientGroupInfo() {
        return Optional.ofNullable(this.clientGroupInfo);
    }
    /**
     * @return The configurations that need to be overriden.
     * 
     */
    public Map<String,String> configurationOverride() {
        return this.configurationOverride == null ? Map.of() : this.configurationOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaRestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClientGroupInfoResponse clientGroupInfo;
        private @Nullable Map<String,String> configurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaRestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientGroupInfo = defaults.clientGroupInfo;
    	      this.configurationOverride = defaults.configurationOverride;
        }

        public Builder clientGroupInfo(@Nullable ClientGroupInfoResponse clientGroupInfo) {
            this.clientGroupInfo = clientGroupInfo;
            return this;
        }
        public Builder configurationOverride(@Nullable Map<String,String> configurationOverride) {
            this.configurationOverride = configurationOverride;
            return this;
        }        public KafkaRestPropertiesResponse build() {
            return new KafkaRestPropertiesResponse(clientGroupInfo, configurationOverride);
        }
    }
}
