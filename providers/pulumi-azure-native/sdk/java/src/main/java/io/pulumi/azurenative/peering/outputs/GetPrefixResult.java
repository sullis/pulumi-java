// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.PeeringServicePrefixEventResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrefixResult {
    /**
     * The error message for validation state
     * 
     */
    private final String errorMessage;
    /**
     * The list of events for peering service prefix
     * 
     */
    private final List<PeeringServicePrefixEventResponse> events;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The prefix learned type
     * 
     */
    private final String learnedType;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The peering service prefix key
     * 
     */
    private final @Nullable String peeringServicePrefixKey;
    /**
     * The prefix from which your traffic originates.
     * 
     */
    private final @Nullable String prefix;
    /**
     * The prefix validation state
     * 
     */
    private final String prefixValidationState;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"errorMessage","events","id","learnedType","name","peeringServicePrefixKey","prefix","prefixValidationState","provisioningState","type"})
    private GetPrefixResult(
        String errorMessage,
        List<PeeringServicePrefixEventResponse> events,
        String id,
        String learnedType,
        String name,
        @Nullable String peeringServicePrefixKey,
        @Nullable String prefix,
        String prefixValidationState,
        String provisioningState,
        String type) {
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.events = Objects.requireNonNull(events);
        this.id = Objects.requireNonNull(id);
        this.learnedType = Objects.requireNonNull(learnedType);
        this.name = Objects.requireNonNull(name);
        this.peeringServicePrefixKey = peeringServicePrefixKey;
        this.prefix = prefix;
        this.prefixValidationState = Objects.requireNonNull(prefixValidationState);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The error message for validation state
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The list of events for peering service prefix
     * 
    */
    public List<PeeringServicePrefixEventResponse> getEvents() {
        return this.events;
    }
    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The prefix learned type
     * 
    */
    public String getLearnedType() {
        return this.learnedType;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The peering service prefix key
     * 
    */
    public Optional<String> getPeeringServicePrefixKey() {
        return Optional.ofNullable(this.peeringServicePrefixKey);
    }
    /**
     * The prefix from which your traffic originates.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The prefix validation state
     * 
    */
    public String getPrefixValidationState() {
        return this.prefixValidationState;
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private List<PeeringServicePrefixEventResponse> events;
        private String id;
        private String learnedType;
        private String name;
        private @Nullable String peeringServicePrefixKey;
        private @Nullable String prefix;
        private String prefixValidationState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.learnedType = defaults.learnedType;
    	      this.name = defaults.name;
    	      this.peeringServicePrefixKey = defaults.peeringServicePrefixKey;
    	      this.prefix = defaults.prefix;
    	      this.prefixValidationState = defaults.prefixValidationState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setEvents(List<PeeringServicePrefixEventResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLearnedType(String learnedType) {
            this.learnedType = Objects.requireNonNull(learnedType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeeringServicePrefixKey(@Nullable String peeringServicePrefixKey) {
            this.peeringServicePrefixKey = peeringServicePrefixKey;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefixValidationState(String prefixValidationState) {
            this.prefixValidationState = Objects.requireNonNull(prefixValidationState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrefixResult build() {
            return new GetPrefixResult(errorMessage, events, id, learnedType, name, peeringServicePrefixKey, prefix, prefixValidationState, provisioningState, type);
        }
    }
}