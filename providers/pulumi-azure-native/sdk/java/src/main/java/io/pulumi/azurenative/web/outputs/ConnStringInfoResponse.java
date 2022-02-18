// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnStringInfoResponse {
    /**
     * Connection string value.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * Name of connection string.
     * 
     */
    private final @Nullable String name;
    /**
     * Type of database.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"connectionString","name","type"})
    private ConnStringInfoResponse(
        @Nullable String connectionString,
        @Nullable String name,
        @Nullable String type) {
        this.connectionString = connectionString;
        this.name = name;
        this.type = type;
    }

    /**
     * Connection string value.
     * 
     */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * Name of connection string.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Type of database.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnStringInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionString;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnStringInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ConnStringInfoResponse build() {
            return new ConnStringInfoResponse(connectionString, name, type);
        }
    }
}
