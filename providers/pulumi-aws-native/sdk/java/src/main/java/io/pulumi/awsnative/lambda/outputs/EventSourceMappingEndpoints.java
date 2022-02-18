// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingEndpoints {
    /**
     * A list of Kafka server endpoints.
     * 
     */
    private final @Nullable List<String> kafkaBootstrapServers;

    @OutputCustomType.Constructor({"kafkaBootstrapServers"})
    private EventSourceMappingEndpoints(@Nullable List<String> kafkaBootstrapServers) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
    }

    /**
     * A list of Kafka server endpoints.
     * 
     */
    public List<String> getKafkaBootstrapServers() {
        return this.kafkaBootstrapServers == null ? List.of() : this.kafkaBootstrapServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingEndpoints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> kafkaBootstrapServers;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingEndpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafkaBootstrapServers = defaults.kafkaBootstrapServers;
        }

        public Builder setKafkaBootstrapServers(@Nullable List<String> kafkaBootstrapServers) {
            this.kafkaBootstrapServers = kafkaBootstrapServers;
            return this;
        }

        public EventSourceMappingEndpoints build() {
            return new EventSourceMappingEndpoints(kafkaBootstrapServers);
        }
    }
}
