// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataStoreResponse {
    /**
     * The capacity of data store in GBs.
     * 
     */
    private final @Nullable String capacity;
    /**
     * The free space of data store in GBs.
     * 
     */
    private final @Nullable String freeSpace;
    /**
     * The symbolic name of data store.
     * 
     */
    private final @Nullable String symbolicName;
    /**
     * The type of data store.
     * 
     */
    private final @Nullable String type;
    /**
     * The uuid of data store.
     * 
     */
    private final @Nullable String uuid;

    @CustomType.Constructor
    private DataStoreResponse(
        @CustomType.Parameter("capacity") @Nullable String capacity,
        @CustomType.Parameter("freeSpace") @Nullable String freeSpace,
        @CustomType.Parameter("symbolicName") @Nullable String symbolicName,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("uuid") @Nullable String uuid) {
        this.capacity = capacity;
        this.freeSpace = freeSpace;
        this.symbolicName = symbolicName;
        this.type = type;
        this.uuid = uuid;
    }

    /**
     * The capacity of data store in GBs.
     * 
    */
    public Optional<String> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The free space of data store in GBs.
     * 
    */
    public Optional<String> getFreeSpace() {
        return Optional.ofNullable(this.freeSpace);
    }
    /**
     * The symbolic name of data store.
     * 
    */
    public Optional<String> getSymbolicName() {
        return Optional.ofNullable(this.symbolicName);
    }
    /**
     * The type of data store.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The uuid of data store.
     * 
    */
    public Optional<String> getUuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacity;
        private @Nullable String freeSpace;
        private @Nullable String symbolicName;
        private @Nullable String type;
        private @Nullable String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.freeSpace = defaults.freeSpace;
    	      this.symbolicName = defaults.symbolicName;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        public Builder capacity(@Nullable String capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder freeSpace(@Nullable String freeSpace) {
            this.freeSpace = freeSpace;
            return this;
        }
        public Builder symbolicName(@Nullable String symbolicName) {
            this.symbolicName = symbolicName;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }        public DataStoreResponse build() {
            return new DataStoreResponse(capacity, freeSpace, symbolicName, type, uuid);
        }
    }
}
