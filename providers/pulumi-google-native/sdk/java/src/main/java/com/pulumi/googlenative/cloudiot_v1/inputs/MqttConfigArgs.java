// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudiot_v1.enums.MqttConfigMqttEnabledState;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of MQTT for a device registry.
 * 
 */
public final class MqttConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MqttConfigArgs Empty = new MqttConfigArgs();

    /**
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
     * 
     */
    @Import(name="mqttEnabledState")
    private @Nullable Output<MqttConfigMqttEnabledState> mqttEnabledState;

    /**
     * @return If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
     * 
     */
    public Optional<Output<MqttConfigMqttEnabledState>> mqttEnabledState() {
        return Optional.ofNullable(this.mqttEnabledState);
    }

    private MqttConfigArgs() {}

    private MqttConfigArgs(MqttConfigArgs $) {
        this.mqttEnabledState = $.mqttEnabledState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MqttConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MqttConfigArgs $;

        public Builder() {
            $ = new MqttConfigArgs();
        }

        public Builder(MqttConfigArgs defaults) {
            $ = new MqttConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mqttEnabledState If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
         * 
         * @return builder
         * 
         */
        public Builder mqttEnabledState(@Nullable Output<MqttConfigMqttEnabledState> mqttEnabledState) {
            $.mqttEnabledState = mqttEnabledState;
            return this;
        }

        /**
         * @param mqttEnabledState If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
         * 
         * @return builder
         * 
         */
        public Builder mqttEnabledState(MqttConfigMqttEnabledState mqttEnabledState) {
            return mqttEnabledState(Output.of(mqttEnabledState));
        }

        public MqttConfigArgs build() {
            return $;
        }
    }

}
