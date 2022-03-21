// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.ServiceBusTransportType;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusAuthenticationArgs;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusBrokeredMessagePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusTopicMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusTopicMessageArgs Empty = new ServiceBusTopicMessageArgs();

    /**
     * Gets or sets the Service Bus authentication.
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<ServiceBusAuthenticationArgs> authentication;

    public Output<ServiceBusAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * Gets or sets the brokered message properties.
     * 
     */
    @Import(name="brokeredMessageProperties")
      private final @Nullable Output<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties;

    public Output<ServiceBusBrokeredMessagePropertiesArgs> getBrokeredMessageProperties() {
        return this.brokeredMessageProperties == null ? Output.empty() : this.brokeredMessageProperties;
    }

    /**
     * Gets or sets the custom message properties.
     * 
     */
    @Import(name="customMessageProperties")
      private final @Nullable Output<Map<String,String>> customMessageProperties;

    public Output<Map<String,String>> getCustomMessageProperties() {
        return this.customMessageProperties == null ? Output.empty() : this.customMessageProperties;
    }

    /**
     * Gets or sets the message.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Gets or sets the namespace.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    /**
     * Gets or sets the topic path.
     * 
     */
    @Import(name="topicPath")
      private final @Nullable Output<String> topicPath;

    public Output<String> getTopicPath() {
        return this.topicPath == null ? Output.empty() : this.topicPath;
    }

    /**
     * Gets or sets the transport type.
     * 
     */
    @Import(name="transportType")
      private final @Nullable Output<ServiceBusTransportType> transportType;

    public Output<ServiceBusTransportType> getTransportType() {
        return this.transportType == null ? Output.empty() : this.transportType;
    }

    public ServiceBusTopicMessageArgs(
        @Nullable Output<ServiceBusAuthenticationArgs> authentication,
        @Nullable Output<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties,
        @Nullable Output<Map<String,String>> customMessageProperties,
        @Nullable Output<String> message,
        @Nullable Output<String> namespace,
        @Nullable Output<String> topicPath,
        @Nullable Output<ServiceBusTransportType> transportType) {
        this.authentication = authentication;
        this.brokeredMessageProperties = brokeredMessageProperties;
        this.customMessageProperties = customMessageProperties;
        this.message = message;
        this.namespace = namespace;
        this.topicPath = topicPath;
        this.transportType = transportType;
    }

    private ServiceBusTopicMessageArgs() {
        this.authentication = Output.empty();
        this.brokeredMessageProperties = Output.empty();
        this.customMessageProperties = Output.empty();
        this.message = Output.empty();
        this.namespace = Output.empty();
        this.topicPath = Output.empty();
        this.transportType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceBusAuthenticationArgs> authentication;
        private @Nullable Output<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties;
        private @Nullable Output<Map<String,String>> customMessageProperties;
        private @Nullable Output<String> message;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> topicPath;
        private @Nullable Output<ServiceBusTransportType> transportType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.brokeredMessageProperties = defaults.brokeredMessageProperties;
    	      this.customMessageProperties = defaults.customMessageProperties;
    	      this.message = defaults.message;
    	      this.namespace = defaults.namespace;
    	      this.topicPath = defaults.topicPath;
    	      this.transportType = defaults.transportType;
        }

        public Builder authentication(@Nullable Output<ServiceBusAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable ServiceBusAuthenticationArgs authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder brokeredMessageProperties(@Nullable Output<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties) {
            this.brokeredMessageProperties = brokeredMessageProperties;
            return this;
        }
        public Builder brokeredMessageProperties(@Nullable ServiceBusBrokeredMessagePropertiesArgs brokeredMessageProperties) {
            this.brokeredMessageProperties = Output.ofNullable(brokeredMessageProperties);
            return this;
        }
        public Builder customMessageProperties(@Nullable Output<Map<String,String>> customMessageProperties) {
            this.customMessageProperties = customMessageProperties;
            return this;
        }
        public Builder customMessageProperties(@Nullable Map<String,String> customMessageProperties) {
            this.customMessageProperties = Output.ofNullable(customMessageProperties);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }
        public Builder topicPath(@Nullable Output<String> topicPath) {
            this.topicPath = topicPath;
            return this;
        }
        public Builder topicPath(@Nullable String topicPath) {
            this.topicPath = Output.ofNullable(topicPath);
            return this;
        }
        public Builder transportType(@Nullable Output<ServiceBusTransportType> transportType) {
            this.transportType = transportType;
            return this;
        }
        public Builder transportType(@Nullable ServiceBusTransportType transportType) {
            this.transportType = Output.ofNullable(transportType);
            return this;
        }        public ServiceBusTopicMessageArgs build() {
            return new ServiceBusTopicMessageArgs(authentication, brokeredMessageProperties, customMessageProperties, message, namespace, topicPath, transportType);
        }
    }
}
