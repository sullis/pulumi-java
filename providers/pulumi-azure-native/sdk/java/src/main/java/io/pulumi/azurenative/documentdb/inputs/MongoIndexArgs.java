// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.MongoIndexKeysArgs;
import io.pulumi.azurenative.documentdb.inputs.MongoIndexOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection index key
 * 
 */
public final class MongoIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoIndexArgs Empty = new MongoIndexArgs();

    /**
     * Cosmos DB MongoDB collection index keys
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<MongoIndexKeysArgs> key;

    public Input<MongoIndexKeysArgs> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Cosmos DB MongoDB collection index key options
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<MongoIndexOptionsArgs> options;

    public Input<MongoIndexOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    public MongoIndexArgs(
        @Nullable Input<MongoIndexKeysArgs> key,
        @Nullable Input<MongoIndexOptionsArgs> options) {
        this.key = key;
        this.options = options;
    }

    private MongoIndexArgs() {
        this.key = Input.empty();
        this.options = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MongoIndexKeysArgs> key;
        private @Nullable Input<MongoIndexOptionsArgs> options;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.options = defaults.options;
        }

        public Builder setKey(@Nullable Input<MongoIndexKeysArgs> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable MongoIndexKeysArgs key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setOptions(@Nullable Input<MongoIndexOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable MongoIndexOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public MongoIndexArgs build() {
            return new MongoIndexArgs(key, options);
        }
    }
}
