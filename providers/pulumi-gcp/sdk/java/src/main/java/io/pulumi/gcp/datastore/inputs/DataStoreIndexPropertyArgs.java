// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datastore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataStoreIndexPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataStoreIndexPropertyArgs Empty = new DataStoreIndexPropertyArgs();

    /**
     * The direction the index should optimize for sorting.
     * Possible values are `ASCENDING` and `DESCENDING`.
     * 
     */
    @InputImport(name="direction", required=true)
      private final Input<String> direction;

    public Input<String> getDirection() {
        return this.direction;
    }

    /**
     * The property name to index.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DataStoreIndexPropertyArgs(
        Input<String> direction,
        Input<String> name) {
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataStoreIndexPropertyArgs() {
        this.direction = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreIndexPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> direction;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreIndexPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder setDirection(Input<String> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public DataStoreIndexPropertyArgs build() {
            return new DataStoreIndexPropertyArgs(direction, name);
        }
    }
}