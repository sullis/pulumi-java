// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadNetworkPortMirroringResult {
    /**
     * @return Destination VM Group.
     * 
     */
    private final @Nullable String destination;
    /**
     * @return Direction of port mirroring profile.
     * 
     */
    private final @Nullable String direction;
    /**
     * @return Display name of the port mirroring profile.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * @return NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * @return Source VM Group.
     * 
     */
    private final @Nullable String source;
    /**
     * @return Port Mirroring Status.
     * 
     */
    private final String status;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkloadNetworkPortMirroringResult(
        @CustomType.Parameter("destination") @Nullable String destination,
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("revision") @Nullable Double revision,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.destination = destination;
        this.direction = direction;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.source = source;
        this.status = status;
        this.type = type;
    }

    /**
     * @return Destination VM Group.
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * @return Direction of port mirroring profile.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return Display name of the port mirroring profile.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return NSX revision number.
     * 
     */
    public Optional<Double> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Source VM Group.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Port Mirroring Status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkPortMirroringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable String direction;
        private @Nullable String displayName;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private @Nullable String source;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkPortMirroringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder revision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkloadNetworkPortMirroringResult build() {
            return new GetWorkloadNetworkPortMirroringResult(destination, direction, displayName, id, name, provisioningState, revision, source, status, type);
        }
    }
}
