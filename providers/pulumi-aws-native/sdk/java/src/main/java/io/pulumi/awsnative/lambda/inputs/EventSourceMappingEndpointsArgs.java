// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The endpoints used by AWS Lambda to access a self-managed event source.
 * 
 */
public final class EventSourceMappingEndpointsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingEndpointsArgs Empty = new EventSourceMappingEndpointsArgs();

    /**
     * A list of Kafka server endpoints.
     * 
     */
    @InputImport(name="kafkaBootstrapServers")
    private final @Nullable Input<List<String>> kafkaBootstrapServers;

    public Input<List<String>> getKafkaBootstrapServers() {
        return this.kafkaBootstrapServers == null ? Input.empty() : this.kafkaBootstrapServers;
    }

    public EventSourceMappingEndpointsArgs(@Nullable Input<List<String>> kafkaBootstrapServers) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
    }

    private EventSourceMappingEndpointsArgs() {
        this.kafkaBootstrapServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> kafkaBootstrapServers;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingEndpointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafkaBootstrapServers = defaults.kafkaBootstrapServers;
        }

        public Builder setKafkaBootstrapServers(@Nullable Input<List<String>> kafkaBootstrapServers) {
            this.kafkaBootstrapServers = kafkaBootstrapServers;
            return this;
        }

        public Builder setKafkaBootstrapServers(@Nullable List<String> kafkaBootstrapServers) {
            this.kafkaBootstrapServers = Input.ofNullable(kafkaBootstrapServers);
            return this;
        }

        public EventSourceMappingEndpointsArgs build() {
            return new EventSourceMappingEndpointsArgs(kafkaBootstrapServers);
        }
    }
}
